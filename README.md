# 📚 Library Management System

A simple Library Management System project built using Java and Object-Oriented Programming (OOP) concepts.  
Tracks books, members, and issue/return transactions with a fully interactive console-based menu.

## ✅ Features

- Add books and members
- Search books by ISBN
- Issue and return books
- Display all books, members, and issued book transactions
- Tracks which member issued which book (with member name)
- Interactive console menu for easy usage

## ⚙ Technologies Used

- Java (JDK 8+)
- OOP Concepts: Classes, Objects, Encapsulation, Interfaces
- ArrayList for data storage

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/armankhan-sourcecode/Library_Management_System.git

2. Open the project in an IDE (like IntelliJ IDEA).
3. Run the Main.java class.
4. Follow the interactive console menu to manage books and members

## 📋 Sample Example

▶️ 1️⃣ Before Issuing Any Book  
Books in Library:  
Clean Code | ISBN: 9780132350884 | Qty: 2  
Effective Java | ISBN: 9780134685991 | Qty: 1  

Members:    
Alice Johnson | ID: M001    
Bob Smith     | ID: M002    

▶️ 2️⃣ Issuing a Book    
Enter Member ID to issue book: M001    
Enter ISBN of the book to issue: 9780132350884    

[DEBUG] Searching for Member ID: 'M001'  
[DEBUG] Searching for ISBN: '9780132350884'  
Book issued: Clean Code to Alice Johnson  

▶️ 3️⃣ After Issuing the Book  
Books in Library:  
Clean Code | ISBN: 9780132350884 | Qty: 1  
Effective Java | ISBN: 9780134685991 | Qty: 1  

Issued Books:  
Book: Clean Code | Issued to: Alice Johnson  

▶️ 4️⃣ Attempting to Issue a Non-Existent Book  
Enter Member ID to issue book: M001  
Enter ISBN of the book to issue: 0000000000000  

[DEBUG] Searching for Member ID: 'M001'  
[DEBUG] Searching for ISBN: '0000000000000'  
Book not found.  

## ⚡ Notes

   ✔️ Make sure to enter correct Member ID and ISBN (without extra spaces).  
   ✔️ This project is built for learning purposes and demonstration of OOP in Java.  

## 📜 License

   This project is open-source and free to use.   
