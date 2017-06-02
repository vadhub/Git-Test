package ru.git_test.run;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Git_commands {	
	public Object gitCd(String path){
		return runCommand("cd /c"+path);				
	}
	//calling window git in program 
	public Object gitCall(){
		return runCommand("C:\\Program Files\\Git\\git-bash.exe");	
	}
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
	// run command git
	public Object runCommand(String commands) {
		try {			
			Runtime.getRuntime().exec(commands);						
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		return commands;
	}

}
