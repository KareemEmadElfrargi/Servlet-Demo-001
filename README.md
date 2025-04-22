# Embedded Tomcat Servlet Project

This project demonstrates how to run a basic **embedded Tomcat** server and create a servlet that dynamically greets a user based on the `userName` parameter passed in the URL.

## Features

- Embedded **Apache Tomcat 11.0.3** server.
- Servlet that handles HTTP requests and generates a personalized greeting.
- Accepts a `userName` parameter from the URL to display a dynamic greeting.

## Project Structure

App.java: Main class to start the embedded Tomcat server.
HelloServlet.java: Servlet that handles HTTP requests and displays dynamic greetings.

## Dependencies (Maven)
Apache Tomcat 11.0.3 (embedded)
Jakarta Servlet API


## Example of a Personalized Greeting:
URL: http://localhost:2025/hello?userName=Kareem

Output: Hello Kareem!


