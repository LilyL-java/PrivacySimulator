/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342619939
 */
public class ClassSettings {
    private boolean updated;
    private Security isSecure;
    private Privacy isPrivate;
    private Supervision hasParentalVision;
    
    public ClassSettings(boolean updated, Security isSecure, Privacy isPrivate, Supervision hasParentalVision) {
        this.updated = updated;
        this.isSecure = isSecure;
        this.isPrivate = isPrivate;
        this.hasParentalVision = hasParentalVision;
    }
}
