package com.pmaven1.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pmaven1.model.Category;

@Repository
public interface CategoryDAO {
	public void Category(Category ct);
	public  List<Category> getProducts();
	Category single_object(int pid);
	void edit_list(Category adp);
	public void deleteRow(int id);
	Category getAddcategoryById(int id);
	
}
