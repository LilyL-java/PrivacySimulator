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
    private Settings settings;
    private static final String DEFAULT_NAME = "NULL";
    
    public Account(String lastName, String firstName, String username, String password, Settings settings) {
        this.lastName= lastName;
        this.firstName = firstName;
        this.username = username;
        this.password = password;
        this.settings = settings;
    }
    public Account() {
        this.lastName = DEFAULT_NAME;
        this.firstName = DEFAULT_NAME;
        this.username = "User123";
        this.password = "Pass123";
        this.settings = new Settings();
    }
    
    public String getName() {
        return firstName + " " + lastName;
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
    public void setPassword(String password) {
        this.password = password;
    }
}
