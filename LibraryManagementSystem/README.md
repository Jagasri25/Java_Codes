# Library System 📚

## Overview

The `LibrarySystem` Java application provides a simple console-based interface for managing a library. It allows users to add students and books, search for books by serial number or author name, check out and check in books, and view lists of all books and students. The system handles up to 50 books and students each.

## Features

- **Add Students**: Register new students.
- **Add Books**: Add new books to the library.
- **Search Books**: Find books by serial number or author name.
- **Show All Books**: Display a list of all books in the library.
- **Upgrade Book Quantity**: Increase the number of copies of a book.
- **Check Out Books**: Allow students to borrow books.
- **Check In Books**: Allow students to return borrowed books.
- **Show All Students**: Display a list of all registered students.

## Prerequisites

- Java Development Kit (JDK) 8 or higher.

## Installation

1. **Clone the Repository (if applicable):**
   ```bash
   git clone https://github.com/Jagasri25/LibraryManagementSystem.git
   ```

2. **Navigate to the Project Directory:**
   ```bash
   cd LibrarySystem
   ```

3. **Compile the Java Code:**
   ```bash
   javac LibrarySystem.java
   ```

## Usage

1. **Run the Program:**
   ```bash
   java LibrarySystem
   ```

2. **Menu Options:**
   - **Add Student (1)**: Register a new student.
   - **Add Book (2)**: Add a new book to the library.
   - **Search Book by Serial Number (3)**: Find a book by its serial number.
   - **Search Book by Author Name (4)**: Find books by a specific author.
   - **Show All Books (5)**: Display a list of all books.
   - **Upgrade Quantity of a Book (6)**: Increase the quantity of a specific book.
   - **Check Out Book (7)**: Borrow a book from the library.
   - **Check In Book (8)**: Return a borrowed book.
   - **Show All Students (9)**: Display a list of all registered students.
   - **Exit (0)**: Exit the library system.

## Code Structure

- **`Book.java`**: Represents a book in the library.
  - **Attributes**: Serial number, name, author, quantity, available quantity.
  - **Constructor**: Initializes book details via user input.

- **`Student.java`**: Represents a student registered in the library.
  - **Attributes**: Name, registration number, borrowed books, and count of borrowed books.
  - **Constructor**: Initializes student details via user input.

- **`Books.java`**: Manages the collection of books.
  - **Methods**: Add books, search by serial number or author, show all books, upgrade book quantity, check out and check in books.

- **`Students.java`**: Manages the list of students.
  - **Methods**: Add students, show all students, check if a student is registered, handle book checkouts and check-ins.

- **`LibrarySystem.java`**: The main entry point of the application.
  - **Methods**: Provides a menu-driven interface to interact with the library system.

## Example

Here's an example of using the library system:

```bash
Library System Menu:
1. Add Student
2. Add Book
3. Search Book by Serial Number
4. Search Book by Author Name
5. Show All Books
6. Upgrade Quantity of a Book
7. Check Out Book
8. Check In Book
9. Show All Students
0. Exit

Enter your choice: 1
Enter Student Name:
John Doe
Enter Registration Number:
12345

Enter your choice: 2
Enter Serial No of Book:
1
Enter Book Name:
Java Programming
Enter Author Name:
Jane Smith
Enter Quantity of Books:
10

Enter your choice: 5
Showing All Books
S.No		Name		Author		Available Qty		Total Qty
1		Java Programming		Jane Smith		10		10

Enter your choice: 0
Exiting Library System.
```

## Code Enhancements

Feel free to enhance the system by adding features such as:
- **Persistence**: Save and load library data from a file.
- **User Interface**: Implement a graphical user interface (GUI).
- **Advanced Search**: Add more search options (e.g., by publication year).

## Contributing

Contributions are welcome! If you have ideas for enhancements or bug fixes, please:
- Fork the repository and create a pull request.
- Ensure your code follows Java conventions and is well-documented.
- Test your changes thoroughly.
