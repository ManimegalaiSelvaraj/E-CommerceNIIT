package com.pmaven1.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Column
	String name;
	@Column
	String Desc;
	@OneToMany(mappedBy="category")
	   private List<AddProduct> products;
	 //private Set<AddProduct> products;
	public int getId() {
			return id;
		}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	public List<AddProduct> getProducts() {
		return products;
	}
	public void setProducts(List<AddProduct> products) {
		this.products = products;
	}
	@Override
	public String toString()
	{
		return this.id + " " +this.name;
	}
	

}
