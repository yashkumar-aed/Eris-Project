/*
 * To change this template, choose Tools | Templates
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
    private String emailId;
    private int funds;
    private String address;
    private int claimsAccountNumber;
    private int bankBalance;
    private String passportNumber;
    private String username;
    private int ownFunds;
    private String docPath;
    private String claimsmanager;
    private String reen;
    private int fundsApproved;

    public int getFundsApproved() {
        return fundsApproved;
    }

    public void setFundsApproved(int fundsApproved) {
        this.fundsApproved = fundsApproved;
    }

    public int getOwnFunds() {
        return ownFunds;
    }

    public void setOwnFunds(int ownFunds) {
        this.ownFunds = ownFunds;
    }

    

    public Claims(String firstName, String emailId) {
        this.firstName = firstName;
        this.emailId = emailId;
        Random rand =  new Random();
        this.claimsAccountNumber = rand.nextInt(100000000);
    }

    public String getReen() {
        return reen;
    }

    public void setReen(String reen) {
        this.reen = reen;
    }


    public String getClaimsmanager() {
        return claimsmanager;
    }

    public void setClaimsmanager(String claimsmanager) {
        this.claimsmanager = claimsmanager;
    }
    

    public int getClaimsAccountNumber() {
        return claimsAccountNumber;
    }

    public void setClaimsAccountNumber(int claimsAccountNumber) {
        this.claimsAccountNumber = claimsAccountNumber;
    }

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }
    

    public Claims() {
        this.firstName = new String();
        this.emailId = new String();
        this.lastName = new String();
        this.address = new String();
        this.funds = 0;
        this.passportNumber = new String();
        this.docPath = new String();
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
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

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDocPath() {
        return docPath;
    }

    public void setDocPath(String docPath) {
        this.docPath = docPath;
    }

    
    public void addValues(String emailId, int funds, String address, String passportNumber, String docPath) {
        this.emailId = emailId;
        this.funds = funds;
        this.address = address;
        this.passportNumber = passportNumber;
        this.docPath = docPath;
        
    }
    
    public void addValues1(String emailId, int funds, String address, String passportNumber, String docPath) {
        this.emailId = emailId;
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