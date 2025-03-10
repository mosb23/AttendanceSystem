/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import dao.ConnectionProvider;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;



/**
 *
 * @author My Lab
 */

public class AssignClass extends javax.swing.JFrame {

    /**
     * Creates new form UserRegistration
     */
    public AssignClass() {
        initComponents();
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4, Color.BLACK));
        loadCourseNames();
    
           courseComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    loadClassesForSelectedCourse();
                }
            }
        });
           
           
        assignButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                assignClass(); 
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });

           
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        studentUserNameTextField = new javax.swing.JTextField();
        courseNameComboBox = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        assignButton = new javax.swing.JButton();
        courseComboBox = new javax.swing.JComboBox<>();
        lblDep1 = new javax.swing.JLabel();
        classNameComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 600));
        setUndecorated(true);

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setText("x");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Student Registration");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName.setText("Student UserName");

        studentUserNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentUserNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentUserNameTextFieldActionPerformed(evt);
            }
        });

        courseNameComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        courseNameComboBox.setText("Course Name");

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        assignButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        assignButton.setText("Assign");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });

        courseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        courseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseComboBoxActionPerformed(evt);
            }
        });

        lblDep1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDep1.setText("Class Name");

        classNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        classNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classNameComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(387, 387, 387)
                .addComponent(btnExit)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(courseNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblDep1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseNameComboBox))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDep1)
                    .addComponent(classNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void studentUserNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentUserNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentUserNameTextFieldActionPerformed


    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed

    }//GEN-LAST:event_assignButtonActionPerformed

    private void courseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseComboBoxActionPerformed

    }//GEN-LAST:event_courseComboBoxActionPerformed

    private void classNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classNameComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classNameComboBoxActionPerformed
 private void loadCourseNames() {
        try (Connection con = ConnectionProvider.getCon();
             PreparedStatement stmt = con.prepareStatement("SELECT course_name FROM course")) {

            ResultSet rs = stmt.executeQuery();
            courseComboBox.removeAllItems();

            while (rs.next()) {
                courseComboBox.addItem(rs.getString("course_name"));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error loading courses: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(); // Print the exception for debugging
        }
    }



private void loadClassesForSelectedCourse() {
        String selectedCourse = (String) courseComboBox.getSelectedItem();

        try (Connection con = ConnectionProvider.getCon();
             PreparedStatement stmt = con.prepareStatement(
                     "SELECT cl.class_name FROM Class cl JOIN Course c ON cl.course_id = c.course_id " +
                     "WHERE c.course_name = ?")) {

            stmt.setString(1, selectedCourse);
            ResultSet rs = stmt.executeQuery();
            classNameComboBox.removeAllItems();

            while (rs.next()) {
                classNameComboBox.addItem(rs.getString("class_name"));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error loading classes: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(); // Print the exception for debugging
        }
    }
 private void assignClass() {
    String studentUserName = studentUserNameTextField.getText().trim();
    String selectedClassName = (String) classNameComboBox.getSelectedItem();

    // Input validation
    if (studentUserName.isEmpty() || selectedClassName.isEmpty() ) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection con = ConnectionProvider.getCon();
         PreparedStatement stmt = con.prepareStatement(
             "SELECT COUNT(*) FROM student WHERE username = ?")) {

        stmt.setString(1, studentUserName);
        ResultSet rs = stmt.executeQuery();

        if (rs.next() && rs.getInt(1) > 0) { 
            // Student exists, proceed with class assignment
            try (PreparedStatement insertStmt = con.prepareStatement(
                     "INSERT INTO student_class (student_id, class_id) " +
                     "VALUES ((SELECT student_id FROM student WHERE username = ?), " +
                     "(SELECT class_id FROM class WHERE class_name = ?))")) {

                insertStmt.setString(1, studentUserName);
                insertStmt.setString(2, selectedClassName);

                int rowsInserted = insertStmt.executeUpdate();

                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Class Assigned successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    clearForm(); 
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to assign class. Please check if the student and class exist.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } 
        } else {
            JOptionPane.showMessageDialog(null, "Student with the given username does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // For debugging
    }
}
    private void clearForm() {
        studentUserNameTextField.setText("");
        courseComboBox.setSelectedIndex(0); // Select the first item (or leave it empty)
        classNameComboBox.removeAllItems(); // Clear the class combo box
    }
    
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AssignClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignButton;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> classNameComboBox;
    private javax.swing.JComboBox<String> courseComboBox;
    private javax.swing.JLabel courseNameComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDep1;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField studentUserNameTextField;
    // End of variables declaration//GEN-END:variables
}
