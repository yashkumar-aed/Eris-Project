/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ClaimsManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author yashk
 */
public class VolunteersOrganization extends Organization{

    public VolunteersOrganization() {
        super(Organization.Type.VolunteerOrg.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        return roles;
    }
     
}