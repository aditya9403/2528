package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class employee_dao implements employee_service
{
	@Autowired
	employee_Repo er;

	@Override
	public void savedata(employee e1)
	{
		er.save(e1);
		
	}

	@Override
	public List<employee> getinfo() 
	{
		return er.findAll();
	}

	@Override
	public void deletedata(int sid) 
	{
		
		er.deleteById(sid);
	}

}
