/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

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
        ClaimsManager employee = new ClaimsManager();
        employee.setName(name);
        ClaimsManagerList.add(employee);
        return employee;
    }

    public NFRFInsuranceManager createandadNFRFInsuranceManager (String name){
        NFRFInsuranceManager employee = new NFRFInsuranceManager();
        employee.setName(name);
        NFRFInsuranceManagerList.add(employee);
        return employee;
    }

    public NFRFAidManager createandaddNFRFAidManager (String name){
        NFRFAidManager employee = new NFRFAidManager();
        employee.setName(name);
        NFRFAidManagerList.add(employee);
        return employee;
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