package com.pmaven1.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Register 
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column
int id;
@Column
String name;
@Column
String email;
@Column
String Address;
@Transient
@Column 
String password;
@Column
String conpassword;
@Column
private boolean enabled;

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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getconpassword() {
	return conpassword;
}
public void setconpassword(String conpassword) {
	this.conpassword = conpassword;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public boolean isEnabled() {
	return enabled;
}
public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}
}
