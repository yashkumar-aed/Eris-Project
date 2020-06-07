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
public class EmployeeDirectory {
 
    private ArrayList<Employee> employeeList;
    private ArrayList<ClaimsManager> claimsmanagerlist;
    private ArrayList<NFRFAidManager> nfrfaidmanagerlist;
    private ArrayList<NFRFInsuranceManager> nfrfinsuranceManager;
    
    

    public EmployeeDirectory() {
        claimsmanagerlist = new ArrayList<ClaimsManager>();
        nfrfaidmanagerlist = new ArrayList<NFRFAidManager>();
        nfrfinsuranceManager = new ArrayList<NFRFInsuranceManager>();
                
                
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public Employee createandaddEmployee(String name){
        Employee em = new Employee();
        em.setName(name);
        employeeList.add(em);
        return em;
    }
    
    public ClaimsManager createandaddClaimsmanager(String name){
        ClaimsManager em = new ClaimsManager();
        em.setName(name);
        claimsmanagerlist.add(em);
        return em;
    }

    public NFRFInsuranceManager createandaddnfrfInsuranceManager (String name){
        NFRFInsuranceManager em = new NFRFInsuranceManager();
        em.setName(name);
        nfrfinsuranceManager.add(em);
        return em;
    }

    public NFRFAidManager createandaddnfrfaidManager (String name){
        NFRFAidManager em = new NFRFAidManager();
        em.setName(name);
        nfrfaidmanagerlist.add(em);
        return em;
    }

    public ArrayList<ClaimsManager> getClaimsmanagerlist() {
        return claimsmanagerlist;
    }

    public void setClaimsmanagerlist(ArrayList<ClaimsManager> claimsmanagerlist) {
        this.claimsmanagerlist = claimsmanagerlist;
    }

    public ArrayList<NFRFAidManager> getNfrfaidmanagerlist() {
        return nfrfaidmanagerlist;
    }

    public void setNfrfaidmanagerlist(ArrayList<NFRFAidManager> nfrfaidmanagerlist) {
        this.nfrfaidmanagerlist = nfrfaidmanagerlist;
    }

    public ArrayList<NFRFInsuranceManager> getNfrfinsuranceManager() {
        return nfrfinsuranceManager;
    }

    public void setNfrfinsuranceManager(ArrayList<NFRFInsuranceManager> nfrfinsuranceManager) {
        this.nfrfinsuranceManager = nfrfinsuranceManager;
    }
 
    
}
