/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author dhava
 */
public class ClientEnterprise extends Enterprise {
    
    public ClientEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Client);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
