package com.staff.api.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.staff.api.model.Staff;

@Repository
public class Dao {
	
	@Autowired
	SessionFactory sf;
	private String experiance;
	
//insert data into table
	
	public String insertdata(Staff staff) {

		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		se.save(staff);
				
		tr.commit();
		
		se.close();
		return "Data Inserted";
	}
	
	
//		all info in table
	
	
	public List<Staff> getAllData() {
		Session se=sf.openSession();
		Criteria cr=se.createCriteria(Staff.class);
		List<Staff> l= cr.list();
		
		se.close();
		return l;
		
	}
	
//  	avarage salary in table 
	
	public List<Staff> avgsal() {
		Session session=sf.openSession();
		Criteria cr1=session.createCriteria(Staff.class);
		
		cr1.add(Restrictions.gt("salary", 20000));
		List<Staff> li=cr1.list();
		session.close();
		return li;
	}

//		Experiance between table
	
	
	public List<Staff> between() {
		Session session=sf.openSession();
		Criteria cr2=session.createCriteria(Staff.class);
		cr2.add(Restrictions.between("experiance", 10, 20));
		List<Staff> l=cr2.list();
		session.close();
		return l;
	}
	
//   	maximum salary of table
	
	public List<Staff> maxsal() {
		Session se=sf.openSession();
		@SuppressWarnings("deprecation")
		Criteria cr3=se.createCriteria(Staff.class );
		cr3.addOrder(Order.desc("salary"));
		List<Staff> l=cr3.list();
		se.close();
		return l;
	}

//		upadate staff
	
	public Staff update(Staff staff) {
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		se.update(staff);
		tr.commit();
		se.close();
		return staff;
	}

//  minimum experiance
	
	public String miniexperi() {
		Session se=sf.openSession();
		Criteria cr=se.createCriteria(Staff.class);
		cr.addOrder(Order.asc("experiance"));
		cr.setMaxResults(1);
		List<Staff> st=cr.list();
		String s2=null;
		for (Staff staff : st) {
			s2=staff.getName();
			
		}
		se.close();
		return s2;
		
	}

//	whose profile as trainer
	
	public List<Staff> profile() {
		Session se=sf.openSession();
		Criteria cr=se.createCriteria(Staff.class);
		cr.add(Restrictions.like("profile", "tainer"));
		List<Staff> ls=cr.list();
		se.close();
		return ls;
		
		
	}
	

	
	
	
}
