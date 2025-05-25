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
    /**
     * This constructor makes personal account (child class of Account)
     * @param lastName
     * @param firstName
     * @param date
     * @param username
     * @param password
     * @param enableDM
     * @param timeOnline 
     */
    public PersonalAccount(String lastName, String firstName, Date date, String username, String password, boolean enableDM, int timeOnline) {
        super(lastName, firstName, date, username, password);
        this.enableDM = enableDM;
        this.timeOnline = timeOnline;
    }
    /**
     * This constructor makes personal account preset
     */
    public PersonalAccount() {
        super();
        this.enableDM = false;
        this.timeOnline = 0;
    }
    /**
     * This method puts whether or not user's DMs are enabled
     * @param choice 
     */
    public void enableDM(boolean choice) {
        if (choice == true) {
            this.enableDM = true;
        }
        else {
            this.enableDM = false;
        }
    }
    @Override
    /**
     * This method is overriden method of Account to put display name instead
     */
    public String getUsername() {
        return "Display name is " + super.getUsername();
    }
    /**
     * This method sets user's username using super
     * @param name 
     */
    public void setUsername(String name) {
        super.setUsername(name);
    }
    /**
     * This method sets user's password using super
     * @param newPass 
     */
    public void setPassword(String newPass) {
        super.setPassword(newPass);
    }
    /**
     * This method returns user's password using super
     * @return Returns user's password
     */
    public String getPassword() {
        return super.getPassword();
    }
    /**
     * This method returns user's choice of enabling DM
     * @return Returns their choice of enabling DM or not
     */
    public boolean getChoice() {
        return enableDM;
    }
    /**
     * This method returns user's time set online
     * @return Returns user's time online
     */
    public int getTimeOnline() {
        return timeOnline;
    }
}
