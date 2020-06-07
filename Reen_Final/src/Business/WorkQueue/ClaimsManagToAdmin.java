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
 * @author 
 */
public class ClaimsManagToAdmin extends WorkRequest{
    
     private String requestResult;
     private Volunteers volunteer;
     private Responders responder;
     
     public ClaimsManagToAdmin(String message, Volunteers volunteerzzz) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.requestResult = new String();
        this.volunteer = volunteerzzz;   
        this.responder = new Responders();
    }
    
    public ClaimsManagToAdmin(String message, Responders BM) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.requestResult = new String();
        this.responder = BM;   
        this.volunteer = new Volunteers();
    }

    public Responders getResponder() {
        return responder;
    }

    public void setResponder(Responders responder) {
        this.responder = responder;
    }


    public Volunteers getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteers volunteer) {
        this.volunteer = volunteer;
    }

    public ClaimsManagToAdmin(String requestResult) {
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
