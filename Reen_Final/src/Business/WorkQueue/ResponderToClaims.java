/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.ClaimsAccount.Claims;
import Business.Directory.Responders;
import Business.Directory.Volunteers;

/**
 *
 * @author HP
 */
public class ResponderToClaims extends WorkRequest{
    private Responders responder;
    private Claims loan;

    public ResponderToClaims(String message, Claims loan, Responders bm) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.loan = loan;
        this.responder =bm;
    }

    public Responders getResponder() {
        return responder;
    }

    public void setResponder(Responders responder) {
        this.responder = responder;
    }
    
    public Claims getLoan() {
        return loan;
    }

    public void setLoan(Claims loan) {
        this.loan = loan;
    }

    @Override
    public String toString() {
        return super.getSender().getName();
    }
    
    
}
