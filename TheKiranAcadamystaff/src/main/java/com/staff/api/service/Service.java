package com.staff.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.staff.api.dao.Dao;
import com.staff.api.model.Staff;

@org.springframework.stereotype.Service

public class Service {

	
	@Autowired
	Dao dao;
	public Object getAllData;

	public String insertdata(Staff staff) {
		
		return dao.insertdata(staff);
		
	}

	public List<Staff> getAllData() {
       return dao.getAllData();
	}

	public List<Staff> avgsal() {
	return	dao.avgsal();
		
	}

	public List<Staff> between() {
		return dao.between();
		
	}

	public List<Staff> maxsal() {
		return dao.maxsal();
		
	}

	public Staff update(Staff staff) {
		return dao.update(staff);
	}

	public String miniexperi() {
		return dao.miniexperi();
	}

	public List<Staff> profile() {
		return dao.profile();
	}
	
	
}
