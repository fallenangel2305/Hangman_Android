/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import javax.swing.JOptionPane;
import DB.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alan
 */
public class resources extends javax.swing.JFrame {

    DBConnection obj = new DBConnection();
    Object selid;
    int flag = 0;

    /**
     * Creates new form resources
     */
    public resources() {
        initComponents();

        setSize(800, 600);
        setResizable(false);

        lbl_opt1.setVisible(false);
        lbl_opt2.setVisible(false);
        lbl_qus.setVisible(false);
        lbl_ans.setVisible(false);
        txt_op1.setVisible(false);
        txt_op2.setVisible(false);
        txt_qus.setVisible(false);
        txt_ans.setVisible(false);
        btn_cancel.setVisible(false);
        btn_entry.setVisible(true);
        btn_back1.setVisible(true);
        btn_insert.setVisible(false);
        btn_view.setVisible(true);
        btn_back.setVisible(false);
        tbl_view.setVisible(false);
        sp_view.setVisible(false);

        filldata();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp_view = new javax.swing.JScrollPane();
        tbl_view = new javax.swing.JTable();
        btn_back = new javax.swing.JButton();
        btn_insert = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        lbl_qus = new javax.swing.JLabel();
        txt_qus = new javax.swing.JTextField();
        lbl_opt1 = new javax.swing.JLabel();
        txt_op1 = new javax.swing.JTextField();
        lbl_opt2 = new javax.swing.JLabel();
        txt_op2 = new javax.swing.JTextField();
        lbl_ans = new javax.swing.JLabel();
        txt_ans = new javax.swing.JTextField();
        btn_entry = new javax.swing.JButton();
        btn_view = new javax.swing.JButton();
        btn_back1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tbl_view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question", "Option1", "Option2", "Answer"
            }
        ));
        tbl_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_viewMouseClicked(evt);
            }
        });
        sp_view.setViewportView(tbl_view);

        getContentPane().add(sp_view);
        sp_view.setBounds(0, 70, 780, 310);

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backm.png"))); // NOI18N
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back);
        btn_back.setBounds(320, 0, 150, 60);

        btn_insert.setText("Insert");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });
        getContentPane().add(btn_insert);
        btn_insert.setBounds(210, 350, 77, 32);

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel);
        btn_cancel.setBounds(380, 350, 69, 32);

        lbl_qus.setText("Question :");
        getContentPane().add(lbl_qus);
        lbl_qus.setBounds(180, 160, 70, 30);

        txt_qus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_qusActionPerformed(evt);
            }
        });
        getContentPane().add(txt_qus);
        txt_qus.setBounds(290, 160, 370, 24);

        lbl_opt1.setText("Option 1  :");
        getContentPane().add(lbl_opt1);
        lbl_opt1.setBounds(180, 210, 70, 30);

        txt_op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_op1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_op1);
        txt_op1.setBounds(290, 210, 170, 24);

        lbl_opt2.setText("Option 2  :");
        getContentPane().add(lbl_opt2);
        lbl_opt2.setBounds(180, 260, 70, 30);

        txt_op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_op2ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_op2);
        txt_op2.setBounds(290, 260, 170, 24);

        lbl_ans.setText("Answer :");
        getContentPane().add(lbl_ans);
        lbl_ans.setBounds(180, 300, 70, 30);

        txt_ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ansActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ans);
        txt_ans.setBounds(290, 300, 170, 24);

        btn_entry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newentry.png"))); // NOI18N
        btn_entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entryActionPerformed(evt);
            }
        });
        getContentPane().add(btn_entry);
        btn_entry.setBounds(300, 170, 150, 60);

        btn_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        getContentPane().add(btn_view);
        btn_view.setBounds(300, 110, 150, 60);

        btn_back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backm.png"))); // NOI18N
        btn_back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back1);
        btn_back1.setBounds(300, 230, 150, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_img.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void filldata() {
        try {
            int i = 0;
            String heading[] = new String[5];
            heading[0] = "no";
            heading[1] = "Question";
            heading[2] = "Option1";
            heading[3] = "Option2";
            heading[4] = "Answer";

            String sel = "select * from tbl_questionbank";
            ResultSet rs = obj.SelectData(sel);
            rs.last();
            int row = rs.getRow();
            String data[][] = new String[row][5];
            rs.beforeFirst();
            while (rs.next()) {
                data[i][0] = String.valueOf(i + 1);
                data[i][1] = rs.getString("qus_name");
                data[i][2] = rs.getString("op1");
                data[i][3] = rs.getString("op2");
                data[i][4] = rs.getString("ans");
                i++;
            }
            DefaultTableModel model = new DefaultTableModel(data, heading);
            tbl_view.setModel(model);
            tbl_view.getColumn("no").setMinWidth(0);
            tbl_view.getColumn("no").setMaxWidth(0);
        } catch (SQLException ex) {
            Logger.getLogger(Highscore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void btn_entryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entryActionPerformed

        btn_view.setVisible(false);
        btn_entry.setVisible(false);
        btn_back1.setVisible(false);
        lbl_opt1.setVisible(true);
        lbl_opt2.setVisible(true);
        lbl_qus.setVisible(true);
        lbl_ans.setVisible(true);
        txt_op1.setVisible(true);
        txt_op2.setVisible(true);
        txt_qus.setVisible(true);
        txt_ans.setVisible(true);
        btn_insert.setVisible(true);
        btn_cancel.setVisible(true);
    }//GEN-LAST:event_btn_entryActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed

        lbl_opt1.setVisible(false);
        lbl_opt2.setVisible(false);
        lbl_qus.setVisible(false);
        lbl_ans.setVisible(false);
        txt_op1.setVisible(false);
        txt_op2.setVisible(false);
        txt_qus.setVisible(false);
        txt_ans.setVisible(false);
        btn_insert.setVisible(false);
        btn_cancel.setVisible(false);
        btn_view.setVisible(true);
        btn_entry.setVisible(true);
        btn_back1.setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed

        btn_view.setVisible(false);
        btn_entry.setVisible(false);
        btn_back1.setVisible(false);
        btn_back.setVisible(true);
        tbl_view.setVisible(true);
        sp_view.setVisible(true);

        String highscore = ("select * from tbl_questionbank");
        ResultSet rs = obj.SelectData(highscore);


    }//GEN-LAST:event_btn_viewActionPerformed

    private void txt_qusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_qusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_qusActionPerformed

    private void txt_op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_op1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_op1ActionPerformed

    private void txt_op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_op2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_op2ActionPerformed

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        String qtn = "", op1 = "", op2 = "", ans = "";

        qtn = txt_qus.getText();
        op1 = txt_op1.getText();
        op2 = txt_op2.getText();
        ans = txt_ans.getText();

        String insertqtn = "insert into tbl_questionbank(qus_name,op1,op2,ans) values('" + qtn + "','" + op1 + "','" + op2 + "','" + ans + "')";

        int a = obj.ExecuteQuery(insertqtn);

        JOptionPane.showMessageDialog(this, "New Entry Added!!!");

        txt_qus.setText("");
        txt_op1.setText("");
        txt_op2.setText("");
        txt_ans.setText("");

    }//GEN-LAST:event_btn_insertActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        tbl_view.setVisible(false);
        sp_view.setVisible(false);
        btn_entry.setVisible(true);
        btn_back1.setVisible(true);
        btn_view.setVisible(true);
        btn_back.setVisible(false);
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_ansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ansActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ansActionPerformed

    private void btn_back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back1ActionPerformed

        Login l = new Login();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_back1ActionPerformed

    private void tbl_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_viewMouseClicked

    }//GEN-LAST:event_tbl_viewMouseClicked

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
            java.util.logging.Logger.getLogger(resources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resources().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_back1;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_entry;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_view;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_ans;
    private javax.swing.JLabel lbl_opt1;
    private javax.swing.JLabel lbl_opt2;
    private javax.swing.JLabel lbl_qus;
    private javax.swing.JScrollPane sp_view;
    private javax.swing.JTable tbl_view;
    private javax.swing.JTextField txt_ans;
    private javax.swing.JTextField txt_op1;
    private javax.swing.JTextField txt_op2;
    private javax.swing.JTextField txt_qus;
    // End of variables declaration//GEN-END:variables
}
