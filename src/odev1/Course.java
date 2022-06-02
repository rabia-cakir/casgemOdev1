package odev1;

public class Course {
	
	private int id;
	private String name;
	Instructor instructor;
	Category category;
	public Course() {
		super();
	}
		
	public Course(int id, String name, Instructor instructor, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}
