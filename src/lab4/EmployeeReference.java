/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author tmorales3
 */
public class EmployeeReference {
    private Employee employee;
    
    public EmployeeReference(Employee employee)
    {
        this.employee = employee;
    }
    
    public boolean vouchedForHire()
    {
        return true;
    }
}
