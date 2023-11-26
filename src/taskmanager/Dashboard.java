package taskmanager;

import java.awt.BorderLayout;
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
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Dashboard extends JPanel{

    
    JLabel greetings,separator;
    ProjectPanel projectPanel,usersPanel,projectReport;
      
    Dashboard(){
       
        setBackground(Color.decode("#FFFFFF"));

        greetings = new JLabel("Welcome Administrator");
        greetings.setFont(new Font(greetings.getName(),Font.PLAIN,20));
        
       separator = new JLabel("");
       separator.setBackground(Color.decode("#27592B"));
       separator.setOpaque(true); 
    
        projectPanel =  new ProjectPanel("Project",4,"src/images/dashboardProject.png");
        usersPanel =  new ProjectPanel("Users",10,"src/images/dashboardUsers.png");
        projectReport = new ProjectPanel("Report",-1,"src/images/dashboardReport.png");
   
        setDashboardLayout();
    }

    public void setDashboardLayout(){
            setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();

        gbc.weightx = 0.1;
        gbc.weighty = 0.1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(10, 10, 0, 10); // Add some spacing to the left
        gbc.anchor = GridBagConstraints.LINE_START;
        add(greetings, gbc);

        // Separator
        gbc.weightx = 0.1;
        gbc.weighty = 0.1;
        gbc.gridx = 0;
        gbc.gridy=4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;    
      
        gbc.ipady= 1;
         gbc.weightx = 0.1;
        add(separator, gbc);
       

        // Project panel
        gbc.weightx = 0.1;
        gbc.weighty = 2;
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.insets = new Insets(10, 50, 10, 10);
        gbc.ipadx = 100;
        gbc.ipady = 30;
        add(projectPanel, gbc);

        gbc.weightx = 0.1;
        gbc.weighty = 2;
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.insets = new Insets(10, 50, 10, 10);
        gbc.ipadx = 100;
        gbc.ipady = 30;
        add(usersPanel, gbc);

         gbc.weightx = 8;
        gbc.weighty = 2;
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.insets = new Insets(10, 50, 10, 10);
        gbc.ipadx = 100;
        gbc.ipady = 30;
        add(projectReport, gbc);

        

        // // Users panel    
        // gbc.gridx = 1;
        //   gbc.weightx = 4;
        // gbc.insets = new Insets(10, 0, 10, 10);
        // add(usersPanel, gbc);

        // // Project Report panel
        // gbc.gridx = 2;
        // gbc.insets = new Insets(10, 0, 10, 10);
        // add(projectReport, gbc);

           


    }
}



class ProjectPanel extends JPanel{
 
   JLabel projectTxt, projectQty;
   

    ProjectPanel(String name,int NumberOfProject, String imgSrc){
        
        projectTxt =  new JLabel(name);
        
       
        projectQty = new JLabel(NumberOfProject+"");
       
        projectQty.setFont(new Font(projectQty.getName(),Font.PLAIN,16));

        ImageIcon dashboardProjectIcon = new ImageIcon(imgSrc);
        int dashboardProjectWidth = 50;
        int dashboardProjectHeight =50;
        // Create a new ImageIcon with the specified size
        Image dashboardProjectScaledImage = dashboardProjectIcon.getImage().getScaledInstance(dashboardProjectWidth, dashboardProjectHeight, Image.SCALE_SMOOTH);
        ImageIcon setDashboardProjectIcon = new ImageIcon(dashboardProjectScaledImage);
        // Set the icon for the JLabel
        projectTxt.setIcon(setDashboardProjectIcon);       
        Font dashboardProjectFont = projectTxt.getFont();
        projectTxt.setFont(new Font(dashboardProjectFont.getName(),Font.PLAIN,16));
       
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Border border = BorderFactory.createEtchedBorder();
        setBorder(border);
        add(projectTxt);
        
        setLayout( new GridBagLayout());
         GridBagConstraints gbc = new GridBagConstraints();

            gbc.weightx=1;
            gbc.weighty=0;
           
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.NONE;      
            gbc.insets = new Insets(0, 10, 0, 0); // Add some spacing to the left
            gbc.anchor = GridBagConstraints.LAST_LINE_START;     
            add(projectTxt, gbc);

        
            gbc.insets = new Insets(0, 0, 0, 10); // Add some spacing to the left
            gbc.anchor = GridBagConstraints.LINE_END;     
            if(NumberOfProject != -1)
             add(projectQty, gbc);

        

    }

}
