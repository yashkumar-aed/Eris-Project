/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    public boolean containsName(String type){
        for (Enterprise org : enterpriseList){
            if(org.getName().equals(type)){
                return true;
            }
        }
                return false;
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
     
        if(type==Enterprise.EnterpriseType.NFRF){

            enterprise=new NFRFEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseList.add(enterprise);
            return enterprise;
        }
        if(type==Enterprise.EnterpriseType.Reen){
            enterprise=new ReenEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseList.add(enterprise);
            return enterprise;
        }
        return enterprise;
    }
}
