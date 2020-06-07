/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author yashk
 */
public class WorkQueue {
    
    private ArrayList<RespondersToClaimsManager> respondersToClaim;
    private ArrayList<VolunteerToClaimManagr> volunteerToClaim;
    private ArrayList<ClaimsManagToAdmin> claimToAdmin;
    private ArrayList<ResponderToVolunteer> responderToVolunteer;
    private ArrayList<ResponderToClaims> responderToClaim; 
    private ArrayList<ReenAdminToNFRFAid> reenadminToNFRFAid;
    private ArrayList<ResponderToNFRFInsurance> responderToNFRFInsurance;

    public WorkQueue() {
        respondersToClaim = new ArrayList();
        volunteerToClaim = new ArrayList();
        claimToAdmin = new ArrayList();
        responderToVolunteer =  new ArrayList();
        responderToClaim = new ArrayList();
        reenadminToNFRFAid = new ArrayList();
        responderToNFRFInsurance = new ArrayList();
               
    }  

    
    public ArrayList<ResponderToNFRFInsurance> getResponderToNFRFInsurance() {
        return responderToNFRFInsurance;
    }

    public void setResponderToNFRFInsurance(ArrayList<ResponderToNFRFInsurance> responderToNFRFInsurance) {
        this.responderToNFRFInsurance = responderToNFRFInsurance;
    }
    
    public ArrayList<ResponderToClaims> getResponderToClaim() {
        return responderToClaim;
    }

    public void setResponderToClaim(ArrayList<ResponderToClaims> responderToClaim) {
        this.responderToClaim = responderToClaim;
    }
    

    public ArrayList<ResponderToVolunteer> getResponderToVolunteer() {
        return responderToVolunteer;
    }

    public void setResponderToVolunteer(ArrayList<ResponderToVolunteer> responderToVolunteer) {
        this.responderToVolunteer = responderToVolunteer;
    }


    public ArrayList<RespondersToClaimsManager> getResponderToClaimManagr() {
        return respondersToClaim;
    }

    public ArrayList<VolunteerToClaimManagr> getVolunteerToClaim() {
        return volunteerToClaim;
    }


    public void setRespondersToClaim(ArrayList<RespondersToClaimsManager> respondersToClaim) {
        this.respondersToClaim = respondersToClaim;
    }
    public void addRespondersToClaims(RespondersToClaimsManager bMC) {
       respondersToClaim.add(bMC);

    }

    public void setVolunterrClaims(ArrayList<VolunteerToClaimManagr> volToClaim) {
        this.volunteerToClaim = volToClaim;
    }

    public void setClaimToAdmin(ArrayList<ClaimsManagToAdmin> claimToAdmin) {
        this.claimToAdmin = claimToAdmin;
    }

    public ArrayList<ClaimsManagToAdmin> getClaimToAdmin() {
        return claimToAdmin;
    }

    public ArrayList<ReenAdminToNFRFAid> getReenadminToNFRFAid() {
        return reenadminToNFRFAid;
    }

    public void setReenadminToNFRFAid(ArrayList<ReenAdminToNFRFAid> reenadminToNFRFAid) {
        this.reenadminToNFRFAid = reenadminToNFRFAid;
    }


}