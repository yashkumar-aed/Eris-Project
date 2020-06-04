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
public class RespondersDirectory {
    
    private ArrayList<Responders> respondersList;

    public RespondersDirectory() {
        respondersList = new ArrayList();
    }

    public ArrayList<Responders> getRespondersList() {
        return respondersList;
    }
    
    public Responders createBirthMother(String name){
        Responders responders = new Responders();
        responders.setUsername(name);
        respondersList.add(responders);
        return responders;
    }
    
    public void addResponders(Responders r){
        this.respondersList.add(r);
    }

  
}
