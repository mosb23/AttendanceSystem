/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author mosb2
 */
public class tables {
    
    public static void main (String[] args){
        Connection con = null;
        Statement st = null;
         try{
             con = ConnectionProvider.getCon();
             st = con.createStatement();
             
    // UserDetails entity
if (!tableExists(st, "admin")) {
    st.executeUpdate("CREATE TABLE admin (" +
                    "admin_id INT AUTO_INCREMENT PRIMARY KEY," +
                    "password VARCHAR(255)," +
                    "name VARCHAR(255)," +
                    "role ENUM('Admin')" +
                    ")");
}

// UserAttendance entity
if (!tableExists(st, "doctor")) {
    st.executeUpdate("CREATE TABLE doctor (" +
        "doctor_id INT AUTO_INCREMENT PRIMARY KEY," +
        "password VARCHAR(255)," +
        "name VARCHAR(255)," +
        "department_id INT," +
        "contact VARCHAR(20) UNIQUE," +
        "email VARCHAR(255) UNIQUE," +
        "gender ENUM('Male', 'Female')," +
        "role ENUM('Doctor')," +
        "username VARCHAR(255) UNIQUE, " + 
        "FOREIGN KEY (department_id) REFERENCES department(department_id)" +
        ")");
}

if (!tableExists(st, "department")) {
    st.executeUpdate("CREATE TABLE department (" +
                    "department_id INT AUTO_INCREMENT PRIMARY KEY," +
                    "department_name VARCHAR(255)" +
                    ")");
}

if (!tableExists(st, "student")) {
    st.executeUpdate("CREATE TABLE student (" +
        "student_id INT AUTO_INCREMENT PRIMARY KEY," +
        "password VARCHAR(255)," +
        "name VARCHAR(255)," +
        "department_id INT," +
        "course_id INT," +
        "contact VARCHAR(20) UNIQUE," +
        "email VARCHAR(255) UNIQUE," +
        "gender ENUM('Male', 'Female')," +
        "role ENUM('Student')," +
        "username VARCHAR(255) UNIQUE, " + // Add username column here
        "FOREIGN KEY (department_id) REFERENCES department(department_id)," +
        "FOREIGN KEY (course_id) REFERENCES course(course_id)" +
        ")");
}

if (!tableExists(st, "course")) {
st.executeUpdate("CREATE TABLE course (" +
    "course_id INT AUTO_INCREMENT PRIMARY KEY," +
    "course_name VARCHAR(255)," +
    "course_code VARCHAR(255) UNIQUE," + // Add course_code column with UNIQUE constraint
    "department_id INT," +
    "FOREIGN KEY (department_id) REFERENCES department(department_id)" +
    ")");
}

if (!tableExists(st, "class")) {
    st.executeUpdate("CREATE TABLE class (" +
        "class_id INT AUTO_INCREMENT PRIMARY KEY," + 
        "course_id INT, " + // Add course_id column
        "class_name VARCHAR(255)," +
        "doctor_id INT," +
        "FOREIGN KEY (course_id) REFERENCES course(course_id)," + // Add foreign key for course_id
        "FOREIGN KEY (doctor_id) REFERENCES doctor(doctor_id)" +
        ")");
}
if (!tableExists(st, "student_class")) {
    st.executeUpdate("CREATE TABLE student_class (" +
                    "student_class_id INT AUTO_INCREMENT PRIMARY KEY," +
                    "student_id INT," +
                    "class_id INT," +
                    "FOREIGN KEY (student_id) REFERENCES student(student_id)," +
                    "FOREIGN KEY (class_id) REFERENCES class(class_id)" +
                    ")");
}
if (!tableExists(st, "student_attendance")) {
    st.executeUpdate("CREATE TABLE student_attendance (" +
                    "attendance_id INT AUTO_INCREMENT PRIMARY KEY," +
                    "student_id INT," +
                    "class_id INT," +
                    "attendance_date DATE," +
                    "status ENUM('Present', 'Absent')," +
                    "FOREIGN KEY (student_id) REFERENCES student(student_id)," +
                    "FOREIGN KEY (class_id) REFERENCES class(class_id)" +
                    ")");
}
            JOptionPane.showMessageDialog(null,"tables checked/Created successfully");
         
     }   catch (Exception ex){
         JOptionPane.showMessageDialog(null, ex);
         
     }  finally{
             try{
                 if(con!=null){
                     con.close();
                 }
                 if(st!=null){
                     st.close();
                 }
             }catch(Exception ex) {
                 ex.printStackTrace();
             }
         }
         
            
    }
    
    
    
    private static boolean tableExists(Statement st ,String tableName)throws 
            Exception {
        ResultSet resultSet = st.executeQuery("show tables like '"+ tableName +"'");
        return resultSet.next();
        
    }
    
}
