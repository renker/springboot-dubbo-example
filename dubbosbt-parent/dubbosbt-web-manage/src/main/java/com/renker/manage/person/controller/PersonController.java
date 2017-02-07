package com.renker.manage.person.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.renker.person.service.PersonService;

@RestController
@RequestMapping("dubbo")
public class PersonController {
	
	@Reference(group="person")
	private PersonService personService;
	
	@RequestMapping(value="hellow",method=RequestMethod.GET)
	public String Hellow(){
		int res = personService.hellow();
		return ""+res;
	}
}
