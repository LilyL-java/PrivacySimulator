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
    
    public PersonalAccount(String lastName, String firstName, String password, Settings settings, boolean enableDM, int timeOnline, String displayName) {
        super(lastName, firstName, displayName, password);
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
}
