package com.sunbeam;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.sql.SQLException;
import java.text.ParseException;

public class Main {

	public static Date parseDate(String str) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
			Date sDate = sdf.parse(str);
			return sDate;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0. Exit");
		System.out.println("1. Add a user");
		System.out.println("2. Display all user");
		System.out.println("3. Update an user");
		System.out.println("4. Delete a user");
		System.out.print("Enter your choice:");
		int choice = sc.nextInt();
		return choice;

	}

	public static void main(String[] args) throws SQLException, Exception {
		int choice;
		Scanner sc = new Scanner(System.in);
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				try(userDao ud = new userDao()) {
					System.out.println("Add a user");
					User u  = new User();
					System.out.println("Enter first name:");
					String fName = sc.next();
					System.out.println("Enter last name:");
					String lName = sc.next();
					System.out.println("Enter email:");
					String email = sc.next();
					System.out.println("Enter password");
					String password = sc.next();
					System.out.println("Enter birth date:");
					String dob = sc.next();
					Date uDate = parseDate(dob);
					java.sql.Date sDate = new java.sql.Date(uDate.getTime());
					
					System.out.println("Enter status");
					boolean status= sc.nextBoolean();   
					System.out.println("Enter your role");
					String role = sc.next();
					u.setFirst_name(fName);
					u.setLast_name(lName);
					u.setEmail(email);
					u.setPassword(password);
					u.setDob(sDate);
					u.setStatus(status);
					u.setRole(role);
					int cnt = ud.add(u);
					System.out.println("User Added: "+cnt);
				}catch(Exception e) {
					e.printStackTrace();
					
				}
				break;
			case 2:
				try (userDao ud = new userDao()){
				    List<User> userList = new ArrayList<>();
					System.out.println("Display all users");
					userList = ud.display();
					userList.forEach(x -> System.out.println(x));
				}catch(Exception e) {
					e.printStackTrace();
				}

				break;

			case 3:
				try(userDao ud = new userDao()){
					User user = new User();
					System.out.println("Update user by id");
					System.out.print("Enter to update: ");
					int id = sc.nextInt();
					System.out.print("Enter first name: ");
					String fName = sc.next();
					user.setId(id);
					user.setFirst_name(fName);
					System.out.print("Enter last name: ");
					String lName = sc.next();
					user.setLast_name(lName);
					int cnt  =  ud.update(user);
					System.out.println("Rows Affected: "+cnt);
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
				try(userDao ud = new userDao()){
					User user = new User();
					System.out.print("Enter for deleting user: ");
					int id  = sc.nextInt();
					user.setId(id);
					int cnt = ud.delete(id);
					System.out.println("Rows Affected: "+cnt);
		 		}catch(Exception e) {
		 			e.printStackTrace();
		 		}

				break;
			}

		}

	}

}
