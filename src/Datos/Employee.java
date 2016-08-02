/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Date;

/**
 *
 * @author Nicolas
 */
public abstract class Employee extends Person {
    
    protected Date hiringDate;

    public Employee(Date hiringDate, String id, String name) {
        super(id, name);
        this.hiringDate = hiringDate;
    }

    public Date getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }
    
    public abstract float paySalary();

    @Override
    public String toString() {
        return super.toString()+ "," + hiringDate.toString();
    }
   
    
}
