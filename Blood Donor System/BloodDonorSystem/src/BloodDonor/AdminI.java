/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BloodDonor;

/**
 *
 * @author MehediHassanHashemy
 */
import static BloodDonor.VerifyList.jTable1;
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
import javax.swing.table.DefaultTableModel;
public class AdminI extends javax.swing.JFrame {

    /**
     * Creates new form AdminI
     */
    public AdminI() {
        initComponents();
        this.setLocationRelativeTo(null);
        fillTable();
    }
    
    public static void fillTable(){
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"Name","Blood Group","Location","Contact Number"}));
        PreparedStatement st;
        ResultSet rs;
        String query = "SELECT `Name`,`Blood_group`, `Contact`, `Address` FROM `verified_user`" ;
                
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            
            rs = st.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            
            Object [] row;
            while(rs.next()){
                row = new Object[4];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(4);
                row[3] = rs.getString(3);
                model.addRow(row);
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(VerifyList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void fillTable(String blsearch){
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"Name","Blood Group","Location","Contact Number"}));
        PreparedStatement st;
        ResultSet rs;
        String query = "SELECT `Name`,`Blood_group`, `Contact`, `Address` FROM `verified_user` WHERE `Blood_group` = ?" ;
                
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1,blsearch);
            rs = st.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            
            Object [] row;
            while(rs.next()){
                row = new Object[4];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(4);
                row[3] = rs.getString(3);
                model.addRow(row);
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(VerifyList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void fillTable(String lsearch,int r){
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"Name","Blood Group","Location","Contact Number"}));
        PreparedStatement st;
        ResultSet rs;
        String query = "SELECT `Name`,`Blood_group`, `Contact`, `Address` FROM `verified_user` WHERE `Address` = ?" ;
                
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1,lsearch);
            rs = st.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            
            Object [] row;
            while(rs.next()){
                row = new Object[4];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(4);
                row[3] = rs.getString(3);
                model.addRow(row);
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(VerifyList.class.getName()).log(Level.SEVERE, null, ex);
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

        adminPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        ViewUser = new javax.swing.JMenu();
        VerifyUser = new javax.swing.JMenu();
        profile = new javax.swing.JMenu();
        logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        adminPanel.setBackground(new java.awt.Color(0, 102, 102));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Blood Group", "Location", "Contact Number"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Search User");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search By", "Blood Group", "Location" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search by:");

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
        );

        ViewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/usericon.jpg"))); // NOI18N
        ViewUser.setText("View User");
        jMenuBar1.add(ViewUser);

        VerifyUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/verify.png"))); // NOI18N
        VerifyUser.setText("Verify User");
        VerifyUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerifyUserMouseClicked(evt);
            }
        });
        jMenuBar1.add(VerifyUser);

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/profile.png"))); // NOI18N
        profile.setText("Profile");
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        jMenuBar1.add(profile);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(logout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained

        if(jTextField1.getText().trim().equals("Search User") || jTextField1.getText().equals("")){
            jTextField1.setText("");
            jTextField1.setForeground(Color.black);
            fillTable();
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if(jTextField1.getText().trim().equals("") || jTextField1.getText().equals("")){
            jTextField1.setText("Search User");
            jTextField1.setForeground(new Color(153,153,153));
            fillTable();
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        LoginAI a1=new LoginAI();
        a1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        PreparedStatement st;
        ResultSet rs;
        
        String query = "SELECT * FROM `Admin` WHERE `Username` = ?";
        try {
            st =My_CNX.getConnection().prepareStatement(query);
            
            st.setString(1,LoginAI.user);
            
            rs = st.executeQuery();

            if(rs.next()){
                AdminProfile up = new AdminProfile();
                up.setVisible(true);
                AdminProfile.name.setText(rs.getString(1));
                AdminProfile.username.setText(rs.getString(2));
                AdminProfile.gender.setText(rs.getString(3));
                AdminProfile.dob.setText(rs.getString(4));
                AdminProfile.bgroup.setText(rs.getString(5));
                AdminProfile.contact.setText(rs.getString(6));
                AdminProfile.email.setText(rs.getString(7));                
                this.dispose();  
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_profileMouseClicked

    private void VerifyUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerifyUserMouseClicked
        VerifyList a1 = new VerifyList();
        a1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VerifyUserMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int rowIndex = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

        String contact = model.getValueAt(rowIndex, 3).toString();

        PreparedStatement st;
        ResultSet rs;
        
        String query = "SELECT * FROM `verified_user` WHERE `Contact` = ?";
        try {
            st =My_CNX.getConnection().prepareStatement(query);
            
            st.setString(1,contact);
            
            rs = st.executeQuery();

            if(rs.next()){
                ViewUP vu = new ViewUP();
                vu.setVisible(true);
                
                ViewUP.name.setText(rs.getString(2));
                ViewUP.username.setText(rs.getString(3));
                ViewUP.gender.setText(rs.getString(1));
                ViewUP.dob.setText(rs.getString(4));
                ViewUP.id.setText(rs.getString(8));
                ViewUP.address.setText(rs.getString(12));
                ViewUP.bgroup.setText(rs.getString(9));
                ViewUP.lastdd.setText(rs.getString(11));
                ViewUP.contact.setText(rs.getString(10));
                ViewUP.email.setText(rs.getString(7));
                ViewUP.sq.setText(rs.getString(5));
                ViewUP.pass.setText(rs.getString(6));
                ViewUP.q1.setText(rs.getString(13));
                ViewUP.q2.setText(rs.getString(14));
                ViewUP.q3.setText(rs.getString(15));
                ViewUP.q4.setText(rs.getString(16));
                ViewUP.q5.setText(rs.getString(17));
                ViewUP.q6.setText(rs.getString(18));
                ViewUP.q1_ex.setText(rs.getString(19));
                ViewUP.q2_ex.setText(rs.getString(20));
                ViewUP.q3_ex.setText(rs.getString(21));
                ViewUP.q4_ex.setText(rs.getString(22));
                ViewUP.q5_ex.setText(rs.getString(23));
                ViewUP.q6_ex.setText(rs.getString(24));

                this.dispose();  
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        String search = jComboBox1.getSelectedItem().toString();
        if(jTextField1.getText().equals("Search User") || jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Insert Something to Search");
        }
        else{
            if(search.equals("Blood Group")){
                fillTable(jTextField1.getText());
            }
            else if(search.equals("Location")){
                fillTable(jTextField1.getText(),1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Select the catagory of searching");
            }
        }
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(AdminI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu VerifyUser;
    private javax.swing.JMenu ViewUser;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenu logout;
    private javax.swing.JMenu profile;
    // End of variables declaration//GEN-END:variables
}
