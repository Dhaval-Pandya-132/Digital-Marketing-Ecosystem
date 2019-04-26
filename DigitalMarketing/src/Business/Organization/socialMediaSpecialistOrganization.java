/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.productManagerRole;
import Business.Role.socialMediaSpecialistRole;
import java.util.ArrayList;

/**
 *
 * @author dhava
 */
public class socialMediaSpecialistOrganization extends Organization {

    public socialMediaSpecialistOrganization() {
        super(Organization.Type.SocialMediaSpecialist.getValue());
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new socialMediaSpecialistRole());
        return roles;
    }
}
