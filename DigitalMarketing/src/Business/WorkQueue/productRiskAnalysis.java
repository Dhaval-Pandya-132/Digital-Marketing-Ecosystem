/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.DMEcosystem;

/**
 *
 * @author dhava
 */
public class productRiskAnalysis {
    static productRiskAnalysis pdwr;
    int productDemand ;
    int Marketreach ;
    int InnovativeAspect ;
    int productdurability ;
    int customerAcceptance ;
    int marketdemand ;
    int tradebarrier ;
    int productreach ;
    int firstmover ;
    int usp ;
    int Finanacecrunch ;
    int Risk=0;
    String productDemandcomment ;
    String Marketreachcomment ;
    String InnovativeAspectcomment ;
    String productdurabilitycomment ;
    String customerAcceptancecomment ;
    String marketdemandcomment ;
    String tradebarriercomment ;
    String productreachcomment ;
    String firstmovercomment ;
    String uspcomment ;
    String Finanacecrunchcomment ;

   public static productRiskAnalysis getInstance(){
        if(pdwr==null){
            pdwr=new productRiskAnalysis();
        }
        return pdwr;
    }

    public void setPdwr(productRiskAnalysis pdwr) {
        this.pdwr = pdwr;
    }

    public int getRisk() {
        return Risk;
    }

    public void setRisk(int Risk) {
        this.Risk = Risk;
    }
    
    
    
    public int getMarketreach() {
        return Marketreach;
    }

    public void setMarketreach(int Marketreach) {
        this.Marketreach = Marketreach;
    }

    public int getInnovativeAspect() {
        return InnovativeAspect;
    }

    public void setInnovativeAspect(int InnovativeAspect) {
        this.InnovativeAspect = InnovativeAspect;
    }

    public int getProductdurability() {
        return productdurability;
    }

    public void setProductdurability(int productdurability) {
        this.productdurability = productdurability;
    }

    public int getCustomerAcceptance() {
        return customerAcceptance;
    }

    public void setCustomerAcceptance(int customerAcceptance) {
        this.customerAcceptance = customerAcceptance;
    }

    public int getMarketdemand() {
        return marketdemand;
    }

    public void setMarketdemand(int marketdemand) {
        this.marketdemand = marketdemand;
    }

    public int getTradebarrier() {
        return tradebarrier;
    }

    public void setTradebarrier(int tradebarrier) {
        this.tradebarrier = tradebarrier;
    }

    public int getProductreach() {
        return productreach;
    }

    public void setProductreach(int productreach) {
        this.productreach = productreach;
    }

    public int getFirstmover() {
        return firstmover;
    }

    public void setFirstmover(int firstmover) {
        this.firstmover = firstmover;
    }

    public int getUsp() {
        return usp;
    }

    public void setUsp(int usp) {
        this.usp = usp;
    }

    public int getFinanacecrunch() {
        return Finanacecrunch;
    }

    public void setFinanacecrunch(int Finanacecrunch) {
        this.Finanacecrunch = Finanacecrunch;
    }

    public String getProductDemandcomment() {
        return productDemandcomment;
    }

    public void setProductDemandcomment(String productDemandcomment) {
        this.productDemandcomment = productDemandcomment;
    }

    public String getMarketreachcomment() {
        return Marketreachcomment;
    }

    public void setMarketreachcomment(String Marketreachcomment) {
        this.Marketreachcomment = Marketreachcomment;
    }

    public String getInnovativeAspectcomment() {
        return InnovativeAspectcomment;
    }

    public void setInnovativeAspectcomment(String InnovativeAspectcomment) {
        this.InnovativeAspectcomment = InnovativeAspectcomment;
    }

    public String getProductdurabilitycomment() {
        return productdurabilitycomment;
    }

    public void setProductdurabilitycomment(String productdurabilitycomment) {
        this.productdurabilitycomment = productdurabilitycomment;
    }

    public String getCustomerAcceptancecomment() {
        return customerAcceptancecomment;
    }

    public void setCustomerAcceptancecomment(String customerAcceptancecomment) {
        this.customerAcceptancecomment = customerAcceptancecomment;
    }

    public String getMarketdemandcomment() {
        return marketdemandcomment;
    }

    public void setMarketdemandcomment(String marketdemandcomment) {
        this.marketdemandcomment = marketdemandcomment;
    }

    public String getTradebarriercomment() {
        return tradebarriercomment;
    }

    public void setTradebarriercomment(String tradebarriercomment) {
        this.tradebarriercomment = tradebarriercomment;
    }

    public String getProductreachcomment() {
        return productreachcomment;
    }

    public void setProductreachcomment(String productreachcomment) {
        this.productreachcomment = productreachcomment;
    }

    public String getFirstmovercomment() {
        return firstmovercomment;
    }

    public void setFirstmovercomment(String firstmovercomment) {
        this.firstmovercomment = firstmovercomment;
    }

    public String getUspcomment() {
        return uspcomment;
    }

    public void setUspcomment(String uspcomment) {
        this.uspcomment = uspcomment;
    }

    public String getFinanacecrunchcomment() {
        return Finanacecrunchcomment;
    }

    public void setFinanacecrunchcomment(String Finanacecrunchcomment) {
        this.Finanacecrunchcomment = Finanacecrunchcomment;
    }
    


    public int getProductDemand() {
        return productDemand;
    }

    public void setProductDemand(int productDemand) {
        this.productDemand = productDemand;
    }
    
    
    public void GetRisk()
    {
    
        this.Risk=((productDemand 
                +Marketreach 
                +InnovativeAspect 
                +productdurability
                +customerAcceptance 
                +marketdemand 
                +tradebarrier 
                +productreach 
                +firstmover 
                +usp 
            +Finanacecrunch )/11); 
    
    }
    
    
    
    
}
