/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Directory.Volunteers;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author yashk
 */
public class VolunteersToClaimsManager extends WorkRequest{
    private String requestResult;
    private Volunteers volunteers;
    private String claimsmanagerFeeback;
    
    public VolunteersToClaimsManager(String message, Volunteers volunteers) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.requestResult = new String();
        this.volunteers = volunteers;
        this.claimsmanagerFeeback = new String();   
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }

    public Volunteers getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(Volunteers volunteers) {
        this.volunteers = volunteers;
    }

    public String getClaimsmanagerFeeback() {
        return claimsmanagerFeeback;
    }

    public void setClaimsmanagerFeeback(String claimsmanagerFeeback) {
        this.claimsmanagerFeeback = claimsmanagerFeeback;
    }
}
