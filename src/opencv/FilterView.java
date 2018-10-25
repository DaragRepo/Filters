/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv;

import javafx.scene.control.RadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;

/**
 *
 * @author moh
 */
public class FilterView extends JPanel  {
    
    private ButtonGroup btnGroup ;
    private RadioButton radioButton;
    private final String arr [] = {"Gaussian", "Blur"};
    
    public FilterView () {
        
        for (int i = 0 ; i  < arr.length ; i++) {
            radioButton = new RadioButton(arr[i]);
        }
        
       

    }
    
    
    
    
    
    
    
    
    
    
    
    
}
