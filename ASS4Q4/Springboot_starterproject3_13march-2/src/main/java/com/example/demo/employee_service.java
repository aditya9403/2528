package com.example.demo;

import java.util.List;

public interface employee_service 
{

	void savedata(employee e1);
    
	List<employee>getinfo();

	void deletedata(int sid);
	
	
}
