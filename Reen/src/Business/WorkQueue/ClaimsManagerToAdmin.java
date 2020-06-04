/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Directory.Responders;
import Business.Directory.Volunteers;
/**
 *
 * @author yashk
 */
public class ClaimsManagerToAdmin extends WorkRequest{
    
    private String requestResult;
     private Volunteers volunteers;
     private Responders responders;
     
     public ClaimsManagerToAdmin(String message, Volunteers volunteers) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.requestResult = new String();
        this.volunteers = volunteers;   
        this.responders = new Responders();
    }
    
    public ClaimsManagerToAdmin(String message, Responders rr) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.requestResult = new String();
        this.responders = rr;   
        this.volunteers = new Volunteers();
    }

    public Responders getResponders() {
        return responders;
    }

    public void setResponders(Responders responders) {
        this.responders = responders;
    }


    public Volunteers getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(Volunteers volunteers) {
        this.volunteers = volunteers;
    }

    public ClaimsManagerToAdmin(String requestResult) {
        this.requestResult = requestResult;
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }
     
    @Override
    public String toString() {
        return super.getMessage();
    } 
}
