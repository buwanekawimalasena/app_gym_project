/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.awt.FlowLayout;

/**
 *
 * @author Buwaneka
 */
public class Payments extends javax.swing.JPanel {

    /**
     * Creates new form Payments
     */
    public Payments() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2_Sub_Payment_set = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Packages Registry");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 10, 160, 40);

        jPanel2_Sub_Payment_set.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2_Sub_Payment_set.setLayout(null);
        jPanel1.add(jPanel2_Sub_Payment_set);
        jPanel2_Sub_Payment_set.setBounds(0, 70, 1040, 530);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home_Pages/icon_Packages.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 60, 40);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jButton1.setText("Packages ");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 192, 29)));
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 20, 220, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 60, 1010, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jPanel2_Sub_Payment_set.removeAll();
        jPanel2_Sub_Payment_set.setLayout(new FlowLayout());
        Admin.Payemnts.Package_Register p = new Admin.Payemnts.Package_Register();
        p.setVisible(true);
        jPanel2_Sub_Payment_set.add(p);
        jPanel2_Sub_Payment_set.updateUI();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2_Sub_Payment_set;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
