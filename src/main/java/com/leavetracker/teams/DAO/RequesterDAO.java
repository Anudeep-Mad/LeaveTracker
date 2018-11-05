package com.leavetracker.teams.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.leavetracker.teams.models.RequesterModel;

@Repository
public class RequesterDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	class RequesterRowMapper implements RowMapper < RequesterModel > {
	    @Override
	    public RequesterModel mapRow(ResultSet rs, int rowNum) throws SQLException {
	        RequesterModel req_model = new RequesterModel();
	        req_model.setEmail(rs.getString("EMAIL"));
	        req_model.setFirst_name(rs.getString("FIRST_NAME"));
	        req_model.setFirst_name(rs.getString("LAST_NAME"));
	       return req_model;
	       
	    }
	}
	
	public List < RequesterModel > findAll() {
	    return jdbcTemplate.query("select * from REQUESTER", new RequesterRowMapper());
	}

	 public void insert(RequesterModel requester) {
		 
	        jdbcTemplate.update("insert into REQUESTER (REQUESTER_ID,FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, IS_APPROVER	) " + "values(?, ?, ?, ?, ?, ?)",
	                requester.getRequester_Id(),requester.getFirst_name(),requester.getLast_name(),requester.getEmail(), requester.getPassword(), requester.getIs_approver());
	    }

	
}
