/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Directory;

import Business.ClaimsAccount.Claims;
import Business.NFRFInsurance.NFRFInsurance;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author yashk
 */
public class Responders {
   
    private String username;
    private int id;
    private static int count = new Random().nextInt(100);
    private String emailId;
    private String password;
    private String branch;
    private String imgPath;
    private String firstName;
    private String lastName;
    private int typeL = 0;
    

    private String address;
    private String claimsmanagr;
    private ArrayList<Volunteers> acceptedVolunteer;
    private NFRFInsurance insurance;
    private Volunteers finalizedVolunteer;
    private Claims claimaccount;

 

   
    private int requiredFund;
   

    private int claimsRequestAmount;
    private int claimsAmountApproved;
    private int insuranceAmount; 
    private int bankBalance; 

    private int volunteerAidfund; 
    private int netfunding; 

    private int ownFunds;

    private String contactResponder;

    public String getContactResponder() {
        return contactResponder;
    }

    public void setContactResponder(String contactResponder) {
        this.contactResponder = contactResponder;
    }


    public int getRequiredFund() {
        return requiredFund;
    }

    public int getOwnFunds() {
        return ownFunds;
    }

    public int getTypeL() {
        return typeL;
    }

    public void setTypeL(int typeL) {
        this.typeL = typeL;
    }

    public void setOwnFunds(int ownFunds) {
        this.ownFunds = ownFunds;
    }
    
    public void setRequiredFund(int requiredFund) {
        this.requiredFund = requiredFund;
    }


    public int getNetFunding(){
        if (requiredFund !=0 && bankBalance!=0){
            netfunding = requiredFund - (bankBalance + volunteerAidfund);
        }
        return netfunding;
    }

    public int getClaimsRequestAmount() {
        return claimsRequestAmount;
    }

    public int getClaimsAmountApproved() {
        return claimsAmountApproved;
    }


    public void setClaimsRequestAmount(int claimsRequestAmount) {
        this.claimsRequestAmount = claimsRequestAmount;
    }

    public void setClaimsAmountApproved(int claimsAmountApproved) {
        this.claimsAmountApproved = claimsAmountApproved;
    }

    public void setNetfunding(int netfunding) {
        this.netfunding = netfunding;
    }
    
   
    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }

    public int getVolunteerAidfund() {
        return volunteerAidfund;
    }

    public void setVolunteerAidfund(int volunteerAidfund) {
        this.volunteerAidfund = volunteerAidfund;
    }

    public Volunteers getFinalizedVolunteer() {
        return finalizedVolunteer;
    }

    public void setFinalizedVolunteer(Volunteers finalizedVolunteer) {
        this.finalizedVolunteer = finalizedVolunteer;
    }

    public Claims getClaimaccount() {
        return claimaccount;
    }

    public void setClaimaccount(Claims claimaccount) {
        this.claimaccount = claimaccount;
    }
    
    public ArrayList<Volunteers> getAcceptedVolunteer() {
        return acceptedVolunteer;
    }

    public void setAcceptedVolunteer(ArrayList<Volunteers> acceptedVolunteer) {
        this.acceptedVolunteer = acceptedVolunteer;
    }

    public String getAddress() {
        return address;
    }

    public String getClaimsmanagr() {
        return claimsmanagr;
    }

    public void setClaimsmanagr(String claimsmanagr) {
        this.claimsmanagr = claimsmanagr;
    }

    public NFRFInsurance getInsurance() {
        return insurance;
    }

    public void setInsurance(NFRFInsurance insurance) {
        this.insurance = insurance;
    }

    public int getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(int insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public void setAddress(String address) {
        this.address = address;
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

   

    
    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
    

    public Responders() {
        id = count;
        count++;
        this.branch =new String();
        this.emailId =new String();
        this.password =new String();
        this.username =new String();
        this.claimaccount = new Claims();
        this.insurance = new NFRFInsurance();
        acceptedVolunteer = new ArrayList<Volunteers>();
        this.requiredFund =0;
        this.insuranceAmount =0;
        this.bankBalance = 0;
        this.volunteerAidfund =0;
        this.netfunding = 0;
                
    }


    public int getId() {
        return id;
    }

    public void setUsername(String name) {
        this.username = name;
    }
    
    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return username;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

  

    public void setAllValues(String username, String firstName, String LastName, String email, String contact, String address, String imgPath) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = LastName;
        this.emailId = email;
        //this.bankBalance = fund;
        this.contactResponder = contact;
        this.address = address;
        this.imgPath = imgPath;
       
    }
   public void setValues(String firstName, String LastName, String email, int bankBalance, String address) {
       this.firstName = firstName;
        this.lastName = LastName;
       this.emailId = email;
      this.ownFunds = bankBalance;
     this.bankBalance = bankBalance;
        this.address = address;
       this.imgPath = imgPath;
 } 
   
}
