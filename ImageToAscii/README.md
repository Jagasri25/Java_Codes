# ImageToAscii

## Overview

`ImageToAscii` is a Java application that converts images into ASCII art. The program reads an image file, processes it to grayscale, and maps its pixel values to ASCII characters based on predefined thresholds. The resulting ASCII art is printed to the console.

## Features

- Converts images to ASCII art.
- Supports grayscale images.
- Customizable ASCII symbols and thresholds.
- Handles images through command-line arguments.

## Prerequisites

- Java Development Kit (JDK) 8 or higher.
- An image file in a supported format (e.g., PNG, JPEG).

## Installation

1. **Clone the Repository (if applicable):**
   ```bash
   git clone https://github.com/Jagasri25/ImageToAscii.git
   ```

2. **Navigate to the Project Directory:**
   ```bash
   cd ImageToAscii
   ```

3. **Compile the Java Code:**
   ```bash
   javac ImageToAscii.java
   ```

## Usage

1. **Run the Program:**
   ```bash
   java ImageToAscii [image_path]
   ```
   - Replace `[image_path]` with the path to the image file you want to convert.
   - If no image path is provided, the program defaults to `sample_image.png`.

2. **Input Example:**
   ```bash
   java ImageToAscii my_image.png
   ```

## How It Works

1. **Image Loading:**
   - The program reads the specified image file. If no file is specified, it defaults to `sample_image.png`.

2. **Grayscale Conversion:**
   - The image is converted to grayscale to simplify the conversion to ASCII.

3. **Image Resizing:**
   - The grayscale image is resized to reduce its dimensions. The width is scaled down by a factor of 20, and the height by a factor of 40.

4. **ASCII Conversion:**
   - Each block of pixels in the resized image is averaged to get a grayscale value.
   - The grayscale value is mapped to an ASCII character using predefined thresholds:
     - `"#"` for darkest
     - `"-"`
     - `"*"`
     - `"."`
     - `"+"`
     - `"o"` for lightest

5. **Output:**
   - The ASCII art representation of the image is printed to the console.

## Code Structure

- **`ImageToAscii.java`**: Main class containing the functionality for image processing and ASCII conversion.
  - **`main` Method:** Entry point that handles image loading, processing, and output.
  - **`imgToAscii` Method:** Converts a grayscale image to an ASCII representation.
  - **`printOutAscii` Method:** Prints the ASCII art to the console.

## Example

Here is a simple example of running the program:

```bash
java ImageToAscii example_image.png
```

Output (to console):
```
#######---***
##--***---
--****--+--
...---o----
```

## Contributing

Contributions are welcome! Please follow these guidelines:
- Fork the repository and create a pull request.
- Ensure code is well-commented and follows Java conventions.
- Test your changes thoroughly.
