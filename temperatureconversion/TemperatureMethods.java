/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconversion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author sapaythhossain
 */
public class TemperatureMethods {
    public void conversionCtoF( JTextField f, JTextField c, JLabel w ) {
        try{
            w.setText("");
            f.setText("");
            float celsius = Integer.parseInt(c.getText());
            float fahrenheit = 9 * (celsius / 5) + 32;
            f.setText(String.valueOf(fahrenheit));
        } catch (NumberFormatException e) {
            w.setText("Enter a valid number");
        }
    }
    
    public void conversionFtoC( JTextField f, JTextField c, JLabel w ) {
        try{
            w.setText("");
            c.setText("");
            float fahrenheit = Integer.parseInt(f.getText());
            float celsius = (fahrenheit - 32) * 5 / 9;
            c.setText(String.valueOf(celsius));
            if( f.getText().isEmpty() ) {
                w.setText("");
            }
        } catch (NumberFormatException e) {
            
            w.setText("Enter a valid number");
        }
    }
}
