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
 * @author HP
 */

public class ResponderToVolunteer extends WorkRequest{
   
    private String requestResult;
    private Responders resp;
 
    private Volunteers volunteer;
 
    public ResponderToVolunteer(Responders BM, Volunteers p) {

        super();
        this.requestResult = new String();
        this.resp = BM;
        this.volunteer = p;
    }

    public Responders getResponder() {
        return resp;
    }

    public void setResponder(Responders m) {
        this.resp = m;
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

    public void setVolunteer(Volunteers volunteer) {
        this.volunteer = volunteer;
    }
 @Override
    public String toString() {
        return resp.getUsername();
    }
   
    
 
}