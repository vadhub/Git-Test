package ru.git_test.run;
import java.awt.FlowLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Run {

	public static void main(String[] args) throws IOException {
		ActionButtons abs = new ActionButtons();	
		
		JFrame frame = new JFrame("Git-test");
		JPanel btn_panel = new JPanel();
		JButton init = new JButton("Init local repo");
		JButton add = new JButton("Add code");
		JButton commit = new JButton("Commit");
		JButton push = new JButton("Push");
		
		
		btn_panel.setLayout(new FlowLayout());
		btn_panel.add(init);
		btn_panel.add(add);
		btn_panel.add(commit);
		btn_panel.add(push);
		
		frame.add(btn_panel);	
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//run command
		abs.actionButtonInit(init);
		abs.actionButtonAdd(add);
		abs.actionButtonCommit(commit);
		abs.actionButtonPush(push);
		
		
		
	}	

}
