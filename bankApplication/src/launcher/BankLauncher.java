package launcher;

import java.util.Scanner;

import bank.Bank;

public class BankLauncher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*******WELCOME TO MYBANK*******");
		Bank mybank = new Bank();
		while (true) {
			System.out.println("Enter Your Role:");
			System.out.println("1.USER");
			System.out.println("2.WORKER");
			System.out.println("3.Close the Bank");
			int role = scanner.nextInt();
			if (role == 1) {
				mybank.userService();
			} else if (role == 2) {
				scanner.nextLine();
				System.out.println("Enter Username:");
				String username = scanner.nextLine();
				System.out.println("Enter Password:");
				String password = scanner.nextLine();
				if (!username.equals("admin") || !password.equals("Password")) {
					System.out.println("Invalid User!");
				} else {
					mybank.workerService();
				}

			} else if (role == 3) {
				System.out.println("Thank you!!");
				break;
			} else {
				System.out.println("Invalid Choice!");
			}
		}
		scanner.close();
	}
}
