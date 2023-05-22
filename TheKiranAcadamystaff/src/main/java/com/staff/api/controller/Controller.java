package com.staff.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.staff.api.model.Staff;
import com.staff.api.service.Service;

@RestController
public class Controller {
	
	@Autowired
	Service ss;
	@PostMapping("in")
	String insertdata(@RequestBody Staff staff) {
		String str=ss.insertdata(staff);
		return str;
		
	}
	@GetMapping("all")
	List<Staff> getAllData() {
		
		List<Staff> list=ss.getAllData();
		return list;
	}
	
	@GetMapping("avgsal")
	List<Staff> avgsal() {
		List<Staff> k= ss.avgsal();
		return k;
	}
	
	@GetMapping("bet")
	List<Staff> between() {
		List<Staff> l=ss.between();
		return l;
	}
	
	@GetMapping("max")
	List<Staff> maxsal() {
		List<Staff> sss=ss.maxsal();
		return sss;
	}
	
	@PutMapping("up")
	Staff update(@RequestBody Staff staff) {
		Staff st=ss.update(staff);
		return st;
	}
	
	@GetMapping("minex")
	String miniexpe() {
		String k=ss.miniexperi();
		return k;
	}
	
	@GetMapping("tr")
	List<Staff> profile() {
		List<Staff> st=ss.profile();
		return st;
		
	}
	
	
	
	
}
