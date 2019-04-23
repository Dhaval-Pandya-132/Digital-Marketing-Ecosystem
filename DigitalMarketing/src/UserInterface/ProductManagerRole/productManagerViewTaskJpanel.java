/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ProductManagerRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.productAnalystOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import UserInterface.SystemAdminWorkArea.ViewEnterpriseDetailsJPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author dhava
 */
public class productManagerViewTaskJpanel extends javax.swing.JPanel {

    /**
     * Creates new form productManagerViewTaskJpanel
     */
   JPanel userProcessContainer;
   UserAccount account;
   private javax.swing.JTable tbltasklist;
    private javax.swing.JScrollPane jScrollPane1;
   Enterprise enterprise;
    public productManagerViewTaskJpanel(JPanel userProcessContainer,UserAccount account ,Enterprise enterprise) {
        initComponents();
         this.userProcessContainer=userProcessContainer;
        this.account=account;
        jScrollPane1 = new javax.swing.JScrollPane();
        
        this.enterprise=enterprise;
        populatestatusComboBox();
        populateWorkListTable();
  //      populateRequestTable("All");
    }

    
    public void populatestatusComboBox(){
        ddlstatus.removeAllItems();
    //    ddlstatus.addItem("-- Select Status--");
        
      //  ddlstatus.setSelectedItem("-- Select Status--");
        
        for(WorkRequest.Workstatus  status:WorkRequest.Workstatus.values())
        {
            ddlstatus.addItem(status);
        }
        ddlstatus.setSelectedItem("All");
       
    }  
//
//     public void populateRequestTable(String Status){
//        DefaultTableModel model = (DefaultTableModel) tbltasklist.getModel();
//        
//        model.setRowCount(0);
//        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
//           
//            if (Status.equals(request.getStatus()) || Status.equals("All"))
//            {
//                    Object[] row = new Object[4];
//                    row[0] = request.getTitle();
//                    row[1] = request.getStatus();
//                    row[2] = request.getAssignto().getName();
//                    row[3] = request.getDuedate();
//                 //   String result = ((productDetailWorkRequest) request).getTestResult();
//                   // row[3] = result == null ? "Waiting" : result;
//
//                    model.addRow(row);
//            }
//            
//            
//        }
//    }
//    
     
    public void populateWorkListTable()
    {
    tbltasklist = new javax.swing.JTable(){
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);

                //  Color row based on a cell value
                if (!isRowSelected(row)) {
                    c.setBackground(getBackground());
                    int modelRow = convertRowIndexToModel(row);
                    Boolean Normal = (Boolean) getModel().getValueAt(modelRow, 4);
                    //            Integer sbpressure = (Integer)getModel().getValueAt(modelRow, 2);
                    //            Integer weightPound = (Integer)getModel().getValueAt(modelRow, 3);
                    //            Integer weightKgs= (Integer)getModel().getValueAt(modelRow, 4);

                    if (Normal) {
                        c.setBackground(Color.RED);
                    }
                    //            if (sbpressure==200) c.setBackground(Color.YELLOW);
                }

                return c;
            }
        };;
        tbltasklist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Status", "Assign To", "Due Date","IsDueToday"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbltasklist);
        if (tbltasklist.getColumnModel().getColumnCount() > 0) {
            tbltasklist.getColumnModel().getColumn(0).setResizable(false);
            tbltasklist.getColumnModel().getColumn(1).setResizable(false);
            tbltasklist.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 683, 197));
                DefaultTableModel model = (DefaultTableModel) tbltasklist.getModel();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        model.setRowCount(0);
        Date dt =new Date();
        String today=formatter.format(dt);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
           
                    Object[] row = new Object[5];
                    row[0] = request;
                    row[1] = request.getStatus();
                    row[2] = request.getAssignto().getName();
                    row[3] = formatter.format(request.getDuedate());
                    row[4] = formatter.format(request.getDuedate()).equals(today) && !request.getStatus().equals("Completed")  ? true:false;
                 //   String result = ((productDetailWorkRequest) request).getTestResult();
                   // row[3] = result == null ? "Waiting" : result;

                    model.addRow(row);
            
            
        }
        
        tbltasklist.removeColumn (tbltasklist.getColumnModel().getColumn(4));
    
    
    
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
        btnSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ddlstatus = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Task List");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 268, 70));

        btnSave.setBackground(new java.awt.Color(0, 153, 255));
        btnSave.setText("Edit");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 150, -1));

        jLabel8.setText("Status:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, 30));

        ddlstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(ddlstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 240, 30));

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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        //Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
       
          int selectedRow=tbltasklist.getSelectedRow();
        if (selectedRow>=0)
        {
        
              try {
                  WorkRequest request=(WorkRequest)tbltasklist.getValueAt(selectedRow,0);
                  productManagerCreateTask smn=new productManagerCreateTask(userProcessContainer,account,enterprise,request);
                  CardLayout cl=(CardLayout)userProcessContainer.getLayout();
                  userProcessContainer.add("SystemAdminManageNetwork",smn);
                  cl.next(userProcessContainer);
                  // resetTextfield();
              } catch (ParseException ex) {
                  Logger.getLogger(productManagerViewTaskJpanel.class.getName()).log(Level.SEVERE, null, ex);
              }
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Pleases select Row ");
        }
        
        
        
        
        
     
    }//GEN-LAST:event_btnSaveActionPerformed

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
    private javax.swing.JComboBox ddlstatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
