package Business;

import Business.Directory.NFRFAidManager;
import Business.Directory.NFRFInsuranceManager;
import Business.Directory.ClaimsManager;
import Business.Directory.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ReenEnterprise;
import Business.Enterprise.NFRFEnterprise;
import Business.Network.Network;
import Business.Role.NFRFAidManagerRole;
import Business.Role.ClaimsManagerRole;
import Business.Role.NFRFAdminRole;
import Business.Role.ReenAdminRole;
import Business.Role.NFRFInsuranceManagerRole;
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
        
        Employee employee = system.getEmployeeDirectory().createandaddEmployee("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        ConfigureASystem configure = new ConfigureASystem();
        configure.configureNetwork();
        return system;
    }
    public void configureNetwork(){
        
        Network network = system.createAndAddNetwork();
        network.setCountry("India");
        network.setCity("Mumbai");
        network.setName("Mumbai Network");
        
        ReenEnterprise reen=(ReenEnterprise)network.getEnterpriseDirectory().createAndAddEnterprise("Reen Foundation Mumbai",Enterprise.EnterpriseType.Reen);
        NFRFEnterprise nfrf=(NFRFEnterprise)network.getEnterpriseDirectory().createAndAddEnterprise("NFRF Mumbai",Enterprise.EnterpriseType.NFRF);

        Employee employee = reen.getEmployeeDirectory().createandaddEmployee("Reen Foundation Admin");
        UserAccount account = reen.getUserAccountDirectory().createUserAccount("reen", "reen", employee, new ReenAdminRole(), network.getName());

        Organization organization = reen.getOrganizationDirectory().createOrganization(Organization.Type.VolunteersOrg);
        ClaimsManager employee1 = organization.getEmployeeDirectory().createandaddClaimsManager("Claims Manager");
        account = organization.getUserAccountDirectory().createClaimsManagerUserAccount("c", "c", employee1, new ClaimsManagerRole(),network.getName() );
        
        employee = nfrf.getEmployeeDirectory().createandaddEmployee("Mumbai NFRF Admin");    
        account = nfrf.getUserAccountDirectory().createUserAccount("nfrf", "nfrf", employee, new NFRFAdminRole(),network.getName());

        
        organization = nfrf.getOrganizationDirectory().createOrganization(Organization.Type.NFRFAidManager);
        NFRFAidManager employee2 = organization.getEmployeeDirectory().createandaddNFRFAidManager("NFRF Aid Manager");
        account = organization.getUserAccountDirectory().createNFRFAidManagerUserAccount("a", "a", employee2, new NFRFAidManagerRole(),network.getName());

        
        Organization organization1 = nfrf.getOrganizationDirectory().createOrganization(Organization.Type.NFRFInsuranceManager);
        NFRFInsuranceManager employee3 = organization1.getEmployeeDirectory().createandadNFRFInsuranceManager("NFRF Insurance Manager");
        account = organization1.getUserAccountDirectory().createNFRFInsuranceManagerUserAccount("i", "i", employee3, new NFRFInsuranceManagerRole(), network.getName());
        account.setNetwork(network.getName());

        account = nfrf.getUserAccountDirectory().createUserAccount("nfrf", "nfrf", employee, new NFRFAdminRole(),network.getName());
        
        reen.getOrganizationDirectory().createOrganization(Organization.Type.RespondersOrg);
        reen.getOrganizationDirectory().createOrganization(Organization.Type.VolunteersOrg);

    }
}
