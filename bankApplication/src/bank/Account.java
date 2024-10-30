package bank;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Account {
	private static int id = 0;
	private int accountNumber;
	private String customerName;
	private String mailId;
	private String mobileNumber;
	private String address;
	private String accountType;
	private float balance;

	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public static int GenerateAccNumber() {
		id++;
		return id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void addTransaction(Transaction transaction) {
		this.transactions.add(transaction);
	}

	public float currentBalance() {
		return balance;
	}

	public void printMiniStatement() {
		System.out.println("******MINI STATEMENT*****");
		if (transactions.size() == 0) {
			System.out.println("No Transactions!");
			return;
		}
		for (Transaction transaction : transactions) {
			System.out.println(transaction);
		}
	}

	public void deposit(float amount, String remark) {
		Transaction transaction = new Transaction(Transaction.generateID(), "CR", LocalDateTime.now(), amount, remark);
		transactions.add(0, transaction);
		setBalance(currentBalance() + amount);
	}

	public void withdraw(float amount, String remark) {
		if (amount > currentBalance()) {
			System.out.println("Insufficient Balance!");
		} else {
			Transaction transaction = new Transaction(Transaction.generateID(), "DR", LocalDateTime.now(), amount,
					remark);
			transactions.add(0, transaction);
			setBalance(currentBalance() - amount);
		}

	}

	public void printInfo() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "accountNumber=" + accountNumber + " \n customerName=" + customerName + " \n mailId=" + mailId
				+ " \n mobileNumber=" + mobileNumber + " \n address=" + address + " \n accountType=" + accountType
				+ " \n balance=" + balance;
	}

}
