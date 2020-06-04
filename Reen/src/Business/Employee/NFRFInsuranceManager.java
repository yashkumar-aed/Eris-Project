/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author yashk
 */
public class NFRFInsuranceManager extends Employee{
/*
    void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   */
   public String NFRFInsuranceName;

    public String getNFRFInsuranceName() {
        return NFRFInsuranceName;
    }

    public void setNFRFInsuranceName(String NFRFInsuranceName) {
        this.NFRFInsuranceName = NFRFInsuranceName;
    }

    public int getWorkRequestcount() {
        return workRequestcount;
    }

    public void setWorkRequestcount(int workRequestcount) {
        this.workRequestcount = workRequestcount;
    }

    public int getMaxFunding() {
        return maxFunding;
    }

    public void setMaxFunding(int maxFunding) {
        this.maxFunding = maxFunding;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
   public int workRequestcount;
   public int maxFunding;
   public String location;

    
}
