/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseHandlingSystem;

/**
 *
 * @author Isurika
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;
//import java.sql.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class UpdateCase extends javax.swing.JFrame {

    /**
     * Creates new form UpdateCase
     */
    public UpdateCase() {

        initComponents();
        combos();
    }

    public void combos() {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            String query = "select CourtNo from court";
            ps = db.con().prepareStatement(query);
            rs = ps.executeQuery(query);
            while (rs.next()) {
                courtno.addItem(rs.getString("CourtNo"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddCase2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        caseid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        caseno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        casedes = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        clientid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Evidence = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        courtno = new javax.swing.JComboBox<String>();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        date = new datechooser.beans.DateChooserCombo();
        label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1016, 734));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Case Id");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 130, 73, 22);

        caseid.setEditable(false);
        caseid.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(caseid);
        caseid.setBounds(230, 130, 230, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Case No");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 190, 73, 22);

        caseno.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(caseno);
        caseno.setBounds(230, 180, 230, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Case Discription");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 280, 128, 22);

        casedes.setColumns(20);
        casedes.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        casedes.setRows(5);
        jScrollPane1.setViewportView(casedes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(230, 290, 240, 180);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Court No");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(80, 570, 74, 22);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(820, 211, 104, 40);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(680, 210, 102, 40);

        clientid.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(clientid);
        clientid.setBounds(660, 150, 260, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Client Id");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(540, 150, 87, 31);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(820, 60, 100, 40);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Case ID", "Case No", "Case Description", "Court No", "CaseDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(530, 280, 420, 150);

        Evidence.setColumns(20);
        Evidence.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Evidence.setRows(5);
        jScrollPane3.setViewportView(Evidence);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(230, 490, 240, 60);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Evidence");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 500, 140, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Trail");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(230, 230, 70, 31);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Call");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(390, 230, 70, 31);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Case Type");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 240, 90, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Status");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(80, 620, 80, 30);

        jPanel1.add(courtno);
        courtno.setBounds(230, 570, 240, 30);

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("New");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(230, 620, 90, 30);

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Pending");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(340, 620, 90, 30);

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Finish");
        jPanel1.add(jRadioButton5);
        jRadioButton5.setBounds(460, 620, 90, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Case Date");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(540, 430, 130, 40);
        jPanel1.add(date);
        date.setBounds(660, 440, 250, 22);

        label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/p12.jpg"))); // NOI18N
        jPanel1.add(label);
        label.setBounds(0, 0, 1000, 700);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Case Type");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 230, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Update up = new Update();
        up.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        PreparedStatement pst = null;
        int count = 0;
        String cli = clientid.getText();
        caseid.setEditable(true);
        if (cli.equals("")) {
            JOptionPane.showMessageDialog(this, "Select any client for update!");
            clientid.setText("");
        } else {
            count++;
            int p = JOptionPane.showConfirmDialog(null, "Do you realy want to update this client");
            if (p == 0) {
                String ci = caseid.getText();
                if (ci == null) {
                    JOptionPane.showMessageDialog(this, "Please enter the Case ID!");
                    caseid.setText("");
                } else {
                    count++;
                }
                String cn = caseno.getText();
                if (cn == null) {
                    JOptionPane.showMessageDialog(this, "Please enter the case number!");
                    caseno.setText("");
                } else {
                    count++;
                }
                String ctype = null;

                if (jRadioButton1.isSelected()) {
                    ctype = "Trail";

                    count++;
                } else if (jRadioButton2.isSelected()) {
                    ctype = "Call";
                    count++;
                } else {
                    JOptionPane.showMessageDialog(this, "Select the Case Type");
                }
                String cstatus = null;
                if (jRadioButton3.isSelected()) {
                    cstatus = "New";

                    count++;
                } else if (jRadioButton4.isSelected()) {
                    cstatus = "Pending";
                    count++;
                } else if (jRadioButton5.isSelected()) {
                    cstatus = "Finish";
                    count++;
                } else {
                    //JOptionPane.showMessageDialog(this, "Select the Case Status");
                }
                String cd = casedes.getText();
                if (cd == null) {
                   // JOptionPane.showMessageDialog(this, "pls enter case description!");
                    casedes.setText("");
                } else {
                    count++;
                }

//                String cno=courtno.getText();
//                if(cno==null){
//                    JOptionPane.showMessageDialog(this, "pls enter Court number!");
//                    courtno.setText("");
//                }else{
//                    count++;
//                }
                String evi = Evidence.getText();
                if (evi == null) {

                } else {
                    count++;
                }

               String ts = new SimpleDateFormat("yyyy_MM_dd_HH:mm").format(date.getSelectedDate().getTime());
                System.out.println(ts);
                String casi = caseid.getText();

                String query = "UPDATE AddCase SET CaseID=?,  CaseNO=? ,CaseType=?,CaseDes=? ,CaseDate=? ,CourtNo=?,Evidence=?,Status=?  WHERE CaseID='" + casi+"'";

                if (count == 7) {
                    try {
                        pst = db.con().prepareStatement(query);
                        pst.setString(1, ci);
                        pst.setString(2, cn);
                        pst.setString(3, ctype);
                        pst.setString(4, cd);
                        pst.setString(5, ts);
                        pst.setString(6, (String) courtno.getSelectedItem());
                        pst.setString(7, evi);
                        pst.setString(8, cstatus);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Client details updated successfully");
//                        clientid.setText("");
//                        caseid.setText("");
//                        caseno.setText("");
//                        casedes.setText("");

                    } catch (SQLException ex) {
                        Logger.getLogger(UpdateCase.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Customer not found!");
                    } finally {
                        try {
                            pst.close();

                        } catch (SQLException ex) {
                            Logger.getLogger(UpdateClient.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                }
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    String sc = null;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultTableModel tb = (DefaultTableModel) table1.getModel();
        tb.setRowCount(0);
        PreparedStatement pst = null;
        ResultSet rst = null;
        sc = clientid.getText();

        String query = "SELECT * FROM AddCase WHERE ClientID LIKE ?";

        try {
            pst = db.con().prepareStatement(query);
            pst.setString(1, sc);
            rst = pst.executeQuery();

            while (rst.next()) {

                Vector v = new Vector();
                v.add(rst.getString("CaseID"));
                v.add(rst.getString("CaseNo"));

                v.add(rst.getString("Casedes"));
                v.add(rst.getString("CourtNo"));
                v.add(rst.getString("CaseDate"));
                v.add(rst.getString("CaseType"));
                tb.addRow(v);
            } if(tb.getRowCount()==0){
                   JOptionPane.showMessageDialog(this, "Not Found!\nplease check the Client ID");
               }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pst.close();
                rst.close();
            } catch (SQLException ex) {
                Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        DefaultTableModel tb = (DefaultTableModel) table1.getModel();
        caseid.setEditable(false);
        int selectedRowIndex = table1.getSelectedRow();
        caseid.setText(tb.getValueAt(selectedRowIndex, 0).toString());
        caseno.setText(tb.getValueAt(selectedRowIndex, 1).toString());
        casedes.setText(tb.getValueAt(selectedRowIndex, 2).toString());
        courtno.setSelectedItem(tb.getValueAt(selectedRowIndex, 3));
//        try { 
//            
//            Date dat = new SimpleDateFormat("yyyy_MM_dd_HH:mm").parse((String)tb.getValueAt(selectedRowIndex,4));
//            date.set
//           
//        } catch (ParseException ex) {
//            Logger.getLogger(UpdateCase.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        try {
            PreparedStatement ps = db.con().prepareStatement("SELECT Evidence,CaseType, Status FROM addcase WHERE ClientID=" + sc);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Evidence.setText(rs.getString("Evidence"));
                if (rs.getString(2).equals("Trial")) {
                    jRadioButton1.setSelected(true);
                } else {
                    jRadioButton2.setSelected(true);
                }
                if (rs.getString(3).equals("New")) {
                    jRadioButton3.setSelected(true);
                } else if (rs.getString(3).equals("Pending")) {
                    jRadioButton4.setSelected(true);
                } else {
                    jRadioButton5.setSelected(true);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateCase.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_table1MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateCase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Evidence;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextArea casedes;
    private javax.swing.JTextField caseid;
    private javax.swing.JTextField caseno;
    private javax.swing.JTextField clientid;
    private javax.swing.JComboBox<String> courtno;
    private datechooser.beans.DateChooserCombo date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
