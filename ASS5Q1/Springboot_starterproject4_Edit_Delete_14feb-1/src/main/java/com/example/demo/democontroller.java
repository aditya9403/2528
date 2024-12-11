package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class democontroller {
	
	@Autowired
	studentservice ss;
	
	@RequestMapping("/")
		public String one() {
			
		return "index";	
		}
	@PostMapping("/sky")
    public String two(@ModelAttribute("s1") student s1)
    {
    	ss.savedata(s1);
    	return "redirect:/welcome";
    }
	 
	 @RequestMapping("/welcome")
		public String three(Model m)
		{
     	List<student> ee=ss.getinfo();
     	m.addAttribute("ee",ee);
		    return "welcome";	
		}
     
     @RequestMapping("/del")
     public String four(@RequestParam("id")int id)
     {
     	ss.deletedata(id);
     	return "redirect:/welcome";
     }
	
	}


