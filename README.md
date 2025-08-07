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

## Running Instructions

1. **Clone the Repository**

   ```bash
   git clone https://github.com/sheetkulkarni01/Banking_application_Java.git
   cd Banking_application_Java/src/main/java
   ```

2. **Compile**

   ```bash
   javac bank/*.java
   ```

3. **Run**

   ```bash
   java bank.Main
   ```

---

## Sample run

```plaintext

1.Create new account 2.Open existing account 3.Check Balance 4.Display richest person in the bank 5.exit
Enter your choice: 1
Enter your name: Alice
Enter your address: Wonderland
Your account number is: 1
Your account has been created
```

---

## Requirements

- Java 8 or above

---

## Learnings

This project demonstrates the use of:
- Classes and objects
- Encapsulation
- Java Collections (`HashMap`)
- CLI user interaction

---

## Project Structure

```plaintext
                    
├── src                                    
|   └── main 
|   |   └── java
|   |       └── bank
|   |           ├── Account.java # Represents an account (name, balance, etc.)
|   |           ├── Bank.java # Handles banking operations
|   |           └── Main.java # Main CLI entry point              
|   └── test
|        └── java 
|            └── bank
|                ├── Create.java
|                └── Banking.java                                          
├── .gitignore        
└── README.md                       
```

---

