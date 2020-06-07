package Business;

import Business.Directory.ClaimsManager;
import Business.Enterprise.Enterprise;
import Business.Enterprise.NFRFEnterprise;
import Business.Enterprise.ReenEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.NFRFAidManagerRole;
import Business.Role.ClaimsManagerRole;
import Business.Role.NFRFAdminRole;
import Business.Role.ReenAdminRole;
import Business.Role.NFRFInsuranceManagerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Directory.*;

/**
 *
 * @author yashk
 */
public class ConfigureASystem {
    
    public static EcoSystem system; 
    
    public static EcoSystem configure(){
        
        system = EcoSystem.getInstance();
           
        Employee employee = system.getEmployeeDirectory().createandaddEmployee("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());;
        ConfigureASystem configure = new ConfigureASystem();
        configure.configureNetwork();
        return system;
    }
    
    public void configureNetwork(){

         Network network = system.createAndAddNetwork();
        network.setCountry("United States");
        network.setState("Massachusetts");
        network.setCity("Boston");
        network.setName("Boston Network");
    // Boston   
        ReenEnterprise hospital = (ReenEnterprise)network.getEnterpriseDirectory().createAndAddEnterprise("Reen Boston Network", Enterprise.EnterpriseType.Reen);
        NFRFEnterprise financial = (NFRFEnterprise)network.getEnterpriseDirectory().createAndAddEnterprise("NFRF Boston Network", Enterprise.EnterpriseType.NFRF);
        
        Employee employee = hospital.getEmployeeDirectory().createandaddEmployee("Reen Boston");
        UserAccount account = hospital.getUserAccountDirectory().createUserAccount("hadmin", "hadmin", employee, new ReenAdminRole(), network.getName());
        
        Organization organization = hospital.getOrganizationDirectory().createOrganization(Organization.Type.ClaimsManager);
        ClaimsManager employee1 = organization.getEmployeeDirectory().createandaddClaimsmanager("Claims Manager");
        account = organization.getUserAccountDirectory().createClaimManagrUserAccount("claim", "claim", employee1, new ClaimsManagerRole(),network.getName() );
        
        employee = financial.getEmployeeDirectory().createandaddEmployee("Boston Public Finance Admin");    
        account = financial.getUserAccountDirectory().createUserAccount("fadmin", "fadmin", employee, new NFRFAdminRole(),network.getName());
     
        
        organization = financial.getOrganizationDirectory().createOrganization(Organization.Type.NFRFAidManager);
        NFRFAidManager employee2 = organization.getEmployeeDirectory().createandaddnfrfaidManager("NFRF Aid Manager Organization");
        account = organization.getUserAccountDirectory().createNFRFAidManagerUserAccount("amanager", "amanager", employee2, new NFRFAidManagerRole(),network.getName());
        
    
        Organization organization1 = financial.getOrganizationDirectory().createOrganization(Organization.Type.NFRFInsuranceManager);
        NFRFInsuranceManager employee3 = organization1.getEmployeeDirectory().createandaddnfrfInsuranceManager("NFRF Insurance Manager Organization");
        account = organization1.getUserAccountDirectory().createNFRFInsuranceManagerUserAccount("imanager", "imanager", employee3, new NFRFInsuranceManagerRole(), network.getName());
        account.setNetwork(network.getName());
        
        hospital.getOrganizationDirectory().createOrganization(Organization.Type.ResponderOrg);
        hospital.getOrganizationDirectory().createOrganization(Organization.Type.VolunteerOrg);
        

    }
    
}
