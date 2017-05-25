package ru.git_test.run;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Run {

	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exec("C:\\Program Files\\Git\\git-bash.exe");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getStackTrace());		
		}
	}

}
