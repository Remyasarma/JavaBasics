package com.shristi.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PreSelectTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/training";
		String username = "root";
		String password = "root";
		String sql = "select * from product";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement statement = connection.prepareStatement(sql);
				ResultSet rs = statement.executeQuery();) {
			while (rs.next()) {
				int productId = rs.getInt("product_Id");
				String productName = rs.getString("product_name");
				float price = rs.getFloat("price");
				String brand = rs.getString("brand");
				System.out.println(productId+"\t"+productName+"\t"+price+"\t"+price);
				Product product =new Product(productName,brand,price,productId);
				System.out.println(product);

			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
