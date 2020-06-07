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
public class RespondersDirectory {
    
    private ArrayList<Responders> responderList;

    public RespondersDirectory() {
        responderList = new ArrayList();
    }

    public ArrayList<Responders> getResponderList() {
        return responderList;
    }
    
    public Responders createResponder(String name){
        Responders responder = new Responders();
        responder.setUsername(name);
        responderList.add(responder);
        return responder;
    }
    
    public void addResponder(Responders BM){
        this.responderList.add(BM);
    }

  
}