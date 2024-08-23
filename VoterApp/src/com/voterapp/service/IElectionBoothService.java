package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;

public interface IElectionBoothService {

	  boolean checkEligibility(int age,String locality,int vid) throws InValidVoterException; 
}
