package UserInterface.MarketingAnalystRole;

import Business.DMEcosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.digitalMarketingManagerOrganization;
import Business.Organization.marketAnalystOrganization;
import Business.Organization.marketingManagerOrganization;
import Business.RegionNetwork.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.productDetailWorkRequest;
import Business.WorkQueue.productRiskAnalysis;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iamni
 */
public class EvaluateRiskFactorsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SWOTanalysis
     */
   
  
    
    
    JPanel userProcessContainer;
   UserAccount account;
   //productManagerOrganization  organization;
    Enterprise enterprise;
   WorkRequest request ;
  //  productRiskAnalysis 
    DMEcosystem business;
   
    public EvaluateRiskFactorsJPanel(JPanel userProcessContainer,UserAccount account,WorkRequest request ,Enterprise enterprise, DMEcosystem business) {
        initComponents();
        
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.request=request;
        this.enterprise=enterprise;
        this.business=business;
        setactioncommand();
    
        
    }

    public void setactioncommand()
    {
    jrdProductDemand1.setActionCommand("1");
    jrdProductDemand2.setActionCommand("2");
    jrdProductDemand3.setActionCommand("3");
    jrdProductDemand4.setActionCommand("4");
    jrdProductDemand5.setActionCommand("5");
    
    jrdMarketDemand1.setActionCommand("1");
    jrdMarketDemand2.setActionCommand("2");
    jrdMarketDemand3.setActionCommand("3");
    jrdMarketDemand4.setActionCommand("4");
    jrdMarketDemand5.setActionCommand("5");
    
    jrdInnovativeAspects1.setActionCommand("1");
    jrdInnovativeAspects2.setActionCommand("2");
    jrdInnovativeAspects3.setActionCommand("3");
    jrdInnovativeAspects4.setActionCommand("4");
    jrdInnovativeAspects5.setActionCommand("5");
    
        
    jrdProductDurability1.setActionCommand("1");
    jrdProductDurability2.setActionCommand("2");
    jrdProductDurability3.setActionCommand("3");
    jrdProductDurability4.setActionCommand("4");
    jrdProductDurability5.setActionCommand("5");
    
    
    
    jrdCustomerAcceptance1.setActionCommand("1");
    jrdCustomerAcceptance2.setActionCommand("2");
    jrdCustomerAcceptance3.setActionCommand("3");
    jrdCustomerAcceptance4.setActionCommand("4");
    jrdCustomerAcceptance5.setActionCommand("5");
    
    
    
    jrdMarketReach1.setActionCommand("1");
    jrdMarketReach2.setActionCommand("2");
    jrdMarketReach3.setActionCommand("3");
    jrdMarketReach4.setActionCommand("4");
    jrdMarketReach5.setActionCommand("5");
    
    
    jrdTradeBarrier1.setActionCommand("1");
    jrdTradeBarrier2.setActionCommand("2");
    jrdTradeBarrier3.setActionCommand("3");
    jrdTradeBarrier4.setActionCommand("4");
    jrdTradeBarrier5.setActionCommand("5");
    
    
    jrdProductReach1.setActionCommand("1");
    jrdProductReach2.setActionCommand("2");
    jrdProductReach3.setActionCommand("3");
    jrdProductReach4.setActionCommand("4");
    jrdProductReach5.setActionCommand("5");
    
    
    jrdFirstMover1.setActionCommand("1");
    jrdFirstMover2.setActionCommand("2");
    jrdFirstMover3.setActionCommand("3");
    jrdFirstMover4.setActionCommand("4");
    jrdFirstMover5.setActionCommand("5");
    
    jrdUSPproposition1.setActionCommand("1");
    jrdUSPproposition2.setActionCommand("2");
    jrdUSPproposition3.setActionCommand("3");
    jrdUSPproposition4.setActionCommand("4");
    jrdUSPproposition5.setActionCommand("5");
    
    
    jrdFinanceCrunch1.setActionCommand("1");
    jrdFinanceCrunch2.setActionCommand("2");
    jrdFinanceCrunch3.setActionCommand("3");
    jrdFinanceCrunch4.setActionCommand("4");
    jrdFinanceCrunch5.setActionCommand("5");
    
    
    }
    
    
    public void SaveRiskAnalysis()
    {
        productRiskAnalysis productRiskAnalysis = new productRiskAnalysis();
        
        
        
     //   productDetailWorkRequest pw=new productDetailWorkRequest();
       productRiskAnalysis.setProductDemand(Integer.valueOf(prodctdemand.getSelection().getActionCommand()));
       productRiskAnalysis.setMarketreach(Integer.valueOf(prodctdemand.getSelection().getActionCommand()));
       productRiskAnalysis.setInnovativeAspect(Integer.valueOf(prodctdemand.getSelection().getActionCommand()));
       productRiskAnalysis.setProductdurability(Integer.valueOf(prodctdemand.getSelection().getActionCommand()));
       productRiskAnalysis.setCustomerAcceptance(Integer.valueOf(prodctdemand.getSelection().getActionCommand()));
       productRiskAnalysis.setMarketdemand(Integer.valueOf(prodctdemand.getSelection().getActionCommand()));
       productRiskAnalysis.setTradebarrier(Integer.valueOf(prodctdemand.getSelection().getActionCommand()));
       productRiskAnalysis.setProductreach(Integer.valueOf(prodctdemand.getSelection().getActionCommand()));
       productRiskAnalysis.setFirstmover(Integer.valueOf(prodctdemand.getSelection().getActionCommand()));
       productRiskAnalysis.setUsp(Integer.valueOf(prodctdemand.getSelection().getActionCommand()));
       productRiskAnalysis.setFinanacecrunch(Integer.valueOf(prodctdemand.getSelection().getActionCommand()));
       
       productRiskAnalysis.setProductDemandcomment(txtProductDemand.getText());
       productRiskAnalysis.setMarketreachcomment(txtMarketReach.getText());
       productRiskAnalysis.setInnovativeAspectcomment(txtInnovativeAspects.getText());
       productRiskAnalysis.setProductdurabilitycomment(txtProductDurability.getText());
       productRiskAnalysis.setCustomerAcceptancecomment(txtCustomerAcceptance.getText());
       productRiskAnalysis.setMarketdemandcomment(txtMarketReach.getText());
       productRiskAnalysis.setTradebarriercomment(txtTradeBarrier.getText());
       productRiskAnalysis.setFirstmovercomment(txtProductDemand.getText());
       productRiskAnalysis.setUspcomment(txtUSPproposition.getText());
       productRiskAnalysis.setFinanacecrunchcomment(txtFinanceCrunch.getText());
       productRiskAnalysis.GetRisk();
       request.getPdw().setPra(productRiskAnalysis);
       request.setStatus("Assign to Digital Marketing Team");
          for (Network N : business.getNetworkList()) {
            
            if (N.getName().equals(enterprise.getNetwork()))
            {
                for (Enterprise e   : N.getEpd().getEnterpriseList()) {
                    if (e.getEnterpriseType().getValue().equals("DigitalMarket"))
                    {
                            Organization org = null;
                            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
                                if (organization instanceof digitalMarketingManagerOrganization){
                                    org = organization;
                                 //   pa.setPdwr(request);
                                    break;
                                } 
                            }
                            if (org!=null){
                                org.getWorkQueue().getWorkRequestList().add(request);
                              //  org.getWorkQueue().getProductDetailWorkRequestList().add(request);
                                account.getWorkQueue().getWorkRequestList().add(request);
                               // account.getWorkQueue().getWorkRequestList().add(request);
                            }
                    }
                }
            
            }
            
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

        prodctdemand = new javax.swing.ButtonGroup();
        MarketReach = new javax.swing.ButtonGroup();
        InnovativeAspect = new javax.swing.ButtonGroup();
        productdurability = new javax.swing.ButtonGroup();
        CustomerAcceptance = new javax.swing.ButtonGroup();
        MarketDemand = new javax.swing.ButtonGroup();
        tradebarrier = new javax.swing.ButtonGroup();
        productreach = new javax.swing.ButtonGroup();
        firstMover = new javax.swing.ButtonGroup();
        uspproposition = new javax.swing.ButtonGroup();
        financecrunch = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jrdMarketReach1 = new javax.swing.JRadioButton();
        jrdMarketReach2 = new javax.swing.JRadioButton();
        jrdMarketReach3 = new javax.swing.JRadioButton();
        jrdMarketReach4 = new javax.swing.JRadioButton();
        jrdMarketReach5 = new javax.swing.JRadioButton();
        txtMarketReach = new javax.swing.JTextField();
        jrdInnovativeAspects1 = new javax.swing.JRadioButton();
        jrdInnovativeAspects2 = new javax.swing.JRadioButton();
        jrdInnovativeAspects3 = new javax.swing.JRadioButton();
        jrdInnovativeAspects4 = new javax.swing.JRadioButton();
        jrdInnovativeAspects5 = new javax.swing.JRadioButton();
        txtInnovativeAspects = new javax.swing.JTextField();
        jrdProductDurability1 = new javax.swing.JRadioButton();
        jrdProductDurability2 = new javax.swing.JRadioButton();
        jrdProductDurability3 = new javax.swing.JRadioButton();
        jrdProductDurability4 = new javax.swing.JRadioButton();
        jrdProductDurability5 = new javax.swing.JRadioButton();
        txtProductDurability = new javax.swing.JTextField();
        lblComments = new javax.swing.JLabel();
        jrdCustomerAcceptance1 = new javax.swing.JRadioButton();
        jrdCustomerAcceptance2 = new javax.swing.JRadioButton();
        jrdCustomerAcceptance3 = new javax.swing.JRadioButton();
        jrdCustomerAcceptance4 = new javax.swing.JRadioButton();
        jrdCustomerAcceptance5 = new javax.swing.JRadioButton();
        txtCustomerAcceptance = new javax.swing.JTextField();
        jrdMarketDemand1 = new javax.swing.JRadioButton();
        jrdMarketDemand2 = new javax.swing.JRadioButton();
        jrdMarketDemand3 = new javax.swing.JRadioButton();
        jrdMarketDemand4 = new javax.swing.JRadioButton();
        jrdMarketDemand5 = new javax.swing.JRadioButton();
        txtMarketDemand = new javax.swing.JTextField();
        jrdTradeBarrier1 = new javax.swing.JRadioButton();
        jrdTradeBarrier2 = new javax.swing.JRadioButton();
        jrdTradeBarrier3 = new javax.swing.JRadioButton();
        jrdTradeBarrier4 = new javax.swing.JRadioButton();
        jrdTradeBarrier5 = new javax.swing.JRadioButton();
        txtTradeBarrier = new javax.swing.JTextField();
        jrdProductReach1 = new javax.swing.JRadioButton();
        jrdProductReach2 = new javax.swing.JRadioButton();
        jrdProductReach3 = new javax.swing.JRadioButton();
        jrdProductReach4 = new javax.swing.JRadioButton();
        jrdProductReach5 = new javax.swing.JRadioButton();
        txtProductReach = new javax.swing.JTextField();
        jrdFirstMover1 = new javax.swing.JRadioButton();
        jrdFirstMover2 = new javax.swing.JRadioButton();
        jrdFirstMover3 = new javax.swing.JRadioButton();
        jrdFirstMover4 = new javax.swing.JRadioButton();
        jrdFirstMover5 = new javax.swing.JRadioButton();
        txtFirstMover = new javax.swing.JTextField();
        lblFinanceCrunch = new javax.swing.JLabel();
        jrdProductDemand1 = new javax.swing.JRadioButton();
        jrdProductDemand2 = new javax.swing.JRadioButton();
        jrdProductDemand3 = new javax.swing.JRadioButton();
        jrdProductDemand4 = new javax.swing.JRadioButton();
        jrdProductDemand5 = new javax.swing.JRadioButton();
        txtProductDemand = new javax.swing.JTextField();
        jrdUSPproposition1 = new javax.swing.JRadioButton();
        jrdUSPproposition2 = new javax.swing.JRadioButton();
        jrdUSPproposition3 = new javax.swing.JRadioButton();
        jrdUSPproposition4 = new javax.swing.JRadioButton();
        jrdUSPproposition5 = new javax.swing.JRadioButton();
        txtUSPproposition = new javax.swing.JTextField();
        jrdFinanceCrunch1 = new javax.swing.JRadioButton();
        jrdFinanceCrunch2 = new javax.swing.JRadioButton();
        jrdFinanceCrunch3 = new javax.swing.JRadioButton();
        jrdFinanceCrunch4 = new javax.swing.JRadioButton();
        jrdFinanceCrunch5 = new javax.swing.JRadioButton();
        txtFinanceCrunch = new javax.swing.JTextField();
        lblProductDemand = new javax.swing.JLabel();
        lblMarketReach = new javax.swing.JLabel();
        lblInnovativeAspects = new javax.swing.JLabel();
        lblProductDurability = new javax.swing.JLabel();
        lblCustomerAcceptance = new javax.swing.JLabel();
        lblProductDemand6 = new javax.swing.JLabel();
        lblTradeBarrier = new javax.swing.JLabel();
        lblProductReach = new javax.swing.JLabel();
        lblFirstMover = new javax.swing.JLabel();
        lblUSPproposition = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btngetproductdetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Risk Factors");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 268, 70));

        MarketReach.add(jrdMarketReach1);
        jrdMarketReach1.setText("1");
        jrdMarketReach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdMarketReach1ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdMarketReach1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 206, -1, -1));

        MarketReach.add(jrdMarketReach2);
        jrdMarketReach2.setText("2");
        jrdMarketReach2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdMarketReach2ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdMarketReach2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 206, -1, -1));

        MarketReach.add(jrdMarketReach3);
        jrdMarketReach3.setText("3");
        jrdMarketReach3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdMarketReach3ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdMarketReach3, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 206, -1, -1));

        MarketReach.add(jrdMarketReach4);
        jrdMarketReach4.setText("4");
        jrdMarketReach4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdMarketReach4ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdMarketReach4, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 206, -1, -1));

        MarketReach.add(jrdMarketReach5);
        jrdMarketReach5.setText("5");
        jrdMarketReach5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdMarketReach5ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdMarketReach5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 206, -1, -1));

        txtMarketReach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarketReachActionPerformed(evt);
            }
        });
        jPanel1.add(txtMarketReach, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 207, 350, -1));

        InnovativeAspect.add(jrdInnovativeAspects1);
        jrdInnovativeAspects1.setText("1");
        jrdInnovativeAspects1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdInnovativeAspects1ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdInnovativeAspects1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 245, -1, -1));

        InnovativeAspect.add(jrdInnovativeAspects2);
        jrdInnovativeAspects2.setText("2");
        jrdInnovativeAspects2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdInnovativeAspects2ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdInnovativeAspects2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 245, -1, -1));

        InnovativeAspect.add(jrdInnovativeAspects3);
        jrdInnovativeAspects3.setText("3");
        jrdInnovativeAspects3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdInnovativeAspects3ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdInnovativeAspects3, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 245, -1, -1));

        InnovativeAspect.add(jrdInnovativeAspects4);
        jrdInnovativeAspects4.setText("4");
        jrdInnovativeAspects4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdInnovativeAspects4ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdInnovativeAspects4, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 245, -1, -1));

        InnovativeAspect.add(jrdInnovativeAspects5);
        jrdInnovativeAspects5.setText("5");
        jrdInnovativeAspects5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdInnovativeAspects5ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdInnovativeAspects5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 245, -1, -1));

        txtInnovativeAspects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInnovativeAspectsActionPerformed(evt);
            }
        });
        jPanel1.add(txtInnovativeAspects, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 246, 350, -1));

        productdurability.add(jrdProductDurability1);
        jrdProductDurability1.setText("1");
        jrdProductDurability1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdProductDurability1ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdProductDurability1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 284, -1, -1));

        productdurability.add(jrdProductDurability2);
        jrdProductDurability2.setText("2");
        jrdProductDurability2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdProductDurability2ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdProductDurability2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 284, -1, -1));

        productdurability.add(jrdProductDurability3);
        jrdProductDurability3.setText("3");
        jrdProductDurability3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdProductDurability3ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdProductDurability3, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 284, -1, -1));

        productdurability.add(jrdProductDurability4);
        jrdProductDurability4.setText("4");
        jrdProductDurability4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdProductDurability4ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdProductDurability4, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 284, -1, -1));

        productdurability.add(jrdProductDurability5);
        jrdProductDurability5.setText("5");
        jrdProductDurability5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdProductDurability5ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdProductDurability5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 284, -1, -1));

        txtProductDurability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductDurabilityActionPerformed(evt);
            }
        });
        jPanel1.add(txtProductDurability, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 285, 350, -1));

        lblComments.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblComments.setText("Comments");
        jPanel1.add(lblComments, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 100, -1));

        CustomerAcceptance.add(jrdCustomerAcceptance1);
        jrdCustomerAcceptance1.setText("1");
        jrdCustomerAcceptance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdCustomerAcceptance1ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdCustomerAcceptance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 323, -1, -1));

        CustomerAcceptance.add(jrdCustomerAcceptance2);
        jrdCustomerAcceptance2.setText("2");
        jrdCustomerAcceptance2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdCustomerAcceptance2ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdCustomerAcceptance2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 323, -1, -1));

        CustomerAcceptance.add(jrdCustomerAcceptance3);
        jrdCustomerAcceptance3.setText("3");
        jrdCustomerAcceptance3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdCustomerAcceptance3ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdCustomerAcceptance3, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 323, -1, -1));

        CustomerAcceptance.add(jrdCustomerAcceptance4);
        jrdCustomerAcceptance4.setText("4");
        jrdCustomerAcceptance4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdCustomerAcceptance4ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdCustomerAcceptance4, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 323, -1, -1));

        CustomerAcceptance.add(jrdCustomerAcceptance5);
        jrdCustomerAcceptance5.setText("5");
        jrdCustomerAcceptance5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdCustomerAcceptance5ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdCustomerAcceptance5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 323, -1, -1));

        txtCustomerAcceptance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerAcceptanceActionPerformed(evt);
            }
        });
        jPanel1.add(txtCustomerAcceptance, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 324, 350, -1));

        MarketDemand.add(jrdMarketDemand1);
        jrdMarketDemand1.setText("1");
        jrdMarketDemand1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdMarketDemand1ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdMarketDemand1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 362, -1, -1));

        MarketDemand.add(jrdMarketDemand2);
        jrdMarketDemand2.setText("2");
        jrdMarketDemand2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdMarketDemand2ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdMarketDemand2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 362, -1, -1));

        MarketDemand.add(jrdMarketDemand3);
        jrdMarketDemand3.setText("3");
        jrdMarketDemand3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdMarketDemand3ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdMarketDemand3, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 362, -1, -1));

        MarketDemand.add(jrdMarketDemand4);
        jrdMarketDemand4.setText("4");
        jrdMarketDemand4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdMarketDemand4ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdMarketDemand4, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 362, -1, -1));

        MarketDemand.add(jrdMarketDemand5);
        jrdMarketDemand5.setText("5");
        jrdMarketDemand5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdMarketDemand5ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdMarketDemand5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 362, -1, -1));

        txtMarketDemand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarketDemandActionPerformed(evt);
            }
        });
        jPanel1.add(txtMarketDemand, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 363, 350, -1));

        tradebarrier.add(jrdTradeBarrier1);
        jrdTradeBarrier1.setText("1");
        jrdTradeBarrier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdTradeBarrier1ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdTradeBarrier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 401, -1, -1));

        tradebarrier.add(jrdTradeBarrier2);
        jrdTradeBarrier2.setText("2");
        jrdTradeBarrier2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdTradeBarrier2ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdTradeBarrier2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 401, -1, -1));

        tradebarrier.add(jrdTradeBarrier3);
        jrdTradeBarrier3.setText("3");
        jrdTradeBarrier3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdTradeBarrier3ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdTradeBarrier3, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 401, -1, -1));

        tradebarrier.add(jrdTradeBarrier4);
        jrdTradeBarrier4.setText("4");
        jrdTradeBarrier4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdTradeBarrier4ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdTradeBarrier4, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 401, -1, -1));

        tradebarrier.add(jrdTradeBarrier5);
        jrdTradeBarrier5.setText("5");
        jrdTradeBarrier5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdTradeBarrier5ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdTradeBarrier5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 401, -1, -1));

        txtTradeBarrier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTradeBarrierActionPerformed(evt);
            }
        });
        jPanel1.add(txtTradeBarrier, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 402, 350, -1));

        productreach.add(jrdProductReach1);
        jrdProductReach1.setText("1");
        jrdProductReach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdProductReach1ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdProductReach1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 440, -1, -1));

        productreach.add(jrdProductReach2);
        jrdProductReach2.setText("2");
        jrdProductReach2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdProductReach2ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdProductReach2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 440, -1, -1));

        productreach.add(jrdProductReach3);
        jrdProductReach3.setText("3");
        jrdProductReach3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdProductReach3ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdProductReach3, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 440, -1, -1));

        productreach.add(jrdProductReach4);
        jrdProductReach4.setText("4");
        jrdProductReach4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdProductReach4ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdProductReach4, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 440, -1, -1));

        productreach.add(jrdProductReach5);
        jrdProductReach5.setText("5");
        jrdProductReach5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdProductReach5ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdProductReach5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 440, -1, -1));

        txtProductReach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductReachActionPerformed(evt);
            }
        });
        jPanel1.add(txtProductReach, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 441, 350, -1));

        firstMover.add(jrdFirstMover1);
        jrdFirstMover1.setText("1");
        jrdFirstMover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdFirstMover1ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdFirstMover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 479, -1, -1));

        firstMover.add(jrdFirstMover2);
        jrdFirstMover2.setText("2");
        jrdFirstMover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdFirstMover2ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdFirstMover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 479, -1, -1));

        firstMover.add(jrdFirstMover3);
        jrdFirstMover3.setText("3");
        jrdFirstMover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdFirstMover3ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdFirstMover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 479, -1, -1));

        firstMover.add(jrdFirstMover4);
        jrdFirstMover4.setText("4");
        jrdFirstMover4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdFirstMover4ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdFirstMover4, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 479, -1, -1));

        firstMover.add(jrdFirstMover5);
        jrdFirstMover5.setText("5");
        jrdFirstMover5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdFirstMover5ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdFirstMover5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 479, -1, -1));

        txtFirstMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstMoverActionPerformed(evt);
            }
        });
        jPanel1.add(txtFirstMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 350, -1));

        lblFinanceCrunch.setText("Finance Crunch:");
        jPanel1.add(lblFinanceCrunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 120, 20));

        prodctdemand.add(jrdProductDemand1);
        jrdProductDemand1.setText("1");
        jrdProductDemand1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdProductDemand1ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdProductDemand1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 170, -1, -1));

        prodctdemand.add(jrdProductDemand2);
        jrdProductDemand2.setText("2");
        jrdProductDemand2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdProductDemand2ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdProductDemand2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 170, -1, -1));

        prodctdemand.add(jrdProductDemand3);
        jrdProductDemand3.setText("3");
        jrdProductDemand3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdProductDemand3ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdProductDemand3, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 170, -1, -1));

        prodctdemand.add(jrdProductDemand4);
        jrdProductDemand4.setText("4");
        jrdProductDemand4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdProductDemand4ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdProductDemand4, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 170, -1, -1));

        prodctdemand.add(jrdProductDemand5);
        jrdProductDemand5.setText("5");
        jrdProductDemand5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdProductDemand5ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdProductDemand5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 170, -1, -1));

        txtProductDemand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductDemandActionPerformed(evt);
            }
        });
        jPanel1.add(txtProductDemand, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 171, 350, -1));

        uspproposition.add(jrdUSPproposition1);
        jrdUSPproposition1.setText("1");
        jrdUSPproposition1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdUSPproposition1ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdUSPproposition1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 518, -1, -1));

        uspproposition.add(jrdUSPproposition2);
        jrdUSPproposition2.setText("2");
        jrdUSPproposition2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdUSPproposition2ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdUSPproposition2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 518, -1, -1));

        uspproposition.add(jrdUSPproposition3);
        jrdUSPproposition3.setText("3");
        jrdUSPproposition3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdUSPproposition3ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdUSPproposition3, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 518, -1, -1));

        uspproposition.add(jrdUSPproposition4);
        jrdUSPproposition4.setText("4");
        jrdUSPproposition4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdUSPproposition4ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdUSPproposition4, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 518, -1, -1));

        uspproposition.add(jrdUSPproposition5);
        jrdUSPproposition5.setText("5");
        jrdUSPproposition5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdUSPproposition5ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdUSPproposition5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 518, -1, -1));

        txtUSPproposition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUSPpropositionActionPerformed(evt);
            }
        });
        jPanel1.add(txtUSPproposition, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 519, 350, -1));

        financecrunch.add(jrdFinanceCrunch1);
        jrdFinanceCrunch1.setText("1");
        jrdFinanceCrunch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdFinanceCrunch1ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdFinanceCrunch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 557, -1, -1));

        financecrunch.add(jrdFinanceCrunch2);
        jrdFinanceCrunch2.setText("2");
        jrdFinanceCrunch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdFinanceCrunch2ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdFinanceCrunch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 557, -1, -1));

        financecrunch.add(jrdFinanceCrunch3);
        jrdFinanceCrunch3.setText("3");
        jrdFinanceCrunch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdFinanceCrunch3ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdFinanceCrunch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 557, -1, -1));

        financecrunch.add(jrdFinanceCrunch4);
        jrdFinanceCrunch4.setText("4");
        jrdFinanceCrunch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdFinanceCrunch4ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdFinanceCrunch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 557, -1, -1));

        financecrunch.add(jrdFinanceCrunch5);
        jrdFinanceCrunch5.setText("5");
        jrdFinanceCrunch5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdFinanceCrunch5ActionPerformed(evt);
            }
        });
        jPanel1.add(jrdFinanceCrunch5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 557, -1, -1));

        txtFinanceCrunch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinanceCrunchActionPerformed(evt);
            }
        });
        jPanel1.add(txtFinanceCrunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 558, 350, -1));

        lblProductDemand.setText("Product Demand:");
        jPanel1.add(lblProductDemand, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, 20));

        lblMarketReach.setText("Market Reach:");
        jPanel1.add(lblMarketReach, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 120, 20));

        lblInnovativeAspects.setText("Innovative Aspects:");
        jPanel1.add(lblInnovativeAspects, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 140, 20));

        lblProductDurability.setText("Product Durability:");
        jPanel1.add(lblProductDurability, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 160, 20));

        lblCustomerAcceptance.setText("Customer Acceptance:");
        jPanel1.add(lblCustomerAcceptance, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 160, 20));

        lblProductDemand6.setText("Market Demand:");
        jPanel1.add(lblProductDemand6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 120, 20));

        lblTradeBarrier.setText("Trade Barrier:");
        jPanel1.add(lblTradeBarrier, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 120, 20));

        lblProductReach.setText("Product Reach:");
        jPanel1.add(lblProductReach, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 120, 20));

        lblFirstMover.setText("First Mover:");
        jPanel1.add(lblFirstMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 120, 20));

        lblUSPproposition.setText("USP Proposition:");
        jPanel1.add(lblUSPproposition, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 120, 20));

        btnSend.setBackground(new java.awt.Color(0, 153, 255));
        btnSend.setText("Save");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        jPanel1.add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, 150, -1));

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
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 105, 76));

        btngetproductdetails.setBackground(new java.awt.Color(0, 153, 255));
        btngetproductdetails.setText("Show Product Detail");
        btngetproductdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngetproductdetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btngetproductdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 220, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jrdMarketReach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdMarketReach1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdMarketReach1ActionPerformed

    private void jrdMarketReach2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdMarketReach2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdMarketReach2ActionPerformed

    private void jrdMarketReach3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdMarketReach3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdMarketReach3ActionPerformed

    private void jrdMarketReach4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdMarketReach4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdMarketReach4ActionPerformed

    private void jrdMarketReach5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdMarketReach5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdMarketReach5ActionPerformed

    private void txtMarketReachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarketReachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarketReachActionPerformed

    private void jrdInnovativeAspects1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdInnovativeAspects1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdInnovativeAspects1ActionPerformed

    private void jrdInnovativeAspects2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdInnovativeAspects2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdInnovativeAspects2ActionPerformed

    private void jrdInnovativeAspects3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdInnovativeAspects3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdInnovativeAspects3ActionPerformed

    private void jrdInnovativeAspects4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdInnovativeAspects4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdInnovativeAspects4ActionPerformed

    private void jrdInnovativeAspects5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdInnovativeAspects5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdInnovativeAspects5ActionPerformed

    private void txtInnovativeAspectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInnovativeAspectsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInnovativeAspectsActionPerformed

    private void jrdProductDurability1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdProductDurability1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdProductDurability1ActionPerformed

    private void jrdProductDurability2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdProductDurability2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdProductDurability2ActionPerformed

    private void jrdProductDurability3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdProductDurability3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdProductDurability3ActionPerformed

    private void jrdProductDurability4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdProductDurability4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdProductDurability4ActionPerformed

    private void jrdProductDurability5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdProductDurability5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdProductDurability5ActionPerformed

    private void txtProductDurabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductDurabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductDurabilityActionPerformed

    private void jrdCustomerAcceptance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdCustomerAcceptance1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdCustomerAcceptance1ActionPerformed

    private void jrdCustomerAcceptance2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdCustomerAcceptance2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdCustomerAcceptance2ActionPerformed

    private void jrdCustomerAcceptance3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdCustomerAcceptance3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdCustomerAcceptance3ActionPerformed

    private void jrdCustomerAcceptance4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdCustomerAcceptance4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdCustomerAcceptance4ActionPerformed

    private void jrdCustomerAcceptance5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdCustomerAcceptance5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdCustomerAcceptance5ActionPerformed

    private void txtCustomerAcceptanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerAcceptanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerAcceptanceActionPerformed

    private void jrdMarketDemand1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdMarketDemand1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdMarketDemand1ActionPerformed

    private void jrdMarketDemand2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdMarketDemand2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdMarketDemand2ActionPerformed

    private void jrdMarketDemand3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdMarketDemand3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdMarketDemand3ActionPerformed

    private void jrdMarketDemand4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdMarketDemand4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdMarketDemand4ActionPerformed

    private void jrdMarketDemand5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdMarketDemand5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdMarketDemand5ActionPerformed

    private void txtMarketDemandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarketDemandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarketDemandActionPerformed

    private void jrdTradeBarrier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdTradeBarrier1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdTradeBarrier1ActionPerformed

    private void jrdTradeBarrier2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdTradeBarrier2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdTradeBarrier2ActionPerformed

    private void jrdTradeBarrier3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdTradeBarrier3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdTradeBarrier3ActionPerformed

    private void jrdTradeBarrier4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdTradeBarrier4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdTradeBarrier4ActionPerformed

    private void jrdTradeBarrier5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdTradeBarrier5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdTradeBarrier5ActionPerformed

    private void txtTradeBarrierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTradeBarrierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTradeBarrierActionPerformed

    private void jrdProductReach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdProductReach1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdProductReach1ActionPerformed

    private void jrdProductReach2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdProductReach2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdProductReach2ActionPerformed

    private void jrdProductReach3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdProductReach3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdProductReach3ActionPerformed

    private void jrdProductReach4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdProductReach4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdProductReach4ActionPerformed

    private void jrdProductReach5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdProductReach5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdProductReach5ActionPerformed

    private void txtProductReachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductReachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductReachActionPerformed

    private void jrdFirstMover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdFirstMover1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdFirstMover1ActionPerformed

    private void jrdFirstMover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdFirstMover2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdFirstMover2ActionPerformed

    private void jrdFirstMover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdFirstMover3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdFirstMover3ActionPerformed

    private void jrdFirstMover4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdFirstMover4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdFirstMover4ActionPerformed

    private void jrdFirstMover5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdFirstMover5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdFirstMover5ActionPerformed

    private void txtFirstMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstMoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstMoverActionPerformed

    private void jrdProductDemand1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdProductDemand1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdProductDemand1ActionPerformed

    private void jrdProductDemand2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdProductDemand2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdProductDemand2ActionPerformed

    private void jrdProductDemand3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdProductDemand3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdProductDemand3ActionPerformed

    private void jrdProductDemand4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdProductDemand4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdProductDemand4ActionPerformed

    private void jrdProductDemand5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdProductDemand5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdProductDemand5ActionPerformed

    private void txtProductDemandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductDemandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductDemandActionPerformed

    private void jrdUSPproposition1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdUSPproposition1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdUSPproposition1ActionPerformed

    private void jrdUSPproposition2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdUSPproposition2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdUSPproposition2ActionPerformed

    private void jrdUSPproposition3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdUSPproposition3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdUSPproposition3ActionPerformed

    private void jrdUSPproposition4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdUSPproposition4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdUSPproposition4ActionPerformed

    private void jrdUSPproposition5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdUSPproposition5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdUSPproposition5ActionPerformed

    private void txtUSPpropositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUSPpropositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUSPpropositionActionPerformed

    private void jrdFinanceCrunch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdFinanceCrunch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdFinanceCrunch1ActionPerformed

    private void jrdFinanceCrunch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdFinanceCrunch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdFinanceCrunch2ActionPerformed

    private void jrdFinanceCrunch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdFinanceCrunch3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdFinanceCrunch3ActionPerformed

    private void jrdFinanceCrunch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdFinanceCrunch4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdFinanceCrunch4ActionPerformed

    private void jrdFinanceCrunch5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdFinanceCrunch5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdFinanceCrunch5ActionPerformed

    private void txtFinanceCrunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinanceCrunchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinanceCrunchActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        //Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        try {SaveRiskAnalysis();
        JOptionPane.showMessageDialog(null, "Risk Analysis Saved successfully and Assign to Digital Marketing Enterprise");
        }catch(Exception E){
        
        JOptionPane.showMessageDialog(null, "Please Insert all required Input");
        }
        
        
    }//GEN-LAST:event_btnSendActionPerformed

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

        //        CardLayout layout=(CardLayout) mainJpanel.getLayout();
        //        layout.previous(mainJpanel);
        //        Component[] comps = mainJpanel.getComponents();
        //        for(Component c: comps){
            //            if(c instanceof EnterpriseDetailsTableJPanel){
                //                EnterpriseDetailsTableJPanel panel = (EnterpriseDetailsTableJPanel) c;
                //                panel.PopulateTable();
                //            }
            //        }
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btngetproductdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngetproductdetailsActionPerformed
        // TODO add your handling code here:
          ViewProductDetailsJpanel pi=new ViewProductDetailsJpanel(request);
                            JFrame jf=new JFrame();
                            jf.setSize(new Dimension(1200, 800));
                           // jf.setLayout( new AbsoluteLayout());
                            jf.setTitle("View Product Detail");
                            jf.add(pi);
                            jf.setVisible(true);
    }//GEN-LAST:event_btngetproductdetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup CustomerAcceptance;
    private javax.swing.ButtonGroup InnovativeAspect;
    private javax.swing.ButtonGroup MarketDemand;
    private javax.swing.ButtonGroup MarketReach;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btngetproductdetails;
    private javax.swing.ButtonGroup financecrunch;
    private javax.swing.ButtonGroup firstMover;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrdCustomerAcceptance1;
    private javax.swing.JRadioButton jrdCustomerAcceptance2;
    private javax.swing.JRadioButton jrdCustomerAcceptance3;
    private javax.swing.JRadioButton jrdCustomerAcceptance4;
    private javax.swing.JRadioButton jrdCustomerAcceptance5;
    private javax.swing.JRadioButton jrdFinanceCrunch1;
    private javax.swing.JRadioButton jrdFinanceCrunch2;
    private javax.swing.JRadioButton jrdFinanceCrunch3;
    private javax.swing.JRadioButton jrdFinanceCrunch4;
    private javax.swing.JRadioButton jrdFinanceCrunch5;
    private javax.swing.JRadioButton jrdFirstMover1;
    private javax.swing.JRadioButton jrdFirstMover2;
    private javax.swing.JRadioButton jrdFirstMover3;
    private javax.swing.JRadioButton jrdFirstMover4;
    private javax.swing.JRadioButton jrdFirstMover5;
    private javax.swing.JRadioButton jrdInnovativeAspects1;
    private javax.swing.JRadioButton jrdInnovativeAspects2;
    private javax.swing.JRadioButton jrdInnovativeAspects3;
    private javax.swing.JRadioButton jrdInnovativeAspects4;
    private javax.swing.JRadioButton jrdInnovativeAspects5;
    private javax.swing.JRadioButton jrdMarketDemand1;
    private javax.swing.JRadioButton jrdMarketDemand2;
    private javax.swing.JRadioButton jrdMarketDemand3;
    private javax.swing.JRadioButton jrdMarketDemand4;
    private javax.swing.JRadioButton jrdMarketDemand5;
    private javax.swing.JRadioButton jrdMarketReach1;
    private javax.swing.JRadioButton jrdMarketReach2;
    private javax.swing.JRadioButton jrdMarketReach3;
    private javax.swing.JRadioButton jrdMarketReach4;
    private javax.swing.JRadioButton jrdMarketReach5;
    private javax.swing.JRadioButton jrdProductDemand1;
    private javax.swing.JRadioButton jrdProductDemand2;
    private javax.swing.JRadioButton jrdProductDemand3;
    private javax.swing.JRadioButton jrdProductDemand4;
    private javax.swing.JRadioButton jrdProductDemand5;
    private javax.swing.JRadioButton jrdProductDurability1;
    private javax.swing.JRadioButton jrdProductDurability2;
    private javax.swing.JRadioButton jrdProductDurability3;
    private javax.swing.JRadioButton jrdProductDurability4;
    private javax.swing.JRadioButton jrdProductDurability5;
    private javax.swing.JRadioButton jrdProductReach1;
    private javax.swing.JRadioButton jrdProductReach2;
    private javax.swing.JRadioButton jrdProductReach3;
    private javax.swing.JRadioButton jrdProductReach4;
    private javax.swing.JRadioButton jrdProductReach5;
    private javax.swing.JRadioButton jrdTradeBarrier1;
    private javax.swing.JRadioButton jrdTradeBarrier2;
    private javax.swing.JRadioButton jrdTradeBarrier3;
    private javax.swing.JRadioButton jrdTradeBarrier4;
    private javax.swing.JRadioButton jrdTradeBarrier5;
    private javax.swing.JRadioButton jrdUSPproposition1;
    private javax.swing.JRadioButton jrdUSPproposition2;
    private javax.swing.JRadioButton jrdUSPproposition3;
    private javax.swing.JRadioButton jrdUSPproposition4;
    private javax.swing.JRadioButton jrdUSPproposition5;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblCustomerAcceptance;
    private javax.swing.JLabel lblFinanceCrunch;
    private javax.swing.JLabel lblFirstMover;
    private javax.swing.JLabel lblInnovativeAspects;
    private javax.swing.JLabel lblMarketReach;
    private javax.swing.JLabel lblProductDemand;
    private javax.swing.JLabel lblProductDemand6;
    private javax.swing.JLabel lblProductDurability;
    private javax.swing.JLabel lblProductReach;
    private javax.swing.JLabel lblTradeBarrier;
    private javax.swing.JLabel lblUSPproposition;
    private javax.swing.ButtonGroup prodctdemand;
    private javax.swing.ButtonGroup productdurability;
    private javax.swing.ButtonGroup productreach;
    private javax.swing.ButtonGroup tradebarrier;
    private javax.swing.JTextField txtCustomerAcceptance;
    private javax.swing.JTextField txtFinanceCrunch;
    private javax.swing.JTextField txtFirstMover;
    private javax.swing.JTextField txtInnovativeAspects;
    private javax.swing.JTextField txtMarketDemand;
    private javax.swing.JTextField txtMarketReach;
    private javax.swing.JTextField txtProductDemand;
    private javax.swing.JTextField txtProductDurability;
    private javax.swing.JTextField txtProductReach;
    private javax.swing.JTextField txtTradeBarrier;
    private javax.swing.JTextField txtUSPproposition;
    private javax.swing.ButtonGroup uspproposition;
    // End of variables declaration//GEN-END:variables
}
