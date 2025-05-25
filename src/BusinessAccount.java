/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342619939
 */
public class BusinessAccount extends Account {
    private boolean enableAds;
    private int dailyInteractions;
    /**
     * This constructor makes a business account (child class of Account)
     * @param lastName
     * @param firstName
     * @param date
     * @param username
     * @param password
     * @param enableAds
     * @param dailyInteractions 
     */
    public BusinessAccount(String lastName, String firstName, Date date, String username, String password, boolean enableAds, int dailyInteractions) {
        super(lastName, firstName, date, username, password);
        this.enableAds = enableAds;
        this.dailyInteractions = dailyInteractions;
    }
    /**
     * This constructor makes a business account preset
     */
    public BusinessAccount() {
        super();
        this.enableAds = false;
        this.dailyInteractions = 0;
    }
    /**
     * This method enables/disables user's choice to enable ads or not
     * @param choice
     */
    public void enableAds(boolean choice) {
        if (choice == false) {
            this.enableAds = false;
        } else {
            this.enableAds = true;
        }
    }
    /**
     * This method sets user's username using super
     * @param username 
     */
    public void setUsername(String username) {
        super.setUsername(username);
    }
    @Override
    /**
     * This method retrieves user's username using the super and formatting with "Business' name is "and overrides Account getUsername()
     */
    public String getUsername() {
        return "Business' name is " + super.getUsername();
    }
    /**
     * This method sets user's daily interactions 
     * @param number 
     */
    public void setDailyInteractions(int number) {
        this.dailyInteractions = number;
    }
    /**
     * This method returns user's daily interactions
     * @return Returns user's daily interactions
     */
    public int getDailyInteractions() {
        return dailyInteractions;
    }
    /**
     * This method sets user's password using super
     * @param newPass 
     */
    public void setPassword(String newPass) {
        super.setPassword(newPass);
    }
    /**
     * This method retrieves user's password using super
     * @return Returns user's password
     */
    public String getPassword() {
        return super.getPassword();
    }
    /**
     * This method retrieves user's choice of enabling ads or not
     * @return Returns choice to enable ads or not
     */
    public boolean getChoice() {
        return enableAds;
    }
}
