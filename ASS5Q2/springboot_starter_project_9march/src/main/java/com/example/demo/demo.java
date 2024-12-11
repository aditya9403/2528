package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class demo {
	
	@Autowired
	Staffservice ss;

	@RequestMapping("/")
	public String disp() {
		return "index";
	}
	
	@PostMapping("/sky")
	public String getdata( @ModelAttribute("s1") staff s1)
	{
		ss.savedata(s1);
		return "redirect:/welcome";
	}
	
	@RequestMapping("/welcome")     //display table
	public String one(Model m) 
	{
		List<staff> sr=ss.getinfo();
		m.addAttribute("sr",sr);
		return "welcome";
	}	
	
	@RequestMapping("/del")
	public String four(@RequestParam("id") int id)  //delete data
	{
		ss.deletedata(id);
		return "redirect:/welcome";
	}
	

	@RequestMapping("/edit")
	public String four(@RequestParam("id") int id,ModelMap m)  //edit page load
	{
		 staff a1= ss.getSingledata(id);
		 m.addAttribute("a1",a1);
		 return "edit";
	}
	
	@PostMapping("/fly")
	public String five(@ModelAttribute("a1") staff a1)  //record update
	
	{
		ss.updatedata(a1);
		return "redirect:/welcome";
	}
	
	
}
