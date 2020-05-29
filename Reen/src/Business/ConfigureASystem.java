package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ReenEnterprise;
import Business.Enterprise.NFRFEnterprise;
import Business.Network.Network;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Organization.Organization;


/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem system;
    public static EcoSystem configure(){

        system = EcoSystem.getInstance();
        
        //Create a network
        
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    public void configureNetwork(){
        
        Network network = system.createAndAddNetwork();
        network.setCountry("India");
        network.setCity("Mumbai");
        network.setName("Mumbai Network");
        
        ReenEnterprise reen=(ReenEnterprise)network.getEnterpriseDirectory().createAndAddEnterprise("Reen Foundation Mumbai",Enterprise.EnterpriseType.Reen);
        NFRFEnterprise nfrf=(NFRFEnterprise)network.getEnterpriseDirectory().createAndAddEnterprise("NFRF Mumbai",Enterprise.EnterpriseType.NFRF);

        Organization organization = reen.getOrganizationDirectory().createOrganization(Organization.Type.VolunteersOrg);
    
        
        organization = reen.getOrganizationDirectory().createOrganization(Organization.Type.RespondersOrg);
        organization = reen.getOrganizationDirectory().createOrganization(Organization.Type.ClaimsManager);
        organization = nfrf.getOrganizationDirectory().createOrganization(Organization.Type.NFRFInsuranceManager);
        organization = nfrf.getOrganizationDirectory().createOrganization(Organization.Type.NFRFAidManager);

    }
}
