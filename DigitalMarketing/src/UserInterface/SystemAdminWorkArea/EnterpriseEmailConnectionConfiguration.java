package UserInterface.SystemAdminWorkArea;

import Business.DMEcosystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Session;
import javax.mail.Transport;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iamni
 */
public class EnterpriseEmailConnectionConfiguration extends javax.swing.JPanel {

    /**
     * Creates new form EnterpriseEmailConnectionConfiguration
     */
      private JPanel userProcessContainer;
     private DMEcosystem system;
     private    Enterprise E;
      String regexEmail = "^[A-Za-z0-9]+[A-Za-z0-9+_]+@[A-Za-z0-9.-]+$";
    // String regex = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[#]).{8,10})";
   
     //EnterpriseEmailConnectionConfiguration ec = new EnterpriseEmailConnectionConfiguration(userProcessContainer,system,E);
     
    public EnterpriseEmailConnectionConfiguration(JPanel userProcessContainer,DMEcosystem system,Enterprise E) {
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
        jLabel5 = new javax.swing.JLabel();
        btnTestConnection = new javax.swing.JButton();
        txtSenderEmailAdd1 = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnSave1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtHost = new javax.swing.JTextField();
        txtPort = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Configure Email Connection");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 350, 70));

        jLabel2.setText("Port:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, 30));

        jLabel5.setText("Sender Email Address:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, 30));

        btnTestConnection.setBackground(new java.awt.Color(0, 153, 255));
        btnTestConnection.setForeground(new java.awt.Color(255, 255, 255));
        btnTestConnection.setText("Test Connection");
        btnTestConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestConnectionActionPerformed(evt);
            }
        });
        add(btnTestConnection, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 150, 40));
        add(txtSenderEmailAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 240, 30));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 240, 30));

        btnSave1.setBackground(new java.awt.Color(0, 153, 255));
        btnSave1.setForeground(new java.awt.Color(255, 255, 255));
        btnSave1.setText("Save");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        add(btnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 150, 40));

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
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 105, 76));
        add(txtHost, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 240, 30));
        add(txtPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 240, 30));

        jLabel3.setText("Password:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, 30));

        jLabel4.setText("Host:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 256, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnTestConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestConnectionActionPerformed
        // TODO add your handling code here:
             try {
             String senderEmail;
             senderEmail = txtSenderEmailAdd1.getText();
             String password;
             password = String.valueOf(txtPassword.getPassword());
            String host = txtHost.getText();
            // String host = "smtp.gmail.com";
             String port = txtPort.getText();
            
            Properties props = new Properties();
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", port);
            props.put("mail.smtp.auth", "true");
            Session mailSession = Session.getDefaultInstance(props, null);
            Transport transport=mailSession.getTransport("smtp");
            transport.connect(host, senderEmail, password);
            JOptionPane.showMessageDialog(null,"Email configuration is Successful..!! ");
             
         } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Something went wrong", "Invalid Credential", 1);
             return;
           //  Logger.getLogger(ManageDigitalPlatformConfigurationPanel.class.getName()).log(Level.SEVERE, null, ex);
             
         }
    }//GEN-LAST:event_btnTestConnectionActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:
        String Password = String.valueOf(txtPassword.getPassword());
        Pattern pattern = Pattern.compile(regexEmail);
     //   Matcher matcher = pattern.matcher(txtSenderEmailAdd1.getText());
        if(txtSenderEmailAdd1.getText().equals("")|| Password.equals("")|| txtHost.getText().equals("")||txtPort.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"One or more fields are empty");
        }
        if(!(Pattern.matches(regexEmail,txtSenderEmailAdd1.getText()))) 
        {
            JOptionPane.showMessageDialog(null,"Please check email","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if(!txtPort.getText().equals("587") || !txtHost.getText().equals("smtp.gmail.com"))
            {
                JOptionPane.showMessageDialog(null,"check values of Host and Port");
            }
            else
            {
                saveEmailConfig(); 
            }
           
          
        }
        

    }//GEN-LAST:event_btnSave1ActionPerformed
    public void setValues()
    {
         
        if (E != null)
        {
          txtSenderEmailAdd1.setText(E.getSenderEmail());
           txtHost.setText(E.getHost());
           txtPort.setText(E.getPort());
            txtPassword.setText(E.getPassword());
  
        }
    
    }
    
     public void saveEmailConfig()
    {
         if (E != null)
        {
           // setValues();
           // E.setConsumerkey(txtConsumerKey.getText());
            E.setSenderEmail(txtSenderEmailAdd1.getText());
            E.setPassword(String.valueOf(txtPassword.getPassword()));
           E.setHost(txtHost.getText());
            E.setPort(txtPort.getText());
            
            JOptionPane.showMessageDialog(null,"Email settings saved successfully..!!");
            
        }
    
    }
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

        //        CardLayout layout=(CardLayout) mainJpanel.getLayout();
        //        layout.previous(mainJpanel);
        //        Component[] comps = mainJpanel.getComponents();
        //        for(Component c: comps){
            //            if(c instanceof EnterpriseDetailsTableJPanel){
                //                EnterpriseDetailsTableJPanel panel = (EnterpriseDetailsTableJPanel) c;
                //                panel.PopulateTable();
                //            }
            //        }
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnTestConnection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtHost;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtSenderEmailAdd1;
    // End of variables declaration//GEN-END:variables
}
