package com.pmaven1.DAO;

import org.springframework.stereotype.Repository;

import com.pmaven1.model.Register;
import com.pmaven1.model.UserCredential;

@Repository
public interface RegisterDAO 
{
public void adduser(Register reg); 

UserCredential getid(String id);

UserCredential getUserById(String id);
//UserCredential getUserByName(String username);
}
