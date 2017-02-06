/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.p
 */
package lab4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tmorales3
 */
public class HrManager {
    private List<Employee> employees;
    private EmployeeReference er;
    
    public HrManager()
    {
        employees = new ArrayList();
        
    }
    
    public void hireEmployee(String firstName, String lastName, String ssn, String cubeID)
    {
        
        Employee e = new Employee(firstName, lastName, ssn);
        er = new EmployeeReference(e);
        if(er.vouchedForHire())
        {
            employees.add(e);
            e.doFirstTimeOrientation(cubeID);
        }
        else
        {
            return;
        }
    }
}
