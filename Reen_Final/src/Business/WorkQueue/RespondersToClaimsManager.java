/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Directory.Responders;
import Business.Directory.ClaimsManager;

/**
 *
 * @author 
 */
public class RespondersToClaimsManager extends WorkRequest{
   
    private String requestResult;
    private Responders responder;
    private String claimmanagerFeeback;
    private ClaimsManager claimmanagr;

    public RespondersToClaimsManager() {
        super();
    }

    public Responders getResponder() {
        return responder;
    }

    public void setResponder(Responders responder) {
        this.responder = responder;
    }

    public ClaimsManager getClaimmanagr() {
        return claimmanagr;
    }

    public void setClaimmanagr(ClaimsManager claimmanagr) {
        this.claimmanagr = claimmanagr;
    }
    
    public RespondersToClaimsManager(Responders BM) {
        super();
        this.requestResult = new String();
        this.responder = BM;
        this.claimmanagerFeeback = new String();
    }

    public Responders getRespondeer() {
        return responder;
    }

    public void setResponderss(Responders m) {
        this.responder = m;
    }

    public String getClaimmanagerFeeback() {
        return claimmanagerFeeback;
    }

    public void setClaimmanagerFeeback(String claimmanagerFeeback) {
        this.claimmanagerFeeback = claimmanagerFeeback;
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }
    public void selectCounsellor(){
        
      //TODO: Function to allot the ClaimsManager to Responders  
    }
    @Override
    public String toString() {
        return getRespondeer().getUsername();
    }
    
}
