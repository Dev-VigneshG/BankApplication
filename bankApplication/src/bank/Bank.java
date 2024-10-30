package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	String bankName = "ABC";
	String address = "1/2 Abc Street,Abc District 6256769";
	ArrayList<Account> accounts;
	Scanner scanner;

	public Bank() {
		accounts = new ArrayList<Account>();
		scanner = new Scanner(System.in);

	}

	public Account getAccByNum(int accountNum) {
		for (Account account : accounts) {
			if (account.getAccountNumber() == accountNum) {
				return account;
			}
		}
		return null;
	}

	public void addAccount() {
		
	    int accNum=Account.GenerateAccNumber();
	    scanner.nextLine();
	    System.out.println("Enter Customer Name:");
	    String cusName=scanner.nextLine();
	    System.out.println("Enter Account Type(SAVING,CURRENT):");
	    String accType=scanner.nextLine();
	    System.out.println("Enter Customer Mail id:");
	    String mailId=scanner.nextLine();
	    System.out.println("Enter Customer Mobile Number:");
	    String mobile=scanner.nextLine();
	    System.out.println("Enter Address:");
	    String address=scanner.nextLine();
	    Account newAccount=new Account();
	    newAccount.setCustomerName(cusName);
	    newAccount.setAccountType(accType);
	    newAccount.setMailId(mailId);
	    newAccount.setMobileNumber(mobile);
	    newAccount.setAddress(address);
	    newAccount.setBalance(0.0f);
		accounts.add(newAccount);
		System.out.println("Account Created!!");
	}

	public void removeAccount(int accountNumber) {
		Account account=getAccByNum(accountNumber);
		if(account==null)
		{
			System.out.println("Not found!");
			return;
		}
		accounts.remove(account);
	}

	public void userService() {
		System.out.println("Enter Your Account Number: ");
		int accountNum = scanner.nextInt();
		Account account = getAccByNum(accountNum);
		if (account == null) {
			System.out.println("Invalid account number");

		}
		while (true) {
			System.out.println("Enter Your Choice:");
			System.out.println("1.Current Balace");
			System.out.println("2.Print Mini Statement");
			System.out.println("3.Deposit");
			System.out.println("4.Withdraw");
			System.out.println("5.Print Customer Info");
			System.out.println("6.Exit");
			int choice = scanner.nextInt();
			String remark = "None";
			switch (choice) {
			case 1:
				account.currentBalance();
				break;
			case 2:
				account.printMiniStatement();
				break;
			case 3:
				float depositAmount = scanner.nextFloat();
				System.out.println("Enter Remark:");
				remark = scanner.nextLine();
				account.deposit(depositAmount, remark);
				break;

			case 4:
				float withdrawAmount = scanner.nextFloat();
				System.out.println("Enter Remark:");
				remark = scanner.nextLine();
				account.deposit(withdrawAmount, remark);
				break;
			case 5:
				account.printInfo();
				break;
			case 6:
				System.out.println("Thank You !!");
				return;
			default:
				System.out.println("Invalid Choice");
			}
		}
	}

	public void workerService() {
		System.out.println("Enter Your Choice:");
		System.out.println("1.ADD NEW ACCOUNT");
		System.out.println("2.DELETE  ACCOUNT");
		System.out.println("3.DISPLAY ACCOUNT DETAILS");
		System.out.println("4.EXIT");
		int choice = scanner.nextInt();
		if (choice == 1) {
            addAccount();
		} else if (choice == 2) {
			System.out.println("Enter Account Number to Delete Account:");
			int accountNumber=scanner.nextInt();
            removeAccount(accountNumber);
		} else if (choice == 3) {
            System.out.println("Enter Account Numuber :");
            
		} else if(choice==4){

		}
		else
		{
			
		}

	}

}
