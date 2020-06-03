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
public class RespondersToVolunteers extends WorkRequest {
  private String requestResult;
    private Responders responders;
 
    private Volunteers volunteers;
 
    public RespondersToVolunteers(Responders rr, Volunteers v) {

        super();
        this.requestResult = new String();
        this.responders = rr;
        this.volunteers = v;
    }

 @Override
    public String toString() {
        return responders.getUsername();
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

    public Volunteers getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(Volunteers volunteers) {
        this.volunteers = volunteers;
    }
}
