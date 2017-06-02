package ru.git_test.run;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ActionButtons {
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
	public void actionButtonGitCd(JButton btn, JTextField txt) {
		btn.addActionListener((e) -> {
			try {
				gc.gitCd(txt.getText());
			} catch (Exception e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, e1.getMessage());
			}
		});
	}
}
