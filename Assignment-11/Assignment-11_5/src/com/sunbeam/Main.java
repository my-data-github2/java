
package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static int menu() {
		int choice;
		System.out.println("0. Exit");
		System.out.println("1. Insert in map");
		System.out.println("2. Find in map");
		System.out.print("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Map<String, Book> map = new HashMap<>();
		int choice;
		

	while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: // insert in map
				
				Book b1= new Book("7","Gate","Kunal",1,20.0);
				map.put(b1.getIsbn(), b1);
				System.out.println(map);
				
				break;
			case 2: // find in map
				Scanner sc = new Scanner(System.in);
				String isbn = sc.next();
				Book f = map.get(isbn);
				System.out.println(f);
				break;

			}

		}
	}

}