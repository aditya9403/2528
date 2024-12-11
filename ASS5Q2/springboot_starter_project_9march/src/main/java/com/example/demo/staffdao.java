package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class staffdao implements Staffservice
{
    @Autowired
	StaffRepo sr;
	
	@Override
	public void savedata(staff s1) 
	{
		sr.save(s1);		
		
	}

	@Override
	public List<staff> getinfo()    //display data
	{
		return sr.findAll();
	}

	@Override
	public void deletedata(int id) {     //delete data
		
		sr.deleteById(id);
		
	}

	@Override                              //edit data
	public staff getSingledata(int id) {
		 staff s=sr.getById(id);
		 return s;
	}

	@Override                                //update data
	public void updatedata(staff s1) {
		sr.save(s1);
		
	}

}
