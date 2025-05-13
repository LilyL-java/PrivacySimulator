/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lily
 */
public class Person {
    private String lastName;
    private String firstName;
    private Date dob;
    private String ssn;
    
    public Person(String lastName, String firstName, Date dob, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dob = dob;
        this.ssn = ssn;
    }
    public Person() {
        this.lastName = "Null";
        this.firstName = "Null";
        this.dob = new Date(00,00,0000);
        this.ssn = "Null";
    }
    public String getName() {
        return firstName + " " + lastName;
    }
    public void setName(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public Date getDOB() {
        return dob;
    }
    public void setDOB(Date dob) {
        this.dob = dob;
    }
    public String getSSN() {
        return ssn;
    }
    public void setSSN(String ssn) {
        this.ssn = ssn;
    }
}
