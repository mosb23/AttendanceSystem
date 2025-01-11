/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import utility.BDUtility;

/**
 *
 * @author mosb2
 */
public class Student_page extends javax.swing.JFrame {

    /**
     * Creates new form Student_page
     */
    public Student_page() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Exit_btm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        ViewAtt = new javax.swing.JButton();
        QrCode = new javax.swing.JButton();
        ShowAllClasses = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 624));
        setMinimumSize(new java.awt.Dimension(1200, 624));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 624));

        Exit_btm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Exit_btm.setText("X");
        Exit_btm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_btmActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Attendance System");

        logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        ViewAtt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ViewAtt.setText("View Attendance");
        ViewAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAttActionPerformed(evt);
            }
        });

        QrCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        QrCode.setText("View Qr CODE");
        QrCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QrCodeActionPerformed(evt);
            }
        });

        ShowAllClasses.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ShowAllClasses.setText("Show All Classes");
        ShowAllClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAllClassesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(487, 487, 487)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(406, 406, 406)
                        .addComponent(Exit_btm, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(logout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShowAllClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QrCode, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Exit_btm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(165, 165, 165)
                .addComponent(QrCode, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ShowAllClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ViewAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194)
                .addComponent(logout))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Exit_btmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_btmActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_Exit_btmActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        BDUtility.openForm(Login.class.getSimpleName(), new Login());;
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void ViewAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAttActionPerformed

    }//GEN-LAST:event_ViewAttActionPerformed

    private void QrCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QrCodeActionPerformed
        BDUtility.openForm(ViewQrs.class.getSimpleName(), new ViewQrs());

    }//GEN-LAST:event_QrCodeActionPerformed

    private void ShowAllClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAllClassesActionPerformed
        // TODO add your handling code here:
        BDUtility.openForm(Stu_allClasses.class.getSimpleName(), new Stu_allClasses());

    }//GEN-LAST:event_ShowAllClassesActionPerformed

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
            java.util.logging.Logger.getLogger(Student_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit_btm;
    private javax.swing.JButton QrCode;
    private javax.swing.JButton ShowAllClasses;
    private javax.swing.JButton ViewAtt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
