/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ClaimsAccount;

import Business.Directory.Volunteers;
import java.util.ArrayList;

/**
 *
 * @author yashk
 */
public class ClaimsAccountDirectory {
        private ArrayList<Claims> claimsList;

    public ClaimsAccountDirectory() {
        claimsList = new ArrayList();
    }

    public ArrayList<Claims> getLoanAccountList() {
        return claimsList;
    }
    
    
    public Claims addLoan(Claims claim){
        claimsList.add(claim);
        return claim;
    }
}
