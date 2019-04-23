/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dhava
 */
public class productDetailWorkRequest extends WorkRequest {
    
   private String  productName; 
   private String  Market; 
   private String  Feature; 
   private String  LastRevenue; 
   private ArrayList<String>  ProductImages ; 
   private String  Durability; 
   private int  reatilPrice; 
   private Date  ManufectureDate; 
   private Date  Expiredate; 
   private String  FinalRemark; 
 
   //private String  ManufectureDate; 

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMarket() {
        return Market;
    }

    public void setMarket(String Market) {
        this.Market = Market;
    }

    public String getFeature() {
        return Feature;
    }

    public void setFeature(String Feature) {
        this.Feature = Feature;
    }

    public String getLastRevenue() {
        return LastRevenue;
    }

    public void setLastRevenue(String LastRevenue) {
        this.LastRevenue = LastRevenue;
    }

    public ArrayList<String> getProductImages() {
        return ProductImages;
    }

    public void setProductImages(ArrayList<String> ProductImages) {
        this.ProductImages = ProductImages;
    }

    public String getDurability() {
        return Durability;
    }

    public void setDurability(String Durability) {
        this.Durability = Durability;
    }

    public int getReatilPrice() {
        return reatilPrice;
    }

    public void setReatilPrice(int reatilPrice) {
        this.reatilPrice = reatilPrice;
    }

    public Date getManufectureDate() {
        return ManufectureDate;
    }

    public void setManufectureDate(Date ManufectureDate) {
        this.ManufectureDate = ManufectureDate;
    }

    public Date getExpiredate() {
        return Expiredate;
    }

    public void setExpiredate(Date Expiredate) {
        this.Expiredate = Expiredate;
    }

    public String getFinalRemark() {
        return FinalRemark;
    }

    public void setFinalRemark(String FinalRemark) {
        this.FinalRemark = FinalRemark;
    }
   
   
    
}
