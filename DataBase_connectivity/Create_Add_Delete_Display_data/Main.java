package com.movies;

import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Movies DataBase");
		System.out.println("1.Create table \n2.Add\n 3.Update \n 4.Delete \n5.Display");
		int opt=sc.nextInt();
		Movie movie=new Movie();
		
		MoviesDAO moviesDAO=new MoviesDAO();
		if(opt==1)
		moviesDAO.create();
		else if (opt==2) {
			System.out.println("Movie Id:");
			movie.setId(sc.nextInt());
			System.out.println("Movie Title:");
			movie.setTitile(sc.next());
			System.out.println("Movie Genre:");
			movie.setGenre(sc.next());
			System.out.println("Movie Year:");
			movie.setYear(sc.nextInt());
			moviesDAO.add(movie);
		}
		else if (opt==3) {
			System.out.println("Enter column name:");
			String col=sc.next();
			System.out.println("Enter value:");
			String val=sc.next();
			System.out.println("Enter Id:");
			int id=sc.nextInt();
			moviesDAO.update(col, val, id);
		}
		else if (opt==4) {
			System.out.println("enter Movie id:");
			int v=sc.nextInt();
			moviesDAO.delete(v);
		}
		else if(opt==5)
		{
			moviesDAO.display();
		}
	}

}
