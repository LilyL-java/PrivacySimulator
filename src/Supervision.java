/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342619939
 */
public class Supervision {
    //Supervision is associated with settings class
    private boolean parentalControls; 
    private int accessPin; 
    
    //Constructors 
    Supervision(boolean parentalControls, int accessPin){
        this.parentalControls = parentalControls;
        this.accessPin = accessPin; 
    }
    
    Supervision(){
        this.parentalControls = false;
        this.accessPin = 1234; 
    }
}
