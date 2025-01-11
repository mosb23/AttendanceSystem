package dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException; // Import for handling SQL exceptions

/**
 * This class provides a connection to the MySQL database.
 * 
 * @author mosb2
 */
public class ConnectionProvider {

    private static final String DB_NAME = "attendancejframebd";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/"; // Removed trailing slash for better URL construction
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";

    /**
     * Establishes a connection to the MySQL database.
     * 
     * @return A Connection object if successful, null otherwise.
     */
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Check if database exists before attempting connection with the database name
            if (!databaseExists(DB_NAME)) {
                createDataBase(DB_NAME);
            }

            // Connect to the database with the specified database name
            Connection con = DriverManager.getConnection(DB_URL + DB_NAME + "?useSSL=false", DB_USERNAME, DB_PASSWORD);
            return con;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    /**
     * Checks if a database with the given name exists.
     * 
     * @param con An existing connection to the MySQL server.
     * @param dbName The name of the database to check.
     * @return True if the database exists, false otherwise.
     * @throws SQLException If an error occurs while executing the query.
     */
    private static boolean databaseExists(String dbName) throws SQLException {
        try (Connection con = DriverManager.getConnection(DB_URL + "?useSSL=false", DB_USERNAME, DB_PASSWORD)) {
            Statement stmt = con.createStatement();
            return stmt.executeQuery("SHOW DATABASES LIKE '" + dbName + "'").next();
        }
    }

    /**
     * Creates a new database with the given name.
     * 
     * @param dbName The name of the database to create.
     * @throws SQLException If an error occurs while creating the database.
     */
    private static void createDataBase(String dbName) throws SQLException {
        try (Connection con = DriverManager.getConnection(DB_URL + "?useSSL=false", DB_USERNAME, DB_PASSWORD)) {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("CREATE DATABASE " + dbName);
            System.out.println("Database '" + dbName + "' created successfully.");
        }
    }
}