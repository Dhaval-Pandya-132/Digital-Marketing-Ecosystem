package UserInterface.socialMediaSpeciaList;


import Business.DMEcosystem;
import Business.Enterprise.Enterprise;
import Business.RegionNetwork.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EmailSendData;
import Business.WorkQueue.WorkRequest;
import UserInterface.SystemAdminWorkArea.EnterpriseEmailConnectionConfiguration;
import com.assignment5.xerox.DataGenerator;
import com.assignment5.xerox.DataReader;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Multipart;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.ejml.ops.ReadCsv;

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
       String CSVfilepath = "";
       private JPanel userProcessContainer;
     private DMEcosystem system;
     private    Enterprise E;
     private EnterpriseEmailConnectionConfiguration ec;
     ArrayList<String[]> Rs2 = null ;
     List<EmailSendData> listEmailsend;
     
     DMEcosystem business;
     
        String host = "";
       String port = "";
        String user = "";
          // final String pass = "Ajinkya2494";
        String pass1 = "";
         String from = "";
       WorkRequest request;
     
     
     public SendEmail(JPanel userProcessContainer,UserAccount account,WorkRequest request,Enterprise enterprise,DMEcosystem business) throws IOException {
        initComponents();
         this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.E=E;
        this.ec=ec;
        this.business=business;
         listEmailsend=new ArrayList<>();
       this.request=request;
         setEnterpriseKey();
//         generator = DataGenerator.getInstance();
//        orderReader = new DataReader(generator.getOrderFilePath());
       
    }

      public void setEnterpriseKey()
    {
        
        for (Network N: business.getNetworkList()) {
            for (Enterprise E: N.getEpd().getEnterpriseList())
            {
                
                if (E.getEnterpriseType().getValue().equals("Client"))
                {
              
                    host=E.getHost();
                    port = E.getPort();
                    //user = E.;
          // final String pass = "Ajinkya2494";
                    pass1 = E.getPassword().toString();
                    from = E.getSenderEmail();
                    user= E.getSenderEmail();
                    break;
//                  
                }
                  else
                  {
                    host="smtp.gmail.com";
                    
                    
                    port = "587";
                    user = "dhavalpandya296@gmail.com";
          // final String pass = "Ajinkya2494";
                    pass1 = "Dhaval!296";
                    from = "dhavalpandya296@gmail.com";
                  
                  }
                }
            }
        }
    
  
    public void PopulateTable(String Name,String Email, String Status )
       {
           DefaultTableModel DTM=(DefaultTableModel)tblemaillist.getModel();
       //    DTM.setRowCount(0);
               Object[] row  =new Object[3];
                row[0]=Name;
                row[1]=Email;
                row[2]=Status;
                DTM.addRow(row);
           
           
       }
     public void sendEmail(String EmailAdd, String Name)
    {
            // String host ="smtp.gmail.com" ;
           // String to = "ankita27brahmankar@gmail.com,pandya.d@husky.neu.edu";
           // String from = "manpreetjoshi12@gmail.com";
       //     String to= txtTo.getText();
            EmailSendData ed=new EmailSendData();
            String to= EmailAdd;
           
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

         if (filepath!="")
         {
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
         }   
            Transport transport=mailSession.getTransport("smtp");
             try {
           transport.connect(host, user, pass1);
           transport.sendMessage(msg, msg.getAllRecipients());
           if (EmailAdd.contains("gmail")||EmailAdd.contains("yahoo")||EmailAdd.contains("husky.neu.edu"))
           {
            PopulateTable(Name, EmailAdd, "Success");
            ed.setEmailAddress(EmailAdd);
            ed.setName(Name);
            ed.setStatus("Success");
           }
            else
           {
             PopulateTable(Name, EmailAdd, "Fail");
                ed.setEmailAddress(EmailAdd);
                ed.setName(Name);
                ed.setStatus("Fail");
           }

           listEmailsend.add(ed);
//mailSession.
             }
             catch(Exception e)
                     {PopulateTable(Name, EmailAdd, "Fail");
                     listEmailsend.add(ed);}
           transport.close();
            
             
        }
        catch (SendFailedException F)
        { PopulateTable(Name, EmailAdd, "Fail");
        listEmailsend.add(ed);}
        catch(Exception ex)
        {
            System.out.println(ex);
            PopulateTable(Name, EmailAdd, "Fail");
            listEmailsend.add(ed);
        }
        finally{
         request.getEsd().add(ed);
        
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
        txtSubject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMsgText = new javax.swing.JTextArea();
        btnSelectphoto = new javax.swing.JButton();
        btnconfigureadmin = new javax.swing.JButton();
        lblfilepath = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblemaillist = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("To:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 30));

        jLabel2.setText("Subject:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 160, 50));

        jLabel4.setText("Message Text");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 110, 50));

        jLabel7.setText("Enterprise Photo:");
        jLabel7.setPreferredSize(new java.awt.Dimension(87, 16));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 150, 33));
        add(txtSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 290, 40));

        txtMsgText.setColumns(20);
        txtMsgText.setRows(5);
        jScrollPane1.setViewportView(txtMsgText);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 290, 120));

        btnSelectphoto.setText("Select Photo");
        btnSelectphoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectphotoActionPerformed(evt);
            }
        });
        add(btnSelectphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 220, 30));

        btnconfigureadmin.setBackground(new java.awt.Color(0, 153, 255));
        btnconfigureadmin.setText("Send");
        btnconfigureadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfigureadminActionPerformed(evt);
            }
        });
        add(btnconfigureadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 160, 40));
        add(lblfilepath, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 220, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Send Email");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 280, -1));

        jButton1.setText("Attach Customer CSV");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 290, -1));

        tblemaillist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email Address", "Status"
            }
        ));
        jScrollPane2.setViewportView(tblemaillist);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, 310));

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
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 105, 76));
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

        while (showOpenDialog==JFileChooser.APPROVE_OPTION && jfc.getSelectedFile().getName() != null  && i >= 0)  {
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
        
        if (Rs2.size() >0)
        {
        int i=0;
            for (String[]  s :Rs2) {
               if (i==0  && !s[0].equals("Email Address") && !s[1].equals("Name") )
               {
                   JOptionPane.showMessageDialog(null, "Invalid file ..!");
                   break;
               }
               else
               {
                    if (i>0)
                    {
                        sendEmail(s[0],s[1]);
                    }
               }
               i++; 
            }
 
          //  request.getEsd().clear();
           // request.getEsd().
           // request.getEd().add(listEmailsend);
            JOptionPane.showMessageDialog(null, "Email sent successfully");
        
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Upload Customer Data");
        
        }
        
        
    }//GEN-LAST:event_btnconfigureadminActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser jfc =new JFileChooser();
        jfc.setMultiSelectionEnabled(false);
        jfc.setCurrentDirectory(new File("D:\\Java Lab assignments\\DigitalMarketing"));
        int showOpenDialog = jfc.showOpenDialog(null);
        String  FileName="";
        String[] FileFormat= {"CSV","csv"};
        Boolean isCorrect =false;
        int i=jfc. getSelectedFiles().length;
      //  jfc.getSelectedFile().getName()
        
        
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
                    CSVfilepath=jfc.getSelectedFile().getPath();
                  //  lblfilepath.setText(FileName);
                       break;
                }      
                //i--;
        }
        
        
        
         File DataFile = new File(CSVfilepath);
         Rs2 = ReadCSVfile(DataFile);
         
         
                
    }//GEN-LAST:event_jButton1ActionPerformed

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

        public ArrayList<String[]> ReadCSVfile(File DataFile) {
            ArrayList<String[]> Rs = new ArrayList<String[]>();
                    String[] OneRow;
            try {
                
                
                BufferedReader brd = new BufferedReader(new FileReader(DataFile));
                while (brd.ready()) {
                    String st = brd.readLine();
                    OneRow = st.split(",");
                    Rs.add(OneRow);
                  //  System.out.println(Arrays.toString(OneRow));
                } // end of while
            } // end of try
            catch (Exception e) {
                String errmsg = e.getMessage();
                JOptionPane.showMessageDialog(null, "File Not found..!");
            } // end of Catch
            return Rs;
        }// end of ReadFile me
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSelectphoto;
    private javax.swing.JButton btnconfigureadmin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblfilepath;
    private javax.swing.JTable tblemaillist;
    private javax.swing.JTextArea txtMsgText;
    private javax.swing.JTextField txtSubject;
    // End of variables declaration//GEN-END:variables
}
