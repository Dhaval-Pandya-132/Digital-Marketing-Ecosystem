/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.marketAnalystRole;
import Business.Role.productManagerRole;
import java.util.ArrayList;

/**
 *
 * @author dhava
 */
public class marketAnalystOrganization extends Organization {

    public marketAnalystOrganization() {
        super(Organization.Type.MarketAnalyst.getValue());
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new marketAnalystRole());
        return roles;
    }
}
