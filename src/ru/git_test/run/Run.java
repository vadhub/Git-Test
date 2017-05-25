package ru.git_test.run;

import java.io.IOException;

import javax.swing.JOptionPane;
public class Run {

	public static void main(String[] args) {
		try {
			Git_commands gc = new Git_commands();			
			String git_run = "C:\\Program Files\\Git\\git-bash.exe";
			Runtime.getRuntime().exec(git_run);
			gc.gitAdd("git add .");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getStackTrace());
			e.printStackTrace();
		}
	}

}
