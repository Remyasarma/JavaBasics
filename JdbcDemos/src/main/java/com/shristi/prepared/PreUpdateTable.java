package com.shristi.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreUpdateTable {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/training";
		String username = "root";
		String password = "root";
		String sql = "update product set price = ? where product_Id =?";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setDouble(1, 50000);
			statement.setInt(2, 6);
			// call execute to execute the query
			System.out.println("Updated count " + statement.executeUpdate());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
