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
 * @author 
 */
public class VolunteerToClaimManagr extends WorkRequest{
    private String requestResult;
    private Volunteers volunteer;
    private String counsellorFeeback;

    public VolunteerToClaimManagr(String message, Volunteers voluntee) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.requestResult = new String();
        this.volunteer = voluntee;
        this.counsellorFeeback = new String();   
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }

    public Volunteers getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteers p) {
        this.volunteer = p;
    }

    public String getCounsellorFeeback() {
        return counsellorFeeback;
    }

    public void setCounsellorFeeback(String counsellorFeeback) {
        this.counsellorFeeback = counsellorFeeback;
    }
}
