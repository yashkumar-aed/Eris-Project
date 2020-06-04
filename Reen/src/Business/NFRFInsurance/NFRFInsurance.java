/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NFRFInsurance;

import Business.Employee.Responders;


/**
 *
 * @author yashk
 */
public class NFRFInsurance {
    
    
     public NFRFInsurance(String firstName, String lastName,int policynumber, String address, String docPath) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.policyNumber = policynumber;
        this.address = address;
        this.reenbranch = new String();
        this.fundsApproved = 0;
        
        this.docPath = docPath;
    }

    public NFRFInsurance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClaimsmanager() {
        return claimsmanager;
    }

    public void setClaimsmanager(String claimsmanager) {
        this.claimsmanager = claimsmanager;
    }

    public int getFundsApproved() {
        return fundsApproved;
    }

    public void setFundsApproved(int fundsApproved) {
        this.fundsApproved = fundsApproved;
    }

    public Responders getResponders() {
        return responders;
    }

    public void setResponders(Responders responders) {
        this.responders = responders;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDocPath() {
        return docPath;
    }

    public void setDocPath(String docPath) {
        this.docPath = docPath;
    }
    
    private String firstName;
    private String lastName;
    private int policyNumber;
    private String address;
    private String claimsmanager;
    private String reenbranch;

    public String getReenbranch() {
        return reenbranch;
    }

    public void setReenbranch(String reenbranch) {
        this.reenbranch = reenbranch;
    }
    private int fundsApproved;
    private Responders responders;

   
    private String username;
    private String docPath;
    
    @Override
    public String toString() {
        return username;
    }
}
