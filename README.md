I coded this project after taking a class on Object Oriented Programming in my sophomore year at college. I wanted to reinforce some concepts and to get some practice.

This project involves the registration of students, university programs and their courses, and also allows students to register for courses. It is meant to model a university student and course registration system. 

It consists of 5 entity classes: Students, Student, Programs, Program, and Course, and 1 control class: Control.
The 'Students' class instantiates 'Student' objects, the 'Programs' class instantiates 'Program' objects and the 'Program' class instantiates 'Course' objects. A 'Student' object can register for a 'Course'.

The code and documentation can be found in the folder 'OO Project'. 

The purpose of this README document is mainly to provide explanations on how this program should be used.

First, the 'Create a new student', 'Create a new program' and 'Create a new course' options should be selected. It is only when students and programs and their courses exist that the other options can be performed. 
'Create a new program' should be done before 'Create a new course' because a course is registered under a program. For example, the course 'CS101' should be registered under the program 'Computer Science'.

After which, 'Print all programs', 'Print all courses registered under a program', and 'Print all students' can be selected.

'Register a student for a course' can also be selected to register an existing student to an existing course. 

Then, 'Print all courses taken by a student' and 'Print all students enrolled in a course' options can be selected.

The system will perform the operation chosen by the user and once completed, it will prompt the user for the next option, until the user selects the 'Quit' option. Only then will the system terminate.

