package UserInterface.socialMediaSpeciaList;


import Business.DMEcosystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import UserInterface.SystemAdminWorkArea.EnterpriseEmailConnectionConfiguration;
import com.assignment5.xerox.DataGenerator;
import com.assignment5.xerox.DataReader;
import java.io.IOException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
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
public class SendEmail extends javax.swing.JPanel {

    /**
     * Creates new form SendEmail
     */
    DataGenerator generator ;
    DataReader orderReader;
      String filepath = "";
       private JPanel userProcessContainer;
     private DMEcosystem system;
     private    Enterprise E;
     private EnterpriseEmailConnectionConfiguration ec;
    public SendEmail(JPanel userProcessContainer,UserAccount account,WorkRequest request,Enterprise enterprise) throws IOException {
        initComponents();
         this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.E=E;
        this.ec=ec;
         generator = DataGenerator.getInstance();
        orderReader = new DataReader(generator.getOrderFilePath());
       
    }

    
     private void readData() throws IOException{
        String[] orderRow;
//        printRow(orderReader.getFileHeader());
         DataReader productReader = new DataReader(generator.getProductCataloguePath());
      //  String[] prodRow;
       // printRow(productReader.getFileHeader());
//        while((prodRow = productReader.getNextRow()) != null){
//            generateProduct(prodRow);
//        }  
     }
     public void sendEmail(String EmailAdd)
    {
    
        
          

        
            // String host ="smtp.gmail.com" ;
        String host = E.getHost();
       String port = E.getPort();
            final String user = E.getSenderEmail();
          // final String pass = "Ajinkya2494";
            final String pass1 = E.getPassword();
           // String to = "ankita27brahmankar@gmail.com,pandya.d@husky.neu.edu";
           // String from = "manpreetjoshi12@gmail.com";
       //     String to= txtTo.getText();
            String to= EmailAdd;
           String from = E.getSenderEmail();
           
            String subject = txtSubject.getText();
            String messageText = txtMsgText.getText();
            // String mBody = txtmsgBody.getText();
            boolean sessionDebug = false;

           // Properties props = System.getProperties();
            Properties props = new Properties();
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            
           Session mailSession = Session.getDefaultInstance(props, null);
            
        try{
             javax.mail.Message msg = new MimeMessage(mailSession);
             msg.setFrom(new InternetAddress(from));
             InternetAddress[] address = {new InternetAddress(to)};
             msg.setRecipients(javax.mail.Message.RecipientType.TO, address);
             msg.setSubject(subject); 
             msg.setText(messageText);
            // Transport.send(msg);
         BodyPart messageBodyPart = new javax.mail.internet.MimeBodyPart();
       //  messageBodyPart = new javax.mail.internet.MimeBodyPart();
         
          messageBodyPart.setText(messageText);

         // Create a multipar message
         Multipart multipart = new MimeMultipart();

         // Set text message part
         multipart.addBodyPart(messageBodyPart);
        messageBodyPart = new MimeBodyPart();
        // String filename = "C:\\Users\\Ankita\\Desktop\\AED Project\\Roles.txt";
         DataSource source = new FileDataSource(filepath);
         messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(filepath);
      //   Multipart multipart = new javax.mail.internet.MimeMultipart();

         // Set text message part
         multipart.addBodyPart(messageBodyPart);
     
         // Send the complete message parts
         msg.setContent(multipart);
             
            Transport transport=mailSession.getTransport("smtp");
           transport.connect(host, user, pass1);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
             
        }
        catch(Exception ex)
        {
            System.out.println(ex);
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

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        txtSubject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMsgText = new javax.swing.JTextArea();
        btnSelectphoto = new javax.swing.JButton();
        btnconfigureadmin = new javax.swing.JButton();
        lblfilepath = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("To:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 150, 30));

        jLabel2.setText("Subject:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 160, 50));

        jLabel4.setText("Message Text");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 110, 50));

        jLabel7.setText("Enterprise Photo:");
        jLabel7.setPreferredSize(new java.awt.Dimension(87, 16));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 150, 33));
        add(txtTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 290, -1));
        add(txtSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 290, 40));

        txtMsgText.setColumns(20);
        txtMsgText.setRows(5);
        jScrollPane1.setViewportView(txtMsgText);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 290, 120));

        btnSelectphoto.setText("Select Photo");
        btnSelectphoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectphotoActionPerformed(evt);
            }
        });
        add(btnSelectphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 220, 30));

        btnconfigureadmin.setBackground(new java.awt.Color(0, 153, 255));
        btnconfigureadmin.setText("Send");
        btnconfigureadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfigureadminActionPerformed(evt);
            }
        });
        add(btnconfigureadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 160, 40));
        add(lblfilepath, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 220, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Send Email");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 280, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectphotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectphotoActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc =new JFileChooser();
        jfc.setMultiSelectionEnabled(false);
        // jfc.setCurrentDirectory(new File("C:\\Users\\dhava\\OneDrive\\Desktop\\Certificates"));
        int showOpenDialog = jfc.showOpenDialog(null);
        String  FileName="";
        String[] FileFormat= {"jpg","png","jpeg"};
        Boolean isCorrect =false;
        int i=jfc. getSelectedFiles().length;
        filepath = jfc.getSelectedFile().getPath();

        while (showOpenDialog==JFileChooser.APPROVE_OPTION && jfc.getSelectedFile().getName() != null) {
            isCorrect =false;
            FileName=jfc.getSelectedFile().getName();

            for(String s : FileFormat)
            {
                if(FileName.endsWith(s))
                {
                    isCorrect=true;
                    break;
                }

            }

            if (!isCorrect) {
                JOptionPane.showMessageDialog(null, "The file "
                    + jfc.getSelectedFile() + " is not valid Image file",
                    "Open Error", JOptionPane.ERROR_MESSAGE);
                showOpenDialog = jfc.showOpenDialog(null);
            }else {

                //FilePath.add(jfc.getSelectedFiles()[i].getPath()) ;
                lblfilepath.setText(FileName);
                break;
            }
            //i--;
        }
    }//GEN-LAST:event_btnSelectphotoActionPerformed

    private void btnconfigureadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfigureadminActionPerformed
        // TODO add your handling code here:
        sendEmail("");
        JOptionPane.showMessageDialog(null, "Email sent successfully");
    }//GEN-LAST:event_btnconfigureadminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelectphoto;
    private javax.swing.JButton btnconfigureadmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblfilepath;
    private javax.swing.JTextArea txtMsgText;
    private javax.swing.JTextField txtSubject;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}
