/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NFRFInsuranceManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class NFRFInsuranceManagerOrganization extends Organization{

    public NFRFInsuranceManagerOrganization() {
        super(Organization.Type.NFRFInsuranceManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NFRFInsuranceManagerRole());
        return roles;
    }
     
   
    
    
}
