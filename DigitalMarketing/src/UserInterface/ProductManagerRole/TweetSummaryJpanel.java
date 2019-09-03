/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ProductManagerRole;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TwitterData;
import Business.WorkQueue.WorkRequest;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author dhava
 */
public class TweetSummaryJpanel extends javax.swing.JPanel {

    /**
     * Creates new form TweetSummaryJpanel
     */
   JPanel userProcessContainer;
   UserAccount account;
   private javax.swing.JTable tbltasklist;
    private javax.swing.JScrollPane jScrollPane1;
   Enterprise enterprise;
   WorkRequest request;
    public TweetSummaryJpanel(JPanel userProcessContainer,UserAccount account ,Enterprise enterprise ,WorkRequest request) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        jScrollPane1 = new javax.swing.JScrollPane();
        this.enterprise=enterprise;
        this.request=request;
        populateTwitterData();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tbltweets = new javax.swing.JTable();
        btnshowcomments = new javax.swing.JButton();
        btngetReport = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Task Analysis");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 213, -1));

        tbltweets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tweet", "RetweetCount", "Favoritecount", "Total Comments", "Positive Comments", "Negative Comments", "Neutral Comments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbltweets);
        if (tbltweets.getColumnModel().getColumnCount() > 0) {
            tbltweets.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbltweets.getColumnModel().getColumn(1).setResizable(false);
            tbltweets.getColumnModel().getColumn(1).setPreferredWidth(20);
            tbltweets.getColumnModel().getColumn(2).setResizable(false);
            tbltweets.getColumnModel().getColumn(2).setPreferredWidth(20);
            tbltweets.getColumnModel().getColumn(3).setResizable(false);
            tbltweets.getColumnModel().getColumn(3).setPreferredWidth(20);
            tbltweets.getColumnModel().getColumn(4).setResizable(false);
            tbltweets.getColumnModel().getColumn(4).setPreferredWidth(20);
            tbltweets.getColumnModel().getColumn(5).setResizable(false);
            tbltweets.getColumnModel().getColumn(5).setPreferredWidth(20);
            tbltweets.getColumnModel().getColumn(6).setResizable(false);
            tbltweets.getColumnModel().getColumn(6).setPreferredWidth(20);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 970, 280));

        btnshowcomments.setBackground(new java.awt.Color(61, 99, 210));
        btnshowcomments.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnshowcomments.setForeground(new java.awt.Color(255, 255, 255));
        btnshowcomments.setText("Show Comments");
        btnshowcomments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowcommentsActionPerformed(evt);
            }
        });
        add(btnshowcomments, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 230, 60));

        btngetReport.setBackground(new java.awt.Color(61, 99, 210));
        btngetReport.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btngetReport.setForeground(new java.awt.Color(255, 255, 255));
        btngetReport.setText("Get Report");
        btngetReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngetReportActionPerformed(evt);
            }
        });
        add(btngetReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 230, 60));

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
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 105, 76));
    }// </editor-fold>//GEN-END:initComponents

    private void btnshowcommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowcommentsActionPerformed
        
      int selectedRow=tbltweets.getSelectedRow();
        if (selectedRow>=0)
        {
        TwitterData request=(TwitterData)tbltweets.getValueAt(selectedRow,0);
                  
                               // TODO add your handling code here:
                        TwitterDetailCommentsJPanel smn=new TwitterDetailCommentsJPanel(userProcessContainer,request);
                        CardLayout cl=(CardLayout)userProcessContainer.getLayout();
                        userProcessContainer.add("TwitterDetailCommentsJPanel",smn);
                        cl.next(userProcessContainer);
        }       
        else
        {
             JOptionPane.showMessageDialog(null, "Pleases select Row ");
        }
        
        
    }//GEN-LAST:event_btnshowcommentsActionPerformed

    private void btngetReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngetReportActionPerformed
        // TODO add your handling code here:
        
        
        int selectedRow=tbltweets.getSelectedRow();
        if (selectedRow>=0)
        {
        
                  TwitterData request=(TwitterData)tbltweets.getValueAt(selectedRow,0);
                   DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
       
                   
                   dataset.addValue(request.getTotalComment(), "Total Comments", "Total Comments");  
                   dataset.addValue(request.getNegativeComment(), "Total NegativeComment", "Total NegativeComment");  
                   dataset.addValue(request.getPositiveComment(), "Total Positive", "Total Positive"); 
                   dataset.addValue(request.getNeutralComments(), "Total Neutral", "Total Neutral"); 
                   dataset.addValue(request.getRetweetCount(), "Total Retweet", "Total Retweet");  
                   dataset.addValue(request.getFavoriteCount(), "Total Favorite", "Total Favorite");  
                   
        
        JFreeChart chart=ChartFactory.createBarChart(  
        "Twitter Analysis", //Chart Title  
        "Properties", // Category axis  
        "Total Count", // Value axis  
        dataset,  
        PlotOrientation.VERTICAL,  
        true,true,false  
       ); 
        
        
    ChartPanel panel=new ChartPanel(chart);  
          JFrame jf=new JFrame();
                            jf.setSize(new Dimension(1200, 800));
                           // jf.setLayout( new AbsoluteLayout());
                            jf.setTitle("Chart Demo");
                            jf.add(panel);
                            jf.setVisible(true);
    
                  
        
        
        }
        else
        {
             JOptionPane.showMessageDialog(null, "Pleases select Row ");
        }
        
        
        
        
       
    
    }//GEN-LAST:event_btngetReportActionPerformed

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
    
    public void populateTwitterData()
    {
                DefaultTableModel model = (DefaultTableModel) tbltweets.getModel();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        model.setRowCount(0);
        Date dt =new Date();
        String today=formatter.format(dt);
        
        
        if ( request.getTd() != null)
        {
        
        for (TwitterData td : request.getTd()){
           
                    Object[] row = new Object[7];
                   // row[0] = request;
                    row[0] = td;
                    row[1] = td.getRetweetCount();
                    row[2] = td.getFavoriteCount();
                    row[3] = td.getTotalComment();
                    row[4] = td.getPositiveComment();
                    row[5] = td.getNegativeComment();
                    row[6] = td.getNeutralComments();
                 //   String result = ((productDetailWorkRequest) request).getTestResult();
                   // row[3] = result == null ? "Waiting" : result;
                      
                    model.addRow(row);
            
            
        }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btngetReport;
    private javax.swing.JButton btnshowcomments;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbltweets;
    // End of variables declaration//GEN-END:variables
}
