package edu.monmouth.cs176.s1297598.lab02;

public class L1Test {
	
	public static void main (String [] args) {
		System.out.println("Lab 1");
		
		//Instantiate Student List Class
		
		StudentList cs176List = new StudentList(14);//change this 15
		
		//instantiate a student
		
		Student s1 = new Student ("Ahmed, Saahil", "1219200", "s1219200@monmouth.edu", "CS", 2, "E.Cesario", 1.0, null);
		Student s2 = new Student ("Berardis, Anthony", "1297598", "s1297598@monmouth.edu", "CS", 2, "R.Scherl", 1.0, null);
		Student s3 = new Student ("Clappsy, Thomas", "1218375", "s1218375@monmouth.edu", "CS", 2, "R.Scherl", 1.0, null);
		Student s4 = new Student ("Coyle, Shannon", "1226097", "s1226097@monmouth.edu", "CS", 2, "R.Scherl", 1.0, null);
		Student s5 = new Student ("Johnson, Spencer", "1224708", "s1224708@monmouth.edu", "CS", 2, "R.Scherl", 1.0, null);
		Student s6 = new Student ("Jones, Matthew", "1095689", "s1095689@monmouth.edu", "CS", 2, "R.Scherl", 1.0, null);
		Student s7 = new Student ("Kliks, Angela", "1137151", "s1137151@monmouth.edu", "CS", 2, "R.Scherl", 1.0, null);
		Student s8 = new Student ("Krempa, Ian", "1233625", "s1233625@monmouth.edu", "CS", 2, "R.Scherl", 1.0, null);
		Student s9 = new Student ("Marquez, Veronica", "1125739", "s1125739@monmouth.edu", "CS", 2, "R.Scherl", 1.0, null);
		Student s10 = new Student ("McKnight, Anthony", "1249736", "s1249736@monmouth.edu", "CS", 2, "R.Scherl", 1.0, null);
		Student s11 = new Student ("Patel, Premkumar", "1205153", "s1205153@monmouth.edu", "CS", 2, "R.Scherl", 1.0, null);
		Student s12 = new Student ("Patel, Sahil", "1245759", "s1245759@monmouth.edu", "CS", 2, "R.Scherl", 1.0, null);
		Student s13 = new Student ("Robinson, Annabelle", "1212304", "s1212304@monmouth.edu", "CS", 2, "R.Scherl", 1.0, null);
		Student s14 = new Student ("Vella, Nicholas", "0999371", "s0999371@monmouth.edu", "CS", 2, "R.Scherl", 1.0, null);

		/**
		 * Adding the Students to cs176 Object
		 */
		//Add student list
		cs176List.addStudent(s1);
		cs176List.addStudent(s2);
		cs176List.addStudent(s3);
		cs176List.addStudent(s4);
		cs176List.addStudent(s5);
		cs176List.addStudent(s6);
		cs176List.addStudent(s7);
		cs176List.addStudent(s8);
		cs176List.addStudent(s9);
		cs176List.addStudent(s10);
		cs176List.addStudent(s11);
		cs176List.addStudent(s12);
		cs176List.addStudent(s13);
		cs176List.addStudent(s14);
		
		/* Listing all students before any update to graduation years
		cs176List.listStudents();
		System.out.println("\n\n\n\n");
		
		//Updating graduation years
		cs176List.updateStudentGraduationYear("0999371", 2020); //Vella N
		cs176List.updateStudentGraduationYear("1205153", 2020);// Patel, P
		cs176List.updateStudentGraduationYear("1212304", 2020); // Robinson A

		//Listing students with new graduation years
		cs176List.listStudents(); // Expect: Vella, N to be 2020 from null, Expect: Patep, p to be 2020 from null, Expect: Robinson A to be 2020 from null.*/
		
		Integer SC = cs176List.studentCount("CS");
		System.out.println(SC);
		
		SC = cs176List.studentCount("CE");
		System.out.println(SC);
		
		Student DB = cs176List.Find1("s1297598@monmouth.edu");
		System.out.println(DB);
		
		DB = cs176List.Find1("anthonyberardis@gmail.com");
		System.out.println("Student not Found");
	}
}