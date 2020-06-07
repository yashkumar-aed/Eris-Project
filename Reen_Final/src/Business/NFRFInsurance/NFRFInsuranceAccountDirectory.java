/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NFRFInsurance;

import Business.Directory.Volunteers;
import java.util.ArrayList;

/**
 *
 * @author yashk
 */
public class NFRFInsuranceAccountDirectory {
        private ArrayList<NFRFInsurance> insuranceList;

    public NFRFInsuranceAccountDirectory() {
        insuranceList = new ArrayList();
    }

    public ArrayList<NFRFInsurance> getInsuranceList() {
        return insuranceList;
    }
 
    public NFRFInsurance addInsurance(NFRFInsurance ins){
        insuranceList.add(ins);
        return ins;
    }
}
