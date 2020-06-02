/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author yashk
 */
public class VolunteersDirectory {
    private ArrayList<Volunteers> volunteersList;

    public VolunteersDirectory() {
        volunteersList = new ArrayList();
    }

    public ArrayList<Volunteers> getParentsList() {
        return volunteersList;
    }
    
    
    public Volunteers createVolunteers(String name){
        Volunteers volunteers = new Volunteers();
        volunteers.setUsername(name);
        volunteersList.add(volunteers);
        return volunteers;
    }
    
    public Volunteers addParents(Volunteers volunteers){
        volunteersList.add(volunteers);
        return volunteers;
    }
}
