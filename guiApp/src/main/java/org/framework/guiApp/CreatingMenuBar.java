package org.framework.guiApp;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class CreatingMenuBar 
{
	 public JMenuBar createMenuBar()
	 {
		 System.out.println("MenuBar creation");
		 JMenuBar menubar = new JMenuBar();
	     
	     JMenu menu1 = new JMenu("File");
	     JMenu menu2 = new JMenu("Edit");
	    
	     menubar.add(menu1);
	     menubar.add(menu2);
	     
	     return menubar;
	 }
}
