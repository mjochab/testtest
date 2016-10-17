
package lab1;

import javax.swing.*;


public class Lab1 {
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                Ramka r = new Ramka();
            }
        });
        
    }
    
}
