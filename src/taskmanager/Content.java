/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskmanager;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author carlconrad
 */
public class Content  extends JPanel{
      
    
     
     ContentHeader header;

     //components
     Dashboard dashboard;

    Content(){
       Dimension dim = getPreferredSize();
       dim.width= 900;
       setPreferredSize(dim);
       
       header = new ContentHeader();
        
       dashboard = new Dashboard();
         


       
       //Border border = BorderFactory.createEtchedBorder();
       Border margin = BorderFactory.createEmptyBorder(10, 10, 20, 10);
       
       setBorder(margin);
     setContentLayout();
    }


    public void setContentLayout(){
        setLayout(new GridBagLayout());
      
        GridBagConstraints gbc =  new GridBagConstraints();
        gbc.weightx = 0.9;
        gbc.weighty = 0.1;
        gbc.gridx = 0;
        gbc.gridy=0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;    
        gbc.ipadx= 700;
        gbc.ipady= 30;
        add(header, gbc);

        gbc.weightx = 1;
        gbc.weighty = 2;
        gbc.gridx = 0;
        gbc.gridy=3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;    
        gbc.ipadx= 450;
       
         
        add(dashboard, gbc);

        
    }
}
