package odev1;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
	private List<Instructor> instructors;
	
	public InstructorManager()
	{
		instructors=new ArrayList<Instructor>();
	}
	
	public List<Instructor> getAll()
	{
		return instructors;
	}
	
	public void add(Instructor instructor)
	{
		if(!checkIfInstructorNameExist(instructor.getName()))
			instructors.add(instructor);
		
		else
			System.out.println("eðitmen mevcut");
			
	}
	
	
	public void delete(Instructor instructor)
	{
		instructors.remove(getById(instructor.getId()));
	}
	

	public void update(Instructor instructor)
	{
		Instructor instructorToUpdate=getById(instructor.getId());
		instructorToUpdate.setLastName(instructor.getLastName());
		instructorToUpdate.setName(instructor.getName());
	}
	
	
	public boolean checkIfInstructorNameExist(String instructorName)
	{
		boolean exist=false;
		for(Instructor instructor:instructors)
		{
			if(instructor.getName()==instructorName)
				exist=true;
		}
		
		return exist;
	}
	
	public Instructor getById(int id)
	{
		Instructor instructorToFind=null;
		for(Instructor instructor:instructors)
		{
			if(instructor.getId()==id)
				instructorToFind=instructor;
		}
		
		return instructorToFind;
		
	}

	
	
}
