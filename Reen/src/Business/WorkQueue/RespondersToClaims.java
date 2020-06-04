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
 * @author yashk
 */
public class RespondersToClaims extends WorkRequest{
    private Responders responders;
    private Claims claims;

    public RespondersToClaims(String message, Claims claims, Responders rr) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.claims = claims;
        this.responders =rr;
    }

    public Responders getResponders() {
        return responders;
    }

    public void setResponders(Responders responders) {
        this.responders = responders;
    }

    public Claims getClaims() {
        return claims;
    }

    public void setClaims(Claims claims) {
        this.claims = claims;
    }

    

    @Override
    public String toString() {
        return super.getSender().getName();
    }
    
    
}
