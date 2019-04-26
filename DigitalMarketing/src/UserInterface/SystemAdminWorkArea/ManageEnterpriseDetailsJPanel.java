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
import java.awt.Dimension;
import java.io.File;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dhava
 */
public class ManageEnterpriseDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseDetailsJPanel
     */
    
   
    JPanel mainJpanel;
    Enterprise en;
    DMEcosystem es;
    EnterpriseDirectory ed;
    String filepath="";
//String Network = ddlNetwork.getSelectedItem().toString();
    
    public ManageEnterpriseDetailsJPanel(JPanel jp,DMEcosystem es, EnterpriseDirectory ed) {
        initComponents();
    //   en=new Enterprise();
       this.ed= ed;
        //this.en = en;
       // this.ed = ed;
        this.es=es;
        this.mainJpanel=jp;
        populateComboBox();
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
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtTotalEmployee = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSelectphoto = new javax.swing.JButton();
        lblfilepath = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        networkJComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Configure Enterprise");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 268, 50));

        jLabel2.setText("Address :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 150, 33));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 220, 30));

        txtTotalEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalEmployeeActionPerformed(evt);
            }
        });
        add(txtTotalEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 220, 30));

        jLabel3.setText("Enterprise Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 150, 33));

        jLabel4.setText("Enterprise Type :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 150, 33));

        jLabel5.setText("Network:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 150, 33));

        jLabel6.setText("Total Employee :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 150, 33));

        btnSelectphoto.setText("Select Photo");
        btnSelectphoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectphotoActionPerformed(evt);
            }
        });
        add(btnSelectphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 220, 30));
        add(lblfilepath, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 220, 30));

        btnsave.setBackground(new java.awt.Color(0, 153, 255));
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 150, 30));

        jLabel7.setText("Enterprise Photo:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 150, 33));

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 220, 50));

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
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 105, 76));

        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeJComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 220, -1));

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 220, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtTotalEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalEmployeeActionPerformed

    private void btnSelectphotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectphotoActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc =new JFileChooser();
        jfc.setMultiSelectionEnabled(false);
        jfc.setCurrentDirectory(new File("C:\\Users\\dhava\\OneDrive\\Desktop\\Certificates"));
        int showOpenDialog = jfc.showOpenDialog(null);
        String  FileName="";
        String[] FileFormat= {"jpg","png","jpeg"};
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
                    filepath=jfc.getSelectedFile().getPath();
                    lblfilepath.setText(FileName);
                       break;
                }      
                //i--;
        }
        
        
    }//GEN-LAST:event_btnSelectphotoActionPerformed

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
        // TODO add your handling code here:
         mainJpanel.remove(this);
       CardLayout layout = (CardLayout) mainJpanel.getLayout();
        layout.previous(mainJpanel);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        
         if(txtName.getText().equals("")||txtTotalEmployee.getText().equals("")||txtaddress.getText().equals("")||networkJComboBox.getSelectedItem().toString().equals("")||enterpriseTypeJComboBox.getSelectedItem().toString().equals("")||lblfilepath.getText().equals(""))
        {
           JOptionPane.showMessageDialog(null, "One or more fields are empty");
            return;
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
        txtName.setText("");
        txtaddress.setText("");
        txtTotalEmployee.setText("");
       
        JOptionPane.showMessageDialog(null, "Enterprise Created successfully..!!");
    }//GEN-LAST:event_btnsaveActionPerformed

    private void enterpriseTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseTypeJComboBoxActionPerformed

    
    
    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();

      for (Network n : es.getNetworkList()) {
            networkJComboBox.addItem(n);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseTypeJComboBox.addItem(type);
        }

    }
    
    
    public void SaveEnterprise()
    {
    
      //  Network network = (Network) ddlNetwork.getSelectedItem();
       // Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) ddlenterprisetype.getSelectedItem();

        String Name =txtName.getText();
        String Path =lblfilepath.getText();
        Network Network = (Network)networkJComboBox.getSelectedItem();
        Integer TotalEmployee =Integer.valueOf(txtTotalEmployee.getText());
        String type =enterpriseTypeJComboBox.getSelectedItem().toString();
//        en.setNoofEmployee(TotalEmployee);
//        en.setEnterpriseName(Name);
//        en.setAddress(Name);
//        en.setCreatedDate(new Date());
//      //  en.setNetwork(Network);
//        en.setType( ddlenterprisetype.getSelectedItem().toString());
//        
       // Network n = new Network();
        
//        for (Network NN: es.getNetworkList())
//        {
//                if (NN.getName().equals(Network))
//                {
//                    n=NN;
//                    break;
//                }
//        }
        
            Enterprise E=Network.getEpd().createAndAddEnterprise(Name, enterpriseTypeJComboBox.getSelectedItem().toString());
            E.setEnterpriseName(Name);
            E.setNoofEmployee(TotalEmployee);
            E.setNetwork(Network.getName());
            E.setProfilePhoto(filepath);
            E.setCreatedDate(new Date());
            E.setEnterpriseType(Enterprise.EnterpriseType.valueOf(enterpriseTypeJComboBox.getSelectedItem().toString()));
            E.setAddress(txtaddress.getText());

         
//ed.createAndAddEnterprise(en, ddlenterprisetype.getSelectedItem().toString());
        
    }
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSelectphoto;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblfilepath;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTotalEmployee;
    private javax.swing.JTextArea txtaddress;
    // End of variables declaration//GEN-END:variables
}