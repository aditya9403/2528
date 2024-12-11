package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentdao implements studentservice {

	@Autowired
	student_repo sr;
	@Override
	public void savedata(student s1) {
		
		sr.save(s1);
		
		
	}
	@Override
	public List<student> getinfo() {
		return sr.findAll();
	}
	@Override
	public void deletedata(int id) {
		sr.deleteById(id);
	}

}
