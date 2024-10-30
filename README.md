# Bank Application

This Java Bank Application simulates a basic banking system where users can create accounts, perform transactions, and view account details. The application is structured with two packages: `bank` and `launcher`.

## Packages and Classes

### 1. `bank` Package
The `bank` package includes the core functionality of the banking application, managing account creation, transactions, and maintaining bank records.

- **Account**  
  Represents a bank account with attributes like account number, account holder's name, balance, and account type. It includes methods to:
  - Create a new account.
  - Check account balance.
  - Update account details.

- **Bank**  
  Acts as a central management class for handling multiple accounts. This class includes methods to:
  - Add and retrieve accounts.
  - Display account information.
  - Process deposits and withdrawals.

- **Transaction**  
  Handles the transactions (deposit and withdrawal) for accounts. It includes methods to:
  - Record each transaction.
  - Generate transaction history.
  - Validate transactions (e.g., check for sufficient funds).

### 2. `launcher` Package
The `launcher` package contains the entry point of the application, providing a user interface to interact with the banking system.

- **BankLauncher**  
  The main class that initiates the application, displaying a menu-driven interface for users to:
  - Open a new bank account.
  - Deposit or withdraw money.
  - View account details.
  - View transaction history.

## Features

- **Account Creation:** Create a new bank account with user-provided details.
- **Deposits and Withdrawals:** Deposit funds into or withdraw funds from a specific account, with balance verification.
- **Account Management:** Access details of existing accounts.
- **Transaction History:** View past transactions associated with an account.



