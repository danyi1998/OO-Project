package src;

import java.util.ArrayList;

public class Program 
{
	private String programName;
	private ArrayList <Course> courses;
		
	//Constructor.
	public Program(String programName) 
	{
		this.programName = programName;
		courses = new ArrayList <Course>();
	}	
	
	//Return programName.
	public String getProgramName() 
	{
		return programName;
	}
	
	//Create a new course.
	public void createCourse(String courseID) 
	{
		//Check if course has already been created.
		if (findCourse(courseID)!=null)
		{
			System.out.println("Course already exists.");
			return;
		}
		//Create the new course.
		Course course = new Course(courseID);
		courses.add(course);
		System.out.println("Course has been created.");
	}
	
	//Find the course with the matching courseID.
	public Course findCourse(String courseID) 
	{
		for (int i=0; i<courses.size(); i++)
		{
			if (courses.get(i).getCourseID().equals(courseID))
			{
				return courses.get(i);
			}
		}
		return null;
	}
	
	//Print all courses created under this program.
	public void printCourse() 
	{
		//No courses registered under this program.
		if (courses.size()==0)
		{
			System.out.println("There are no courses registered under this program.");
			return;
		}
		//Courses registered under this program.
		String courseID;
		System.out.println("Printing all courses under this program...");
		for (int i=0; i<courses.size(); i++)
		{
			courseID = courses.get(i).getCourseID();
			System.out.println("Course ID: " + courseID);
		}
	}
}		