package org.framework.guiApp;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CreatingPanel 
{
	JPanel panel;
	JLabel label;
	JTextField tf;
	JButton send ;
	JButton reset ;
	public JPanel createPanel()
	{
		System.out.println("Panel Creation");
		panel = new JPanel(); // the panel is not visible in output
        label = new JLabel("Enter Text");
        tf = new JTextField(10); // accepts upto 10 characters
        send = new JButton("Send");
        reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
        
           
		return panel;
	}
	
	public void upload()
	{
		send.addActionListener(new ButtonClickListenerforSend());
		reset.addActionListener(new ButtonClickListenerforReset());
	}

}
