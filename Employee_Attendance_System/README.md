# 📋 Employee Attendance System

## Overview

The **Employee Attendance System** is a Java-based application designed to manage employee attendance records. It allows you to add employees, mark their attendance, and view attendance history. This system is ideal for keeping track of employee presence in an organization. 🏢📅

## Features

- **Add Employee**: Register new employees with a unique ID and name. ✍️
- **Mark Attendance**: Record the attendance of employees with a timestamp. 🕒
- **View Attendance**: Check the attendance history of employees. 📜

## Requirements

- **Java Development Kit (JDK)**: Ensure you have JDK 8 or later installed. ☕️

## Usage

### How to Run

1. **Clone the Repository** 🧩

   ```sh
   git clone https://github.com/Jagasri25/Employee_Attendance_System.git
   cd your-repository
   ```

2. **Compile the Code** ⚙️

   Navigate to the directory containing the `AttendanceSystem` class and compile the code:

   ```sh
   javac AttendanceSystem.java
   ```

3. **Run the Application** 🚀

   Execute the application using:

   ```sh
   java AttendanceSystem
   ```

   Follow the menu prompts to add employees, mark attendance, or view attendance records.

### Menu Options

1. **Add Employee**: Enter the employee's name to add them to the system. Each employee is assigned a unique ID. 🆔
2. **Mark Attendance**: Input the employee ID to mark their attendance for the current time. 🕰️
3. **View Attendance**: Enter the employee ID to view their attendance records. 📋
4. **Exit**: Close the application. 🚪

### Code Details

- **`Employee` Class**:
  - **Attributes**: `name`, `id`, `attendance` (list of timestamps).
  - **Methods**:
    - `markAttendance()`: Records the current date and time as attendance.
    - `getAttendance()`: Retrieves the list of attendance records.
    - `getName()`: Returns the employee's name.
    - `getId()`: Returns the employee's ID.

- **`AttendanceSystem` Class**:
  - **`main(String[] args)`**: Provides a command-line menu for interacting with the system.
  - **`findEmployeeById(List<Employee> employees, int id)`**: Finds and returns an `Employee` object by ID.

### Example Usage

```text
Employee Attendance System Menu:
1. Add Employee
2. Mark Attendance
3. View Attendance
4. Exit
Select an option (1/2/3/4): 1

Enter the employee's name: John Doe
Employee added successfully.

Select an option (1/2/3/4): 2

Enter employee ID to mark attendance: 1
Attendance marked for John Doe

Select an option (1/2/3/4): 3

Enter employee ID to view attendance: 1
Attendance records for John Doe:
2024-09-05 12:34:56
```

## Error Handling

- **Invalid Option**: Prompts the user to select a valid option (1, 2, 3, or 4).
- **Employee Not Found**: Displays a message if the entered employee ID does not exist in the system. ❓
