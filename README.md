# AttendanceSystem

This project implements a simple Student Registration System using Java Swing for the user interface and JDBC for database interaction.

**Features:**

- **User-friendly GUI:** A visually appealing and intuitive interface for students to register.
- **Data Entry and Validation:** Collects student information (name, gender, email, contact, department, password) and performs basic input validation.
- **Department Selection:** Allows students to select their department from a dropdown list.
- **Database Interaction:** Stores student registration data in a MySQL database.
- **Error Handling:** Displays informative error messages to the user in case of invalid input or database errors.

**Technologies Used:**

- **Java:** Programming language.
- **Swing:** Java GUI library.
- **JDBC:** Java Database Connectivity for database interaction.
- **MySQL:** Relational database management system.

**How to Run:**

1. **Prerequisites:**
   - Install Java Development Kit (JDK) and set up the environment variables.
   - Install MySQL and create a database (e.g., "attendance_system").
   - Create the necessary tables in the database (refer to the SQL scripts in the `sql` directory).
   - Add the MySQL JDBC driver JAR file to the project's classpath.

2. **Build and Run:**
   - Compile the Java source files.
   - Run the compiled Java class (e.g., `StudentRegistration.class`).

**Project Structure:**

- `src/`: Contains the source code files (e.g., `StudentRegistration.java`, `ConnectionProvider.java`).
- `sql/`: Contains SQL scripts for creating database tables.
- `images/`: Contains any images used in the GUI (if applicable).
