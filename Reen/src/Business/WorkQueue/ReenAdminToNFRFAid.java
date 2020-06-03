/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Responders;
import Business.Employee.Volunteers;
/**
 *
 * @author yashk
 */
public class ReenAdminToNFRFAid extends WorkRequest{
    private String requestResult;
     private Responders responders;
    
    public ReenAdminToNFRFAid(String message, Responders rr) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.requestResult = new String();
        this.responders = rr;   
        
    }

   
    public ReenAdminToNFRFAid(String requestResult) {
        this.requestResult = requestResult;
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

    
}
