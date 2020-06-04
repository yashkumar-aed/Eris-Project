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
public class RespondersToNFRFInsuranceManager extends WorkRequest{
    private Responders responders;
    private UserAccount userAccount;
    private NFRFInsurance nfrfinsurance;
    private NFRFInsuranceAccountDirectory insuranceDir;

    public Responders getResponders() {
        return responders;
    }

    public void setResponders(Responders responders) {
        this.responders = responders;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public NFRFInsurance getNfrfinsurance() {
        return nfrfinsurance;
    }

    public void setNfrfinsurance(NFRFInsurance nfrfinsurance) {
        this.nfrfinsurance = nfrfinsurance;
    }

    public NFRFInsuranceAccountDirectory getInsuranceDir() {
        return insuranceDir;
    }

    public void setInsuranceDir(NFRFInsuranceAccountDirectory insuranceDir) {
        this.insuranceDir = insuranceDir;
    }

public RespondersToNFRFInsuranceManager(Responders responders, UserAccount userAccount, NFRFInsurance nfrfinsurance, NFRFInsuranceAccountDirectory insuranceDir) {
        super();
        this.responders = responders;
        this.userAccount = userAccount;
        this.nfrfinsurance = nfrfinsurance;
    }

@Override
    public String toString() {
        return responders.getFirstName();
    }}
