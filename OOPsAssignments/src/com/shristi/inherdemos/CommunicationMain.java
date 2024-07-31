package com.shristi.inherdemos;

public class CommunicationMain {

	public static void main(String[] args) {
		Communication communication = new Communication();
		communication = new MailCommunication();
		communication.sendMessage();
		communication = new SMSCommunication();
		communication.sendMessage();
		communication = new PhoneCommunication();
		communication.sendMessage();
		communication = new WhatsappCommunication();
		communication.sendMessage();

	}

}
