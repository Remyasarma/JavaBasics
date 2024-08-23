package com.voterapp.main;

import com.voterapp.service.IElectionBoothService;
import com.voterapp.exception.InValidVoterException;
import com.voterapp.service.ElectionBoothServiceImpl;

public class Voter {

	public static void main(String[] args) {
		 IElectionBoothService electionBoothService = new ElectionBoothServiceImpl();

	        try {
	            boolean isEligible = electionBoothService.checkEligibility(21, "Cherthala", 4563);
	            if (isEligible) {
	                System.out.println("Voter is eligible.");
	            }
	        } catch (InValidVoterException e) {
	            System.out.println(e.getMessage());
	        }

	}

}
