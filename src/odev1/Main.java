package odev1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<LogService> services=new ArrayList<LogService>();
		services.add(new DatabaseLogService());
		services.add(new EmailLogService());
		services.add(new FileLogService());
		Instructor instructor=new Instructor(1,"Seher","Çakýr");
		Category category=new Category(1,"programlar");
		Course course=new Course(1,"Java ile Programlama", instructor,category);
		
		Instructor instructor1=new Instructor(2,"RABÝA","Çakýr");
		Category category1=new Category(2,"uygulamalar");
		Course course1=new Course(2,"Python ile Programlama", instructor1,category1);
		
		Instructor instructor2=new Instructor(3,"ali","Çakýr");
		Category category2=new Category(3,"teori");
		Course course2=new Course(3,"Ruby ile Programlama", instructor2,category2);
		
		
		
		CategoryManager categoryManager=new CategoryManager();
		InstructorManager instructorManager=new InstructorManager();
		
		CourseManager courseManager=new CourseManager(instructorManager, categoryManager, services);
		courseManager.add(course);
		courseManager.add(course1);
		courseManager.add(course2);
	
		
		List<Course> courses=courseManager.getAll();
		
		for(Course c:courses)
		{
			System.out.println(c.getCategory().getName()+ " "+c.getName()+" "+c.getInstructor().getName()+" "+c.getInstructor().getLastName());
		}
		
		courseManager.delete(course2);
		for(Course c:courses)
		{
			System.out.println(c.getCategory().getName()+ " "+c.getName()+" "+c.getInstructor().getName()+" "+c.getInstructor().getLastName());
		}
		
		
	}

}
