package ru.git_test.run;

import java.io.IOException;

public class Git_commands {
	public void gitAdd(String git_command) throws IOException {
		ProcessBuilder pb = new ProcessBuilder(git_command);	
		pb.command(git_command);
		pb.start();
	}
}
