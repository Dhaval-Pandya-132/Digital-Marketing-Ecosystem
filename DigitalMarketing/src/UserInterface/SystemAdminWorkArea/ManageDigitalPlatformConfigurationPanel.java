package UserInterface.SystemAdminWorkArea;


import Business.DMEcosystem;
import Business.Enterprise.Enterprise;
import Business.RegionNetwork.Network;
import java.awt.CardLayout;
import java.awt.TrayIcon;
import javax.swing.JPanel;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import twitter4j.ResponseList;
import twitter4j.Status;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iamni
 */
public class ManageDigitalPlatformConfigurationPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDigitalPlatformConfigurationPanel
     */
    
     private JPanel userProcessContainer;
     private DMEcosystem system;
     private    Enterprise E;
    
    public ManageDigitalPlatformConfigurationPanel(JPanel userProcessContainer,DMEcosystem system, Enterprise E) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.E=E;
        setValues();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtConsumerSecretKey = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnTestAPI = new javax.swing.JButton();
        txtConsumerKey = new javax.swing.JTextField();
        txtAccessKey = new javax.swing.JTextField();
        txtAccessTokenSecret = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Configure Twitter");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 268, 70));

        jLabel2.setText("Consumer Secret Key:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, -1));
        add(txtConsumerSecretKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 240, 30));

        jLabel3.setText("Access Token Secret :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 170, -1));

        jLabel4.setText("Access Key :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 120, -1));

        btnSave.setBackground(new java.awt.Color(0, 153, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 150, -1));

        jLabel5.setText("Consumer Key:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, 30));

        btnTestAPI.setBackground(new java.awt.Color(0, 153, 255));
        btnTestAPI.setText("Test API");
        btnTestAPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestAPIActionPerformed(evt);
            }
        });
        add(btnTestAPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 150, -1));

        txtConsumerKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsumerKeyActionPerformed(evt);
            }
        });
        add(txtConsumerKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 240, 30));
        add(txtAccessKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 240, 30));
        add(txtAccessTokenSecret, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 240, 30));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png"))); // NOI18N
        btnBack.setToolTipText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnBack.setBorderPainted(false);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 105, 76));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        //Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
         if(txtAccessKey.getText().equals("")||txtAccessTokenSecret.getText().equals("")||txtConsumerKey.getText().equals("")|| txtConsumerSecretKey.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"One or more fields are empty");
        }
         else
         {
              saveTwitterConfig();
            
            txtConsumerKey.setText("");
            txtConsumerSecretKey.setText("");
            txtAccessKey.setText("");
            txtAccessTokenSecret.setText("");
         }
           
            

    }//GEN-LAST:event_btnSaveActionPerformed

   
    public void setValues()
    {
        
        if (E != null)
        {
            txtConsumerKey.setText(E.getConsumerkey());
            txtConsumerSecretKey.setText(E.getConsumerSecretkey());
            txtAccessKey.setText(E.getAccessToken());
            txtAccessTokenSecret.setText(E.getAccessTokenSecret());
            
            
            
        }
    
    }
    
    public void saveTwitterConfig()
    {
        if (E != null)
        {
            E.setConsumerkey(txtConsumerKey.getText());
            E.setConsumerSecretkey(txtConsumerSecretKey.getText());
            E.setAccessToken(txtAccessKey.getText());
            E.setAccessTokenSecret(txtAccessTokenSecret.getText());
            
            JOptionPane.showMessageDialog(null,"Twitter settings saved successfully..!!");
            
        }
    
    
    
    }      
    
    
    private void btnTestAPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestAPIActionPerformed
         try {
             // TODO add your handling code here:
             
             String consumerKeyStr = txtConsumerKey.getText();//"zpGL6kU6RKXoHE7MYkX1hsS5u";
              //Your Twitter App's Consumer Secret
             String consumerSecretStr = txtConsumerSecretKey.getText();//"KtubqX7OqHxZm79F9CeeeU9z7EXCaKOYtAVFIrflsgcr1wSFUL";
             //Your Twitter Access Token
             String accessTokenStr = txtAccessKey.getText();//"1114998612692545550-TRf6N9YGy2SrD8cE7dlriQSCLjErCL";
               //Your Twitter Access Token Secret
             String accessTokenSecretStr = txtAccessTokenSecret.getText();//"5687xOyIqQzw3CHes45fvKIOMEgACoXmjcRWZLGSnqa1m";
             
             Twitter twitter = new TwitterFactory().getInstance();
             
             twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
             AccessToken accessToken = new AccessToken(accessTokenStr,
                     accessTokenSecretStr);
             
             twitter.setOAuthAccessToken(accessToken);
                              twitter.verifyCredentials();
                              JOptionPane.showMessageDialog(null,"Twitter connect Successfully..!! ");
         } catch (TwitterException ex) {
             JOptionPane.showMessageDialog(null, "Something went wrong", "Invalid Credential", 1);
             return;
           //  Logger.getLogger(ManageDigitalPlatformConfigurationPanel.class.getName()).log(Level.SEVERE, null, ex);
             
         }

        
        
    }//GEN-LAST:event_btnTestAPIActionPerformed

    private void txtConsumerKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsumerKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsumerKeyActionPerformed

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        // TODO add your handling code here:

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px2.png")));
        btnBack.setBorderPainted(false);
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        // TODO add your handling code here:
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png")));
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnTestAPI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAccessKey;
    private javax.swing.JTextField txtAccessTokenSecret;
    private javax.swing.JTextField txtConsumerKey;
    private javax.swing.JTextField txtConsumerSecretKey;
    // End of variables declaration//GEN-END:variables
}