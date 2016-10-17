/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Przycisk extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        int width = (int) getWidth() / 8;
        int height = (int) getHeight() / 8;
        int x = 0;
        int y = 0;
        
        
        
        for (int i = 0; i < 4; i++) {
            g.setColor(Color.red);
            g.fillRect(x, y, width, height);
            x += width; y += height;
            g.setColor(Color.yellow);
            g.fillOval(x, y, width, height);
            x += width; y += height;
        }
    }
}
