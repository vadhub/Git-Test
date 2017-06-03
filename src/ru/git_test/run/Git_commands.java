package ru.git_test.run;

import java.io.IOException;
import java.nio.file.Path;

import javax.swing.JOptionPane;

public class Git_commands {	
	
	//class calling commands git in java program
	
	
	public void gitCd(Path path){
		ProcessBuilder p =new ProcessBuilder("git add .").directory(path.toFile());
		try {
			p.start();
		} catch (IOException e) {			
			e.printStackTrace();
		}				
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
