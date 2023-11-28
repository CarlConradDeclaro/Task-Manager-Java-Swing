    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskmanager;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
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
     private JLabel dashboard,project,user,reports;
    
    NavBar(){
       Dimension dim = getPreferredSize();
       dim.width= 200;
       setPreferredSize(dim);
       
       setBackground(new Color(0x353943));
        titleRole = new JLabel("Admin Role");
        separator1 = new JLabel("");
        separator2 = new JLabel("");
        positioned = new JLabel("Administrator");
        dashboard =  new JLabel("Dashboard");
        project  =new JLabel("Project");
        user  =new JLabel("Users");
        reports =new JLabel("Reports");

        
        Font labelFont = titleRole.getFont();
        titleRole.setFont(new Font(labelFont.getName(), Font.BOLD, 24));  
        titleRole.setForeground(new Color(0xB2B1B7));
        

        ImageIcon icon = new ImageIcon("src/images/nft.jpg");
        int iconWidth = 30;
        int iconHeight = 30;
        // Create a new ImageIcon with the specified size
        Image scaledImage = icon.getImage().getScaledInstance(iconWidth, iconHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Set the icon for the JLabel
        positioned.setIcon(scaledIcon);
        Font positionFont = positioned.getFont();
        positioned.setFont(new Font(positionFont.getName(), Font.PLAIN, 18));  
        positioned.setForeground(new Color(0xB2B1B7));
        

        separator1.setPreferredSize(new Dimension(176, 1));
        separator1.setBackground(new Color(0xB2B1B7)); 
        separator1.setOpaque(true);  
 
 
        separator2.setPreferredSize(new Dimension(176, 1));
        separator2.setBackground(new Color(0xB2B1B7));
        separator2.setOpaque(true); // Ensure the label is opaque to show the background color
       

        ImageIcon dashboardIcon = new ImageIcon("src/images/dashyboard.png");
        int dashWidth = 20;
        int dashHeight = 20;
        // Create a new ImageIcon with the specified size
        Image dashScaledImage = dashboardIcon.getImage().getScaledInstance(dashWidth, dashHeight, Image.SCALE_SMOOTH);
        ImageIcon setDashIcon = new ImageIcon(dashScaledImage);
        // Set the icon for the JLabel
        dashboard.setIcon(setDashIcon);       
        Font dashboardFont = dashboard.getFont();
        dashboard.setFont(new Font(dashboardFont.getName(),Font.PLAIN,16));
        dashboard.setForeground(new Color(0xB2B1B7));
        dashboard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        ImageIcon projectIcon = new ImageIcon("src/images/project.png");
        int projectWidth = 20;
        int projectHeight = 20;
        // Create a new ImageIcon with the specified size
        Image projectScaledImage = projectIcon.getImage().getScaledInstance(projectWidth, projectHeight, Image.SCALE_SMOOTH);
        ImageIcon setProjectIcon = new ImageIcon(projectScaledImage);
        // Set the icon for the JLabel
        project.setIcon(setProjectIcon);       
        Font projectFont = project.getFont();
        project.setFont(new Font(projectFont.getName(),Font.PLAIN,16));
        project.setForeground(new Color(0xB2B1B7));
        project.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));




        ImageIcon userIcon = new ImageIcon("src/images/users.png");
        int userWidth = 20;
        int userHeight = 20;
        // Create a new ImageIcon with the specified size
        Image userScaledImage = userIcon.getImage().getScaledInstance(userWidth, userHeight, Image.SCALE_SMOOTH);
        ImageIcon setUserIcon = new ImageIcon(userScaledImage);
        // Set the icon for the JLabel
        user.setIcon(setUserIcon);       
        Font userFont =user.getFont();
        user.setFont(new Font(userFont.getName(),Font.PLAIN,16));
        user.setForeground(new Color(0xB2B1B7));
        user.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        ImageIcon reportIcon = new ImageIcon("src/images/reports.png");
        int reportWidth = 20;
        int reportHeight = 20;
        // Create a new ImageIcon with the specified size
        Image reportScaledImage = reportIcon.getImage().getScaledInstance(reportWidth, reportHeight, Image.SCALE_SMOOTH);
        ImageIcon setReportIcon = new ImageIcon(reportScaledImage);
        // Set the icon for the JLabel
        reports.setIcon(setReportIcon);       
        Font reportFont =user.getFont();
        reports.setFont(new Font(reportFont.getName(),Font.PLAIN,16));
        reports.setForeground(new Color(0xB2B1B7));
        reports.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       



       
       Border border = BorderFactory.createEtchedBorder();
//       Border margin = BorderFactory.createEmptyBorder(10, 10, 10, 10);      
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
       gbc.weighty = 0.3;
       gbc.gridx = 0;
       gbc.gridy=4;
       gbc.fill = GridBagConstraints.NONE;
        gbc.ipadx =200;
       gbc.ipady = 1;
       gbc.anchor = GridBagConstraints.FIRST_LINE_END;
       add(separator2, gbc);
       
    // dashboard
      gbc.weightx = 1;
       gbc.weighty = 0.1;
       gbc.gridx = 0;
       gbc.gridy=5;
       gbc.fill = GridBagConstraints.NONE;
       gbc.ipadx =70;
       gbc.ipady = 1;
       gbc.anchor = GridBagConstraints.FIRST_LINE_END;
       add(dashboard, gbc);

     // Project
      gbc.weightx = 1;
       gbc.weighty = 0.1;
       gbc.gridx = 0;
       gbc.gridy=6;
       gbc.fill = GridBagConstraints.NONE;
       gbc.ipadx =97;
       gbc.ipady = 1;
       gbc.anchor = GridBagConstraints.FIRST_LINE_END;
       add(project, gbc);

     // user
        gbc.weightx = 1;
       gbc.weighty = 0.1;
       gbc.gridx = 0;
       gbc.gridy=7;
       gbc.fill = GridBagConstraints.NONE;
       gbc.ipadx =107;
       gbc.ipady = 1;
       gbc.anchor = GridBagConstraints.FIRST_LINE_END;
       add(user, gbc);

        // reports
       gbc.weightx = 1;
       gbc.weighty = 3;
       gbc.gridx = 0;
       gbc.gridy=8;
       gbc.fill = GridBagConstraints.NONE;
      //  gbc.ipadx =94;
      //  gbc.ipady = 1;
      gbc.insets = new Insets(0, 23, 0, 0); 
       gbc.anchor = GridBagConstraints.FIRST_LINE_END;
       add(reports, gbc);

       
    }
    
    
}
