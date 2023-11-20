package taskmanager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ContentHeader  extends JPanel{
        
     JLabel title; 

    ContentHeader(){
        title = new JLabel("Project Management System");

        Font titlteFont = title.getFont();
        title.setFont(new Font(titlteFont.getName(),Font.BOLD,22));
        setBackground(Color.decode("#FFFFFF"));
        setOpaque(true); 
        title.setForeground( Color.decode("#54575F"));


        setLayout(new GridBagLayout());
        // Border border = BorderFactory.createEtchedBorder();
        // Border margin = BorderFactory.createEmptyBorder(10, 10, 10, 10);      
        // setBorder(BorderFactory.createCompoundBorder(margin, border));
        // setBorder(border);



        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx =1;
        gbc.gridy = 0; 
        add(title,gbc);
        
      }



}
