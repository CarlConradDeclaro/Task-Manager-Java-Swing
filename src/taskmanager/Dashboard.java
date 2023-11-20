package taskmanager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dashboard extends JPanel{
    
    JLabel greetings,separator;
    Dashboard(){
       
        setBackground(Color.decode("#FFFFFF"));


        greetings = new JLabel("Welcome Administrator");
        greetings.setFont(new Font(greetings.getName(),Font.PLAIN,20));
 

         
        separator = new JLabel(); 
        separator.setBackground(new Color(0xB2B1B7)); 
        separator.setOpaque(true);  
 
        setDashboardLayout();
    }

    public void setDashboardLayout(){
            setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();

            gbc.weightx = 1;
            gbc.weighty = 0;
            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.fill = GridBagConstraints.NONE;      
            gbc.insets = new Insets(50, 10, 10, 10); // Add some spacing to the left
            gbc.anchor = GridBagConstraints.LAST_LINE_START;     
            add(greetings, gbc);
             
              

            gbc.weightx =1;
            gbc.weighty = 1;
            gbc.gridx =0;
            gbc.gridy =3;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.anchor = GridBagConstraints.FIRST_LINE_START;   
            gbc.insets = new Insets(10, 10, 10, 10);     
             gbc.ipady =1;
            add(separator,gbc);


    }
}
