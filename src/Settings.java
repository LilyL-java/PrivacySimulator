/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342619939
 */
public class Settings {
    private Security isSecure;
    private Privacy isPrivate;
    private Supervision hasParentalVision;
    
    public Settings(Security isSecure, Privacy isPrivate, Supervision hasParentalVision) {
        this.isSecure = isSecure;
        this.isPrivate = isPrivate;
        this.hasParentalVision = hasParentalVision;
    }
    public Settings() {
        this.isSecure = new Security();
        this.isPrivate = new Privacy();
        this.hasParentalVision = new Supervision();
    }
}
