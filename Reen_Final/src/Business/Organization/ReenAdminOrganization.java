/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ReenAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class ReenAdminOrganization extends Organization{

    public ReenAdminOrganization() {
        super(Type.ReenAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ReenAdminRole());
        return roles;
    }
     
}
