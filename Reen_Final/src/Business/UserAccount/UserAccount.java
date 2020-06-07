/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Directory.*;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author 
 */
public class UserAccount {
    
   private String name;
    private String username;
    private String password;
    private Employee employee;
    private Responders responder;
    private NFRFInsuranceManager insuranceManager;
    private ClaimsManager claimmanagr;
    private NFRFAidManager bankManager;
    private Volunteers volunteer;
    private Role role;
    private WorkQueue workQueue;
    private String network;

    public Responders getResponder() {
        return responder;
    }

    public void setResponder(Responders responder) {
        this.responder = responder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NFRFInsuranceManager getInsuranceManager() {
        return insuranceManager;
    }

    public void setInsuranceManager(NFRFInsuranceManager insuranceManager) {
        this.insuranceManager = insuranceManager;
    }

    public ClaimsManager getClaimmanagr() {
        return claimmanagr;
    }

    public void setClaimmanagr(ClaimsManager claimmanagr) {
        this.claimmanagr = claimmanagr;
    }

    public NFRFAidManager getBankManager() {
        return bankManager;
    }

    public void setBankManager(NFRFAidManager bankManager) {
        this.bankManager = bankManager;
    }

    public Volunteers getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteers volunteer) {
        this.volunteer = volunteer;
    }

    public UserAccount() {
        workQueue = new WorkQueue();
        username =  new String();
        network = new String();
        name  = new String();
        
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}