package com.movies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MoviesDAO {
	public void create() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Sys as sysdba","sundar");
			PreparedStatement preparedStatement=con.prepareStatement("create table Movies(id number(20)primary key,title varchar(20),genre varchar(20),year number(10))");
			preparedStatement.executeQuery();
			System.out.println("Created");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void add(Movie movie) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Sys as sysdba","sundar");
			PreparedStatement preparedStatement=con.prepareStatement("insert into Movies values(?,?,?,?)");
			preparedStatement.setInt(1,movie.getId());
			preparedStatement.setString(2,movie.getTitile());
			preparedStatement.setString(3,movie.getGenre());
			preparedStatement.setInt(4,movie.getYear());
			preparedStatement.executeQuery();
			System.out.print("Added");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void delete(int id) {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Sys as sysdba","sundar");
			PreparedStatement preparedStatement=con.prepareStatement("delete from movies where id=?");
			preparedStatement.setInt(1, id);
			preparedStatement.executeQuery();
			System.out.println("Deleted..");
			con.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void display() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Sys as sysdba","sundar");
			PreparedStatement preparedStatement=con.prepareStatement("select * from movies");
			ResultSet resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.print(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+"\n");
			
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void update(String atr,String val,int id) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Sys as sysdba","sundar");
			PreparedStatement preparedStatement=con.prepareStatement("update movies set ?='?' where id=?");
			   String query = "UPDATE movies SET "+ atr +" = '"+val+"' WHERE id = "+id;
		        preparedStatement = con.prepareStatement(query);
		        preparedStatement.executeUpdate();
			System.out.println("Updated..");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
