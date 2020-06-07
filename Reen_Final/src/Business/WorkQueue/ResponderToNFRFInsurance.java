/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.NFRFInsurance.NFRFInsurance;
import Business.NFRFInsurance.NFRFInsuranceAccountDirectory;
import Business.Directory.Responders;
import Business.UserAccount.UserAccount;

/**
 *
 * @author yashk
 */
public class ResponderToNFRFInsurance extends WorkRequest{
    
    private Responders responder;
    private UserAccount userAccount;
    private NFRFInsurance insurance;
    private NFRFInsuranceAccountDirectory insuranceDir;

    public ResponderToNFRFInsurance(Responders responder, UserAccount userAccount, NFRFInsurance insurance, NFRFInsuranceAccountDirectory insur) {
        super();
        this.responder = responder;
        this.userAccount = userAccount;
        this.insurance = insurance;
    }

    public Responders getResponder() {
        return responder;
    }

    public void setResponder(Responders responder) {
        this.responder = responder;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public NFRFInsurance getInsurance() {
        return insurance;
    }

    public void setInsurance(NFRFInsurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return responder.getFirstName();
    }
    
}
