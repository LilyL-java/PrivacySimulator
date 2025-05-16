/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342619939
 */
public class Privacy {
    //Privacy is associated with Settings
    private boolean allowDMs; 
    private boolean enableSafeSearch;
    private boolean enableSearchHistory;
    
    //Constructors
    Privacy(boolean allowDMs, boolean enableSafeSearch, boolean enableSearchHistory){
        this.allowDMs = allowDMs;
        this.enableSafeSearch = enableSafeSearch;
        this.enableSearchHistory = enableSearchHistory;
    }
    
    Privacy(){
        this.allowDMs = false;
        this.enableSafeSearch = false;
        this.enableSafeSearch = false;
    }
}
