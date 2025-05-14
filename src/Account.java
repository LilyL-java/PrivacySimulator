/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lily
 */
public class Account {
    //add stuff here
    private String lastName;
    private String firstName;
    private String ssn;
    private String username;
    private String password;
    private Settings settings;
    private static String defaultName = "NULL";
    
    public Account(String lastName, String firstName, String username, String password, String ssn, Settings settings) {
        this.lastName= lastName;
        this.firstName = firstName;
        this.username = username;
        this.password = password;
        this.ssn = ssn;
        this.settings = settings;
    }
    public Account() {
        this.lastName = defaultName;
        this.firstName = defaultName;
        this.username = "User123";
        this.password = "Pass123";
    }
    
    public String getName() {
        return firstName + " " + lastName;
    }
    public void setName(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public String getSSN() {
        return ssn;
    }
    public void setSSN(String ssn) {
        this.ssn = ssn;
    }
}
