/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NFRFInsuranceManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author yashk
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
