/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Directory;

import java.util.Random;



/**
 *
 * @author yashk
 */
public class Volunteers {
    
    private String imgPath;
    private String firstName;
    private String lastName;
     private int funds;
    private int remainingFunds;

    private String address;
    private String claimsmanagr;
    private int currentFunds;
    private String username;
    private Responders responder;
    private int volunteerId;
    private boolean isAvailable;
    private static int count = new Random().nextInt(100);
    private String email;
    private String password;
    private String contactVolunteer;

    public int getRemainingFunds() {
        return remainingFunds;
    }

    public void setRemainingFunds(int remainingFunds) {
        this.remainingFunds = remainingFunds;
    }
    
    public String getContactVolunteer() {
        return contactVolunteer;
    }

    public void setContactVolunteer(String contactVolunteer) {
        this.contactVolunteer = contactVolunteer;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Responders getResponder() {
        return responder;
    }

    public void setResponder(Responders responder) {
        this.responder = responder;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public int getCurrentFunds() {
        return currentFunds;
    }

    public void setCurrentFunds(int currentFunds) {
        this.currentFunds = currentFunds;
    }

    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Volunteers(String username, String email, String password) {
        volunteerId = count;
        count++;
        this.email = email;
        this.password = password;
        this.username = username;
    
    }

    public String getEmail() {
        return email;
    }

    public String getClaimsmanagr() {
        return claimsmanagr;
    }

    public void setClaimsmanagr(String claimsmanagr) {
        this.claimsmanagr = claimsmanagr;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Volunteers() {
        volunteerId = count;
        count++;
        this.email =new String();
        this.password = new String();
        this.username = new String();
   
        this.claimsmanagr = new String();
        this.isAvailable = false;
        
    }

    public int getVolunteerId() {
        return volunteerId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getUsername() {
        return username;
    }
    
    public void setAllValues(String username, String firstName, String LastName, String email,   int funds, String address, String imgPath, String contact) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = LastName;
        this.email = email;
         this.funds = funds;
        this.address = address;
        this.imgPath = imgPath;
        this.contactVolunteer = contact;
    }
    
    @Override
    public String toString() {
        return username;
    }

}
