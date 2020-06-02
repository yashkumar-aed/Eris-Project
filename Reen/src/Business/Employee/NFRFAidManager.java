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
public class NFRFAidManager extends Employee {
    
/*
    void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  */
   public String NFRFName;
   public int workRequestcount;
   public int maxFunding;
   public String location;

   
   public NFRFAidManager(String NFRFName, int workRequestcount, int maxFunding, String location) {
        super();
        this.NFRFName = NFRFName;
        this.workRequestcount = workRequestcount;
        this.maxFunding = maxFunding;
        this.location = location;
    }
    
    public NFRFAidManager() {
        super();
        this.NFRFName = new String();
        this.workRequestcount = new Integer(100);
        this.maxFunding = new Integer(100);
        this.location = location;
    }
    
    
    public String getNFRFName() {
        return NFRFName;
    }

    public void setNFRFName(String NFRFName) {
        this.NFRFName = NFRFName;
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
}
