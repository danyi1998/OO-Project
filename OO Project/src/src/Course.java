package src;

import java.util.ArrayList;

public class Course
{
	private String courseID;
	private ArrayList <Student> studentsEnrolled;
	
	//Constructor.
	public Course(String courseID) 
	{
		this.courseID = courseID;
		studentsEnrolled = new ArrayList <Student>();	
	}
	
	//Return the courseID.
	public String getCourseID() 
	{
		return courseID;
	}
	
	//Add student to studentsEnrolled ArrayList.
	public void addStudent(Student stud)
	{ 
		//Check if studentsEnrolled ArrayList already contains the student. 
		if (studentsEnrolled.contains(stud))
		{
			System.out.println("Student is already enrolled in this course.");
			return;
		}
		studentsEnrolled.add(stud);
		System.out.println("Student has been enrolled into this course.");
	}
	
	//Print all students enrolled.
	public void printStudentsEnrolled() 
	{
		//No students enrolled.
		if (studentsEnrolled.size()==0)
		{
			System.out.println("There are no students enrolled.");
			return;
		}
		//Students enrolled.
		String studentID;
		System.out.println("Printing students enrolled...");
		for (int i=0; i<studentsEnrolled.size(); i++)
		{
			studentID = studentsEnrolled.get(i).getStudentID();
			System.out.println("Student ID: " + studentID);
		}
	}
}