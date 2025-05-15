/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342619939
 */
public class Security {
    private boolean privateAccount;
    private String newPassword;
    private boolean enableVerification;
    
    public Security(boolean privateAccount, String newPassword, boolean enableVerification) {
        this.privateAccount = privateAccount;
        this.newPassword = newPassword;
        this.enableVerification = enableVerification;
    }
    public Security() {
        this.privateAccount = false;
        this.newPassword = "NULL";
        this.enableVerification = false;
    }
    public String getNewPassword() {
        return newPassword;
    }
    public void setPrivateAccount() {
        
    }
}
