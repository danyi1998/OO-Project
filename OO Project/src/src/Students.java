package src;

import java.util.ArrayList;

public class Students 
{
	private ArrayList <Student> students;  
	
	//Constructor.
	public Students() 
	{
		students = new ArrayList <Student>();
	}
	
	//Create new student.
	public void createStudent(String studentID) 
	{
		//Check if student has already been created.
		if (findStudent(studentID)!=null)
		{
			System.out.println("Student already exists.");
			return;
		}	
		//Create the new student.
		Student student = new Student(studentID);
		students.add(student);
		System.out.println("Student created.");
	}
	
	//Find the student with the matching studentID.
	public Student findStudent(String studentID) 
	{
		for (int i=0; i<students.size(); i++)
		{
			if (students.get(i).getStudentID().equals(studentID))
			{
				return students.get(i);
			}
		}
		return null;
	}
	
	//Print all students created.
	public void printStudents()
	{
		//No students.
		if (students.size()==0)
		{
			System.out.println("There are no students.");
			return;
		}
		//There are students.
		String studentID;
		System.out.println("Printing all students...");
		for (int i=0; i<students.size(); i++)
		{
			studentID = students.get(i).getStudentID();
			System.out.println("Student ID: " + studentID);
		}
	}
}