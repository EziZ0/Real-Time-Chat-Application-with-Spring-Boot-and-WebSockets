# Real-Time Chat Application with Spring Boot and WebSockets

This project is a simple real-time chat application built using **Spring Boot** and **WebSockets**. It enables users to send and receive messages in real time. The front-end is built with **HTML**, **JavaScript**, and **Bootstrap**, and it communicates with the Spring Boot backend using **STOMP** over **WebSocket**.

## Features

- **Real-Time Messaging**: Users can send and receive messages instantly.
- **WebSocket Integration**: Uses WebSocket and STOMP for real-time communication.
- **Message Broadcasting**: Messages sent by one user are broadcast to all connected clients.
- **Simple User Interface**: Built using HTML, JavaScript, and Bootstrap for a clean and responsive UI.
- **Spring Boot Backend**: Handles WebSocket connections and manages message sending.

## Technologies Used

- **Spring Boot**: Backend framework for building REST APIs and handling WebSocket communication.
- **WebSockets**: Used for real-time communication between the server and clients.
- **STOMP (Simple Text Oriented Messaging Protocol)**: A messaging protocol over WebSockets.
- **SockJS**: JavaScript library to provide WebSocket-like object support.
- **Bootstrap**: For responsive and clean front-end UI.
- **JavaScript**: For the client-side logic to connect to WebSocket and manage messages.
- **Lombok**: Used for simplifying Java code by reducing boilerplate code (e.g., getters, setters).


## Important Files

- **WebSocketConfig.java**: Configures the WebSocket endpoints and message broker.
- **ChatController.java**: Contains the logic for handling WebSocket messages and broadcasting them to all clients.
- **ChatMessage.java**: Defines the structure of the chat message object.
- **chat.html**: The front-end HTML page for the chat interface.
- **application.properties**: Configures application properties like server port.

## Setup and Installation

### Prerequisites

- **Java 17** or later
- **Maven**
- **IDE** (IntelliJ IDEA, Eclipse, or similar)

### Steps to Run the Application

1. **Clone the repository**:

   ```bash
   git clone https://github.com/yourusername/real-time-chat-app.git

2.  **Navigate to the project directory**:
   
    ```bash

    cd real-time-chat-app
    
3.  **Build the application**:

     ```bash

     mvn clean install

4.   **Run and Access the chat Application**:

       ```bash

       mvn spring-boot:run
       http://localhost:8080/chat
