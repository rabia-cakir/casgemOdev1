package odev1;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
	
	public List<Category> categories;
	
	public CategoryManager()
	{
		categories=new ArrayList<Category>();
	}
	
	public List<Category> getAll()
	{
		return categories;
	}
	
	public void add(Category category)
	{
		if(!checkIfCategoryExist(category.getName()))
			categories.add(category);
		
		else
			System.out.println("kategori mevcut.");
	}
	
	public void delete(Category category)
	{
		categories.remove(getById(category.getId()));
	}
	
	public void update(Category category)
	{
		Category categoryToUpdate=getById(category.getId());
		categoryToUpdate.setName(category.getName());
	}
	
	
	public Category getById(int id)
	{
		Category categoryToFind=null;
		for(Category category:categories)
		{
			if(category.getId()==id)
				categoryToFind=category;
		}
		
		return categoryToFind;
	}
	
	public boolean checkIfCategoryExist(String categoryName)
	{
		boolean exist=false;
		for(Category category:categories)
		{
			if(category.getName()==categoryName)
				exist=true;
		}
		
		return exist;
	}

}
