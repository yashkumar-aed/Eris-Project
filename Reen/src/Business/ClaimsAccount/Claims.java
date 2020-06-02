/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ClaimsAccount;

import java.util.Random;

/**
 *
 * @author yashk
 */
public class Claims {
    
    private String firstName;
    private String lastName;
    private int funds;
    private String address;
    private int claimsAccountNumber;
    private int accountBalance;
    private String passportNumber;
    private String username;
    private int ownFunds;
    private String docPath;
    private String claimsManager;
    private String reen;
    private int fundsApproved; 

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    
    
     public Claims(String firstName) {
        this.firstName = firstName;
        Random rand =  new Random();
        this.claimsAccountNumber = rand.nextInt(100000000);
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getClaimsAccountNumber() {
        return claimsAccountNumber;
    }

    public void setClaimsAccountNumber(int claimsAccountNumber) {
        this.claimsAccountNumber = claimsAccountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    
    
    public Claims() {
        this.firstName = new String();
        this.lastName = new String();
        this.address = new String();
        this.funds = 0;
        this.passportNumber = new String();
        this.docPath = new String();
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getOwnFunds() {
        return ownFunds;
    }

    public void setOwnFunds(int ownFunds) {
        this.ownFunds = ownFunds;
    }

    public String getDocPath() {
        return docPath;
    }

    public void setDocPath(String docPath) {
        this.docPath = docPath;
    }

    public String getClaimsManager() {
        return claimsManager;
    }

    public void setClaimsManager(String claimsManager) {
        this.claimsManager = claimsManager;
    }

    public String getReen() {
        return reen;
    }

    public void setReen(String reen) {
        this.reen = reen;
    }

    public int getFundsApproved() {
        return fundsApproved;
    }

    public void setFundsApproved(int fundsApproved) {
        this.fundsApproved = fundsApproved;
    }
    
    public void addValues(int funds, String address, String passportNumber, String docPath) {
        this.funds = funds;
        this.address = address;
        this.passportNumber = passportNumber;
        this.docPath = docPath;
        
    }
    
    public void addValues1(int funds, String address, String passportNumber, String docPath) {
        this.ownFunds = funds;
        this.address = address;
        this.passportNumber = passportNumber;
        this.docPath = docPath;
        
    }
     @Override
    public String toString() {
        return firstName;
    }
}
