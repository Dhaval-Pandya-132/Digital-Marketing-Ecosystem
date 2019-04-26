package UserInterface.MarketingAnalystRole;


import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.productDetailWorkRequest;
import java.awt.Dimension;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iamni
 */
public class ViewProductDetailsJpanel extends javax.swing.JPanel {

    
  //s   private static final DateFormat df = new SimpleDateFormat("yyyy/mm/dd");
     JPanel userProcessContainer;
     WorkRequest request;
       String filepath="";
  //    ArrayList<String> FilePath =new ArrayList<String>();
    /**
     * Creates new form ProductDetails
     */
    public ViewProductDetailsJpanel(WorkRequest request) {
        initComponents();
        this.request=request;
       setValues();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnViewphoto = new javax.swing.JButton();
        lblFinalRemark = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        lblMarket = new javax.swing.JLabel();
        lblFeatures = new javax.swing.JLabel();
        lblLastRevenue = new javax.swing.JLabel();
        lblDurability = new javax.swing.JLabel();
        lblRetailPrice = new javax.swing.JLabel();
        lblManufactureDate = new javax.swing.JLabel();
        lblExpirydate = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Product Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 268, 80));

        jLabel5.setText("Product Name :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, 30));

        jLabel2.setText("Market :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, 20));

        jLabel4.setText("Features :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, -1));

        jLabel3.setText("Last Revenue :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 120, -1));

        jLabel9.setText("Durability :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 120, 20));

        jLabel10.setText("Manufacture Date :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 150, 40));

        jLabel11.setText("Expired Date :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 120, -1));

        jLabel12.setText("Final Remark :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 120, -1));

        jLabel13.setText("Product Image :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 120, -1));

        jLabel14.setText("Retail Price :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 120, 20));

        btnViewphoto.setText("View Photo");
        btnViewphoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewphotoActionPerformed(evt);
            }
        });
        add(btnViewphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 240, 30));

        lblFinalRemark.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblFinalRemark, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 230, 110));

        lblProductName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 230, 30));

        lblMarket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblMarket, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 230, 30));

        lblFeatures.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblFeatures, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 230, 30));

        lblLastRevenue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblLastRevenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 230, 30));

        lblDurability.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblDurability, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 230, 30));

        lblRetailPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblRetailPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 230, 30));

        lblManufactureDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblManufactureDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 230, 30));

        lblExpirydate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblExpirydate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 230, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewphotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewphotoActionPerformed
        // TODO add your handling code here:
        ProfileImageJpanel pi=new ProfileImageJpanel(request);
                            JFrame jf=new JFrame();
                            jf.setSize(new Dimension(1200, 800));
                           // jf.setLayout( new AbsoluteLayout());
                            jf.setTitle("Select Profile Picture");
                            jf.add(pi);
                            jf.setVisible(true);
    }//GEN-LAST:event_btnViewphotoActionPerformed

    
    public void setValues()
    {
        lblDurability.setText(request.getPdw().getDurability());
        lblProductName.setText(request.getPdw().getProductName());
        lblMarket.setText(request.getPdw().getMarket());
        lblRetailPrice.setText(String.valueOf(request.getPdw().getReatilPrice()));
        lblFeatures.setText(request.getPdw().getFeature());
        lblManufactureDate.setText(String.valueOf(request.getPdw().getManufectureDate()));
        lblLastRevenue.setText(request.getPdw().getLastRevenue());
        lblExpirydate.setText(String.valueOf(request.getPdw().getExpiredate()));
        lblFinalRemark.setText(request.getPdw().getFinalRemark());
        //lblLastRevenue.setText(request.getDurability());
        
    }
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewphoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDurability;
    private javax.swing.JLabel lblExpirydate;
    private javax.swing.JLabel lblFeatures;
    private javax.swing.JLabel lblFinalRemark;
    private javax.swing.JLabel lblLastRevenue;
    private javax.swing.JLabel lblManufactureDate;
    private javax.swing.JLabel lblMarket;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblRetailPrice;
    // End of variables declaration//GEN-END:variables
}