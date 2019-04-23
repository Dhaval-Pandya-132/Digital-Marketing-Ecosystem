/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author dhava
 */
public class EnterpriseDirectory {
        private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,String type){
        Enterprise enterprise=null;
        if(type.equals("Client")){
            enterprise=new ClientEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type.equals("MarketAnlysis")){
            enterprise=new DigitalMarketingEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type.equals("DigitalMarket")){
            enterprise=new MarketingAnalysisEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        
        return enterprise;
    }

}
