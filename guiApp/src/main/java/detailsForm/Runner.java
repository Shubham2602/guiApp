package detailsForm;

import javax.swing.JFrame;

public class Runner 
{
	public static void main(String args[])
	{
		RegForm regForm = new RegForm();
		
		JFrame jframe = regForm.createFrame();
		//regForm.createLabelField("Name", jframe);
		regForm.create(jframe);
	}
}
