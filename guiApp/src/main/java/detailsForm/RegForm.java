package detailsForm;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.*;

public class RegForm 
{
	static Integer indexer = 1;
    
    
    
	public JFrame createFrame()
	{
		JFrame jframe = new JFrame("Quick Rally Access");
		jframe.setVisible(true);
		jframe.setBounds(200,100,700,600 );
		//jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		jframe.setLayout(new FlowLayout());
		
		setBGColor(jframe);
		
		return jframe;
	}
	
	public void setBGColor(JFrame jframe)
	{
		Container container = jframe.getContentPane();
		container.setLayout(null);    // Setting layout as null    
		container.setBackground(Color.white);
		
		container.add(createPanel());
	}
	
	public JLabel createPanel()
	{
		JLabel heading_lbl=new JLabel();
		heading_lbl.setBounds(250,5,200,40);
		heading_lbl.setText("Details Form"); 
		Font f=new Font("Arial",Font.BOLD,20); 
		heading_lbl.setFont(f);
		
		return heading_lbl;
	}
	
	public static void createLabelField(String label, JFrame jframe)
	{
		JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();
        
        JLabel lbUsername;
        JTextField tfUsername;
        
        cs.fill = GridBagConstraints.HORIZONTAL;
 
        lbUsername = new JLabel(label + " : ");
        cs.gridx = 0;
        cs.gridy = 0;
        cs.gridwidth = 1;
        panel.add(lbUsername, cs);
 
        tfUsername = new JTextField(20);
        cs.gridx = 1;
        cs.gridy = 0;
        cs.gridwidth = 2;
        panel.add(tfUsername, cs);
        
        panel.setBorder(new LineBorder(Color.BLACK));
        
        jframe.add(panel, BorderLayout.CENTER);
        
        //jframe.pack();
        jframe.setResizable(true);
        //jframe.setLocationRelativeTo(jframe);
        jframe.setVisible(true);
    }
	
	public void create(JFrame jframe)
	{
		 JLabel BRID, password,workspace,project,testset;
		 JTextField BRIDtf,workspacetf,projecttf,testsettf;
		 JButton uploadBtn;
		 JPasswordField passwdTF;
		
		 
		 BRID = new JLabel("BRID");
		 password = new JLabel("Password");
		 workspace = new JLabel("Workspace");
		 project = new JLabel("Project");
		 testset = new JLabel("TestsetFolder Location");
		 BRIDtf = new JTextField();
		  passwdTF = new JPasswordField();
		  workspacetf = new JTextField();
		  projecttf = new JTextField();
		  testsettf = new JTextField();
		  uploadBtn = new JButton("Upload");
		 
		  
		  BRID.setBounds(80, 70, 200, 30);
		  password.setBounds(80, 110, 200, 30);
		  workspace.setBounds(80, 150, 200, 30);
		  project.setBounds(80, 190, 200, 30);
		  testset.setBounds(80, 230, 200, 30);
		  BRIDtf.setBounds(300, 70, 200, 30);
		  passwdTF.setBounds(300, 110, 200, 30);
		  workspacetf.setBounds(300, 150, 200, 30);
		  projecttf.setBounds(300, 190, 200, 30);
		  testsettf.setBounds(300, 230, 200, 30);
		  
		  uploadBtn.setBounds(150, 400, 100, 30);
		 
		 
		  jframe.add(BRID);
		  jframe.add(BRIDtf);
		  jframe.add(password);
		  jframe.add(passwdTF);
		  jframe.add(workspace);
		  jframe.add(workspacetf);
		  jframe.add(project);
		  jframe.add(projecttf);
		  jframe.add(testset);
		  jframe.add(testsettf);
		  jframe.add(uploadBtn);
		 
		  jframe.setSize(800, 800);
		  jframe.setLayout(null);
		  jframe.setVisible(true);
		  
	}
}
