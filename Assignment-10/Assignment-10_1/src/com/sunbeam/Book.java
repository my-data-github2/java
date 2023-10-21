package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Book {
	String isbn;
	String title;
	String author;
	int quantity;
	double price;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void accept() {
		System.out.println("Enter isbn");
		Scanner sc = new Scanner(System.in);
		isbn = sc.nextLine();
		System.out.println("Enter Title");
		title = sc.nextLine();
		System.out.println("Enter Author");
		author = sc.nextLine();
		System.out.println("Enter Quantity");
		quantity = sc.nextInt();
		System.out.println("Enter Price");
		price = sc.nextDouble();
		
	}
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	Book other = (Book) obj;
	if(other.getIsbn().equals(this.isbn))
	return true;
	return false;
}
public int hashCode() {
	return Objects.hash(author, isbn, price, quantity);
}

static int menu() {
	int choice;
	System.out.println("------------------------------------------------------");
	System.out.println("Menu");
	System.out.println("1. Add new book in list");
	System.out.println("2. Display all books in forward order");
	System.out.println("3. Delete book at given index");
	System.out.println("4. Check if book with given isbn is in list or not");
	System.out.println("5. Delete all books in list");
	System.out.println("6. Display number of books in list");
	System.out.println("7. Sort all books by price in desc order");
	System.out.print("Enter your choice = ");
	choice = new Scanner(System.in).nextInt();
	System.out.println("------------------------------------------------------");

	return choice;
}
	public static void main(String[] args) {

		int choice, index;
		Book key;
		String isbn;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Book> bookList = new ArrayList<>();
		Book b;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				b = new Book();
				b.accept();
				if(bookList.contains(b)) {
					int idx = bookList.indexOf(b);
					Book bk = bookList.get(idx);
					bk.setQuantity(bk.getQuantity()+1);
				}
				bookList.add(b);
				break;
			case 2:
				for (Book book : bookList) {
					System.out.println(book);
				}
				break;
			case 3:
                System.out.println("Enter isbn for searching = ");
				isbn = sc.next();
				key = new Book();
				key.setIsbn(isbn);
				System.out.println(bookList.contains(key));
				break;
				
			case 4:
				System.out.println("Enter index for deletion of book = ");
				index = sc.nextInt();
				if (index < 0 && index > bookList.size()) {
					System.out.println("Wrong Index...:(");
					break;
				} else {
				bookList.remove(index);
					System.out.println("Book at given index deleted");
					break;
			}
			
			case 5:
				System.out.println("Enter isbn for deletion of book = ");
				isbn = sc.next();
				bookList.remove(isbn);
					System.out.println("Book with isbn deleted");
					break;
			
			case 6:
              Collections.reverse(bookList);
             System.out.println(bookList);
              
			default:
				System.out.println("Wrong Choice Entered :(");
				break;
			}
		}
		System.out.println("Thank you for using our Book App :)");
	}


}
