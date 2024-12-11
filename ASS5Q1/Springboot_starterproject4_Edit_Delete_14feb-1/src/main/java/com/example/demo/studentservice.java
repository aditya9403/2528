package com.example.demo;

import java.util.List;

public interface studentservice {
	
	void savedata(student s1);
	List<student>getinfo();

	void deletedata(int id);

}
