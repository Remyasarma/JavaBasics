package com.shristi.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreInsertTable {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/training";
		String username = "root";
		String password = "root";
		String sql = "insert into product(product_name,brand,price) values(?,?,?)";
		Connection connection = DriverManager.getConnection(url, username, password);
		PreparedStatement statement = connection.prepareStatement(sql);
		try (connection; statement) {
			// set values for placeholders
			statement.setString(1, "Mobile");
			statement.setString(2, "Samsung");
			statement.setDouble(3, 20000);

			// call execute to execute the query
			System.out.println(!statement.execute());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
