/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BloodDonor;

/**
 *
 * @author RamesaIbnat
 */
import static BloodDonor.AdminI.fillTable;
import static BloodDonor.AdminI.jTable1;
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
public class SearchDonorI extends javax.swing.JFrame {

    /**
     * Creates new form SearchDonarI
     */
    public SearchDonorI() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border layout = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        Close.setBorder(layout);
        Minimize.setBorder(layout);
        back.setBorder(layout);
        fillTable();
    }

    public static void fillTable(){
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"Name","Blood Group","Address","Contact","Email","Last Donate Date"}));
        PreparedStatement st;
        ResultSet rs;
        String query = "SELECT `Name`,`Email`,`Blood_group`, `Contact`, `Last_don_date`, `Address` FROM `verified_user`" ;
                
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            
            rs = st.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            
            Object [] row;
            while(rs.next()){
                row = new Object[6];
                row[0] = rs.getString(1);
                row[1] = rs.getString(3);
                row[2] = rs.getString(6);
                row[3] = rs.getString(4);
                row[4] = rs.getString(2);
                row[5] = rs.getString(5);
                model.addRow(row);
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(VerifyList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void fillTable(String blsearch){
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"Name","Blood Group","Address","Contact","Email","Last Donate Date"}));
        PreparedStatement st;
        ResultSet rs;
        String query = "SELECT `Name`,`Email`,`Blood_group`, `Contact`, `Last_don_date`, `Address` FROM `verified_user` WHERE `Blood_group` = ?" ;
                
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1,blsearch);
            rs = st.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            
            Object [] row;
            while(rs.next()){
                row = new Object[6];
                row[0] = rs.getString(1);
                row[1] = rs.getString(3);
                row[2] = rs.getString(6);
                row[3] = rs.getString(4);
                row[4] = rs.getString(2);
                row[5] = rs.getString(5);
                model.addRow(row);
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(VerifyList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void fillTable(String lsearch,int r){
        
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"Name","Blood Group","Address","Contact","Email","Last Donate Date"}));
        PreparedStatement st;
        ResultSet rs;
        String query = "SELECT `Name`,`Email`,`Blood_group`, `Contact`, `Last_don_date`, `Address` FROM `verified_user` WHERE `Address` = ?" ;
                
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1,lsearch);
            rs = st.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            
            Object [] row;
            while(rs.next()){
                row = new Object[6];
                row[0] = rs.getString(1);
                row[1] = rs.getString(3);
                row[2] = rs.getString(6);
                row[3] = rs.getString(4);
                row[4] = rs.getString(2);
                row[5] = rs.getString(5);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        regDonor = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 204));

        jTable1.setBackground(new java.awt.Color(102, 102, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Blood Group", "Address", "Contact", "Email", "Last Donate Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Donor:");

        search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFocusLost(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Search a Hero to Save Life");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(170, 170, 170)
                .addComponent(Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Close))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 204));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        regDonor.setBackground(new java.awt.Color(255, 0, 0));
        regDonor.setForeground(new java.awt.Color(204, 204, 204));
        regDonor.setText("Register as a Donor");
        regDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regDonorActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search By", "Blood Group", "Location" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(regDonor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBox1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        LoginI l1=new LoginI();
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

    private void regDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regDonorActionPerformed
        RegistrationUI r1=new RegistrationUI();
        r1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regDonorActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String dsearch = jComboBox1.getSelectedItem().toString();
        if(search.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Insert Something to Search");
        }
        else{
            if(dsearch.equals("Blood Group")){
                fillTable(search.getText());
            }
            else if(dsearch.equals("Location")){
                fillTable(search.getText(),1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Select the catagory of searching");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFocusGained
        if(search.getText().equals("")){
            fillTable();
        }
    }//GEN-LAST:event_searchFocusGained

    private void searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFocusLost
        if(search.getText().equals("")){
            fillTable();
        }
    }//GEN-LAST:event_searchFocusLost

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
                DonorProfile vu = new DonorProfile();
                vu.setVisible(true);
                
                DonorProfile.name.setText(rs.getString(2));
                DonorProfile.gender.setText(rs.getString(1));
                DonorProfile.dob.setText(rs.getString(4));
                DonorProfile.address.setText(rs.getString(12));
                DonorProfile.bgroup.setText(rs.getString(9));
                DonorProfile.lastdd.setText(rs.getString(11));
                DonorProfile.contact.setText(rs.getString(10));
                DonorProfile.email.setText(rs.getString(7));
                DonorProfile.q1.setText(rs.getString(13));
                DonorProfile.q2.setText(rs.getString(14));
                DonorProfile.q3.setText(rs.getString(15));
                DonorProfile.q4.setText(rs.getString(16));
                DonorProfile.q5.setText(rs.getString(17));
                DonorProfile.q6.setText(rs.getString(18));
                DonorProfile.q1_ex.setText(rs.getString(19));
                DonorProfile.q2_ex.setText(rs.getString(20));
                DonorProfile.q3_ex.setText(rs.getString(21));
                DonorProfile.q4_ex.setText(rs.getString(22));
                DonorProfile.q5_ex.setText(rs.getString(23));
                DonorProfile.q6_ex.setText(rs.getString(24));

                this.dispose();  
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchDonorI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(SearchDonorI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchDonorI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchDonorI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchDonorI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchDonorI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel back;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JButton regDonor;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}