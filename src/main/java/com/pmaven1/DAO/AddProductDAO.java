package com.pmaven1.DAO;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.pmaven1.model.AddProduct;
import com.pmaven1.model.Category;

@Repository
public interface AddProductDAO{
	public void addproduct(AddProduct ap);
	public  List<AddProduct> getProducts();
	AddProduct single_object(int pid);
	void edit_list(AddProduct adp);
	public void deleteRow(int id);
	List<Category> getAllCategories();
	 public AddProduct find(int id);
}
