/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.ClaimsAccount.ClaimsAccountDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Employee.RespondersDirectory;
import Business.Employee.VolunteersDirectory;
import Business.NFRFInsurance.NFRFInsuranceAccountDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private VolunteersDirectory volunteersDirectory;
    private RespondersDirectory respondersDirectory;
    private EmployeeDirectory employeeDirectory;
    private ClaimsAccountDirectory claimsDirectory;
    private NFRFInsuranceAccountDirectory nfrfinsuranceAccountDirectory;

    private UserAccountDirectory userAccountDirectory;

    public VolunteersDirectory getVolunteersDirectory() {
        return volunteersDirectory;
    }

    public void setVolunteersDirectory(VolunteersDirectory volunteersDirectory) {
        this.volunteersDirectory = volunteersDirectory;
    }

    public ClaimsAccountDirectory getClaimsDirectory() {
        return claimsDirectory;
    }

    public void setClaimsDirectory(ClaimsAccountDirectory claimsDirectory) {
        this.claimsDirectory = claimsDirectory;
    }

    public NFRFInsuranceAccountDirectory getNfrfinsuranceAccountDirectory() {
        return nfrfinsuranceAccountDirectory;
    }

    public void setNfrfinsuranceAccountDirectory(NFRFInsuranceAccountDirectory nfrfinsuranceAccountDirectory) {
        this.nfrfinsuranceAccountDirectory = nfrfinsuranceAccountDirectory;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization"), ClaimsManager("Claims Manager"), NFRFInsuranceManager("NFRF Insurance Manager"), ReenAdmin("Reen Admin"), NFRFAdmin("NFRFAdmin"), NFRFAidManager("NFRF Aid Manager"), RespondersOrg("Responder"), VolunteersOrg("Volunteers");
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
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public RespondersDirectory getRespondersDirectory() {
        return respondersDirectory;
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
