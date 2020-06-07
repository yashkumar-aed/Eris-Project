/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NFRFAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class NFRFAdminOrganization extends Organization{

    public NFRFAdminOrganization() {
        super(Type.NFRFAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NFRFAdminRole());
        return roles;
    }
     
}
