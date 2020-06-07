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
 * @author 
 */
public class ClaimsManagerOrganization extends Organization{

    public ClaimsManagerOrganization() {
        super(Organization.Type.ClaimsManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ClaimsManagerRole());
        return roles;
    }
     
}