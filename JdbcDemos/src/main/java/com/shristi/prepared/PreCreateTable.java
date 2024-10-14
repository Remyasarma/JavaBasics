package com.shristi.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreCreateTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/training";
		String username = "root";
		String password = "root";
		String sql = """
				create table product(product_name varchar(20),
				product_Id int primary key auto_increment,
				brand varchar(20),price float)
				""";
		try(Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement statement =connection.prepareStatement(sql);
				){
			System.out.println(statement.execute());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
