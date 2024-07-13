package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductDAO {
	public void update(Product product) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sys as sysdba","sundar");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into product values(?,?,?)");
			preparedStatement.setInt(1,product.getP_id() );
			preparedStatement.setString(2,product.getP_name());
			preparedStatement.setInt(3, product.getP_price());
			preparedStatement.executeQuery();
			System.out.println("Updated...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
