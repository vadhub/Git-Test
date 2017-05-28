package ru.git_test.run;

import java.io.IOException;

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
		runCommand("git commit -m");
		System.out.println("complete 'git commit -m'");
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
