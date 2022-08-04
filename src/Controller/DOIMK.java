/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controller;

import Service.ChucNang;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author QingShan
 */
public class DOIMK extends javax.swing.JFrame {

    /**
     * Creates new form DOIMK
     */
    public DOIMK() {
        initComponents();
        setLocationRelativeTo(null);
        lblImgCEye1.setIcon(new ImageIcon("src/image/c.eye.png"));
        lblImgOEye1.setIcon(new ImageIcon("src/image/o.eye.png"));
        lblImgCEye2.setIcon(new ImageIcon("src/image/c.eye.png"));
        lblImgOEye2.setIcon(new ImageIcon("src/image/o.eye.png"));

        lblImgOEye1.setVisible(false);
        lblImgOEye2.setVisible(false);
    }

    public boolean checkValidate(String mk, int index) {
        if (index == 1) {
            if (String.valueOf(txtMKM.getPassword()).length() == 0) {
                txtMKM.setBackground(Color.yellow);
                lblMkm.setText("Chưa nhập mật khẩu");
                return false;
            } else {
                txtMKM.setBackground(Color.white);
                lblMkm.setText("");
            }
        }
        
        if (index == 2) {
            if (String.valueOf(txtXTMKM.getPassword()).length() == 0) {
                txtXTMKM.setBackground(Color.yellow);
                lblXtmkm.setText("Chưa nhập mật khẩu");
                return false;
            } else if (!String.valueOf(txtXTMKM.getPassword()).equals(String.valueOf(txtMKM.getPassword()))) {
                txtXTMKM.setBackground(Color.yellow);
                lblXtmkm.setText("Mật khẩu không khớp");
                return false;
            } else {
                txtXTMKM.setBackground(Color.white);
                lblXtmkm.setText("");
            }
        }
        
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMKM = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblImgCEye1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblImgOEye1 = new javax.swing.JLabel();
        lblImgCEye2 = new javax.swing.JLabel();
        txtXTMKM = new javax.swing.JPasswordField();
        lblImgOEye2 = new javax.swing.JLabel();
        txtMKM = new javax.swing.JPasswordField();
        lblMkm = new javax.swing.JLabel();
        lblXtmkm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đổi mật khẩu");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đổi mật khẩu");

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setText("Nhập mật khẩu mới");

        lblImgCEye1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgCEye1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("Xác nhận mật khẩu mới");

        lblImgOEye1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgOEye1MouseClicked(evt);
            }
        });

        lblImgCEye2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgCEye2MouseClicked(evt);
            }
        });

        txtXTMKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtXTMKMMousePressed(evt);
            }
        });
        txtXTMKM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtXTMKMKeyReleased(evt);
            }
        });

        lblImgOEye2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgOEye2MouseClicked(evt);
            }
        });

        txtMKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtMKMMousePressed(evt);
            }
        });
        txtMKM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMKMKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOK)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMKM, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblImgOEye2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImgCEye2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblXtmkm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtXTMKM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblImgCEye1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImgOEye1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblMkm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImgOEye2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImgCEye2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMkm, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtXTMKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImgCEye1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImgOEye1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblXtmkm, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblMKM, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMKM)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        if (txtMKM.getText().equals(txtXTMKM.getText())) {
            try {
                ChucNang.UpdateUser(txtXTMKM.getText());
                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công!");
                this.setVisible(false);
//                QuanLyNhaTro ql = new QuanLyNhaTro();
//                ql.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(DOIMK.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void lblImgCEye1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgCEye1MouseClicked
        // TODO add your handling code here:
        txtXTMKM.setEchoChar((char) 0);
        lblImgCEye1.setVisible(false);
        lblImgCEye1.setEnabled(false);
        lblImgOEye1.setVisible(true);
        lblImgOEye1.setEnabled(true);
    }//GEN-LAST:event_lblImgCEye1MouseClicked

    private void lblImgOEye1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgOEye1MouseClicked
        // TODO add your handling code here:
        txtXTMKM.setEchoChar((char) 8226);
        lblImgCEye1.setVisible(true);
        lblImgCEye1.setEnabled(true);
        lblImgOEye1.setVisible(false);
        lblImgOEye1.setEnabled(false);
    }//GEN-LAST:event_lblImgOEye1MouseClicked

    private void lblImgCEye2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgCEye2MouseClicked
        // TODO add your handling code here:
        txtXTMKM.setEchoChar((char) 0);
        lblImgCEye2.setVisible(false);
        lblImgCEye2.setEnabled(false);
        lblImgOEye2.setVisible(true);
        lblImgOEye2.setEnabled(true);
    }//GEN-LAST:event_lblImgCEye2MouseClicked

    private void lblImgOEye2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgOEye2MouseClicked
        // TODO add your handling code here:
        txtXTMKM.setEchoChar((char) 8226);
        lblImgCEye2.setVisible(true);
        lblImgCEye2.setEnabled(true);
        lblImgOEye2.setVisible(false);
        lblImgOEye2.setEnabled(false);
    }//GEN-LAST:event_lblImgOEye2MouseClicked

    private void txtMKMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKMKeyReleased
        // TODO add your handling code here:
        checkValidate(String.valueOf(txtMKM.getPassword()), 1);
    }//GEN-LAST:event_txtMKMKeyReleased

    private void txtMKMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMKMMousePressed
        // TODO add your handling code here:
        checkValidate(String.valueOf(txtMKM.getPassword()), 1);
    }//GEN-LAST:event_txtMKMMousePressed

    private void txtXTMKMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtXTMKMKeyReleased
        // TODO add your handling code here:
        checkValidate(String.valueOf(txtXTMKM.getPassword()), 2);
    }//GEN-LAST:event_txtXTMKMKeyReleased

    private void txtXTMKMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtXTMKMMousePressed
        // TODO add your handling code here:
        checkValidate(String.valueOf(txtXTMKM.getPassword()), 2);
    }//GEN-LAST:event_txtXTMKMMousePressed

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
            java.util.logging.Logger.getLogger(DOIMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DOIMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DOIMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DOIMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DOIMK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImgCEye1;
    private javax.swing.JLabel lblImgCEye2;
    private javax.swing.JLabel lblImgOEye1;
    private javax.swing.JLabel lblImgOEye2;
    private javax.swing.JLabel lblMKM;
    private javax.swing.JLabel lblMkm;
    private javax.swing.JLabel lblXtmkm;
    private javax.swing.JPasswordField txtMKM;
    private javax.swing.JPasswordField txtXTMKM;
    // End of variables declaration//GEN-END:variables
}
