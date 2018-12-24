package src;

import java.util.Scanner;

public class Control 
{
	public static void main(String[] args) 
	{
		//Print instructions and options.
		System.out.println("Listed below are the choices: ");
		System.out.println("1. Create a new student");
		System.out.println("2. Create a new program");
		System.out.println("3. Create a new course");
		System.out.println("4. Register a student for a course");
		System.out.println("5. Print all programs");
		System.out.println("6. Print all courses registered under a program");
		System.out.println("7. Print all students.");
		System.out.println("8. Print all courses taken by a student");
		System.out.println("9. Print all students enrolled in a course");
		System.out.println("10. Quit");
		
		int choice;
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		Students students = new Students();
		Programs programs = new Programs();
		Program program;
		Course course;
		Student student;
		String studentID, programName, courseID;
		
		//Keep looping while the option to quit has not been chosen.
		do 
		{
			//Read in an appropriate choice.
			do
			{
				System.out.println("Enter your choice from 1 to 10: ");
				choice = scInt.nextInt();
			} while ((choice<1)||(choice>10));
			
			switch(choice)
			{
				//Create a new student
				case 1:
					System.out.println("Enter the student ID: ");
					studentID = scString.nextLine();
					students.createStudent(studentID);
					break;
				
				//Create a new program
				case 2:
					System.out.println("Enter the program name: ");
					programName = scString.nextLine();
					programs.createProgram(programName);
					break;
				
				//Create a new course
				case 3:
					//Create the course under the correct program.
					System.out.println("Enter the program name under which the course will be created: ");
					programName = scString.nextLine();
					program = programs.findProgram(programName);
					if (program==null)
					{
						System.out.println("Program name not found!");
						break;
					}
					System.out.println("Enter the course ID of the course to be created: ");
					courseID = scString.nextLine();
					program.createCourse(courseID);
					break;
				
				//Register a student for a course
				case 4: 
					//Find the correct course from the program it is created under.
					System.out.println("Enter the program of the course to be registered into: ");
					programName = scString.nextLine();
					program = programs.findProgram(programName);
					if (program==null)
					{
						System.out.println("Program name not found!");
						break;
					}
					System.out.println("Enter the ID of the course to be registered into: ");
					courseID = scString.nextLine();
					course = program.findCourse(courseID);
					if (course==null)
					{
						System.out.println("Course ID not found!");
						break;
					}
					//Find the correct student.
					System.out.println("Enter the ID of the student to be registered: ");
					studentID = scString.nextLine();
					student = students.findStudent(studentID);
					if (student==null)
					{
						System.out.println("Student ID not found!");
						break;
					}
					//Register the student into that course.
					course.addStudent(student);
					//Add course to list of courses taken by student.
					student.addCourse(course);
					break;
					
				//Print all programs
				case 5:
					programs.printPrograms();
					break;
					
				//Print all courses registered under a program
				case 6: 
					//Find the correct program.
					System.out.println("Enter the program name: ");
					programName = scString.nextLine();
					program = programs.findProgram(programName);
					if (program==null)
					{
						System.out.println("Program name not found!");
						break;
					}
					program.printCourse();
					break;
					
				//Print all students.
				case 7:
					students.printStudents();
					break;
					
				//Print all courses taken by a student
				case 8:
					//Find the correct student.
					System.out.println("Enter the ID of the student: ");
					studentID = scString.nextLine();
					student = students.findStudent(studentID);
					if (student==null)
					{
						System.out.println("Student ID not found!");
						break;
					}
					student.printCoursesTaken();
					break;
				
				//Print all students enrolled in a course
				case 9: 
					//Find the correct course from the program it is created under.
					System.out.println("Enter the program the course is registered under: ");
					programName = scString.nextLine();
					program = programs.findProgram(programName);
					if (program==null)
					{
						System.out.println("Program name not found!");
						break;
					}
					System.out.println("Enter the course ID: ");
					courseID = scString.nextLine();
					course = program.findCourse(courseID);
					if (course==null)
					{
						System.out.println("Course ID not found!");
						break;
					}
					course.printStudentsEnrolled();
					break;
				
				//Quit
				case 10:
					System.out.println("Quit.");	
			}
		} while (choice!=10);
	}
}
