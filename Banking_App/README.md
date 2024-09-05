# 🏦 Banking Application

## Overview

Welcome to the **Banking Application**! This Java-based program allows users to manage bank accounts, including operations like creating accounts, depositing money, withdrawing money, and searching for accounts. Perfect for learning basic concepts in Java and understanding object-oriented programming. 💳

## Features

- **Open a New Account**: Create new bank accounts with account number, type, name, and initial balance. 🆕
- **Display All Accounts**: View details for all bank accounts. 📜
- **Search for an Account**: Find an account by its account number. 🔍
- **Deposit Money**: Add funds to an existing account. 💵
- **Withdraw Money**: Remove funds from an existing account. 💸

## Requirements

- **Java Development Kit (JDK)**: Ensure JDK 8 or later is installed on your machine. ☕️

## How to Run

### Clone the Repository

First, clone the repository to your local machine:

```sh
git clone https://github.com/Jagasri25/Banking_App.git
cd BankingApp
```

### Compile the Code

Navigate to the directory containing the `BankingApp.java` file and compile it:

```sh
javac BankingApp.java
```

### Run the Application

Execute the compiled Java application:

```sh
java BankingApp
```

Follow the on-screen menu to interact with the system.

## Menu Options

1. **Display All Account Details**: Lists details for all created accounts. 📝
2. **Search by Account Number**: Find and display details for a specific account using its account number. 🔍
3. **Deposit the Amount**: Deposit funds into a specific account. 💵
4. **Withdraw the Amount**: Withdraw funds from a specific account. 💸
5. **Exit**: Exits the application. 🚪

## Example Usage

```text
How many number of customers do you want to input? 2

Enter Account No: 12345
Enter Account type: Savings
Enter Name: Alice
Enter Balance: 5000

Enter Account No: 67890
Enter Account type: Checking
Enter Name: Bob
Enter Balance: 3000

 ***Banking System Application***
1. Display all account details
2. Search by Account number
3. Deposit the amount
4. Withdraw the amount
5. Exit
Enter your choice: 1

Name of account holder: Alice
Account no.: 12345
Account type: Savings
Balance: 5000

Name of account holder: Bob
Account no.: 67890
Account type: Checking
Balance: 3000

Enter your choice: 3
Enter Account no. : 12345
Enter the amount you want to deposit: 1500
Balance after deposit: 6500

Enter your choice: 4
Enter Account No : 67890
Enter the amount you want to withdraw: 500
Balance after withdrawal: 2500

Enter your choice: 5
See you soon...
```

## Code Overview

### `BankDetails` Class

- **Attributes**:
  - `accno` (String)
  - `name` (String)
  - `acc_type` (String)
  - `balance` (long)
  - `sc` (Scanner)
- **Methods**:
  - `openAccount()`: Collects details to open a new account.
  - `showAccount()`: Displays account details.
  - `deposit()`: Deposits money into the account.
  - `withdrawal()`: Withdraws money from the account.
  - `search(String ac_no)`: Searches for an account by its account number.

### `BankingApp` Class

- **`main(String[] args)`**: Main method that provides the command-line menu for interacting with the banking system.
- **`createAccounts()`**: Initializes accounts with user input.
- **`listAllAccounts()`**: Lists details for all accounts.
- **`searchAccount(String ac_no)`**: Searches and displays a specific account by account number.
- **`depositAmount(String ac_no)`**: Deposits money into a specific account.
- **`withdrawAmount(String ac_no)`**: Withdraws money from a specific account.

## Error Handling

- **Invalid Account Number**: Displays an error message if the account number does not exist.
- **Insufficient Balance**: Notifies the user if there are not enough funds to withdraw.
