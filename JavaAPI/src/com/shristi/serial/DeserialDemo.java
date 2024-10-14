package com.shristi.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.shristi.lang.Employee;

public class DeserialDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		try(FileInputStream fin = new FileInputStream("stud.ser");
				ObjectInputStream oin = new ObjectInputStream(fin);
				){
			
		Student student = (Student) oin.readObject();
		Employee emp =(Employee) oin.readObject();
		System.out.println(emp);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

