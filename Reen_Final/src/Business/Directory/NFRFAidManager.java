/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Directory;

import java.util.ArrayList;

/**
 *
 * @author yashk
 */
public class NFRFAidManager extends Employee{

   public String nfrfaidName;
   public int workRequestcount;
   public int maxFunding;
   public String location;
   

    public NFRFAidManager(String NfrfAidname, int workRequestcount, int maxFunding, String location) {
        super();
        this.nfrfaidName = NfrfAidname;
        this.workRequestcount = workRequestcount;
        this.maxFunding = maxFunding;
        this.location = location;
    }
    
    public NFRFAidManager() {
        super();
        this.nfrfaidName = new String();
        this.workRequestcount = new Integer(100);
        this.maxFunding = new Integer(100);
        this.location = location;
    }

    public String getNfrfaidName() {
        return nfrfaidName;
    }

    public void setNfrfaidName(String nfrfaidName) {
        this.nfrfaidName = nfrfaidName;
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
