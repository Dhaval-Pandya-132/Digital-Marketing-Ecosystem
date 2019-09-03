/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author dhava
 */
public abstract class WorkRequest {
    
    private String TaskID;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String Title;
    private String description;
    private Date Duedate;
    private Employee  Assignto;
    private productDetailWorkRequest pdw; 
    private productRiskAnalysis pra;
    private List<TwitterData> td;
    private List<EmailSendData> esd;

    public List<EmailSendData> getEsd() {
        return esd;
    }

    public void setEsd(List<EmailSendData> esd) {
        this.esd = esd;
    }


    public List<TwitterData> getTd() {
        return td;
    }

    public void setTd(List<TwitterData> td) {
        this.td = td;
    }

    
    
    
    public productRiskAnalysis getPra() {
        return pra;
    }

    public void setPra(productRiskAnalysis pra) {
        this.pra = pra;
    }
    private ProducttwitterdataWorkrequest twr;

//    public productRiskAnalysis getPra() {
//        return pra;
//    }

    public ProducttwitterdataWorkrequest getTwr() {
        return twr;
    }

    public void setTwr(ProducttwitterdataWorkrequest twr) {
        this.twr = twr;
    }

//    public void setPra(productRiskAnalysis pra) {
//        this.pra = pra;
//    }
    
    public productDetailWorkRequest getPdw() {
        return pdw;
    }

    public void setPdw(productDetailWorkRequest pdw) {
        this.pdw = pdw;
    }

    @Override
    public String toString()
    {
           return this.Title;
    }
    
    public Employee getAssignto() {
        return Assignto;
    }

    public void setAssignto(Employee Assignto) {
        this.Assignto = Assignto;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDuedate() {
        return Duedate;
    }

    public void setDuedate(Date Duedate) {
        this.Duedate = Duedate;
    }

    public String getTaskID() {
        return TaskID;
    }

    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }
    
      public enum Workstatus{
        
        All("All"),  
        Create("Created"),
        InProgress("InProgress"),
        Completed("Completed");
        
        private String value;
        private Workstatus(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
  
    
    public WorkRequest(){
        requestDate = new Date();
        UUID uuid = UUID.randomUUID();
        this.TaskID = uuid.toString();
        this.td=new ArrayList<>();
        this.pra=new productRiskAnalysis();
        this.esd=new ArrayList<>();
     //   this.pdw=new productDetailWorkRequest();
      //  this.pra=new  productRiskAnalysis();
        
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
}
