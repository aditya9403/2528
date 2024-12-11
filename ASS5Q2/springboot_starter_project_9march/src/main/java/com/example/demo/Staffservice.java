package com.example.demo;

import java.util.List;

public interface Staffservice
{
  void savedata(staff s1);
  
  List<staff>getinfo();   //display data

  void deletedata(int id);   //delete data
  
  staff getSingledata(int id);  //edit

   void updatedata(staff a1);    //update
  
}
