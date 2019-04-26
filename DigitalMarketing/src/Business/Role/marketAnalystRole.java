/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DMEcosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.marketAnalystOrganization;
import Business.Organization.productManagerOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.MarketingAnalystRole.MarketingAnalysWorkAreaJPanel;
import UserInterface.ProductManagerRole.ProductmanagerworkareaJPanel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author dhava
 */
public class marketAnalystRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, DMEcosystem business) {
         try {
             return new MarketingAnalysWorkAreaJPanel(userProcessContainer, account, (marketAnalystOrganization)organization, enterprise,business);
         } catch (IOException ex) {
             Logger.getLogger(productManagerRole.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }
    
}