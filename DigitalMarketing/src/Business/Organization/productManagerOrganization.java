/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.productManagerRole;
import java.util.ArrayList;

/**
 *
 * @author dhava
 */
public class productManagerOrganization  extends Organization {

    public productManagerOrganization() {
        super(Organization.Type.ProductManager.getValue());
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new productManagerRole());
        return roles;
    }
    
    
}
