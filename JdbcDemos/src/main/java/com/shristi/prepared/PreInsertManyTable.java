package com.shristi.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreInsertManyTable {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/training";
		String username = "root";
		String password = "root";
		String sql = "insert into product(product_name,brand,price) values(?,?,?)";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement statement = connection.prepareStatement(sql);
				Scanner sc = new Scanner(System.in);) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Enter the details");
				// set values for placeholder
				System.out.println("Enter the name,brand and price");
				statement.setString(1, sc.next());
				statement.setString(2, sc.next());
				statement.setDouble(3, sc.nextDouble());

				// call execute to execute the query
				System.out.println(!statement.execute());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
