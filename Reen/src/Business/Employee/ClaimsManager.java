/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.time.LocalTime;

/**
 *
 * @author yashk
 */


public class ClaimsManager {

    public ClaimsManager(int ratingReviews, boolean isAvailable, LocalTime availableTime) {
        super();
        this.ratingReviews = ratingReviews;
        this.isAvailable = isAvailable;
        this.availableTime = availableTime;
        
    }
    
    public ClaimsManager(){
        super();
        this.isAvailable = true;
        this.availableTime = LocalTime.MIN;
       
    }
    public int getWorkRequestCount() {
        return workRequestCount;
    }

    public void setWorkRequestCount(int workRequestCount) {
        this.workRequestCount = workRequestCount;
    }

    public int getRatingReviews() {
        return ratingReviews;
    }

    public void setRatingReviews(int ratingReviews) {
        this.ratingReviews = ratingReviews;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public LocalTime getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(LocalTime availableTime) {
        this.availableTime = availableTime;
    }
   private int workRequestCount;
   private int ratingReviews;
   private boolean isAvailable;
   private LocalTime availableTime;

    void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
