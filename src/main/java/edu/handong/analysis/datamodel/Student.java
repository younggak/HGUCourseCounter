package edu.handong.analysis.datamodel;

public class Student {
	
	private String studentld;
	private ArrayList<Course> CoursesTaken;
	private HashMap<String,Integer>semestersByYearAndSemester;

	public Student(String studentld) {
		this.studentld=studentld;
	}
	public void addCourse(Course newRecord) {
		
	}
	public HashMap<String,Integer>getSemestersByYearAndSemester(){
		
	}
	public int getNumCourselnNthSementer(int semester) {
		
	}
}
