/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.RegionNetwork.Network;
import java.util.ArrayList;

/**
 *
 * @author dhava
 */
public class DMEcosystem {
   
     private static DMEcosystem business;
       private ArrayList<Network> networkList;
    public static DMEcosystem getBusiness() {
        return business;
    }

    public DMEcosystem() {
        networkList =new ArrayList<Network> ();
    }

    public static void setBusiness(DMEcosystem business) {
        DMEcosystem.business = business;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
   
     public static DMEcosystem getInstance(){
        if(business==null){
            business=new DMEcosystem();
        }
        return business;
    }
   
     public void addNetwork(Network N)
     {
         networkList.add(N);
     }
     
     
}
