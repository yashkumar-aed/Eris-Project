/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NFRFAidManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class NFRFAidManagerOrganization extends Organization{

    public NFRFAidManagerOrganization() {
        super(Organization.Type.NFRFAidManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NFRFAidManagerRole());
        return roles;
    }
     
   
    
    
}
