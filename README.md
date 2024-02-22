# Trading Card Game Client

This project includes a Java client for a simplified network-based trading card game, which interacts with a centralized server hosted by the university. Players authenticate with the server using their credentials and can then trade cards and manage their collection.

## Features
- Enum for card ranks.
- Card class with ID, name, rank, and price attributes.
- Client class for server communication and command processing.
- Input stream class for reading card details.
- Trading methods to buy and sell cards.

## Skills Learned
- Utilizing Java streams for network communication.
- Implementing object-oriented design principles.
- Enumerations, sorting algorithms, and comparable interfaces in Java.
- Writing test cases and using a provided JAR file for testing.

## Installation
Ensure you have Java installed on your system. If not, install the JDK from Oracle's website or an open-source alternative like OpenJDK.

1. Clone or download the project files to your local machine.

## Usage
This client is exclusively for use with the university server and requires a VPN connection to the university network for external access.

1. Compile the Java files using the `javac` command.
2. Run the `HollomonClient` program with the server address and port.
3. Log in with your university-provided credentials.

## Testing

The project includes test classes for the `Card` and `HollomonClient` classes. Compile these with the other Java files and run them to ensure functionality.

`java CardTest java HollomonClientTest`

The output will indicate whether the tests pass or fail.