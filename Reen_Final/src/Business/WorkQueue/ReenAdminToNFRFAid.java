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
public class ReenAdminToNFRFAid extends WorkRequest{
    
     private String requestResult;
     private Responders responder;
    
    public ReenAdminToNFRFAid(String message, Responders BM) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.requestResult = new String();
        this.responder = BM;   
        
    }

    public Responders getResponder() {
        return responder;
    }

    public void setResponder(Responders responder) {
        this.responder = responder;
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
     
     
    
}
