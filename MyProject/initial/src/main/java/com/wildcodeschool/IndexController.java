package com.wildcodeschool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/doctor/1")
    @ResponseBody
    public String doctorone() {
	  return "<h2>1 - William Hartnell</h2>"
			  + "<ul><li><a href='/'><h3>Home</h3></a></li></ul>"; 
    }

    @RequestMapping("/doctor/2")
    @ResponseBody
    public String doctortwo() {
	  return "<h2>2 - Patrick Troughton</h2>"
			  + "<ul><li><a href='/'><h3>Home</h3></a></li></ul>"; 
    }
    
    @RequestMapping("/doctor/3")
    @ResponseBody
    public String doctorthree() {
	  return "<h2>3 - Jon Pertwee</h2>"
			  + "<ul><li><a href='/'><h3>Home</h3></a></li></ul>"; 
    }
    
    @RequestMapping("/doctor/4")
    @ResponseBody
    public String doctorfour() {
	  return "<h2>4 - Tom Baker</h2>"
			  + "<ul><li><a href='/'><h3>Home</h3></a></li></ul>"; 
    }
}