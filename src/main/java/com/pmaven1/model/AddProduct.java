package com.pmaven1.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;
@Entity
public class AddProduct {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int pid;
	@Column
	String pName;
	@Column
	int pQuantity;
	@Column
	int pPrize;
	@Column
	String pDes;
	@ManyToOne
	@JoinColumn(name="id")
	private Category category;	

	@Transient
	private MultipartFile image;

	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	//@OneToOne
    //@JoinColumn(name="categoryId")
   // private Category category;
	public int getpid() {
		return pid;
	}
	public void setpid(int pid) {
		this.pid = pid;
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}
	public int getpPrize() {
		return pPrize;
	}
	public void setpPrize(int pPrize) {
		this.pPrize = pPrize;
	}
	
	public String getpDes() {
		return pDes;
	}
	public void setpDes(String pDes) {
		this.pDes = pDes;
	}

	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	
}
}