/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskmanager;

import java.awt.BorderLayout;
import javax.swing.JFrame;
/**
 *
 * @author carlconrad
 */
public class Mainframe  extends JFrame{
 
    
      private NavBar navbar;
      private Content content;
    Mainframe(){
     
        super("Task Manager");
        setLayout(new BorderLayout());
        
        navbar = new NavBar();
        content =  new Content();
        
        
        add(navbar, BorderLayout.WEST);
        add(content,BorderLayout.CENTER);
        
        setSize(1300,700);
        setVisible(true);
        
        
        
        
    
    }
    
    
    
}
