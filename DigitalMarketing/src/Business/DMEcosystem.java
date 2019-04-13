/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author dhava
 */
public class DMEcosystem {
   
     private static DMEcosystem business;
     public static DMEcosystem getInstance(){
        if(business==null){
            business=new DMEcosystem();
        }
        return business;
    }
    
}
