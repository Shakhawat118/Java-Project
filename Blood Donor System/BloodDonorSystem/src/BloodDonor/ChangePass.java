/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BloodDonor;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author MehediHassanHashemy
 */
public class ChangePass extends javax.swing.JFrame {

    /**
     * Creates new form ChangePass
     */
    public ChangePass() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border lay = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        back.setBorder(lay);
        Minimize.setBorder(lay);
        Close.setBorder(lay);
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
        passfield = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        passfield1 = new javax.swing.JPasswordField();
        userfield = new javax.swing.JTextField();
        uicon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        secretCode = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        passfield.setBackground(new java.awt.Color(192, 192, 192));
        passfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passfield.setForeground(new java.awt.Color(228, 241, 254));
        passfield.setText("******");
        passfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passfieldFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("New Password:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Confirm Password:");

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        login.setText("Confirm");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        passfield1.setBackground(new java.awt.Color(192, 192, 192));
        passfield1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passfield1.setForeground(new java.awt.Color(228, 241, 254));
        passfield1.setText("******");
        passfield1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passfield1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passfield1FocusLost(evt);
            }
        });

        userfield.setBackground(new java.awt.Color(192, 192, 192));
        userfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userfield.setForeground(new java.awt.Color(153, 153, 153));
        userfield.setText("username");
        userfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userfieldFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Favourite Person:");

        secretCode.setBackground(new java.awt.Color(192, 192, 192));
        secretCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secretCodeActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        back.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("←");
        back.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });

        Close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setText("X");
        Close.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Close.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CloseFocusGained(evt);
            }
        });
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseMouseExited(evt);
            }
        });

        Minimize.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Minimize.setForeground(new java.awt.Color(255, 255, 255));
        Minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimize.setText("-");
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)
                .addComponent(Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Close))
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(uicon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(passfield1)
                            .addComponent(passfield)
                            .addComponent(secretCode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userfield, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uicon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secretCode, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        uicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/usericon.jpg")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseEntered
        Border layout = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue);
        Minimize.setBorder(layout);
        Minimize.setForeground(Color.blue);
    }//GEN-LAST:event_MinimizeMouseEntered

    private void MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseExited
        Border layout = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        Minimize.setBorder(layout);
        Minimize.setForeground(Color.white);
    }//GEN-LAST:event_MinimizeMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        LoginUI l1=new LoginUI();
        l1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        Border layout = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.green);
        back.setBorder(layout);
        back.setForeground(Color.green);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        Border layout = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        back.setBorder(layout);
        back.setForeground(Color.white);
    }//GEN-LAST:event_backMouseExited

    private void CloseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CloseFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseFocusGained

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered
        Border layout = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        Close.setBorder(layout);
        Close.setForeground(Color.red);
    }//GEN-LAST:event_CloseMouseEntered

    private void CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseExited
        Border layout = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        Close.setBorder(layout);
        Close.setForeground(Color.white);
    }//GEN-LAST:event_CloseMouseExited

    private void passfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passfieldFocusGained
        if(passfield.getText().trim().equals("******")){
            passfield.setText("");
        }
        passfield.setForeground(Color.black);
    }//GEN-LAST:event_passfieldFocusGained

    private void passfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passfieldFocusLost
        if(passfield.getText().trim().equals("")){
            passfield.setText("******");
            passfield.setForeground(new Color(228,241,254));
        }
    }//GEN-LAST:event_passfieldFocusLost

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setBackground(Color.blue);
        login.setForeground(Color.white);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        login.setBackground(Color.white);
        login.setForeground(Color.black);
    }//GEN-LAST:event_loginMouseExited

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        PreparedStatement st;
        ResultSet rs;

        String username = userfield.getText();
        String sq = secretCode.getText();
        String pass1 = passfield.getText();
        String pass2 = passfield1.getText();

        if(username.equals("") || sq.equals("") || pass1.equals("******") || pass2.equals("******")){
            JOptionPane.showMessageDialog(null, "One of more Field is Empty","Confirmation Error",2);
            return;
        }
            else if(pass1.trim().length() < 4){
                    JOptionPane.showMessageDialog(null,"Password must be atleast 4 word","Confirm Password",2);
                    return;
                    }
        String query = "SELECT * FROM `verified_user` WHERE `username` = ? AND `Fav_person` = ?";

        try {
            st =My_CNX.getConnection().prepareStatement(query);

            st.setString(1, username);
            st.setString(2, sq);
            
            rs = st.executeQuery();

            if(rs.next()){
                //show a new form
                if(pass1.equals(pass2)){
                    query = "UPDATE `verified_user` SET `Password`=? WHERE `Username` = ? AND `Fav_person` = ?";
                    
                    st = My_CNX.getConnection().prepareStatement(query);
                    
                    st.setString(1,pass1);
                    st.setString(2,username);
                    st.setString(3,sq);
                    
                    st.executeUpdate();
                    
                    
                    JOptionPane.showMessageDialog(null, "Password Updated ","Congratulation",1);
                    LoginUI a = new LoginUI();
                    a.setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Password Doesn't match ","Password Error",2);
                }
                
            }else{
                //error message
                JOptionPane.showMessageDialog(null, "Invalid Username or Sequrity answer ","Confirmation Error",2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChangePass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void passfield1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passfield1FocusGained
        if(passfield1.getText().trim().equals("******")){
            passfield1.setText("");
        }
        passfield1.setForeground(Color.black);
    }//GEN-LAST:event_passfield1FocusGained

    private void passfield1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passfield1FocusLost
        if(passfield1.getText().trim().equals("")){
            passfield1.setText("******");
            passfield1.setForeground(new Color(228,241,254));
        }
    }//GEN-LAST:event_passfield1FocusLost

    private void userfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userfieldFocusGained
        if(userfield.getText().trim().equals("username")){
            userfield.setText("");
        }
        userfield.setForeground(Color.black);
    }//GEN-LAST:event_userfieldFocusGained

    private void userfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userfieldFocusLost
        if(userfield.getText().trim().equals("")){
            userfield.setText("username");
            userfield.setForeground(new Color(228,241,254));
        }
    }//GEN-LAST:event_userfieldFocusLost

    private void secretCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secretCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secretCodeActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JPasswordField passfield1;
    private javax.swing.JTextField secretCode;
    private javax.swing.JLabel uicon;
    private javax.swing.JTextField userfield;
    // End of variables declaration//GEN-END:variables
}
