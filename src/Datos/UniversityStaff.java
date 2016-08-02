package Datos;

import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class UniversityStaff {
    
    private ArrayList<Person> payroll;

    public UniversityStaff() {
        this.payroll = new ArrayList<Person>();
    }
    
    public void addPerson(Person person){
        this.payroll.add(person);
    }
       
}
