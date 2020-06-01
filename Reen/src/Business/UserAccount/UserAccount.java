/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.*;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    private String name;
    private String username;
    private String password;
    private Employee employee;
    
    private Responders responders;
    private ClaimsManager claimsmanager;
    private Volunteers volunteers;
    private NFRFAidManager nfrfaid;
    private NFRFInsuranceManager nfrfinsurance;

    private Role role;
    private WorkQueue workQueue;
    private String network;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Responders getResponders() {
        return responders;
    }

    public void setResponders(Responders responders) {
        this.responders = responders;
    }

    public ClaimsManager getClaimsmanager() {
        return claimsmanager;
    }

    public void setClaimsmanager(ClaimsManager claimsmanager) {
        this.claimsmanager = claimsmanager;
    }

    public Volunteers getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(Volunteers volunteers) {
        this.volunteers = volunteers;
    }

    public NFRFAidManager getNfrfaid() {
        return nfrfaid;
    }

    public void setNfrfaid(NFRFAidManager nfrfaid) {
        this.nfrfaid = nfrfaid;
    }

    public NFRFInsuranceManager getNfrfinsurance() {
        return nfrfinsurance;
    }

    public void setNfrfinsurance(NFRFInsuranceManager nfrfinsurance) {
        this.nfrfinsurance = nfrfinsurance;
    }

    public UserAccount() {
        workQueue = new WorkQueue();
        username=new String();
        network=new String();
        name=new String();
        
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