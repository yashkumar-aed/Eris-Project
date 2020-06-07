/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Directory.*;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
  
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role, String network){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createClaimManagrUserAccount(String username, String password, ClaimsManager employee, Role role, String network){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setClaimmanagr(employee);
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount createNFRFAidManagerUserAccount(String username, String password, NFRFAidManager employee, Role role,String network){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setBankManager(employee);
        userAccount.setRole(role);
         userAccount.setNetwork(network);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount createNFRFInsuranceManagerUserAccount(String username, String password, NFRFInsuranceManager employee, Role role, String network){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setInsuranceManager(employee);
        userAccount.setRole(role);
         userAccount.setNetwork(network);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount createUserAccountVolunteer(String username, String password, Volunteers volu, Role role, String network){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setVolunteer(volu);
        
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createUserAccountResponder(String name,String username, String password, Responders respon, Role role, String network){
        UserAccount userAccount = new UserAccount();
        userAccount.setName(name);
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setResponder(respon);
        
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    public void deleteUserAccount(UserAccount userAccount)
    {
        userAccountList.remove(userAccount);
    }
}
