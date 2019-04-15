/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.Date;

/**
 *
 * @author dhava
 */
public class Enterprise {
    private String EnterpriseName ;
 //   private String EnterpriseType ;
    private int NoofEmployee;
    private Date CreatedDate;
    private String Address;  
    private String profilePhoto;
    
    public enum EnterpriseType{
        Client("Client"),Marketanalysis("Marketanlysis"),DigitalMarket("DigitalMarket");
       
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
        }
    }
    
    public String getEnterpriseName() {
        return EnterpriseName;
    }

    public void setEnterpriseName(String EnterpriseName) {
        this.EnterpriseName = EnterpriseName;
    }
//
//    public String getEnterpriseType() {
//        return EnterpriseType;
//    }
//
//    public void setEnterpriseType(String EnterpriseType) {
//        this.EnterpriseType = EnterpriseType;
//    }

    public int getNoofEmployee() {
        return NoofEmployee;
    }

    public void setNoofEmployee(int NoofEmployee) {
        this.NoofEmployee = NoofEmployee;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
}
