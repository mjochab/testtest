
package lab1;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Ramka extends JFrame implements ActionListener{
    JButton przycisk1;
    JButton przycisk2;
    JButton przycisk3;
    JButton przycisk4;
                
    public Ramka() {
        super("Moja ramka");
        guiInit();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == przycisk2) {
            JOptionPane.showMessageDialog(null, "Nacisnołem cię!");
        }
    }
    
    public void guiInit() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 40));
        
        przycisk1 = new JButton();
        contentPane.add(przycisk1);
        
        przycisk2 = new JButton("Nacisnij mnie");
        przycisk2.addActionListener(this);
        przycisk2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "Nacisnołem cię!");
           } 
        });
        contentPane.add(przycisk2);
        
        Icon audioIcon = new ImageIcon("audio.png");
        przycisk3 = new JButton(audioIcon);
        przycisk3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Gra Muzyka!!");
            }
        });
        contentPane.add(przycisk3);
        
        Icon mikrofon = new ImageIcon("");
        przycisk4 = new JButton("Record audio", mikrofon);
        przycisk4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Nagrywam cie!");
            }
        });
        contentPane.add(przycisk4);
        
        pack();
        setVisible(true);
    }
    
    
    
}