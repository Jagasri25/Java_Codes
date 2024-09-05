# 🔐 Password Encryption

## Overview

The `PasswordEncryption` class provides functionality for hashing strings using the SHA-512 algorithm. It converts the resulting hash into a hexadecimal string representation, which is commonly used for securely storing hashed passwords. 🛡️🔑

## Features

- **SHA-512 Hashing**: Computes a secure hash of the input string using SHA-512. 🔄
- **Hexadecimal Conversion**: Converts the byte array from the hash into a readable hexadecimal string. 🔢

## Usage

### Prerequisites

- **Java Development Kit (JDK)**: Ensure you have JDK 8 or later installed on your machine. ☕️

### How to Run

1. **Clone the Repository** 🧩

   ```sh
   git clone https://github.com/Jagasri25/PasswordEncryption.git
   cd your-repository
   ```

2. **Compile the Code** ⚙️

   Open a terminal and navigate to the directory containing the `PasswordEncryption` class, then compile the code using:

   ```sh
   javac PasswordEncryption.java
   ```

3. **Run the Application** 🚀

   After compilation, you can run the application using:

   ```sh
   java PasswordEncryption
   ```

   This will execute the `main` method, which demonstrates the hashing of two example strings.

### Code Details

- **`getSHA(String input)`**:
  - **Description**: Hashes the input string using SHA-512. 🧩
  - **Parameters**: `String input` - the string to be hashed.
  - **Returns**: A byte array representing the SHA-512 hash. 🔄

- **`toHexString(byte[] hash)`**:
  - **Description**: Converts the byte array hash into a hexadecimal string. 🌟
  - **Parameters**: `byte[] hash` - the byte array to be converted.
  - **Returns**: A hexadecimal string representation of the byte array. 🧮

- **`main(String[] args)`**:
  - **Description**: Demonstrates the use of the `getSHA` and `toHexString` methods. 📜
  - **Parameters**: `String[] args` - command-line arguments (not used in this case).

### Example

The following example demonstrates hashing two strings and outputting their hexadecimal representations:

```java
public static void main(String[] args) {
    try {
        String string1 = "examplePassword123";
        System.out.println(string1 + " : " + toHexString(getSHA(string1)));

        String string2 = "hashtrial";
        System.out.println(string2 + " : " + toHexString(getSHA(string2)));
    } catch (NoSuchAlgorithmException e) {
        System.err.println("Exception thrown for incorrect algorithm: " + e);
    }
}
```

### Output

```
examplePassword123 : [SHA-512 hash in hex]
hashtrial : [SHA-512 hash in hex]
```

## Error Handling

- **`NoSuchAlgorithmException`**: This exception is caught and handled if the SHA-512 algorithm is not available. The error message is printed to the standard error. 🚨
