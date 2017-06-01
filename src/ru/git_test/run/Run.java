package ru.git_test.run;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Run {

	public static void main(String[] args) throws IOException {
		ActionButtons abs = new ActionButtons();	
		
		JFrame frame = new JFrame("Git-test");
		
		JPanel btn_panel = new JPanel();
		JPanel txt_panel = new JPanel();
		
		JButton git = new JButton("git"); 
		JButton init = new JButton("Init local repo");
		JButton add = new JButton("Add code");
		JButton commit = new JButton("Commit");
		JButton push = new JButton("Push");
		JButton goto_path = new JButton("goto path");
		
		JTextField path = new JTextField(10);
		
		btn_panel.setLayout(new FlowLayout());
		btn_panel.add(git);
		btn_panel.add(init);
		btn_panel.add(add);
		btn_panel.add(commit);
		btn_panel.add(push);
		btn_panel.add(goto_path);
		
		txt_panel.setLayout(new FlowLayout());
		txt_panel.add(path);
		
		frame.setLayout(new BorderLayout());
		
		frame.add(btn_panel, "North");
		frame.add(txt_panel, "South");
		frame.pack();
		frame.setVisible(true);
		frame.setLocation(455, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//run command
		abs.actionButtonGitCall(git);
		abs.actionButtonInit(init);
		abs.actionButtonAdd(add);
		abs.actionButtonCommit(commit);
		abs.actionButtonPush(push);
		
		
		
	}	

}
