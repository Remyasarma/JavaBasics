package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {
	
	String[] localities = {"Cherthala","Alapuzha","KKLM"}; 

	@Override
	public boolean checkEligibility(int age, String locality, int voterId) throws InValidVoterException {
		if (!checkAge(age)) {
            throw new UnderAgeException("Voter is underage.");
        }

        if (!checkLocality(locality)) {
            throw new LocalityNotFoundException("Locality not found.");
        }

        if (!checkVoterId(voterId)) {
            throw new NoVoterIDException("Invalid voter ID.");
        }

        return true;
    }

    private boolean checkAge(int age) throws UnderAgeException {
        return age >= 18;
    }

    private boolean checkLocality(String locality) throws LocalityNotFoundException {
        for (String loc : localities) {
            if (loc.equalsIgnoreCase(locality)) {
                return true;
            }
        }
        return false;
    }
    private boolean checkVoterId(int voterId) throws NoVoterIDException {
        return voterId >= 1000 && voterId <= 9999;
    }
}
