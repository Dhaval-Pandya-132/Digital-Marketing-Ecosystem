/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author dhava
 */
public class OrganizationDirectory {
    
      private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.ProductManager.getValue())){
            organization = new productManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.ProductAnalyst.getValue())){
            organization = new productAnalystOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.MarketingManager.getValue())){
            organization = new marketingManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.MarketAnalyst.getValue())){
            organization = new marketAnalystOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.DigitalMarketingManager.getValue())){
            organization = new digitalMarketingManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SocialMediaSpecialist.getValue())){
            organization = new socialMediaSpecialistOrganization();
            organizationList.add(organization);
        }
        
        
        
        return organization;
    }
    
}
