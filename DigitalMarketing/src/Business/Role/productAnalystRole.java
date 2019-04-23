/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DMEcosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.productAnalystOrganization;
import Business.Organization.productManagerOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.ProductAnalystRole.productAnalystworkareaJPanel;
import UserInterface.ProductManagerRole.ProductmanagerworkareaJPanel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author dhava
 */
public class productAnalystRole extends Role{
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, DMEcosystem business) {
          try {
              return new productAnalystworkareaJPanel(userProcessContainer, account, (productAnalystOrganization)organization, enterprise);
          } catch (IOException ex) {
              Logger.getLogger(productAnalystRole.class.getName()).log(Level.SEVERE, null, ex);
          }
          return null;
    }
}
