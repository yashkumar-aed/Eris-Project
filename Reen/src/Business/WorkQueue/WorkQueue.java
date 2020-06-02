/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<RespondersToClaimsManager> respondersToClaimsManager;
    private ArrayList<VolunteersToClaimsManager> volunteersToClaimsManager;
    private ArrayList<ClaimsManagerToAdmin> claimsManagerToAdmin;
    private ArrayList<RespondersToVolunteers> respondersToVolunteers;
    private ArrayList<RespondersToClaims> respondersToClaims; 
    private ArrayList<ReenAdminToNFRFAid> reenAdminToNFRFAid;
    private ArrayList<RespondersToNFRFInsuranceManager> respondersToNFRFInsuranceManager;

    public WorkQueue() {
        workRequestList = new ArrayList();
        respondersToClaimsManager=new ArrayList();
        volunteersToClaimsManager=new ArrayList();
        claimsManagerToAdmin=new ArrayList();
        respondersToVolunteers=new ArrayList();
        respondersToClaims=new ArrayList();
        reenAdminToNFRFAid=new ArrayList();
        respondersToNFRFInsuranceManager=new ArrayList();

    }

    public ArrayList<RespondersToClaimsManager> getRespondersToClaimsManager() {
        return respondersToClaimsManager;
    }

    public void setRespondersToClaimsManager(ArrayList<RespondersToClaimsManager> respondersToClaimsManager) {
        this.respondersToClaimsManager = respondersToClaimsManager;
    }
     public void addRespondersToClaimsManager(RespondersToClaimsManager rc) {
       respondersToClaimsManager.add(rc);
     }
     
    public ArrayList<VolunteersToClaimsManager> getVolunteersToClaimsManager() {
        return volunteersToClaimsManager;
    }

    public void setVolunteersToClaimsManager(ArrayList<VolunteersToClaimsManager> volunteersToClaimsManager) {
        this.volunteersToClaimsManager = volunteersToClaimsManager;
    }

    public ArrayList<ClaimsManagerToAdmin> getClaimsManagerToAdmin() {
        return claimsManagerToAdmin;
    }

    public void setClaimsManagerToAdmin(ArrayList<ClaimsManagerToAdmin> claimsManagerToAdmin) {
        this.claimsManagerToAdmin = claimsManagerToAdmin;
    }

    public ArrayList<RespondersToVolunteers> getRespondersToVolunteers() {
        return respondersToVolunteers;
    }

    public void setRespondersToVolunteers(ArrayList<RespondersToVolunteers> respondersToVolunteers) {
        this.respondersToVolunteers = respondersToVolunteers;
    }

    public ArrayList<RespondersToClaims> getRespondersToClaims() {
        return respondersToClaims;
    }

    public void setRespondersToClaims(ArrayList<RespondersToClaims> respondersToClaims) {
        this.respondersToClaims = respondersToClaims;
    }

    public ArrayList<ReenAdminToNFRFAid> getReenAdminToNFRFAid() {
        return reenAdminToNFRFAid;
    }

    public void setReenAdminToNFRFAid(ArrayList<ReenAdminToNFRFAid> reenAdminToNFRFAid) {
        this.reenAdminToNFRFAid = reenAdminToNFRFAid;
    }

    public ArrayList<RespondersToNFRFInsuranceManager> getRespondersToNFRFInsuranceManager() {
        return respondersToNFRFInsuranceManager;
    }

    public void setRespondersToNFRFInsuranceManager(ArrayList<RespondersToNFRFInsuranceManager> respondersToNFRFInsuranceManager) {
        this.respondersToNFRFInsuranceManager = respondersToNFRFInsuranceManager;
    }
    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}