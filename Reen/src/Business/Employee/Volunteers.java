/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

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
    private String claimsmanager;
    private int currentFunds;
    private String username;
    private Responders responders;
    private int volunteersId;
    private boolean isAvailable;
    private static int count = new Random().nextInt(100);
    private String password;
    private String contactVolunteers;


    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public int getRemainingFunds() {
        return remainingFunds;
    }

    public void setRemainingFunds(int remainingFunds) {
        this.remainingFunds = remainingFunds;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClaimsmanager() {
        return claimsmanager;
    }

    public void setClaimsmanager(String claimsmanager) {
        this.claimsmanager = claimsmanager;
    }

    public int getCurrentFunds() {
        return currentFunds;
    }

    public void setCurrentFunds(int currentFunds) {
        this.currentFunds = currentFunds;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Responders getResponders() {
        return responders;
    }

    public void setResponders(Responders responders) {
        this.responders = responders;
    }

    public int getVolunteersId() {
        return volunteersId;
    }

    public void setVolunteersId(int volunteersId) {
        this.volunteersId = volunteersId;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public static int getCount() {
        return count;
    }

    public Volunteers(String username, String email, String password) {
        volunteersId = count;
        count++;
        this.password = password;
        this.username = username;
        
        this.claimsmanager = new String();
        this.isAvailable = false;
    }

    public static void setCount(int count) {
        Volunteers.count = count;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Volunteers(String username, String password) {
        volunteersId = count;
        count++;
        this.password = password;
        this.username = username;
       
        this.claimsmanager = new String();
        this.isAvailable = false;
    }
    public String getContactVolunteers() {
        return contactVolunteers;
    }

   
     public Volunteers() {
        volunteersId = count;
        count++;
        this.password = new String();
        this.username = new String();
        
        this.claimsmanager = new String();
        this.isAvailable = false;
        
    }
    public void setAllValues(String username, String firstName, String LastName, String email, String blood, int funds, String address, String imgPath, String contact) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = LastName;
        this.funds = funds;
        this.address = address;
        this.imgPath = imgPath;
        this.contactVolunteers = contact;
    }

    public void setContactVolunteers(String contactVolunteers) {
        this.contactVolunteers = contactVolunteers;
    }
    @Override
    public String toString() {
        return username;
    }
}
