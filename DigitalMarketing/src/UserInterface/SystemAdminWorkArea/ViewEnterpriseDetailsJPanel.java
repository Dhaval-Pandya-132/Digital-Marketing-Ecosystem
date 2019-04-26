/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.DMEcosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.RegionNetwork.Network;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ankita
 */
public class ViewEnterpriseDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewEnterpriseDetailsJPanel
     */
    JPanel mainJpanel;
    Enterprise en;
    DMEcosystem es;
   // Network nw;
    EnterpriseDirectory ed;
    public ViewEnterpriseDetailsJPanel(JPanel mainJpanel,DMEcosystem es, Enterprise en) {
        initComponents();
        this.mainJpanel=mainJpanel;
        this.es=es;
        this.en = en;
        txtName.setEditable(false);
        txtTotalEmployee.setEditable(false);
        txtaddress.setEditable(false);
        populateComboBox();
       // this.nw =  nw;
        setValues();
    }

    private void populateComboBox() {
        ddlNetwork.removeAllItems();
        ddlenterprisetype.removeAllItems();

      for (Network network : es.getNetworkList()) {
            ddlNetwork.addItem(network.toString());
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            ddlenterprisetype.addItem(type.toString());
        }

    }
    
    public void setValues(){
        txtName.setText(en.getEnterpriseName());
        txtTotalEmployee.setText(Integer.toString(en.getNoofEmployee()));
        txtaddress.setText(en.getAddress());
        ddlNetwork.setSelectedItem(en.getNetwork());
       // ddlenterprisetype.getSelectedItem((Object)en.getType());
    }
    
    /* public void bindPatientlist() {

        ddlNetwork.addItem("-- Select All--");

        for (Network nw : ed.getEnterpriseList()) {
            
        }

    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        ddlNetwork = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        ddlenterprisetype = new javax.swing.JComboBox<>();
        txtTotalEmployee = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Address :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 150, 33));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 220, 30));

        ddlNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(ddlNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 220, -1));

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 220, 50));

        ddlenterprisetype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ddlenterprisetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlenterprisetypeActionPerformed(evt);
            }
        });
        add(ddlenterprisetype, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 220, -1));

        txtTotalEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalEmployeeActionPerformed(evt);
            }
        });
        add(txtTotalEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 220, 30));

        jLabel3.setText("Enterprise Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 150, 33));

        jLabel4.setText("Enterprise Type :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 150, 33));

        jLabel5.setText("Network:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 150, 33));

        jLabel6.setText("Total Employee :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 150, 33));

        btnsave.setBackground(new java.awt.Color(0, 153, 255));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 100, -1));

        btnupdate.setBackground(new java.awt.Color(0, 153, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 110, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Enterprise");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 268, 50));

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
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 105, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void ddlenterprisetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlenterprisetypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddlenterprisetypeActionPerformed

    private void txtTotalEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalEmployeeActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
         btnsave.setEnabled(true);
        
        txtName.setEditable(true);
        txtTotalEmployee.setEditable(true);
        txtaddress.setEditable(true);
          ddlNetwork.setEnabled(true);
       ddlenterprisetype.setEnabled(true);
        
    }//GEN-LAST:event_btnupdateActionPerformed
       public void SaveEnterprise()
       {
       String Name =txtName.getText();
      //  String Path =lblfilepath.getText();
        String Network = ddlNetwork.getSelectedItem().toString();
        Integer TotalEmployee =Integer.valueOf(txtTotalEmployee.getText());
        
//        en.setNoofEmployee(TotalEmployee);
//        en.setEnterpriseName(Name);
//        en.setAddress(Name);
//        en.setCreatedDate(new Date());
//      //  en.setNetwork(Network);
//        en.setType( ddlenterprisetype.getSelectedItem().toString());
//        
        Network n = null;
        
        for (Network NN: es.getNetworkList())
        {
                if (NN.getName().equals(Name))
                {
                    n=NN;
                    break;
                }
        }
        
        if(n !=null)
        {
            Enterprise E=n.getEpd().createAndAddEnterprise(Name, ddlenterprisetype.getSelectedItem().toString());
            E.setEnterpriseName(Name);
            E.setCreatedDate(new Date());
            E.setEnterpriseType(Enterprise.EnterpriseType.valueOf(ddlenterprisetype.getSelectedItem().toString()));
            E.setAddress(txtaddress.getText());

        } 
        
       // en.setCreatedDate(new Date());
       // ed.createAndAddEnterprise(en, ddlenterprisetype.getSelectedItem().toString());
       }
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
            btnsave.setEnabled(false);
        txtName.setEditable(false);
        txtTotalEmployee.setEditable(false);
        txtaddress.setEditable(false);
       ddlNetwork.setEnabled(false);
       ddlenterprisetype.setEnabled(false);
        
        
         if(txtName.getText().equals("")||txtTotalEmployee.getText().equals("")||txtaddress.getText().equals("")||ddlNetwork.getSelectedItem().toString().equals("")||ddlenterprisetype.getSelectedItem().toString().equals(""))
        {
           JOptionPane.showMessageDialog(null, "One or more fields are empty");
            
        }
   
        int NoofEmployee = -1;
        try{
            NoofEmployee = Integer.parseInt(txtTotalEmployee.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Total Employees should be numeric value");
            return;
        }
        SaveEnterprise();
        JOptionPane.showMessageDialog(null, "Enterprise Created successfully..!!");
    }//GEN-LAST:event_btnsaveActionPerformed

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
        
        CardLayout layout=(CardLayout) mainJpanel.getLayout();
        layout.previous(mainJpanel);
        Component[] comps = mainJpanel.getComponents();
        for(Component c: comps){
            if(c instanceof EnterpriseDetailsTableJPanel){
                EnterpriseDetailsTableJPanel panel = (EnterpriseDetailsTableJPanel) c;
                panel.PopulateTable();
            }
        }
        mainJpanel.remove(this);
//        CardLayout layout = (CardLayout) mainJpanel.getLayout();
//        layout.previous(mainJpanel);
    }//GEN-LAST:event_btnBackActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> ddlNetwork;
    private javax.swing.JComboBox<String> ddlenterprisetype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTotalEmployee;
    private javax.swing.JTextArea txtaddress;
    // End of variables declaration//GEN-END:variables
}
