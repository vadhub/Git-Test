package ru.git_test.run;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Git_commands {

	// methods with git commands
	public void gitInit() throws IOException {
		runCommand("git init");
	}

	public void gitAdd() throws IOException {
		runCommand("git add .");
		System.out.println("complete 'git add .'");
	}

	public void gitCommit() throws IOException {
		String massege = JOptionPane.showInputDialog(null, "massege");		
		runCommand("git commit -m'"+massege+"'");
		System.out.println("complete 'git commit -m"+massege+"'");
	}

	public void gitPush() throws IOException {
		runCommand("git push");
	}

	// run command git
	public void runCommand(String commands) {
		try {
			Process p = Runtime.getRuntime().exec(commands);
			// wait for process complete
			p.waitFor();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}

}
