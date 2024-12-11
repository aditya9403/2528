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
public class employeecon
{
	@Autowired
	employee_service es;

	        @RequestMapping("/")
			public String one()
			{
			  return "index";	
			}
	        
	        @PostMapping("/sky")
	        public String two(@ModelAttribute("e1") employee e1)
	        {
	        	es.savedata(e1);
	        	return "redirect:/welcome";
	        }
	        @RequestMapping("/welcome")
			public String three(Model m)
			{
	        	List<employee> ee=es.getinfo();
	        	m.addAttribute("ee",ee);
			    return "welcome";	
			}
	        
	        @RequestMapping("/del")
	        public String four(@RequestParam("sid")int sid)
	        {
	        	es.deletedata(sid);
	        	return "redirect:/welcome";
	        }
}
