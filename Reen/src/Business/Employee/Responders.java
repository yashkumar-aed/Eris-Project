/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

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
    private String Reen;
    private String imgPath;
    private String firstName;
    private String lastName;
    private int typeL = 0;
    

    private String address;
    private String claimsmanager;
    private ArrayList<Volunteers> acceptedVolunteers;
    private NFRFInsurance insurance;
    private Volunteers finalVolunteer;
    private Claims claimsaccount;

 

   
    private int requiredFund;
   

    private int claimsRequestAmount;
    private int claimsAmountApproved;
    //private int requiredFund;   //Total Cost
    private int insuranceAmount; //Amount of insurance approved
    private int bankBalance; // Amount for personal bank balance

    private int volunteersAidfund; // Amount transferred from volunteers
    private int netfunding; // Net Funding required

    private int ownFunds;

    private String contactResponders;

    public String getContactResponders() {
        return contactResponders;
    }

    public void setContactResponders(String contactResponders) {
        this.contactResponders = contactResponders;
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
            netfunding = requiredFund - (bankBalance + volunteersAidfund);
        }
        return netfunding;
    }

    public int getLoanRequestAmount() {
        return claimsRequestAmount;
    }

    public int getLoanAmountApproved() {
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

    public int getVolunteersAidfund() {
        return volunteersAidfund;
    }

    public void setVolunteersAidfund(int volunteersAidfund) {
        this.volunteersAidfund = volunteersAidfund;
    }

    public Volunteers getFinalizedVolunteers() {
        return finalVolunteer;
    }

    public void setFinalizedVolunteers(Volunteers finalVolunteer) {
        this.finalVolunteer = finalVolunteer;
    }

    public Claims getClaimsaccount() {
        return claimsaccount;
    }

    public void setClaimsaccount(Claims claimsaccount) {
        this.claimsaccount = claimsaccount;
    }
    
    public ArrayList<Volunteers> getAcceptedVolunteers() {
        return acceptedVolunteers;
    }

    public void setAcceptedVolunteers(ArrayList<Volunteers> acceptedVolunteers) {
        this.acceptedVolunteers = acceptedVolunteers;
    }

    public String getAddress() {
        return address;
    }

    public String getClaimsManager() {
        return claimsmanager;
    }

    public void setClaimsManager(String claimsmanager) {
        this.claimsmanager = claimsmanager;
    }

    public NFRFInsurance getInsurance() {
        return insurance;
    }

    public void setNFRFInsurance(NFRFInsurance insurance) {
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
        this.Reen =new String();
        this.emailId =new String();
        this.password =new String();
        this.username =new String();
        this.claimsaccount = new Claims();
        this.insurance = new NFRFInsurance();
        acceptedVolunteers = new ArrayList<Volunteers>();
        this.requiredFund =0;
        this.insuranceAmount =0;
        this.bankBalance = 0;
        this.volunteersAidfund =0;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReen() {
        return Reen;
    }

    public void setReen(String Reen) {
        this.Reen = Reen;
    }

  

    public void setAllValues(String username, String firstName, String LastName, String email, String blood, String contact, String address, String imgPath) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = LastName;
        this.contactResponders= contact;
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

    public void setClaimsmanager(Object name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAllValues(String text, String text0, String text1, String text2, String text3, String path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

