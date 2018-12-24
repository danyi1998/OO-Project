package src;

import java.util.ArrayList;

public class Student 
{
	private String studentID;
	private ArrayList <Course> coursesTaken;
	
	//Constructor.
	public Student(String studentID)
	{
		this.studentID = studentID;
		coursesTaken = new ArrayList <Course>();
	}
	
	//Return studentID.
	public String getStudentID() 
	{
		return studentID;
	}
	
	//Add the course to the list of courses taken by this student.
	public void addCourse(Course course)
	{
		//Check if course is already in the list of courses taken.
		if (coursesTaken.contains(course))
		{
			System.out.println("The course is already in the list of courses taken.");
			return;
		}
		coursesTaken.add(course);
		System.out.println("Course has been added to list of courses taken by student.");
	}
	
	//Print all courses taken by this student.
	public void printCoursesTaken()
	{
		//No courses taken by this student.
		if (coursesTaken.size()==0)
		{
			System.out.println("No courses taken by this student.");
			return;
		}
		//Courses taken by this student.
		String courseID;
		System.out.println("Printing all courses taken by this student...");
		for (int i=0; i<coursesTaken.size(); i++)
		{
			courseID = coursesTaken.get(i).getCourseID();
			System.out.println("Course ID: " + courseID);
		}
	}
}