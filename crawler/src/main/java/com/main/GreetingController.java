package com.main;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.domain.RecievedData;
import com.main.domain.SendData;
import com.main.domain.VideoDAO;


@RestController
public class GreetingController {
	@Autowired
	private VideoDAO videoDao;
	
	@RequestMapping(value ="/greeting", method= RequestMethod.POST)
	public @ResponseBody SendData greeting (@RequestBody RecievedData message){
		SendData data = new SendData(message.getUrl());
		videoDao.save(message);		
		return data;
	}
	
	@RequestMapping (value="/submit", method= RequestMethod.POST, headers = "Content-Type=application/x-www-form-urlencoded")
	@ResponseBody
	public  String formRequest(HttpServletRequest request){
		System.out.println(request.getContentLength());
		return "Hello";
		
	}
}
