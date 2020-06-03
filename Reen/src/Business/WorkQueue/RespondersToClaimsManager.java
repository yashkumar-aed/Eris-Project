/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Responders;
import Business.Employee.ClaimsManager;
import java.util.Date;


/**
 *
 * @author yashk
 */
public class RespondersToClaimsManager extends WorkRequest{
    
    private String requestResult;
    private Responders responders;
    private String claimsmanagerFeeback;
    private ClaimsManager claimsmanager;

     public RespondersToClaimsManager() {
        super();
    }
     
    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }

    public Responders getResponders() {
        return responders;
    }

    public void setResponders(Responders responders) {
        this.responders = responders;
    }

    public String getClaimsmanagerFeeback() {
        return claimsmanagerFeeback;
    }

    public void setClaimsmanagerFeeback(String claimsmanagerFeeback) {
        this.claimsmanagerFeeback = claimsmanagerFeeback;
    }

    public ClaimsManager getClaimsmanager() {
        return claimsmanager;
    }

    public void setClaimsmanager(ClaimsManager claimsmanager) {
        this.claimsmanager = claimsmanager;
    }
    
    public RespondersToClaimsManager(Responders rr) {
        super();
        this.requestResult = new String();
        this.responders = rr;
        this.claimsmanagerFeeback = new String();
    }
    /*
    public Responders getResponders() {
        return responders;
    }

    public void setResponders(Responders r) {
        this.responders = r;
    }
*/
    public void selectClaimsManager(){
        
    }
    
    @Override
    public String toString() {
        return getResponders().getUsername();
    }
}
