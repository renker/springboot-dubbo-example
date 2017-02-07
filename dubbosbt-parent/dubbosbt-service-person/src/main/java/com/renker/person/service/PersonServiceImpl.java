package com.renker.person.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service(group="person", protocol={"dubbo"})
public class PersonServiceImpl implements PersonService{

	public int hellow() {
		return 0;
	}
	
}
