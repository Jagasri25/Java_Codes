# ✈️ Airline Reservation System

## Overview

The **Airline Reservation System** is a simple Java application designed to manage flight bookings. It allows users to view available flights and book seats on them. This system is a useful tool for managing flight reservations in a basic flight management system. 🛫

## Features

- **List Available Flights**: View all flights with their details and available seats. 📋
- **Book a Flight**: Book a seat on a selected flight by providing passenger details. 🎫
- **Exit**: Close the application. 🚪

## Requirements

- **Java Development Kit (JDK)**: Make sure you have JDK 8 or later installed. ☕️

## Usage

### How to Run

1. **Clone the Repository** 🧩

   ```sh
   git clone https://github.com/Jagasri25/AirLine_Reservation_System.git
   cd AirlineReservationSystem
   ```

2. **Compile the Code** ⚙️

   Navigate to the directory containing the `AirlineReservationSystem` class and compile the code:

   ```sh
   javac AirlineReservationSystem.java
   ```

3. **Run the Application** 🚀

   Execute the application using:

   ```sh
   java AirlineReservationSystem
   ```

   Follow the menu prompts to list available flights or book a flight.

### Menu Options

1. **List Available Flights**: Displays all flights with their flight number, destination, and available seats. ✈️
2. **Book a Flight**: Enter your details and select a flight to book a seat. ✍️
3. **Exit**: Exit the application. 🚪

### Example Usage

```text
Airline Reservation System Menu:
1. List Available Flights
2. Book a Flight
3. Exit
Enter your choice: 1

Available Flights:
Flight Number: F101, Destination: New York, Available Seats: 100
Flight Number: F102, Destination: Los Angeles, Available Seats: 120
Flight Number: F103, Destination: Chicago, Available Seats: 90

Enter your choice: 2

Enter your name: John Doe
Enter your age: 30
Enter your passport number: A12345678
Enter the flight number you want to book: F101

Seat booked successfully!

Enter your choice: 3
Exiting the program. Thank you!
```

### Code Details

- **`Passenger` Class**:
  - **Attributes**: `name`, `age`, `passportNumber`.
  - **Methods**:
    - `getName()`: Returns the passenger's name.
    - `toString()`: Provides a string representation of the passenger.

- **`Flight` Class**:
  - **Attributes**: `flightNumber`, `destination`, `availableSeats`, `passengers`.
  - **Methods**:
    - `getFlightNumber()`: Returns the flight number.
    - `getDestination()`: Returns the flight destination.
    - `getAvailableSeats()`: Returns the number of available seats.
    - `getPassengers()`: Returns the list of passengers.
    - `bookSeat(Passenger passenger)`: Books a seat for a passenger if available.

- **`AirlineReservationSystem` Class**:
  - **`main(String[] args)`**: Provides a command-line menu for interacting with the system.
  - **`initializeFlights()`**: Initializes the list of flights with predefined values.
  - **`listAvailableFlights()`**: Displays available flights.
  - **`bookAFlight(Scanner scanner)`**: Handles the booking of a flight by collecting passenger details and updating the flight.

## Error Handling

- **Invalid Flight Number**: Displays a message if the entered flight number does not exist.
- **Flight Fully Booked**: Notifies the user if there are no available seats on the selected flight.
