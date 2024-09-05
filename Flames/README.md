# Flames Game 🎮🔥

## Overview

Welcome to the Flames game! 🎉 This Java program is a fun way to determine the relationship between two people based on their names. The game uses the classic FLAMES acronym to categorize the relationship:

- **F**: Friends forever
- **L**: Lover (Boyfriend/Girlfriend)
- **A**: Affection
- **M**: Marriage (Husband/Wife)
- **E**: Enemies
- **S**: Siblings

## Features

- Interactive console-based game.
- Uses names to calculate the relationship.
- Fun and simple implementation of the classic Flames game.

## Prerequisites

- Java Development Kit (JDK) 8 or higher.
- Basic knowledge of running Java applications.

## Installation

1. **Clone the Repository (if applicable):**
   ```bash
   git clone https://github.com/Jagasri25/Flames.git
   ```

2. **Navigate to the Project Directory:**
   ```bash
   cd Flames
   ```

3. **Compile the Java Code:**
   ```bash
   javac Flames.java
   ```

## Usage

1. **Run the Program:**
   ```bash
   java Flames
   ```

2. **Follow the Prompts:**
   - Enter your name.
   - Enter your partner’s name.
   - The program will calculate and display the relationship result.

## How It Works

1. **Input Handling:**
   - Users provide their names, which are converted to lowercase to ensure case-insensitivity.

2. **Character Matching:**
   - The program compares characters from both names, marking matched characters to determine the remaining unmatched characters.

3. **FLAMES Calculation:**
   - The remaining unmatched characters are counted.
   - Using the FLAMES acronym, the game determines the relationship category by cyclically removing characters.

4. **Output:**
   - The final result is displayed with a relationship description based on the FLAMES acronym.

## Example

```bash
Welcome to Flames
Enter your name: Alice
Enter your partner name: Bob
F -> Friends forever
```

## Code Structure

- **`Flames.java`**: The main class containing the game logic.
  - **`main` Method:** Handles user input and initiates the flames calculation.
  - **`flamesCal` Method:** Computes the relationship based on input names.
  - **`countalpha` Method:** Determines the relationship category using the FLAMES acronym.
  - **`removeCharAt` Method:** Helper function to remove a character from the array.

## Contributing

Contributions are welcome! If you have ideas for improvements or bug fixes, please:
- Fork the repository and create a pull request.
- Ensure your code is well-commented and follows Java conventions.
- Test your changes thoroughly.
