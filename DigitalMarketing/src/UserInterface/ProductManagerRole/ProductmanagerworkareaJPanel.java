/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ProductManagerRole;

import Business.DMEcosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.productManagerOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdminWorkArea.SystemAdminManageNetwork;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import twitter4j.TwitterException;

/**
 *
 * @author dhava
 */
public class ProductmanagerworkareaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProductmanagerworkareaJPanel
     */
   JPanel userProcessContainer;
   UserAccount account;
   productManagerOrganization  organization;
   Enterprise enterprise;
      
    
    public ProductmanagerworkareaJPanel(JPanel userProcessContainer,UserAccount account,productManagerOrganization  organization,Enterprise enterprise) throws IOException {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
       
      if(this.enterprise.getProfilePhoto() !=null)
      {
        if(this.enterprise.getProfilePhoto().length()>0)
        {
            loadProfilepic();
        }
      }
    }

    public void loadProfilepic() throws IOException
    {
            BufferedImage img=ImageIO.read(new File(enterprise.getProfilePhoto()));
            Image im=img;
            ImageIcon ic =new ImageIcon(im.getScaledInstance(360, 150, Image.SCALE_DEFAULT));
            lblenterpriselogo.setIcon(ic);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageTask = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnCreateTask = new javax.swing.JButton();
        lblenterpriselogo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageTask.setBackground(new java.awt.Color(61, 99, 210));
        btnManageTask.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnManageTask.setForeground(new java.awt.Color(255, 255, 255));
        btnManageTask.setText("Manage Task List");
        btnManageTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTaskActionPerformed(evt);
            }
        });
        add(btnManageTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 290, 100));

        btnDashboard.setBackground(new java.awt.Color(61, 99, 210));
        btnDashboard.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("Dashboard");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });
        add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 290, 100));

        btnCreateTask.setBackground(new java.awt.Color(0, 0, 0));
        btnCreateTask.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCreateTask.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateTask.setText("Create New Task");
        btnCreateTask.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnCreateTaskFocusGained(evt);
            }
        });
        btnCreateTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreateTaskMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreateTaskMouseExited(evt);
            }
        });
        btnCreateTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTaskActionPerformed(evt);
            }
        });
        add(btnCreateTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 290, 100));
        add(lblenterpriselogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 570, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTaskActionPerformed
        // TODO add your handling code here:
        
        productManagerViewTaskJpanel smn=new productManagerViewTaskJpanel(userProcessContainer,account,enterprise);
        CardLayout cl=(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("productManagerViewTaskJpanel",smn);
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnManageTaskActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
       try {
           // TODO add your handling code here:
           TwitterAnalysis smn=new TwitterAnalysis(userProcessContainer,account,enterprise);
           CardLayout cl=(CardLayout)userProcessContainer.getLayout();
           userProcessContainer.add("TwitterAnalysis",smn);
           cl.next(userProcessContainer);
       } catch (TwitterException ex) {
           Logger.getLogger(ProductmanagerworkareaJPanel.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnCreateTaskFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnCreateTaskFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateTaskFocusGained

    private void btnCreateTaskMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateTaskMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateTaskMouseEntered

    private void btnCreateTaskMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateTaskMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateTaskMouseExited

    private void btnCreateTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTaskActionPerformed
       try {
           // TODO add your handling code here:
           
           productManagerCreateTask smn=new productManagerCreateTask(userProcessContainer,account,enterprise,null);
           CardLayout cl=(CardLayout)userProcessContainer.getLayout();
           userProcessContainer.add("SystemAdminManageNetwork",smn);
           cl.next(userProcessContainer);
       } catch (ParseException ex) {
           Logger.getLogger(ProductmanagerworkareaJPanel.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }//GEN-LAST:event_btnCreateTaskActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateTask;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnManageTask;
    private javax.swing.JLabel lblenterpriselogo;
    // End of variables declaration//GEN-END:variables
}