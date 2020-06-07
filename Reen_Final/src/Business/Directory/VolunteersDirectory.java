/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Directory;

import java.util.ArrayList;

/**
 *
 * @author yashk
 */
public class VolunteersDirectory {
    
    private ArrayList<Volunteers> volunteerList;

    public VolunteersDirectory() {
        volunteerList = new ArrayList();
    }

    public ArrayList<Volunteers> getVolunteerList() {
        return volunteerList;
    }
    
    
    public Volunteers createVolunteer(String name){
        Volunteers vol = new Volunteers();
        vol.setUsername(name);
        volunteerList.add(vol);
        return vol;
    }
    
    public Volunteers addVolunteer(Volunteers volunteer){
        volunteerList.add(volunteer);
        return volunteer;
    }
}