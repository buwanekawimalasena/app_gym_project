/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logging_Forget_Pass;

import Class_Files.DB;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Buwaneka
 */
public class Logging extends javax.swing.JFrame {

    /**
     * Creates new form Logging
     */
    public Logging() {
        initComponents();
        setLocationRelativeTo(null);
        jButton5_Logging.setEnabled(false);
        txtUserName.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jButton5_Fpass = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jButton5_Logging = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(208, 171, 3));
        jPanel2.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Version 1.01");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(102, 62, 100, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logging_Forget_Pass/Loging_logo.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 0, 90, 90);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ARUNA FITNESS CENTER ");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(100, 18, 210, 20);

        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("GYM MANAGEMENT SYSTEM");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(102, 42, 210, 20);

        jPanel3.setBackground(new java.awt.Color(235, 192, 29));
        jPanel3.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8);
        jLabel8.setBounds(490, 0, 60, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 540, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, -1, 560, 90);

        txtUserName.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        txtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
        });
        jPanel1.add(txtUserName);
        txtUserName.setBounds(90, 190, 360, 28);

        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtpassword);
        txtpassword.setBounds(90, 250, 360, 30);

        jButton5_Fpass.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jButton5_Fpass.setText("Forget Password ?");
        jButton5_Fpass.setBorderPainted(false);
        jButton5_Fpass.setContentAreaFilled(false);
        jButton5_Fpass.setFocusPainted(false);
        jButton5_Fpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_FpassActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5_Fpass);
        jButton5_Fpass.setBounds(80, 330, 160, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 140, 510, 10);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Password :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(90, 220, 150, 30);

        jButton5_Logging.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jButton5_Logging.setText("Login");
        jButton5_Logging.setFocusPainted(false);
        jButton5_Logging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_LoggingActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5_Logging);
        jButton5_Logging.setBounds(90, 290, 360, 30);

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setText(" SANKALPA SOLUTIONS");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(400, 430, 160, 40);

        jLabel18.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Login");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(60, 110, 110, 20);

        jCheckBox1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        jCheckBox1.setText("Show");
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.setFocusable(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(455, 250, 70, 27);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logging_Forget_Pass/icon_lock.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 100, 50, 40);

        jLabel21.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("User Name :");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(90, 160, 110, 30);

        jLabel22.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText(" Software Develpoed By");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(250, 430, 170, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logging_Forget_Pass/icon_SS.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(440, 380, 70, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased

        try {

            if (txtUserName.getText().length() == 0) {
                jButton5_Logging.setEnabled(false);
            } else {
                if (txtUserName.getText().length() != 0
                        && txtpassword.getText().length() != 0) {

                    jButton5_Logging.setEnabled(true);
                }
            }

            txtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 109, 109)));

            if (evt.getKeyCode() == 10) {
                txtpassword.grabFocus();
            }

        } catch (NullPointerException n) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtUserNameKeyReleased

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped

        try {
            System.gc();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtUserNameKeyTyped

    private void jButton5_FpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_FpassActionPerformed

        try {

            Forget_password pas = new Forget_password();
            pas.setVisible(true);
            this.dispose();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton5_FpassActionPerformed

    int User = 0;
    int Password = 0;

    private void jButton5_LoggingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_LoggingActionPerformed

        try {

            byte i = 0;

            String Un = txtUserName.getText();
            String Pa = txtpassword.getText();

            ResultSet rs1 = DB.search("SELECT * FROM user_account WHERE User_Name='" + Un + "' AND Password= '" + Pa + "'  ");
            while (rs1.next()) {
                i = 1;
               // Un = rs1.getString("User_Name");
            }

            if (i == 0) {

                ResultSet rs2 = DB.search("SELECT * FROM user_account");
                while (rs2.next()) {

                    if (rs2.getString("User_Name").equals(txtUserName.getText())) {
                        User = 1;
                    }

                    if (rs2.getString("Password").equals(txtpassword.getText())) {
                        Password = 1;
                    }

                    if (Password == 0) {
                        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
                        txtpassword.setText("");
                    }
                    if (User == 0 && Password == 1) {

                        txtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
                        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
                        txtpassword.setText("");
                        txtUserName.setText("");

                    }
                    if (User == 0 && Password == 0) {

                        txtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
                        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
                        txtpassword.setText("");
                        txtUserName.setText("");

                    }

                    User = 0;
                    Password = 0;
                }

            } else {
                if (rootPaneCheckingEnabled) {
                    
                } else {
                }
                JOptionPane.showMessageDialog(this, "Logging Sucees....!!");
                jButton5_Logging.setEnabled(false);
                txtUserName.setText("");
                txtpassword.setText("");

            }
            System.gc();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton5_LoggingActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        int sty = JOptionPane.showConfirmDialog(this, "Are you sure?", "Conform", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);

        if (sty == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        try {

            if (jCheckBox1.isSelected()) {

                txtpassword.setEchoChar('\u0000');
            } else {
                txtpassword.setEchoChar('\u25cf');
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased

        try {

            if (txtpassword.getText().length() == 0) {
                jButton5_Logging.setEnabled(false);
            } else {
                if (txtUserName.getText().length() != 0
                        && txtpassword.getText().length() != 0) {

                    jButton5_Logging.setEnabled(true);
                }
            }

            if (evt.getKeyCode() == 10) {
                jButton5_Logging.grabFocus();
            }

            txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 109, 109)));

        } catch (NullPointerException n) {
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtpasswordKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Logging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logging().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5_Fpass;
    private javax.swing.JButton jButton5_Logging;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
