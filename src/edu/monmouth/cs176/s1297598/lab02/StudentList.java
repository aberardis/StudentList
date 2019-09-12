package edu.monmouth.cs176.s1297598.lab02;

public class StudentList {
	Student [] cs176Students;
	
	private int count = 0;
	
	public Integer studentCount (String major) {
		Integer count = 0;
		for(Student s: cs176Students) {
			if (s.getMajor() == major) {
				count++;
			}
	}
		return count;
		
}
	
	public Student Find1 (String email) {
				Student foundEmail = null;
				for (Student s: cs176Students) {
					if(s.getEmail().equals(email)) {
						return s;
					}else {
						continue;
					}
				}
				return foundEmail;
	}
	
	
	
	public Student Find (String id) {
				Student foundStudent = null;
				for (Student s: cs176Students) {
					if(s.getStudentID().equals(id)) {
						return s;
					}else {
						continue;
					}
				}
				return foundStudent;
	}
	
	public boolean updateStudentGraduationYear (String studentID, Integer year)
	{
		boolean result = false;
		Student student = Find(studentID);
		if (student != null) {
			student.setgraduationYear(year);
			return true;
		}
		return result;
			
		
	}
	
	
	/**
	 * Constructor for StudentList Class
	 */
	StudentList (int totalStudents) {
		cs176Students = new Student [totalStudents];
 
	}
	/**
	 * @param s - new student object
	 */
	public void addStudent (Student s) {
		cs176Students[count] = s;
		count++;
	}
	
	/**
	 * List the students using for-each loop
	 */
	public void listStudents () {
		for (Student s : cs176Students) {
			System.out.println(s.toString());
		}
	
	}
}