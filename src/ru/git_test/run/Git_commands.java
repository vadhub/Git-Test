package ru.git_test.run;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Git_commands {

	// methods with git commands
	public Object gitInit() throws IOException {
		return runCommand("git init");
	}

	public Object gitAdd() throws IOException {			
		return runCommand("git add .");
	}
	public Object gitCommit() throws IOException {
		String massege = JOptionPane.showInputDialog(null, "massege");	
		System.out.println("git commit -m"+massege+"");
		return runCommand("git commit -m"+massege+"");
	}

	public Object gitPush() throws IOException {
		return runCommand("git push -u origin master");
	}

	// run command git
	public Object runCommand(String commands) {
		try {
			Process p = Runtime.getRuntime().exec(commands);
			// wait for process complete
			p.waitFor();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
		return commands;
	}

}
