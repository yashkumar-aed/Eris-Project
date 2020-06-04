/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ClaimsManager.getValue())){
            organization = new ClaimsManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NFRFAidManager.getValue())){
            organization = new NFRFAidManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NFRFAdmin.getValue())){
            organization = new NFRFAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ReenAdmin.getValue())){
            organization = new ReenAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NFRFInsuranceManager.getValue())){
            organization = new NFRFInsuranceManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.RespondersOrg.getValue())){
            organization = new RespondersOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.VolunteersOrg.getValue())){
            organization = new VolunteersOrganization();
            organizationList.add(organization);
        }
        return organization;
    }

    public boolean containsType(Type type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}