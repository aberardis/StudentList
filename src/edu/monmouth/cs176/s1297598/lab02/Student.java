package edu.monmouth.cs176.s1297598.lab02;

public class Student {
	private String name;
	private String studentID;
	private String email;
	private String major;
	private Integer classLevel;
	private String advisor;
	private Double credits;
	private Integer graduationYear;
	
	/**
	 * @param name - Anthony Berardis
	 * @param  sID - s1297598
	 * @param email - s1297598@monmouth.edu
	 * @param major - Computer Science
	 * @param classLevel - 1
	 * @param advisor - R.Scherl
	 * @param credits - 1 
	 * @param graduationYear 
	 */ 
	
	Student (String name, String sID, String email, String major, Integer classLevel, String advisor, Double credits, Integer graduationYear )
	{ 
		this.name=name;
		this.studentID=sID;
		this.email=email;
		setMajor(major); //good practice
		this.classLevel=classLevel;
		this.advisor=advisor;
		this.credits=credits;
		this.graduationYear=graduationYear;
	}
	/**
	 * Getter method for major 
	 * @param major
	 */
	public void setMajor (String major) {
		this.major=major;
	}
		/**
		 * Getter method for setGraduationYear 
		 * @param graduationYear
		 */
		public void setgraduationYear (Integer graduationYear) {
			this.graduationYear=graduationYear;
}
		
		public String getStudentID () {
			return this.studentID;
			
		}
		
		public String getEmail () {
			return this.email;
		
	}
		public String getMajor () {
			return this.major;
		
	}
	//over object to return string
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return
				"Name:  " + this.name + "\n" +
				"Student ID:  " + this.studentID + "\n" +
				"Email:  " + this.email + "\n" +
				"Major:  " + this.major + "\n" +
				"Class:  " + this.classLevel + "\n" +
				"Advisor:  " + this.advisor + "\n" +
				"Credits:  " + this.credits + "\n" +
				"Graduation Year   " + this.graduationYear + "\n";
	}
	
}