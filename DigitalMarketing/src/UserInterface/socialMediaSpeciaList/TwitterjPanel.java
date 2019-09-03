/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.socialMediaSpeciaList;

import Business.DMEcosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.RegionNetwork.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TwitterData;
import Business.WorkQueue.WorkRequest;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.CoreMap;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javadashboarddemo.SentimentClassification;
import javadashboarddemo.SentimentResult;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.ejml.simple.SimpleMatrix;
import twitter4j.HashtagEntity;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

/**
 *
 * @author dhava
 */
public class TwitterjPanel extends javax.swing.JPanel {

    /**
     * Creates new form TwitterjPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    WorkRequest request;
    Enterprise enterprise;
    String consumerKeyStr = "";
    String consumerSecretStr ="";
    String accessTokenStr = "";
    String accessTokenSecretStr ="";
    static Properties props;
    static StanfordCoreNLP pipeline;
    DMEcosystem business;
    int TotalComment=0;
    int PositiveComment=0;
    int NegativeComment=0;
    int NeutralComments=0;
    
    public TwitterjPanel(JPanel userProcessContainer,UserAccount account,WorkRequest request,Enterprise enterprise,DMEcosystem business) throws TwitterException {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.request=request;
        this.business=business;
        this.enterprise=enterprise;
        this.business=business;
        setEnterpriseKey();
        populateRequestTable();
    }

    
    
    
    
    public static String getSentimentResult(String text) {

            String Sentiment="";
            props = new Properties();
		props.setProperty("annotators", "tokenize, ssplit, parse, sentiment");
		pipeline = new StanfordCoreNLP(props);
        
                SentimentResult sentimentResult = new SentimentResult();
		SentimentClassification sentimentClass = new SentimentClassification();

		if (text != null && text.length() > 0) {
			
			// run all Annotators on the text
			Annotation annotation = pipeline.process(text);

			for (CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class)) {
				// this is the parse tree of the current sentence
				Tree tree = sentence.get(SentimentCoreAnnotations.SentimentAnnotatedTree.class);
				SimpleMatrix sm = RNNCoreAnnotations.getPredictions(tree);
				String sentimentType = sentence.get(SentimentCoreAnnotations.SentimentClass.class);

//				sentimentClass.setVeryPositive((double)Math.round(sm.get(4) * 100d));
//				sentimentClass.setPositive((double)Math.round(sm.get(3) * 100d));
//				sentimentClass.setNeutral((double)Math.round(sm.get(2) * 100d));
//				sentimentClass.setNegative((double)Math.round(sm.get(1) * 100d));
//				sentimentClass.setVeryNegative((double)Math.round(sm.get(0) * 100d));
//				
				sentimentResult.setSentimentScore(RNNCoreAnnotations.getPredictedClass(tree));
				sentimentResult.setSentimentType(sentimentType);
				sentimentResult.setSentimentClass(sentimentClass);
                                System.out.println(sentimentType);
			}

		}

                if (sentimentResult.getSentimentScore() >1)
                {
                    Sentiment="Positive";
                
                }
                else
                {
                      Sentiment="Negatove";
                }
		return sentimentResult.getSentimentType();
	}
    
    public void setEnterpriseKey()
    {
        
        for (Network N: business.getNetworkList()) {
            for (Enterprise E: N.getEpd().getEnterpriseList())
            {
                
                if (E.getEnterpriseType().getValue().equals("Client"))
                {
              
                  if  (E.getConsumerkey() !="" ||E.getConsumerSecretkey() !="" ||E.getAccessToken() !="" ||E.getAccessTokenSecret() !="" )
                  {
                    consumerKeyStr = E.getConsumerkey();//"zpGL6kU6RKXoHE7MYkX1hsS5u";

            //Your Twitter App's Consumer Secret
                    consumerSecretStr = E.getConsumerSecretkey();//"KtubqX7OqHxZm79F9CeeeU9z7EXCaKOYtAVFIrflsgcr1wSFUL";

                   //Your Twitter Access Token
                    accessTokenStr = E.getAccessToken();//"1114998612692545550-TRf6N9YGy2SrD8cE7dlriQSCLjErCL";

                   //Your Twitter Access Token Secret
                    accessTokenSecretStr = E.getAccessTokenSecret();//"5687xOyIqQzw3CHes45fvKIOMEgACoXmjcRWZLGSnqa1m";
                  }
                  else
                  {
                        consumerKeyStr = "zpGL6kU6RKXoHE7MYkX1hsS5u";

            //Your Twitter App's Consumer Secret
                    consumerSecretStr = "KtubqX7OqHxZm79F9CeeeU9z7EXCaKOYtAVFIrflsgcr1wSFUL";

                   //Your Twitter Access Token
                    accessTokenStr = "1114998612692545550-TRf6N9YGy2SrD8cE7dlriQSCLjErCL";

                   //Your Twitter Access Token Secret
                    accessTokenSecretStr = "5687xOyIqQzw3CHes45fvKIOMEgACoXmjcRWZLGSnqa1m";
                  
                  
                  }
                }
            }
        }
            
    
    
    }
    
    
    public void populateRequestTable() throws TwitterException{
        DefaultTableModel model = (DefaultTableModel) tbltweets.getModel();
             Twitter twitter = new TwitterFactory().getInstance();

			twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
			AccessToken accessToken = new AccessToken(accessTokenStr,
					accessTokenSecretStr);

			twitter.setOAuthAccessToken(accessToken);
        model.setRowCount(0);
        List<Status> statuses = twitter.getHomeTimeline(); 
      //  for (Organization o :enterprise.getOrganizationDirectory().getOrganizationList()) {
                  List<String> tweetid =new ArrayList<>();
                     request.getTd().clear();     
                         
                         for(int i=0;i<statuses.size();i++)
                         {
                             TwitterData sa=new TwitterData();
                             HashMap<String,String> Comment =new HashMap<>();
                             List<String> Hastags=new ArrayList<>();
                               TotalComment=0;
                               PositiveComment=0;
                               NegativeComment=0;
                               NeutralComments=0;
                               if (statuses.get(i).getInReplyToStatusId() == -1)
                             {
                                    sa.setFavoriteCount(statuses.get(i).getFavoriteCount());
                                    sa.setText(statuses.get(i).getText());
                                    HashtagEntity[] h =statuses.get(i).getHashtagEntities();
                                    if (h.length>0)
                                    {
                                           for (int j = 0; j < h.length; j++) {
                                                  Hastags.add(h[j].getText());
                                        }

                                           sa.setHasTagList(Hastags);
                                    }
                                    sa.setRetweetCount(statuses.get(i).getRetweetCount());
                                    sa.setTweetID(String.valueOf(statuses.get(i).getId()));

                               tweetid.add(String.valueOf(statuses.get(i).getId()));
                                
                                String tid =String.valueOf(statuses.get(i).getId());
                                String ReplyTID="";    
                                    while (tid!="")
                                    {
                                          for (int k =0 ;k<statuses.size();k++ )  
                                          {
                                              if (String.valueOf(statuses.get(k).getInReplyToStatusId()).equals(tid))
                                                      {
                                                          Comment.put(statuses.get(k).getText(),getSentimentResult(statuses.get(k).getText()));
                                                           tid =String.valueOf(statuses.get(k).getId());
                                                           ReplyTID=String.valueOf(statuses.get(k).getId());
                                                          // TotalComment++;
                                                           if (getSentimentResult(statuses.get(k).getText()).contains("negative") || getSentimentResult(statuses.get(k).getText()).contains("Negative")   )
                                                           {  
                                                                NegativeComment++;
                                                           }
                                                           else if (getSentimentResult(statuses.get(k).getText()).contains("Positive") || getSentimentResult(statuses.get(k).getText()).contains("positive")  )
                                                           {  
                                                                PositiveComment++;
                                                           
                                                           }    
                                                           else
                                                           {
                                                               NeutralComments++;
                                                           }
                                                           k=-1;
                                                      }
                                          
                                          } 
                                          
                                          if (tid.equals(ReplyTID) || ReplyTID=="" )
                                                  {tid="";}
                                          
                                    }
                                
                                    sa.setComments(Comment);
                                    sa.setPositiveComment(PositiveComment);
                                    sa.setNegativeComment(NegativeComment);
                                    sa.setNeutralComments(NeutralComments);
                                    sa.setTotalComment(PositiveComment + NegativeComment+NeutralComments);
                                    request.getTd().add(sa);
                               
                               
                             }
                             
                         }
 
         for ( Status s :statuses) {
              Object[] row = new Object[4];
                    row[0] = s.getText();
                    row[1] = s.getRetweetCount();
                    row[2] =s.getFavoriteCount() ;
                     
                    if(s.getInReplyToStatusId()==-1)
                    {
                    model.addRow(row);
                    
                    }
        }

          //  row[1] = ()request.;
          //  row[2] = o.;
          //  row[3] = request.getDuedate();
                
             
      
   }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txttwitter = new javax.swing.JTextArea();
        btnproceed = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbltweets = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttwitter.setColumns(20);
        txttwitter.setRows(5);
        txttwitter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttwitterKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txttwitter);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 440, 280));

        btnproceed.setBackground(new java.awt.Color(0, 153, 255));
        btnproceed.setText("Tweet");
        btnproceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproceedActionPerformed(evt);
            }
        });
        add(btnproceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 150, -1));

        tbltweets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tweet", "RetweetCount", "Favoritecount"
            }
        ));
        jScrollPane2.setViewportView(tbltweets);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 490, 280));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Twitter Analysis");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 280, -1));

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

    private void btnproceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproceedActionPerformed
        // TODO add your handling code here:
        //Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
     
        Twitter twitter = new TwitterFactory().getInstance();

			twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
			AccessToken accessToken = new AccessToken(accessTokenStr,
					accessTokenSecretStr);

			twitter.setOAuthAccessToken(accessToken);

        try {
            
            
            if (txttwitter.getText().length()>250)
            {
            JOptionPane.showMessageDialog(null, "You cant write more than 250 words");
            return;
            }
            else
            {
                twitter.updateStatus(txttwitter.getText());
                txttwitter.setText("");
                populateRequestTable();
            }
            
        } catch (TwitterException ex) {
           // Logger.getLogger(TwitterjPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Something went wrong in Connection");
            return;
        }

    }//GEN-LAST:event_btnproceedActionPerformed

    private void txttwitterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttwitterKeyPressed
        // TODO add your handling code here:
        if (txttwitter.getText().length()>250)
        {
            JOptionPane.showMessageDialog(null, "You cant write more than 250 words");
            return;
        }
        
    }//GEN-LAST:event_txttwitterKeyPressed

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
    private javax.swing.JButton btnproceed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbltweets;
    private javax.swing.JTextArea txttwitter;
    // End of variables declaration//GEN-END:variables
}
