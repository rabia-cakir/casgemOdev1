package odev1;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
	
	private List<LogService> log;
	private InstructorManager instructorManager;
	private CategoryManager categoryManager;
	private List<Course> courses;
	
	public CourseManager(InstructorManager instructorManager, CategoryManager categoryManager, List<LogService> log)
	{
		courses=new ArrayList<Course>();
		this.log=log;
		this.instructorManager=instructorManager;
		this.categoryManager=categoryManager;
	}
	
	public List<Course> getAll()
	{
		return courses;
	}
	
	public void add(Course course)
	{
		if(!checkIfCourseExist(course.getName()))
		{	courses.add(course);
			instructorManager.add(course.getInstructor());
			categoryManager.add(course.getCategory());
			logMessage("eklendi");
			
			
		}
		
		else
			System.out.println("kurs mevcut");
	}
	
	public void delete(Course course)
	{
		courses.remove(getById(course.getId()));
		logMessage("loglandý");
		
	}
	
	public void update(Course course)
	{
		Course courseToUpdate=getById(course.getId());
		courseToUpdate.setCategory(course.getCategory());
		courseToUpdate.setInstructor(course.getInstructor());
		courseToUpdate.setName(course.getName());
		categoryManager.update(course.getCategory());
		instructorManager.update(course.getInstructor());
	}
	
	
	public Course getById(int id)
	{
		Course courseToFind=null;
		for(Course course:courses)
		{
			if(course.getId()==id)
				courseToFind=course;
		}
		
		return courseToFind;
	}
	
	private void logMessage(String message)
	{
		for(LogService logs: log)
		{
			logs.log("loglandý");
		}
		
	}

	public boolean checkIfCourseExist(String courseName)
	{
		boolean exist=false;
		for(Course course:courses)
		{
			if(course.getName()==courseName)
				exist=true;
		}
		
		return exist;
	}
}
