/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package signin;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hohoa
 */
public class SignIn extends javax.swing.JFrame implements SignInImpl {

    List<User> list = new ArrayList<>();

    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
        txtUsername.setBackground(new Color(0, 0, 0, 1));
        txtPassword.setBackground(new Color(0, 0, 0, 1));
        setLocationRelativeTo(null);
        connect();
        FilltoList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPass = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblSignIn = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblIconUser = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        closeEye = new javax.swing.JLabel();
        btnSignIn = new javax.swing.JButton();
        lblDHAA = new javax.swing.JLabel();
        lblSignUp = new javax.swing.JLabel();
        chkRemember = new javax.swing.JCheckBox();
        lblForget = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        openEye = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 220, 20));
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 150, 20));

        lblSignIn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignIn.setText("Sign In");
        getContentPane().add(lblSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 41, 350, -1));

        lblUsername.setText("Username");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 133, 290, -1));

        lblIconUser.setIcon(new javax.swing.ImageIcon("E:\\AgileScrum\\AgileScrum\\src\\icon\\user.png")); // NOI18N
        getContentPane().add(lblIconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 161, -1, 26));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hello! Let's get started");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 95, 350, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 183, 280, 12));

        txtUsername.setBorder(null);
        txtUsername.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                txtUsernameHierarchyChanged(evt);
            }
        });
        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsernameMousePressed(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 161, 280, -1));

        lblPassword.setText("Password");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 207, 290, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 259, 286, 10));

        closeEye.setIcon(new javax.swing.ImageIcon("E:\\AgileScrum\\AgileScrum\\src\\icon\\c.eye.png")); // NOI18N
        closeEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeEyeMouseClicked(evt);
            }
        });
        getContentPane().add(closeEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, 26));

        btnSignIn.setBackground(new java.awt.Color(0, 204, 204));
        btnSignIn.setText("Sign In");
        btnSignIn.setBorder(null);
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 327, 240, 31));

        lblDHAA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDHAA.setText("Don't have a account?");
        getContentPane().add(lblDHAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 370, 211, -1));

        lblSignUp.setText("Sign Up");
        getContentPane().add(lblSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 370, 133, -1));

        chkRemember.setText("Remember password?");
        getContentPane().add(chkRemember, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 287, 160, -1));

        lblForget.setText("Forget password?");
        getContentPane().add(lblForget, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 289, 122, -1));

        txtPassword.setBorder(null);
        txtPassword.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                txtPasswordHierarchyChanged(evt);
            }
        });
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 235, 286, -1));

        openEye.setIcon(new javax.swing.ImageIcon("E:\\AgileScrum\\AgileScrum\\src\\icon\\o.eye.png")); // NOI18N
        openEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openEyeMouseClicked(evt);
            }
        });
        getContentPane().add(openEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, 26));

        background.setIcon(new javax.swing.ImageIcon("E:\\AgileScrum\\AgileScrum\\src\\icon\\bg.jpg")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        dangnhap();
    }//GEN-LAST:event_btnSignInActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPasswordHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_txtPasswordHierarchyChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPasswordHierarchyChanged

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUsernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMousePressed
        // TODO add your handling code here:
        checkValidate(txtUsername.getText(), 1);
    }//GEN-LAST:event_txtUsernameMousePressed

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        // TODO add your handling code here:
        checkValidate(txtUsername.getText(), 1);
        String name = txtUsername.getText();
        for (User iname : list) {
            txtPassword.setText("");
            if (iname.getUser().equalsIgnoreCase(name) && iname.getRemember() == 1) {
                txtPassword.setText(iname.getPass());
                chkRemember.setSelected(true);
                break;
            }
        }
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMousePressed
        // TODO add your handling code here:
        checkValidate(new String(txtPassword.getPassword()), 2);
    }//GEN-LAST:event_txtPasswordMousePressed

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        checkValidate(new String(txtPassword.getPassword()), 2);
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtUsernameHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_txtUsernameHierarchyChanged
        // TODO add your handling code here:
//        Thread t = new Thread(this);
//        t.start();
    }//GEN-LAST:event_txtUsernameHierarchyChanged

    private void openEyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openEyeMouseClicked
        // TODO add your handling code here:
        txtPassword.setEchoChar((char) 8226);
        closeEye.setVisible(true);
        closeEye.setEnabled(true);
        openEye.setVisible(false);
        openEye.setEnabled(false);
    }//GEN-LAST:event_openEyeMouseClicked

    private void closeEyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeEyeMouseClicked
        // TODO add your handling code here:
        //        txtPassword.setEchoChar((char) 0);

        txtPassword.setEchoChar((char) 0);
        closeEye.setVisible(false);
        closeEye.setEnabled(false);
        openEye.setVisible(true);
        openEye.setEnabled(true);
    }//GEN-LAST:event_closeEyeMouseClicked

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JCheckBox chkRemember;
    private javax.swing.JLabel closeEye;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDHAA;
    private javax.swing.JLabel lblForget;
    private javax.swing.JLabel lblIconUser;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignIn;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel openEye;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void dangnhap() {
        list.forEach(s -> {
            if (s.getUser().equalsIgnoreCase(txtUsername.getText()) && s.getPass().equalsIgnoreCase(new String(txtPassword.getPassword()))) {
//                try {
//                    Customer cus = (Customer) ChucNang.SelectObject(s.getUser());
                int temp;
                if(chkRemember.isSelected()){
                    temp = 1;
                } else{
                    temp = 0;
                }
                System.out.println(temp);
                if(s.getRemember() != temp){
                    try {
                        ChucNang.UpdateUser(s.getUser(),temp);
                    } catch (SQLException ex) {
                        Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    ChucNang.setUser(s.getUser());
                    QuanLyNhaTro nt = new QuanLyNhaTro();
                    nt.setVisible(true);
                    this.setVisible(false);
//                } catch (SQLException ex) {
//                    Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
//                }
            }
        });
    }

    @Override
    public void checkValidate(String user1, int a) {
        if (a == 1) {
            if (user1.trim().equals("")) {
                lblUser.setText("Chưa nhập username");
                System.out.println(lblUser.getText());
                txtUsername.setBackground(Color.yellow);
                return;
            } else {
                lblUser.setText("");
                txtUsername.setBackground(Color.white);
            }
        }
        if (a == 2) {
            if (user1.trim().equals("")) {
                lblPass.setText("Chưa nhập Password");
                txtPassword.setBackground(Color.yellow);
                return;
            } else if (user1.length() < 3) {
                lblPass.setText("Password lớn hơn 3 kí tự");
                txtPassword.setBackground(Color.yellow);
                return;
            } else {
                lblPass.setText("");
                txtPassword.setBackground(Color.white);
            }
        }

    }

    @Override
    public void connect() {
        try {
            ChucNang.getDBConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Remember() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void FilltoList() {
        try {
            list = (List<User>) ChucNang.SelectUser();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
