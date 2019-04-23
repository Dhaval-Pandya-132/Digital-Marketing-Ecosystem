/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import java.util.Date;
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
