package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		if((password.length())<6)
		{
			throw new TooShortException("Password lenght is short.It should be more than 6");
		}
		else if((password.length())>15)
		{
			throw new TooLongException("Password lenght is long.It should be less than 15");
		}
		else
		{
			return true;
		}
	}

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		String[] usernames = {"Sri","Priya","Joe","Kathy"};
		for(String user:usernames)
		{
			if(user.equalsIgnoreCase(username))
			{
				throw new NameExistsException("Name already exists");
			}
		}
		return true;
	}

}
