/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.DMEcosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author dhava
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel mainJpanel;
    DMEcosystem system;
    EnterpriseDirectory ed;
    Enterprise en;
    
    public SystemAdminWorkAreaJPanel(JPanel jp , DMEcosystem system ) {
        initComponents();
        this.mainJpanel=jp;
        this.system=system;
        //this.en = new Enterprise();
        this.ed= new EnterpriseDirectory();
        
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
        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Welcome System Admin..!!");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 370, 100));

        btnManageNetwork.setBackground(new java.awt.Color(0, 0, 0));
        btnManageNetwork.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnManageNetwork.setForeground(new java.awt.Color(255, 255, 255));
        btnManageNetwork.setText("Manage Network");
        btnManageNetwork.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnManageNetworkFocusGained(evt);
            }
        });
        btnManageNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageNetworkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageNetworkMouseExited(evt);
            }
        });
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });
        add(btnManageNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 290, 180));

        btnManageEnterprise.setBackground(new java.awt.Color(0, 0, 0));
        btnManageEnterprise.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnManageEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });
        add(btnManageEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 290, 180));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("View Enterprise ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 310, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        // TODO add your handling code here:
        SystemAdminManageNetwork smn=new SystemAdminManageNetwork(mainJpanel,system);
        CardLayout cl=(CardLayout)mainJpanel.getLayout();
        mainJpanel.add("SystemAdminManageNetwork",smn);
        cl.next(mainJpanel);
       
    }//GEN-LAST:event_btnManageNetworkActionPerformed

    private void btnManageNetworkFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnManageNetworkFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnManageNetworkFocusGained

    private void btnManageNetworkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageNetworkMouseEntered
        // TODO add your handling code here:
         btnManageNetwork.setBackground(Color.blue);
        // jButton2.setSize(20,20);
         btnManageNetwork.setForeground(Color.white);
         
         
         
    }//GEN-LAST:event_btnManageNetworkMouseEntered

    private void btnManageNetworkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageNetworkMouseExited
        // TODO add your handling code here:
        btnManageNetwork.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_btnManageNetworkMouseExited

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseDetailsJPanel smn=new ManageEnterpriseDetailsJPanel(mainJpanel,system,ed);
        CardLayout cl=(CardLayout)mainJpanel.getLayout();
        mainJpanel.add("ManageEnterpriseDetailsJPanel",smn);
        cl.next(mainJpanel);
    
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         EnterpriseDetailsTableJPanel edt =new EnterpriseDetailsTableJPanel(mainJpanel,system,ed);
        CardLayout cl=(CardLayout)mainJpanel.getLayout();
        mainJpanel.add("EnterpriseDetailsTableJPanel",edt);
        cl.next(mainJpanel);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
