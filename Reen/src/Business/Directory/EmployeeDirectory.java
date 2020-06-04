/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Directory;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;
    private ArrayList<ClaimsManager> ClaimsManagerList;
    private ArrayList<NFRFAidManager> NFRFAidManagerList;
    private ArrayList<NFRFInsuranceManager> NFRFInsuranceManagerList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
        ClaimsManagerList = new ArrayList<ClaimsManager>();
        NFRFAidManagerList = new ArrayList<NFRFAidManager>();
        NFRFInsuranceManagerList = new ArrayList<NFRFInsuranceManager>();


    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public Employee createandaddEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
     public ClaimsManager createandaddClaimsManager(String name){
        ClaimsManager em = new ClaimsManager();
        em.setName(name);
        ClaimsManagerList.add(em);
        return em;
    }

    public NFRFInsuranceManager createandadNFRFInsuranceManager (String name){
        NFRFInsuranceManager em = new NFRFInsuranceManager();
        em.setName(name);
        NFRFInsuranceManagerList.add(em);
        return em;
    }

    public NFRFAidManager createandaddNFRFAidManager (String name){
        NFRFAidManager em = new NFRFAidManager();
        em.setName(name);
        NFRFAidManagerList.add(em);
        return em;
    }

    public ArrayList<ClaimsManager> getClaimsManagerList() {
        return ClaimsManagerList;
    }

    public void setClaimsManagerList(ArrayList<ClaimsManager> ClaimsManagerList) {
        this.ClaimsManagerList = ClaimsManagerList;
    }

    public ArrayList<NFRFAidManager> getNFRFAidManagerList() {
        return NFRFAidManagerList;
    }

    public void setNFRFAidManagerList(ArrayList<NFRFAidManager> NFRFAidManagerList) {
        this.NFRFAidManagerList = NFRFAidManagerList;
    }

    public ArrayList<NFRFInsuranceManager> getNFRFInsuranceManagerList() {
        return NFRFInsuranceManagerList;
    }

    public void setNFRFInsuranceManagerList(ArrayList<NFRFInsuranceManager> insuranceManagerList) {
        this.NFRFInsuranceManagerList = NFRFInsuranceManagerList;
    }
 
}