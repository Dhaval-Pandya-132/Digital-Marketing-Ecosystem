/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author dhava
 */
public class WorkQueue {
     private ArrayList<WorkRequest> workRequestList;
    private ArrayList<productDetailWorkRequest> productDetailWorkRequestList;

    public ArrayList<productDetailWorkRequest> getProductDetailWorkRequestList() {
        return productDetailWorkRequestList;
    }

    public void setProductDetailWorkRequestList(ArrayList<productDetailWorkRequest> productDetailWorkRequestList) {
        this.productDetailWorkRequestList = productDetailWorkRequestList;
    }

    public WorkQueue() {
        this.workRequestList = new ArrayList();
        this.productDetailWorkRequestList=new  ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}
