package ru.git_test.run;

import javax.swing.JButton;


public class ActionButtons {
	Git_commands gc = new Git_commands();

	public void actionButtonInit(JButton btn) {
		btn.addActionListener((e) -> {
			try {
				gc.gitInit();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}

	public void actionButtonAdd(JButton btn) {
		btn.addActionListener((e) -> {
			try {
				gc.gitAdd();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}

	public void actionButtonCommit(JButton btn) {
		btn.addActionListener((e) -> {		
			try {				
				gc.gitCommit();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}

	public void actionButtonPush(JButton btn) {
		btn.addActionListener((e) -> {
			try {
				gc.gitPush();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
	}
}
