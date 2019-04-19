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
public class Network  {
    private String name;
     private EnterpriseDirectory  epd;

    public Network() {
        epd=new EnterpriseDirectory();
    }
    
         
    @Override
    public String toString(){
          return name;
    }
    
    public EnterpriseDirectory getEpd() {
        return epd;
    }

    public void setEpd(EnterpriseDirectory epd) {
        this.epd = epd;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
       
    
    
}
