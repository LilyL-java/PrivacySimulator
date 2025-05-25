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
    private String username;
    private String password;
    private Date date;
    private static int numAccounts = 0;
    private static final String DEFAULT_NAME = "NULL";
    
    public Account(String lastName, String firstName, Date date, String username, String password) {
        this.lastName= lastName;
        this.firstName = firstName;
        this.username = username;
        this.password = password;
        this.date = date;
        numAccounts++;
    }
    public Account() {
        this.lastName = DEFAULT_NAME;
        this.firstName = DEFAULT_NAME;
        this.username = "User123";
        this.password = "Pass123";
        this.date = new Date();
        numAccounts++;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setName(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public static int getNumAccounts() {
        return numAccounts;
    }
    public String toString() {
        return "Username: " + username;
    }
    public Date getDOB() {
        return date;
    }
}
