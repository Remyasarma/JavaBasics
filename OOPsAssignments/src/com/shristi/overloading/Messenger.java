package com.shristi.overloading;

public class Messenger {
	void sendMail(String message) {
		System.out.println(message);
	}

	void sendMail(String tousername, String message) {
		System.out.println(tousername + message);
	}

	void sendMail(String tousername, String message, String subject) {
		System.out.println(tousername + message + subject);
	}
}
