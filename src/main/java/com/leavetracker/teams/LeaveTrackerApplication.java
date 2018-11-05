package com.leavetracker.teams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.leavetracker")
public class LeaveTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaveTrackerApplication.class, args);
	}
}
