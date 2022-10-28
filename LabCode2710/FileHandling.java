package LabCode2710;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandling {

	public static void main(String[] args) throws IOException 
	{
		File file = new File("emp.txt");
		if(file.exists())
		{
			PrintWriter p1 = new PrintWriter(file);
			p1.println("Employee name: Rafat Shaikh");
			p1.println("Employee id: 15");
			p1.println("Employee Salary: 20,000");
			p1.close();
			p1.close();
			System.out.println("Done");
		}
		
		

	}

}
