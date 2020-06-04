/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Directory.NFRFAidManager;
import Business.Directory.Volunteers;
import Business.Directory.NFRFInsuranceManager;
import Business.Directory.Employee;
import Business.Directory.ClaimsManager;
import Business.Directory.Responders;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
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
    
    public UserAccount createClaimsManagerUserAccount(String username, String password, ClaimsManager employee, Role role, String network){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setClaimsmanager(employee);
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public UserAccount createNFRFAidManagerUserAccount(String username, String password, NFRFAidManager employee, Role role,String network){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setNfrfaid(employee);
        userAccount.setRole(role);
         userAccount.setNetwork(network);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount createNFRFInsuranceManagerUserAccount(String username, String password, NFRFInsuranceManager employee, Role role, String network){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setNfrfinsurance(employee);
        userAccount.setRole(role);
         userAccount.setNetwork(network);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createUserAccountVolunteers(String username, String password, Volunteers volunteers, Role role, String network){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setVolunteers(volunteers);
        
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createUserAccountResponders(String name,String username, String password, Responders responders, Role role, String network){
        UserAccount userAccount = new UserAccount();
        userAccount.setName(name);
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setResponders(responders);
        
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
