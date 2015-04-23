package org.inc.service.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/greeting")
public class RestfulController 
{
	 @RequestMapping(value = "/{name}", method = RequestMethod.GET)
	 public String getGreeting(@PathVariable String name)
	 {
	  String result="Hello Azad"+name;  
	  return result;
	}
}
