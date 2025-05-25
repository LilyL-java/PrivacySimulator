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
    /**
     * This constructor makes a parent class account
     * @param lastName
     * @param firstName
     * @param date
     * @param username
     * @param password 
     */
    public Account(String lastName, String firstName, Date date, String username, String password) {
        this.lastName= lastName;
        this.firstName = firstName;
        this.username = username;
        this.password = password;
        this.date = date;
        numAccounts++;
    }
    /**
     * This constructor makes parent class account preset
     */
    public Account() {
        this.lastName = DEFAULT_NAME;
        this.firstName = DEFAULT_NAME;
        this.username = "User123";
        this.password = "Pass123";
        this.date = new Date();
        numAccounts++;
    }
    /**
     * This method returns user's first name
     * @return Returns user's first name
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * This method returns user's last name
     * @return Returns user's last name
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * This method sets user's first and last name
     * @param lastName
     * @param firstName 
     */
    public void setName(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    /**
     * This method returns user's username
     * @return Returns user's username
     */
    public String getUsername() {
        return username;
    }
    /**
     * This method sets user's username
     * @param username 
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * This method returns user's username
     * @return Returns user's username
     */
    public String getPassword() {
        return password;
    }
    /**
     * This method sets user's password
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * This method returns the number of accounts
     * @return Number of total accounts
     */
    public static int getNumAccounts() {
        return numAccounts;
    }
    /**
     * This method formats user's name
     * @return Returns username in a formatted way
     */
    public String toString() {
        return "Username: " + username;
    }
    /**
     * This method returns user's date of birth
     * @return Returns user's date of birth
     */
    public Date getDOB() {
        return date;
    }
}
