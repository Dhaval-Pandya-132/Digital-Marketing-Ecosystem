/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ProductAnalystRole;

import Business.DMEcosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.productAnalystOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.productDetailWorkRequest;
import UserInterface.SystemAdminWorkArea.ViewEnterpriseDetailsJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhava
 */
public class productAnalystrequestlistJPanel extends javax.swing.JPanel {

    /**
     * Creates new form productAnalystrequestlistJPanel
     */
   JPanel userProcessContainer;
   UserAccount account;
   //productManagerOrganization  organization;
  productAnalystOrganization  organization;
   Enterprise enterprise;
   DMEcosystem business;
    public productAnalystrequestlistJPanel(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,DMEcosystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization=(productAnalystOrganization)organization;
        this.enterprise=enterprise;
        this.business=business;
        
        populatestatusComboBox();
        populateRequestTable();
    }

    public void populatestatusComboBox(){
        ddlstatus.removeAllItems();
        for(WorkRequest.Workstatus  status:WorkRequest.Workstatus.values())
        {
            ddlstatus.addItem(status);
        }
       
    }  

     public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tbltasklist.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getStatus();
            row[2] = request.getAssignto();
            row[3] = request.getDuedate();
         //   String result = ((productDetailWorkRequest) request).getTestResult();
           // row[3] = result == null ? "Waiting" : result;
           if(request.getAssignto() == account.getEmployee() && (request.getStatus().equals("In Process Product Analyst") || request.getStatus().equals("Task Created"))) 
                {model.addRow(row);}
                
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltasklist = new javax.swing.JTable();
        btnproceed = new javax.swing.JButton();
        ddlstatus = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Task List");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 268, 70));

        tbltasklist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Status", "Assign To", "Due Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbltasklist);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 683, 197));

        btnproceed.setBackground(new java.awt.Color(0, 153, 255));
        btnproceed.setText("Proceed");
        btnproceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproceedActionPerformed(evt);
            }
        });
        add(btnproceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 150, -1));

        ddlstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(ddlstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 240, 30));

        jLabel8.setText("Status:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, 30));

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
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 105, 76));
    }// </editor-fold>//GEN-END:initComponents

    private void btnproceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproceedActionPerformed
        // TODO add your handling code here:
        //Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
         int selectedRow=tbltasklist.getSelectedRow();
        if (selectedRow>=0)
        {
            
            productDetailWorkRequest en=(productDetailWorkRequest)tbltasklist.getValueAt(selectedRow,0);
            en.setStatus("In Process Product Analyst");
            ProductAnalystProductDetailsJpanel vp =new ProductAnalystProductDetailsJpanel(userProcessContainer,account,en,enterprise,business);
            userProcessContainer.add("productManagerViewTaskJpanel",vp);
            CardLayout cl=(CardLayout)userProcessContainer.getLayout();
            cl.next(userProcessContainer);
           // resetTextfield();
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Pleases select Row ");
        }
        
    }//GEN-LAST:event_btnproceedActionPerformed

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
    private javax.swing.JComboBox ddlstatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbltasklist;
    // End of variables declaration//GEN-END:variables
}
