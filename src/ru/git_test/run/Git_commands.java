package ru.git_test.run;

import java.io.File;
import java.io.IOException;
public class Git_commands {	
	public void gitInit(File path) throws IOException {
		runCommand(path, "git init");
	}
	public void gitAdd(File path) throws IOException {
		runCommand(path, "git add .");
	}
	public void gitCommit(File path) throws IOException {
		runCommand(path, "git commit -m'init'");
	}
	public void gitPush(File path) throws IOException {
		runCommand(path, "git push");
	}
	public void runCommand (File path, String commands){	
		try {
			ProcessBuilder pb = new ProcessBuilder().command(commands).directory(path);
			Process p = pb.start();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
}
