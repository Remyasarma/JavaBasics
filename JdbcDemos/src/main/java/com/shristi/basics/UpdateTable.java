package com.shristi.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateTable {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/training";
		String username = "root";
		String password = "root";
		String sql = "update employee set city ='Ernakulam' where empId =1";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();) {
			int updatedCount = statement.executeUpdate(sql);
			System.out.println(updatedCount);
		}

	}

}
