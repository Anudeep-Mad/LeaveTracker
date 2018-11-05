package com.leavetracker.teams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leavetracker.team.service.LeaveTrackerService;
import com.leavetracker.teams.models.RequesterModel;

@Controller
public class LeaveTrackerController {
	
	@Autowired
	public LeaveTrackerService leaveTrackerService;
	
	@RequestMapping(value="/index")
	@ResponseBody
	public String getIndex() {
		return "Hello World";
	}
	
	@PostMapping(value="/signup" )
	public void userLogin(@RequestBody RequesterModel requesterModel)	{
		leaveTrackerService.userLogin(requesterModel);
		
	}
	
	
	
	
	

}
