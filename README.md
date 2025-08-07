# Simple Java Banking System

A basic command-line banking system written in Java. This project supports account creation, deposits, withdrawals, transfers, balance inquiries, and displays the richest account holder. This project also demonstrates unit testing with **JUnit**.

---

## Features

- Create and manage multiple accounts
- Deposit and withdraw funds
- Transfer money between accounts
- Check balance
- Display the richest account holder

---

## Project Structure

├── src/
│ ├── main/
│ │ └── java/
│ │ └── bank/
│ │ ├── Account.java # Represents an account (name, balance, etc.)
│ │ ├── Bank.java # Handles banking operations
│ │ └── Final1.java # Main CLI entry point
│ │
│ └── test/
│ └── java/
│ └── bank/
│ ├── Create.java # Dummy logic for test coverage
│ └── Banking.java # JUnit test cases for Create.java
│
├── .gitignore
└── README.md