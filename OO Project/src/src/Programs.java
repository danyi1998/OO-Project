package src;

import java.util.ArrayList;

public class Programs 
{
	private ArrayList <Program> programs;
	
	//Constructor.
	public Programs() 
	{
		programs = new ArrayList <Program>();
	}
	
	//Create a new program.
	public void createProgram(String programName) 
	{
		//Check that program has not yet been created.
		if (findProgram(programName)!=null)
		{
			System.out.println("Program already exists.");
			return;
		}
		//Create the new program.
		Program program = new Program(programName);
		programs.add(program);
		System.out.println("Program has been created.");
	}
	
	//Find the program with the matching programName.
	public Program findProgram(String programName) 
	{
		for (int i=0; i<programs.size(); i++)
		{
			if (programs.get(i).getProgramName().equals(programName))
			{
				return programs.get(i);
			}
		}
		return null;
	}
		
	//Print all programs.
	public void printPrograms() 
	{
		//No programs created.
		if (programs.size()==0)
		{
			System.out.println("There are no programs created.");
			return;
		}
		//Programs created.
		String programName;
		System.out.println("Printing all programs...");
		for (int i=0; i<programs.size(); i++)
		{
			programName = programs.get(i).getProgramName();
			System.out.println(programName);
		}
	}
}