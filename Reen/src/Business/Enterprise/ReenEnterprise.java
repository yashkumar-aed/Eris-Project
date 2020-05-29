/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author yashk
 */
public class ReenEnterprise extends Enterprise {
    
    public ReenEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Reen);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
