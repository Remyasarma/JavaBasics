package com.shristi.overloading;

public class MessengerMain {

	public static void main(String[] args) {

		Messenger messenger = new Messenger();
		messenger.sendMail("How are you?");
		messenger.sendMail("Remya", ", How are you?");
		messenger.sendMail("Remya", ", How are you?", "Greetings");

	}

}
