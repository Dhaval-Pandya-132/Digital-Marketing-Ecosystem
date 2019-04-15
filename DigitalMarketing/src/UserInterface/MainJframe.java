/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package   UserInterface;
import Business.DMEcosystem;
import Business.DB4OUtil.*;
import UserInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
/**
 *
 * @author dhava
 */
public class MainJframe extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    private DMEcosystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
   // private javax.swing.JPanel container;  
    
    public MainJframe() {
        
        initComponents();
        system =new DMEcosystem();
        system = dB4OUtil.retrieveSystem();
        btnlogout.setEnabled(false);
        btnLogin.setVisible(true);
        txtUserName.setVisible(true);
        txtpassword.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        //container = new javax.swing.JPanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        btnlogout = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jpanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 900));

        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerLocation(150);
        jSplitPane1.setDividerSize(0);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel2.setBackground(new java.awt.Color(87, 85, 212));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 100));

        btnlogout.setBackground(new java.awt.Color(255, 255, 255));
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Name:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password :");

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorderPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin)
                    .addComponent(btnlogout))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel2);

        jpanel1.setBackground(new java.awt.Color(255, 255, 255));
        jpanel1.setMinimumSize(new java.awt.Dimension(1800, 1000));
        jpanel1.setPreferredSize(new java.awt.Dimension(1200, 800));
        jpanel1.setLayout(new java.awt.CardLayout(40, -50));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/complete-digital-marketing-bn-1.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setMinimumSize(new java.awt.Dimension(1400, 1000));
        jLabel3.setPreferredSize(new java.awt.Dimension(1400, 1000));
        jpanel1.add(jLabel3, "card2");

        jSplitPane1.setRightComponent(jpanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
//        this.validate();
//        this.revalidate();
//        this.repaint();

        btnlogout.setEnabled(false);
        btnLogin.setVisible(true);
        txtUserName.setVisible(true);
        txtpassword.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jpanel1.removeAll();
         
      //  JPanel mj = new JPanel();
        ReloadMainJpan(jpanel1);
        jSplitPane1.setDividerLocation(150);
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String UserName =txtUserName.getText();
        String Password =txtpassword.getText();
        if(UserName.equals("Sysadmin") && Password.equals("Sysadmin"))
        {
            btnlogout.setEnabled(true);
            btnLogin.setEnabled(true);
            btnLogin.setVisible(false);
            txtUserName.setVisible(false);
            txtpassword.setVisible(false);
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jpanel1.removeAll();
            //  jpanel1.setSize(1200, 100);
            //  jpanel1.setPreferredSize(new Dimension(1200, 100));
            // jpanel1.setLayout(new java.awt.CardLayout());
            SystemAdminWorkAreaJPanel jp=new SystemAdminWorkAreaJPanel(jpanel1,system);
            jpanel1.add("workArea", jp);
            CardLayout layout=(CardLayout)jpanel1.getLayout();
            layout.next(jpanel1);

            // this.setVisible(false);
            // jp.setVisible(true);

            //jpanel1.add("workArea",jp);

        }
    }//GEN-LAST:event_btnLoginActionPerformed

    
    public void ReloadMainJpan(JPanel jp)
    {
      
        
        jp.setBackground(new java.awt.Color(255, 255, 255));
     //   jp.setMinimumSize(new java.awt.Dimension(1800, 1000));
        jp.setPreferredSize(new java.awt.Dimension(1000, 800));
        jp.setLayout(new java.awt.CardLayout(40, -50));
	jp.add(jLabel3, "card2");
        jSplitPane1.setRightComponent(jp);
    }
    
    
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
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel jpanel1;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtpassword;
    // End of variables declaration//GEN-END:variables
}
