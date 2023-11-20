/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskmanager;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author carlconrad
 */
public class Content  extends JPanel{
      
    
    Content(){
       Dimension dim = getPreferredSize();
       dim.width= 900;
       setPreferredSize(dim);
       
       Border border = BorderFactory.createEtchedBorder();
       Border margin = BorderFactory.createEmptyBorder(10, 10, 10, 10);
       
       setBorder(BorderFactory.createCompoundBorder(margin, border));
     
    }
}
