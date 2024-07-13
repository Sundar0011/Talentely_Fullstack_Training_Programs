package com.connection;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Product product=new Product();
		product.setP_id(scanner.nextInt());
		product.setP_name(scanner.next());
		product.setP_price(scanner.nextInt());
		ProductDAO productDAO=new ProductDAO();	
		productDAO.update(product);
	}

}
         
