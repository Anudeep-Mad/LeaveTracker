package com.leavetracker.team.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leavetracker.teams.DAO.RequesterDAO;
import com.leavetracker.teams.models.RequesterModel;

@Service
public class LeaveTrackerService {
	
	@Autowired
	public RequesterDAO requesterDAO;
	
	public void userLogin(RequesterModel requesterModel) {
		requesterDAO.insert(requesterModel);
		
		
		
		
	}

}
