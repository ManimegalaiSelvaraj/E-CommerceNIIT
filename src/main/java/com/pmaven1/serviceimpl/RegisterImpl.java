package com.pmaven1.serviceimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pmaven1.DAO.RegisterDAO;
import com.pmaven1.model.Register;
import com.pmaven1.model.UserCredential;

@Service
public class RegisterImpl implements RegisterDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	//@Autowired
	//RegisterDAO registerdao;
	public void adduser(Register r) {
		//System.out.println("Register DAO");
		//System.out.println(r.getId());
		//System.out.println(r.getName());
		//r.setEnabled(True);
		UserCredential uc=new UserCredential();
		uc.setName(r.getName());
	    uc.setPassword(r.getPassword());
	    uc.setRole("ROLE_USER");
		//System.out.println("User Credentials");
		try
		{
		Session session= sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		//tx.begin();
		session.save(r);
		session.save(uc);
		tx.commit();
		session.flush();
		session.close();
		} 
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}		
	}

	public void edituser(int i) {
		// TODO Auto-generated method stub
		
	}

	public void deluser(int i) {
		// TODO Auto-generated method stub
	}

	public void showuser() {
					
	}

	public UserCredential getid(String id) {
		// TODO Auto-generated method stub
		return getid(id);	}

	public UserCredential getUserById(String id) {
		// TODO Auto-generated method stub
		return getUserById(id);
	}
	

}
