
package lab1;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.util.EventListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


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
        
        // MENU
        JMenuBar pasekMenu = new JMenuBar();
        JMenu menuPlik = new JMenu("Plik");
        menuPlik.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "PLIK");
           } 
        });
        menuPlik.addSeparator();
        
        JMenuItem item1 = new JMenuItem("POLISA");
        item1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "POLISA");
           } 
        });
        menuPlik.add(item1);
        
        JMenuItem item2 = new JMenuItem("DRUKUJ");
        menuPlik.add(item2);
        
        JMenuItem item3 = new JMenuItem("ZAPISZ");
        menuPlik.add(item3);
        
        JMenuItem item4 = new JMenuItem("ZAMKNIJ");
        item4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menuPlik.add(item4);
        
        pasekMenu.add(menuPlik);
        contentPane.add(pasekMenu, BorderLayout.NORTH);
        
        JMenu menuZamknij = new JMenu("Zamknij");
        menuZamknij.addActionListener(new ActionListener() {
             @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        pasekMenu.add(menuZamknij);
        
        // POLA TEKSTOWE
        JPanel panel = new JPanel(new BorderLayout());
        JLabel labelImie = new JLabel("Imie: ");
        labelImie.setDisplayedMnemonic(KeyEvent.VK_N);
        
        JTextField textField1 = new JTextField();
        textField1.setHorizontalAlignment(JTextField.CENTER);
        
        labelImie.setLabelFor(textField1);
        panel.add(labelImie, BorderLayout.WEST);
        panel.add(textField1, BorderLayout.CENTER);
        add(panel, BorderLayout.CENTER);
        
        // COMBO BOX MARKA SAMOCHODU
        JLabel label1 = new JLabel();
        add(label1, BorderLayout.SOUTH);
        
        String[] sList = new String[]{"BMW", "VOLVO", "MERCEDES"};
        JComboBox<String> opt = new JComboBox<>(sList);
        
        opt.addItemListener((ItemEvent e) -> {
           Object item = e.getItem();
           if (e.getStateChange() == ItemEvent.SELECTED) {
               label1.setText(item + " jest wybrany");
           }
        });
        
        // TAPICERKA RAADIO BUTTON
        JLabel labelRadio = new JLabel();
        
        JRadioButton tapicerka = new JRadioButton("Tapicerka");
        add(tapicerka, BorderLayout.CENTER);
        
        // CHECKBOX
        JCheckBox abs = new JCheckBox("ABS");
        JCheckBox klima = new JCheckBox("Kilma");
        
        // PRZYCISK WYCZYSC
        JButton button1 = new JButton("Wyczysc");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("");
            }
        });
        
        contentPane.add(opt, BorderLayout.EAST);
        contentPane.add(button1, BorderLayout.WEST);
        
        setSize(300, 200);
        pack();
        setVisible(true);
    } 
}