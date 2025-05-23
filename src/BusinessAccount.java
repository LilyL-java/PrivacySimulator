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
    private String username;
    private int dailyInteractions;
    
    public BusinessAccount(String lastName, String firstName, String username, String password, boolean enableAds, int dailyInteractions) {
        super(lastName, firstName, username, password);
        this.enableAds = enableAds;
        this.dailyInteractions = dailyInteractions;
    }
    public BusinessAccount() {
        super();
        this.enableAds = false;
        this.dailyInteractions = 0;
    }
    
    public void enableAds(boolean choice) {
        if (choice == false) {
            this.enableAds = false;
        } else {
            this.enableAds = true;
        }
    }
    public void setUsername(String businessName) {
        this.username = businessName;
    }
    @Override
    public String getUsername() {
        return "Your business' name is " + username;
    }
    public void setDailyInteractions(int number) {
        this.dailyInteractions = number;
    }
    public int getDailyInteractions() {
        return dailyInteractions;
    }
    public void setPassword(String newPass) {
        super.setPassword(newPass);
    }
    public String getPassword() {
        return super.getPassword();
    }
    @Override
    public String toString() {
        return "Business name: " + username;
    }
}
