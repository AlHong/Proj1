package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
	@Autowired
	private UserDAO userDao;
	
	@RequestMapping(value ="/greeting", method= RequestMethod.POST)
	public @ResponseBody SendData greeting (@RequestBody RecievedData message){
		SendData data = new SendData(message.getUrl());
		userDao.save(message);		
		return data;
	}
}
