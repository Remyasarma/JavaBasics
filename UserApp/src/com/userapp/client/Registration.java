package com.userapp.client;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;
import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IValidationService validationService = new ValidationServiceImpl();

		try {
			System.out.print("Enter username: ");
			String username = scanner.nextLine();

			if (validationService.validateUsername(username)) {
				System.out.print("Enter password: ");
				String password = scanner.nextLine();

				if (validationService.validatePassword(password)) {

					System.out.println("Welcome " + username + ". You are registered.");
				}
			}
		} catch (NameExistsException e) {
			System.out.println(e.getMessage());
		} catch (TooShortException | TooLongException e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}
	}

}
