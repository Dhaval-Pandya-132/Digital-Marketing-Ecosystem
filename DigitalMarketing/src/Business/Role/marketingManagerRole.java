/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DMEcosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.marketingManagerOrganization;
import Business.Organization.productAnalystOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.MarketingManagerRole.MarketingManagerWorkAreaJPanel;
import UserInterface.ProductAnalystRole.productAnalystworkareaJPanel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author dhava
 */
public class marketingManagerRole  extends Role{
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, DMEcosystem business) {
          try {
              return new MarketingManagerWorkAreaJPanel(userProcessContainer, account, (marketingManagerOrganization)organization, enterprise);
          } catch (IOException ex) {
              Logger.getLogger(productAnalystRole.class.getName()).log(Level.SEVERE, null, ex);
          }
          return null;
    }
}