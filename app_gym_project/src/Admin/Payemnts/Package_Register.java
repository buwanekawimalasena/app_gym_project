/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.Payemnts;

import Class_Files.DB;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Buwaneka
 */
public class Package_Register extends javax.swing.JPanel {

    int i;

    /**
     * Creates new form Package_and_Discount_Reg
     */
    public Package_Register() {
        initComponents();
        jButton5_addpackage.setEnabled(false);
        jButton5_updatepackage.setEnabled(false);
        jScrollPane3.setVisible(false);
        jList1.setVisible(false);
        txtFullPrice.setEditable(true);
        jButton2_search.setEnabled(false);

        jScrollPane2.setVisible(false);
        jList2.setVisible(false);

        jScrollPane4.setVisible(false);
        jList3.setVisible(false);

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
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        txtPackage_Name = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFullPrice = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton5_updatepackage = new javax.swing.JButton();
        jButton5_addpackage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton2_search = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtDuration = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jList3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList3MousePressed(evt);
            }
        });
        jList3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jList3KeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jList3);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(240, 108, 230, 130);

        jList2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList2MousePressed(evt);
            }
        });
        jList2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jList2KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(240, 150, 230, 130);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Package Price :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(80, 160, 160, 30);

        txtPackage_Name.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        txtPackage_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPackage_NameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPackage_NameKeyTyped(evt);
            }
        });
        jPanel1.add(txtPackage_Name);
        txtPackage_Name.setBounds(240, 80, 230, 28);

        jLabel16.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Package Name :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(80, 80, 120, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Duration :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(80, 120, 160, 30);

        txtFullPrice.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        txtFullPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFullPriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFullPriceKeyTyped(evt);
            }
        });
        jPanel1.add(txtFullPrice);
        txtFullPrice.setBounds(270, 160, 200, 28);

        jLabel17.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Rs ");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(250, 160, 20, 30);

        jButton5_updatepackage.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jButton5_updatepackage.setText("Update Package");
        jButton5_updatepackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_updatepackageActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5_updatepackage);
        jButton5_updatepackage.setBounds(400, 220, 150, 30);

        jButton5_addpackage.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jButton5_addpackage.setText("Add Package");
        jButton5_addpackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_addpackageActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5_addpackage);
        jButton5_addpackage.setBounds(240, 220, 150, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Package Name", "Duration", "Package Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 290, 970, 150);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jLabel13.setText("Package Name :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(590, 90, 130, 21);

        txt_search.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_searchKeyTyped(evt);
            }
        });
        jPanel1.add(txt_search);
        txt_search.setBounds(710, 90, 220, 28);

        jList1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jList1KeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(710, 118, 220, 90);

        jButton2_search.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton2_search.setText("Search");
        jButton2_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_searchActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2_search);
        jButton2_search.setBounds(880, 150, 110, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(570, 50, 440, 190);

        jButton6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jButton6.setText("Veiw All");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(750, 470, 130, 30);

        jButton3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jButton3.setText("Clear All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(890, 470, 120, 30);

        txtDuration.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        txtDuration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDurationKeyReleased(evt);
            }
        });
        jPanel1.add(txtDuration);
        txtDuration.setBounds(240, 120, 230, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
 double fullp;
    private void txtPackage_NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPackage_NameKeyReleased

        try {

            if (!txtPackage_Name.getText().trim().equals("")) {
                ResultSet rs = Class_Files.DB.search("SELECT * FROM package_reg WHERE Package_Name LIKE '" + txtPackage_Name.getText() + "%'  ");
                Vector v = new Vector();
                jList3.removeAll();
                int e = 0;
                while (rs.next()) {
                    e = 1;
                    v.add(rs.getString("Package_Name"));
                    jList3.setListData(v);
                    jScrollPane4.setVisible(true);
                    jList3.setVisible(true);

                }

                if (e == 0) {
                    jScrollPane4.setVisible(false);
                    jList3.setVisible(false);
                }

            } else {
                jScrollPane4.setVisible(false);
                jList3.setVisible(false);

            }

            /////////////////////////////////////////////////////////
            if (jList3.isVisible()) {
                if (evt.getKeyCode() == 40) {
                    jList3.grabFocus();
                }
            }

////////////////////////////////////////////////////////////////////
            if (txtPackage_Name.getText().length() == 0) {
                jButton5_updatepackage.setEnabled(false);
                jButton5_addpackage.setEnabled(false);
            } else {

                if (txtPackage_Name.getText().length() != 0
                        && txtDuration.getText().length() != 0
                        && txtFullPrice.getText().length() != 0) {

                    jButton5_updatepackage.setEnabled(true);
                    jButton5_addpackage.setEnabled(true);

                }

            }

            /////////////////////////////////////////
            if (i == 10) {
                jButton5_addpackage.setEnabled(false);
            } else {
                jButton5_updatepackage.setEnabled(false);
            }

            ////
            if (evt.getKeyCode() == 10) {
                txtDuration.grabFocus();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtPackage_NameKeyReleased

    private void txtPackage_NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPackage_NameKeyTyped

        try {
            System.gc();

            char c = evt.getKeyChar();
            if (Character.isDigit(c)) {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtPackage_NameKeyTyped

    private void txtFullPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFullPriceKeyReleased

        try {
            if (txtFullPrice.getText().length() == 0) {
                jButton5_updatepackage.setEnabled(false);
                jButton5_addpackage.setEnabled(false);
            } else {

                if (txtPackage_Name.getText().length() != 0
                        && txtDuration.getText().length() != 0
                        && txtFullPrice.getText().length() != 0) {

                    jButton5_updatepackage.setEnabled(true);
                    jButton5_addpackage.setEnabled(true);

                }

            }

            /////////////////////////////////////////
            if (i == 10) {
                jButton5_addpackage.setEnabled(false);
            } else {
                jButton5_updatepackage.setEnabled(false);
            }
//Gra

            if (evt.getKeyCode() == 10) {
                jButton5_addpackage.grabFocus();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtFullPriceKeyReleased

    private void txtFullPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFullPriceKeyTyped

        try {
            System.gc();

            char c = evt.getKeyChar();
            if (!Character.isDigit(c)) {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtFullPriceKeyTyped

    int pay_id;

    private void jButton5_updatepackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_updatepackageActionPerformed

        try {
            byte d = 0;
            ResultSet rs = Class_Files.DB.search("SELECT * FROM package_reg WHERE Package_Name = '" + txtPackage_Name.getText() + "'  ");
            while (rs.next()) {
                d = 1;
                pay_id = rs.getInt("Package_Id");
            }

            if (d == 0) {
                JOptionPane.showMessageDialog(this, "Please cheack package name..!!");
            } else {

                Class_Files.DB.sud("UPDATE package_reg SET Package_Name= '" + txtPackage_Name.getText() + "' "
                        + ", One_month = '" + "1000" + "'"
                        + ",Duration = '" + txtDuration.getText() + "'"
                        + ", Price = '" + txtFullPrice.getText() + "'"
                        + " ,Status = '" + "On" + "'  WHERE Package_Id = '" + pay_id + "' ");

                tabelAdd();
                EmtyTF();

                JOptionPane.showMessageDialog(this, "Package Update successfully");
                jButton5_updatepackage.setEnabled(false);
                i = 0;

            }

//           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5_updatepackageActionPerformed

    private void jButton5_addpackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_addpackageActionPerformed

        try {

            String pname = txtPackage_Name.getText().trim().toLowerCase();

            byte a = 0;
            ResultSet rs = DB.search("SELECT * FROM package_reg");
            while (rs.next()) {

                if (pname.equals(rs.getString("Package_Name").toLowerCase())) {
                    a = 1;
                }

            }
            ///////////////////////////////////////////////////////////////////////////////////      
            if (a == 1) {

                JOptionPane.showMessageDialog(this, "Sorry this Package name already availabe", "Warning", JOptionPane.WARNING_MESSAGE);
                EmtyTF();
            } else {
                DB.sud("INSERT INTO package_reg(Package_Name,One_month,Duration,Price,Status)VALUES('" + pname + "' "
                        + ", '" + Double.parseDouble("1000") + "' "
                        + ", '" + txtDuration.getText() + "'"
                        + ", '" + Double.parseDouble(txtFullPrice.getText()) + "', '" + "On" + "')");

                tabelAdd();
                EmtyTF();
                JOptionPane.showMessageDialog(this, "Package add successfully");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton5_addpackageActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased

        try {

            if (!txt_search.getText().trim().equals("")) {
                ResultSet rs = Class_Files.DB.search("SELECT * FROM package_reg WHERE Package_Name LIKE '" + txt_search.getText() + "%'  ");
                Vector v = new Vector();
                jList1.removeAll();

                while (rs.next()) {

                    String sts = rs.getString("Status");

                    if (sts.equals("On")) {

                        jScrollPane3.setVisible(true);
                        jList1.setVisible(true);
                        jButton2_search.setEnabled(true);
                        v.add(rs.getString("Package_Name"));

                        jList1.setListData(v);

                    }

                }

            } else {
                jScrollPane3.setVisible(false);
                jList1.setVisible(false);
                jButton2_search.setEnabled(false);

            }

            /////////////////////////////////////////////////////////
            if (jList1.isVisible()) {
                if (evt.getKeyCode() == 40) {
                    jList1.grabFocus();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        try {
            char c = evt.getKeyChar();
            if (Character.isDigit(c)) {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txt_searchKeyTyped

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed

        try {
            System.gc();
            if (evt.getClickCount() == 2) {
                txt_search.setText(jList1.getSelectedValue().toString());
                jScrollPane3.setVisible(false);
                jList1.setVisible(false);

            }

        } catch (NullPointerException n) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jList1MousePressed

    private void jList1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyReleased

        try {
            System.gc();
            if (evt.getKeyCode() == 10) {
                txt_search.setText(jList1.getSelectedValue().toString());
                jScrollPane3.setVisible(false);
                jList1.setVisible(false);
                jButton2_search.grabFocus();

            }
        } catch (NullPointerException e) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jList1KeyReleased


    private void jButton2_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_searchActionPerformed

        try {
            if (!txt_search.getText().equals("")) {

                byte d = 0;
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                Vector v = new Vector();
                ResultSet rs = Class_Files.DB.search("SELECT * FROM package_reg WHERE Package_Name = '" + txt_search.getText() + "'  ");
                while (rs.next()) {
                    d = 1;
                    v.add(rs.getString("Package_Name"));
                    v.add(rs.getString("Duration"));
                    v.add(rs.getString("Price"));
                    dtm.addRow(v);
                }

                if (d == 0) {
                    JOptionPane.showMessageDialog(this, "Sorry No result found..!");
                }

                txt_search.setText("");
                jButton2_search.setEnabled(false);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2_searchActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try {

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            ResultSet rs = Class_Files.DB.search("SELECT * FROM package_reg  ");
            while (rs.next()) {

                Vector v = new Vector();
                v.add(rs.getString("Package_Name"));
                v.add(rs.getString("Duration"));
                v.add(rs.getString("Price"));
                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            System.gc();
            EmtyTF();
            txt_search.setText("");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed

        try {

            System.gc();
            i = 10;
            int row = jTable1.getSelectedRow();

            String Pname = jTable1.getValueAt(row, 0).toString();
            String duration = jTable1.getValueAt(row, 1).toString();
            String Fullprice = jTable1.getValueAt(row, 2).toString();
            txtPackage_Name.setText(Pname);
            txtDuration.setText(duration);
            txtFullPrice.setText(Fullprice);

            jButton5_updatepackage.setEnabled(true);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jTable1MousePressed

    private void txtDurationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDurationKeyReleased

        try {

            if (!txtDuration.getText().trim().equals("")) {
                ResultSet rs = Class_Files.DB.search("SELECT * FROM package_reg WHERE Duration LIKE '" + txtDuration.getText() + "%'  ");
                Vector v = new Vector();
                jList2.removeAll();
                int e = 0;
                while (rs.next()) {
                    e = 1;
                    v.add(rs.getString("Duration"));
                    jList2.setListData(v);
                    jScrollPane2.setVisible(true);
                    jList2.setVisible(true);

                }

                if (e == 0) {
                    jScrollPane2.setVisible(false);
                    jList2.setVisible(false);
                }

            } else {
                jScrollPane2.setVisible(false);
                jList2.setVisible(false);

            }

            /////////////////////////////////////////////////////////
            if (jList2.isVisible()) {
                if (evt.getKeyCode() == 40) {
                    jList2.grabFocus();
                }
            }

            ///Validation
            if (txtDuration.getText().length() == 0) {
                jButton5_updatepackage.setEnabled(false);
                jButton5_addpackage.setEnabled(false);
            } else {

                if (txtPackage_Name.getText().length() != 0
                        && txtDuration.getText().length() != 0
                        && txtFullPrice.getText().length() != 0) {

                    jButton5_updatepackage.setEnabled(true);
                    jButton5_addpackage.setEnabled(true);

                }

            }

            /////////////////////////////////////////
            if (i == 10) {
                jButton5_addpackage.setEnabled(false);
            } else {
                jButton5_updatepackage.setEnabled(false);
            }

            ///grabfocus
            if (evt.getKeyCode() == 10) {
                txtFullPrice.grabFocus();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtDurationKeyReleased

    private void jList2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList2KeyReleased

        try {
            System.gc();
            if (evt.getKeyCode() == 10) {
                txtDuration.setText(jList2.getSelectedValue().toString());
                jScrollPane2.setVisible(false);
                jList2.setVisible(false);
                txtFullPrice.grabFocus();

            }
        } catch (NullPointerException e) {

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jList2KeyReleased

    private void jList2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MousePressed

        try {
            System.gc();
            if (evt.getClickCount() == 2) {
                txtDuration.setText(jList2.getSelectedValue().toString());
                jScrollPane2.setVisible(false);
                jList2.setVisible(false);
                txtFullPrice.grabFocus();

            }

        } catch (NullPointerException n) {
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jList2MousePressed

    private void jList3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList3KeyReleased

        try {
            System.gc();
            if (evt.getKeyCode() == 10) {
                txtPackage_Name.setText(jList3.getSelectedValue().toString());
                jScrollPane4.setVisible(false);
                jList3.setVisible(false);
                txtDuration.grabFocus();

            }
        } catch (NullPointerException e) {

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jList3KeyReleased

    private void jList3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MousePressed

        try {
            System.gc();
            if (evt.getClickCount() == 2) {
                txtPackage_Name.setText(jList3.getSelectedValue().toString());
                jScrollPane4.setVisible(false);
                jList3.setVisible(false);
                txtDuration.grabFocus();

            }

        } catch (NullPointerException n) {
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jList3MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2_search;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5_addpackage;
    private javax.swing.JButton jButton5_updatepackage;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtFullPrice;
    private javax.swing.JTextField txtPackage_Name;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

    private void tabelAdd() {
        try {

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            Vector v = new Vector();
            v.add(txtPackage_Name.getText());
            // v.add(txtOneMonth.getText());
            v.add(txtDuration.getText());
            v.add(txtFullPrice.getText());

            dtm.addRow(v);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void EmtyTF() {
        txtPackage_Name.setText("");
        // txtOneMonth.setText("");
        txtDuration.setText("");
        txtFullPrice.setText("");
        i = 0;
        jButton5_addpackage.setEnabled(false);
        jButton5_updatepackage.setEnabled(false);
    }
}
