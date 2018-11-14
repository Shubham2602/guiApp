package org.framework.guiApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JTextArea;

public class ButtonClickListenerforReset implements ActionListener {


	JTextArea jTextArea;
	String value;
	WriteToExcel wte = new WriteToExcel();

	public void actionPerformed(ActionEvent args) {
		
			try {
				wte.writeExcel("Reset selected");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}


