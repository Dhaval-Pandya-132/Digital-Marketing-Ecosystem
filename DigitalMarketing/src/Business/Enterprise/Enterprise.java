/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.RegionNetwork.Network;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dhava
 */
public abstract class Enterprise  extends Organization{
    private String EnterpriseName ;
 //   private String EnterpriseType ;
    private int NoofEmployee;
    private Date CreatedDate;
    private String Address;  
    private String profilePhoto;
    private String network;
    private String type;
    
    private String Consumerkey="";
    private String ConsumerSecretkey="";
    private String AccessToken="";
    private String AccessTokenSecret=""; 
    
    private String senderEmail ="";
    private String password = "";
    private String host = "";
    private String port = "";

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getConsumerkey() {
        return Consumerkey;
    }

    public void setConsumerkey(String Consumerkey) {
        this.Consumerkey = Consumerkey;
    }

    public String getConsumerSecretkey() {
        return ConsumerSecretkey;
    }

    public void setConsumerSecretkey(String ConsumerSecretkey) {
        this.ConsumerSecretkey = ConsumerSecretkey;
    }

    public String getAccessToken() {
        return AccessToken;
    }

    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    public String getAccessTokenSecret() {
        return AccessTokenSecret;
    }

    public void setAccessTokenSecret(String AccessTokenSecret) {
        this.AccessTokenSecret = AccessTokenSecret;
    }
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
    
   

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public enum EnterpriseType{
        Client("Client"),MarketAnlysis("MarketAnlysis"),DigitalMarket("DigitalMarket");
       
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
