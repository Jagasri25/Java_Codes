# WeatherApp 🌦️

## Overview

`WeatherApp` is a simple Java application that retrieves and displays current weather data for a specified city using the OpenWeatherMap API. It demonstrates how to make an HTTP request, handle API responses, and parse weather information.

## Features

- Fetches current weather data for a specified city.
- Uses the OpenWeatherMap API for weather information.
- Prints raw weather data to the console.

## Prerequisites

- Java Development Kit (JDK) 8 or higher.
- An OpenWeatherMap API key. [Sign up here](https://home.openweathermap.org/users/sign_up) to get one.

## Installation

1. **Clone the Repository (if applicable):**
   ```bash
   git clone https://github.com/Jagasri25/WeatherApp.git
   ```

2. **Navigate to the Project Directory:**
   ```bash
   cd WeatherApp
   ```

3. **Compile the Java Code:**
   ```bash
   javac WeatherApp.java
   ```

## Usage

1. **Update the API Key:**
   - Open `WeatherApp.java` and replace `"YOUR_API_KEY"` with your actual OpenWeatherMap API key.

2. **Run the Program:**
   ```bash
   java WeatherApp
   ```

3. **Output:**
   - The program will display the raw weather data for the city specified in the code (`"New York"` by default).

4. **Change City:**
   - To fetch weather data for a different city, update the `city` variable in the `main` method.

## How It Works

1. **API Request:**
   - The program constructs a URL with the city name and API key to request weather data from the OpenWeatherMap API.

2. **HTTP Connection:**
   - Opens a connection to the API and sends a GET request.

3. **Read Response:**
   - Reads the response from the API and builds a string from the received data.

4. **Display Data:**
   - Prints the raw JSON response to the console. You may need to parse this data to extract and display specific weather details.

## Example

```bash
Weather Data:
{
  "coord": { "lon": -74.006, "lat": 40.7143 },
  "weather": [{ "id": 801, "main": "Clouds", "description": "few clouds", "icon": "02d" }],
  "base": "stations",
  "main": { "temp": 295.15, "feels_like": 295.16, "temp_min": 293.32, "temp_max": 297.14, "pressure": 1013, "humidity": 77 },
  "visibility": 10000,
  "wind": { "speed": 4.12, "deg": 120 },
  "clouds": { "all": 20 },
  "dt": 1609459200,
  "sys": { "type": 1, "id": 4610, "country": "US", "sunrise": 1609443315, "sunset": 1609496492 },
  "timezone": -18000,
  "id": 5128581,
  "name": "New York",
  "cod": 200
}
```

## Code Structure

- **`WeatherApp.java`**: Main class containing the code to fetch and display weather data.
  - **`main` Method:** Sets up the API request, handles the response, and prints the weather data.

## Contributing

Contributions are welcome! If you have ideas for enhancements or bug fixes, please:
- Fork the repository and create a pull request.
- Ensure code follows Java conventions and is well-documented.
- Test your changes thoroughly.
