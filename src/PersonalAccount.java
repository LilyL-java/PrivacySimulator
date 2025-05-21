/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lily
 */
public class PersonalAccount extends Account {
    private boolean enableDM;
    private int timeOnline;
    private String username;
    
    public PersonalAccount(String lastName, String firstName, String username, String password, boolean enableDM, int timeOnline) {
        super(lastName, firstName, username, password);
        this.enableDM = enableDM;
        this.timeOnline = timeOnline;
    }
    public PersonalAccount() {
        super();
        this.enableDM = false;
        this.timeOnline = 0;
        this.username = "NULL";
    }
    public void enableDM(boolean choice) {
        if (choice == true) {
            this.enableDM = true;
        }
        else {
            this.enableDM = false;
        }
    }
    @Override
    public String getUsername() {
        return "Your display name is " + username;
    }
    
    public void setUsername(String name) {
        this.username = name;
    }
    public void setPassword(String newPass) {
        super.setPassword(newPass);
    }
    public String getPassword() {
        return super.getPassword();
    }
}
