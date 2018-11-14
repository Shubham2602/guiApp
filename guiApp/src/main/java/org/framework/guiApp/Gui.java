package org.framework.guiApp;

import java.awt.BorderLayout;

import javax.swing.*;

public class Gui {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Frame : 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,600);
       
        CreatingMenuBar creatingMenuBar = new CreatingMenuBar();
        
        CreatingPanel creatingPanel = new CreatingPanel();
        
        CreatingTextArea creatingTextArea = new CreatingTextArea();
        
        frame.getContentPane().add(BorderLayout.SOUTH, creatingPanel.createPanel());
        frame.getContentPane().add(BorderLayout.NORTH, creatingMenuBar.createMenuBar());
        frame.getContentPane().add(BorderLayout.CENTER,creatingTextArea.createTextArea());
        
        frame.setVisible(true);

        creatingPanel.upload();
	}

}
