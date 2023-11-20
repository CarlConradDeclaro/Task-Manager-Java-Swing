    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskmanager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author carlconrad
 */
public class NavBar extends JPanel{
     
    private JLabel titleRole;
    private JLabel separator1,positioned,separator2;
    
    
    
    NavBar(){
       Dimension dim = getPreferredSize();
       dim.width= 200;
       setPreferredSize(dim);
       
       setBackground(new Color(0x353943));
        titleRole = new JLabel("Admin Role");
        separator1 = new JLabel("");
        separator2 = new JLabel("");
        positioned = new JLabel("Administrator");


        ImageIcon icon = new ImageIcon("src/images/nft.jpg");

        int iconWidth = 30;
        int iconHeight = 30;
        // Create a new ImageIcon with the specified size
        Image scaledImage = icon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Set the icon for the JLabel
        positioned.setIcon(scaledIcon);



        
        Font labelFont = titleRole.getFont();
        titleRole.setFont(new Font(labelFont.getName(), Font.BOLD, 24));  
        titleRole.setForeground(new Color(0xB2B1B7));
        
        Font positionFont = positioned.getFont();
        positioned.setFont(new Font(labelFont.getName(), Font.PLAIN, 18));  
        positioned.setForeground(new Color(0xB2B1B7));
        
        separator1.setPreferredSize(new Dimension(176, 1));
        separator1.setBackground(new Color(0xB2B1B7));
        separator1.setOpaque(true);  
 
 
       separator2.setPreferredSize(new Dimension(176, 1));
       separator2.setBackground(new Color(0xB2B1B7));
       separator2.setOpaque(true); // Ensure the label is opaque to show the background color
     
          
       
       Border border = BorderFactory.createEtchedBorder();
//       Border margin = BorderFactory.createEmptyBorder(10, 10, 10, 10);
//       
//       setBorder(BorderFactory.createCompoundBorder(margin, border));
      setBorder(border);
       
      componentLayout();
    }
    
    public void componentLayout(){
      setLayout(new GridBagLayout());
      
      GridBagConstraints gbc =  new GridBagConstraints();
      
       gbc.weightx = 1;
       gbc.weighty = 0.1;
       gbc.gridx = 0;
       gbc.gridy=1;
       gbc.fill = GridBagConstraints.NONE;
       gbc.anchor = GridBagConstraints.FIRST_LINE_START;    
       add(titleRole, gbc);
       
       
       gbc.weightx = 1;
       gbc.weighty = 0.05;
       gbc.gridx = 0;
       gbc.gridy=2;
       gbc.fill = GridBagConstraints.NONE;
       gbc.anchor = GridBagConstraints.FIRST_LINE_END;
       gbc.ipadx =200;
       gbc.ipady = 1;
       add(separator1, gbc);
       
       
 
       gbc.weightx = 1;
       gbc.weighty = 0.05;
       gbc.gridx = 0;
       gbc.gridy=3;
       gbc.fill = GridBagConstraints.NONE;
       gbc.anchor = GridBagConstraints.FIRST_LINE_END;
       gbc.ipadx =45;
       gbc.ipady = 1;
       add(positioned, gbc);
 
 
 
       gbc.weightx = 1;
       gbc.weighty = 3;
       gbc.gridx = 0;
       gbc.gridy=4;
       gbc.fill = GridBagConstraints.NONE;
        gbc.ipadx =200;
       gbc.ipady = 1;
       gbc.anchor = GridBagConstraints.FIRST_LINE_END;
       add(separator2, gbc);

       
    }
    
    
}
