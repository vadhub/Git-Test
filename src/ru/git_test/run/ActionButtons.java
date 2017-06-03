package ru.git_test.run;

import java.io.File;
import java.nio.file.Path;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ActionButtons {
	
	//Class Class calls the methods of the class Git_commands in the methods that are 
	//responsible for clicking on the button
	
	Git_commands gc = new Git_commands();

	public void actionButtonInit(JButton btn) {
		btn.addActionListener((e) -> {
			try {
				gc.gitInit();
			} catch (Exception e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, e1.getMessage());
			}
		});
	}

	public void actionButtonAdd(JButton btn) {
		btn.addActionListener((e) -> {
			try {
				gc.gitAdd();
			} catch (Exception e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, e1.getMessage());
			}
		});
	}

	public void actionButtonCommit(JButton btn) {
		btn.addActionListener((e) -> {		
			try {				
				gc.gitCommit();
			} catch (Exception e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, e1.getMessage());
				
			}
		});
	}
	
	public void actionButtonGitCall(JButton btn) {
		btn.addActionListener((e) -> {
			try {
				gc.gitCall();
			} catch (Exception e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, e1.getMessage());
			}
		});
	}
	//test
	public void actionButtonGitCd(JButton btn, JTextField txt) {
		
		File f = (File) txt.getDocument();
		Path path = f.toPath();
		
		btn.addActionListener((e) -> {
			try {
				gc.gitCd(path);
			} catch (Exception e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, e1.getMessage());
			}
		});
	}
}
