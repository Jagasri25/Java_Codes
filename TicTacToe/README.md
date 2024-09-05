# TicTacToe Game 🎮

## Overview

`TicTacToe` is a simple console-based Java application that allows two players to play the classic game of Tic-Tac-Toe. The game board is represented in a 3x3 grid, and players take turns to place their marks ('X' or 'O') on the board. The game checks for a win or draw after each move.

## Features

- **Two-Player Mode**: Play with another person on the same machine.
- **Game Board**: Visual representation of the Tic-Tac-Toe grid.
- **Win/Draw Detection**: Automatically detects when a player wins or if the game is a draw.
- **User Input**: Players provide their moves via the console.

## Prerequisites

- Java Development Kit (JDK) 8 or higher.

## Installation

1. **Clone the Repository (if applicable):**
   ```bash
   git clone https://github.com/Jagasri25/TicTacToe.git
   ```

2. **Navigate to the Project Directory:**
   ```bash
   cd TicTacToe
   ```

3. **Compile the Java Code:**
   ```bash
   javac TicTacToe.java
   ```

## Usage

1. **Run the Program:**
   ```bash
   java TicTacToe
   ```

2. **Play the Game:**
   - Players will take turns to enter their moves.
   - Input the row and column numbers (0, 1, or 2) where you want to place your mark.

3. **Game Output:**
   - The board will be printed to the console after each move.
   - The game will announce the winner or declare a draw when the game ends.

## How It Works

1. **Initialize Board:**
   - The game board is initialized with empty spaces.

2. **Player Moves:**
   - Players input their row and column choices to place their mark.
   - Input validation ensures moves are within bounds and on empty cells.

3. **Check for Win/Draw:**
   - The game checks rows, columns, and diagonals to determine if there is a winner.
   - It also checks if the board is full to declare a draw if no winner is found.

4. **Switch Player:**
   - The game alternates between Player X and Player O after each move.

## Example

Here’s a sample gameplay:

```bash
Player X, enter your row (0, 1, 2) and column (0, 1, 2): 0 0
Player O, enter your row (0, 1, 2) and column (0, 1, 2): 1 1
Player X, enter your row (0, 1, 2) and column (0, 1, 2): 0 1
Player O, enter your row (0, 1, 2) and column (0, 1, 2): 2 2
Player X, enter your row (0, 1, 2) and column (0, 1, 2): 0 2
Player X wins! 🎉
```

## Code Structure

- **`TicTacToe.java`**: Contains the game logic and user interaction.
  - **`main` Method:** Initializes the game, handles player moves, and controls game flow.
  - **`initializeBoard` Method:** Sets up the game board with empty spaces.
  - **`printBoard` Method:** Prints the current state of the board.
  - **`makeMove` Method:** Handles player input and updates the board.
  - **`checkForWin` Method:** Determines if there’s a winner or if the game is a draw.
  - **`switchPlayer` Method:** Switches the active player.

## Contributing

Contributions are welcome! If you have ideas for enhancements or bug fixes, please:
- Fork the repository and create a pull request.
- Ensure your code follows Java conventions and is well-documented.
- Test your changes thoroughly.
