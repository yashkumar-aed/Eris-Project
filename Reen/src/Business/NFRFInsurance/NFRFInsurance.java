/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NFRFInsurance;

import Business.Directory.Responders;



/**
 *
 * @author HP
 */
public class NFRFInsurance {
    
    private String firstName;
    private String lastName;
    private String emailId;
    private int policyNumber;
    private String address;
    private String counselor;
    private String reenbranch;
    private int fundsApproved;
    private Responders responders;
   // private int requestedFunds ;

   
    private String username;
    private String docPath;


    public NFRFInsurance(String firstName, String lastName, String emailId, int policynumber, String address, String docPath) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.policyNumber = policynumber;
        this.address = address;
        this.reenbranch = new String();
        this.fundsApproved = 0;
        
        this.docPath = docPath;
    }

    public NFRFInsurance() {
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
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

    public String getCounselor() {
        return counselor;
    }

    public void setCounselor(String counselor) {
        this.counselor = counselor;
    } 

    public Responders getResponders() {
        return responders;
    }

    public void setResponders(Responders responders) {
        this.responders = responders;
    }

    public String getReenbranch() {
        return reenbranch;
    }

    public void setReenbranch(String reenbranch) {
        this.reenbranch = reenbranch;
    }

    public int getFundsApproved() {
        return fundsApproved;
    }

    public void setFundsApproved(int fundsApproved) {
        
        this.fundsApproved = fundsApproved;
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
 
    @Override
    public String toString() {
        return username;
    }
    
    
    
}