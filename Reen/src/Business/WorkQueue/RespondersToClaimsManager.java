/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Responders;
import Business.Employee.ClaimsManager;

/**
 *
 * @author yashk
 */
public class RespondersToClaimsManager extends WorkRequest{
    
    private String requestResult;
    private Responders responders;

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
    
    public RespondersToClaimsManager(Responders r) {
        super();
        this.requestResult = new String();
        this.responders = r;
        this.claimsmanagerFeeback = new String();
    }
    
    private String claimsmanagerFeeback;
    private ClaimsManager claimsmanager;
    
    public void selectClaimsManager(){
        
      //TODO: Function to allot the Counsellor to BirthMother  
    }
    
}
