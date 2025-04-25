👤 AppClientes
A simple and intuitive Java command-line application designed to manage a list of clients for a candy business (or any general context). This project was developed as part of a programming class, focusing on object-oriented design and user interaction via the terminal.

📋 Overview
AppDoces allows users to:

✅ Register new client names

📄 View a list of all registered clients

🚪 Exit the system gracefully

All operations are performed through a simple menu-driven interface that runs entirely in the terminal.

🧠 How It Works
When launched, the application presents a menu with three options:

markdown
Copiar
Editar
Menu:
1. Register Client
2. View Clients
3. Exit
Option 1 allows the user to input and store a client’s name.

Option 2 displays all previously registered clients (if any).

Option 3 ends the application.

The client list is stored in memory using an ArrayList<String>. No external database or file persistence is used—this is a runtime-only client registry.

💻 Terminal Execution
To run this app from the terminal, follow these steps:

bash
Copiar
Editar
javac AppDoces.java
java AppDoces
You’ll see a welcome message and can begin using the menu options immediately.

🛠️ Installation
Clone this repository to your local machine:

bash
Copiar
Editar
git clone https://github.com/YourUsername/AppClientes.git
cd AppDoces
javac AppDoces.java
java AppDoces
⚠️ Replace YourUsername with your actual GitHub username if you're forking or uploading this to your own repository.

📦 Requirements
Java JDK 8 or later installed

A terminal or command prompt

📚 Educational Value
This app is perfect for:

Beginners learning Java

Practicing input/output handling with Scanner

Understanding control flow and loops

Learning how ArrayList works

🚀 Future Improvements
This app could be extended with:

File or database storage

Client search/filtering by name

More client attributes (email, age, etc.)

A GUI interface using JavaFX or Swing

🤝 Contribution
Want to collaborate or suggest improvements? Fork this repo, improve it, and submit a pull request! Let's make it sweeter together 🍭
