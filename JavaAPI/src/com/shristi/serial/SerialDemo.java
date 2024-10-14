package com.shristi.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialDemo {
	public static void main(String[] args) throws IOException {
		Student student = new Student("Remya",12,"MCA");
		try(
			FileOutputStream fs = new FileOutputStream("stud.ser");
			ObjectOutputStream os = new ObjectOutputStream(null);)
		{
		
			os.writeObject(student);
			System.out.println("Serialized");}
			catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
