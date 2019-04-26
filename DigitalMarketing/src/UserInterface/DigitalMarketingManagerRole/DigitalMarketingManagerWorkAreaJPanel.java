/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DigitalMarketingManagerRole;

import Business.DMEcosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.digitalMarketingManagerOrganization;
import Business.Organization.productManagerOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.io.IOException;
import javax.swing.JPanel;

/**
 *
 * @author dhava
 */
public class DigitalMarketingManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DigitalMarketingManagerWorkAreaJPanel
     */
   JPanel userProcessContainer;
   UserAccount account;
   digitalMarketingManagerOrganization  organization;
   Enterprise enterprise;
    
    public DigitalMarketingManagerWorkAreaJPanel(JPanel userProcessContainer,UserAccount account,digitalMarketingManagerOrganization  organization,Enterprise enterprise,DMEcosystem business) throws IOException {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
       
//      if(this.enterprise.getProfilePhoto() !=null)
//      {
//        if(this.enterprise.getProfilePhoto().length()>0)
//        {
//            loadProfilepic();
//        }
//      }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblenterpriselogo = new javax.swing.JLabel();
        btnManageTask = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(lblenterpriselogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 570, 350));

        btnManageTask.setBackground(new java.awt.Color(61, 99, 210));
        btnManageTask.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnManageTask.setForeground(new java.awt.Color(255, 255, 255));
        btnManageTask.setText("Manage Task List");
        btnManageTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTaskActionPerformed(evt);
            }
        });
        add(btnManageTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 290, 100));

        btnDashboard.setBackground(new java.awt.Color(61, 99, 210));
        btnDashboard.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("Dashboard");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });
        add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 290, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTaskActionPerformed
        // TODO add your handling code here:

        socialMediasManagerworklistJPanel smn=new socialMediasManagerworklistJPanel(userProcessContainer,account,enterprise);
        CardLayout cl=(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("socialMediasManagerworklistJPanel",smn);
        cl.next(userProcessContainer);
    }//GEN-LAST:event_btnManageTaskActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnManageTask;
    private javax.swing.JLabel lblenterpriselogo;
    // End of variables declaration//GEN-END:variables
}
