/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.ClaimsAccount.ClaimsAccountDirectory;
import Business.Directory.RespondersDirectory;
import Business.Directory.VolunteersDirectory;
import Business.Directory.EmployeeDirectory;
import Business.NFRFInsurance.NFRFInsuranceAccountDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public abstract class Organization {

    private String name;

    private WorkQueue workQueue;
    private VolunteersDirectory volunteerDirectory;
    private RespondersDirectory responderDirectory;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ClaimsAccountDirectory claimDirectory;
    private NFRFInsuranceAccountDirectory insuranceAccountDirectory;
    private int organizationID;
    private static int counter=0;

    public VolunteersDirectory getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public void setVolunteerDirectory(VolunteersDirectory volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }

    public RespondersDirectory getResponderDirectory() {
        return responderDirectory;
    }

    public void setResponderDirectory(RespondersDirectory responderDirectory) {
        this.responderDirectory = responderDirectory;
    }
    //private ClaimsAccountDirectory claimDirectory;
    //private NFRFInsuranceAccountDirectory insuranceAccountDirectory;

    public ClaimsAccountDirectory getClaimDirectory() {
        return claimDirectory;
    }

    public void setClaimDirectory(ClaimsAccountDirectory claimDirectory) {
        this.claimDirectory = claimDirectory;
    }
    
     public NFRFInsuranceAccountDirectory getInsuranceAccountDirectory() {
        return insuranceAccountDirectory;
    }

    public void setInsuranceAccountDirectory(NFRFInsuranceAccountDirectory insuranceAccountDirectory) {
        this.insuranceAccountDirectory = insuranceAccountDirectory;
    }
    public enum Type{
        ReenAdmin("Reen Admin Organization"), 
        ClaimsManager("Claims Manager Organization"), 
        NFRFAidManager("NFRF Aid Manager Organization"),
        NFRFInsuranceManager("NFRF Insurance Manager Organization"),
        NFRFAdmin("NFRF Admin Organization"),
        ResponderOrg("Responder Organization"),
        VolunteerOrg("Volunteer Organization");
                
        
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
      
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        volunteerDirectory = new VolunteersDirectory();
        responderDirectory = new RespondersDirectory();
        userAccountDirectory = new UserAccountDirectory();
        claimDirectory = new ClaimsAccountDirectory();
        insuranceAccountDirectory = new NFRFInsuranceAccountDirectory();
        
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
