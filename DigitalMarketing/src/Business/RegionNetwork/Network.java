/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RegionNetwork;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author dhava
 */
public class Network {
    private String Name;
     private EnterpriseDirectory  epd;
    public EnterpriseDirectory getEpd() {
        return epd;
    }

    public void setEpd(EnterpriseDirectory epd) {
        this.epd = epd;
    }
  
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
       
    @Override
    public String toString()
    {
        return this.Name;
    }
    
}
