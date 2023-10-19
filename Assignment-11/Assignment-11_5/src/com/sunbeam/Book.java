package com.sunbeam;
import java.util.Scanner;

public class Book {
	String isbn;
	String title;
	String author;
	int quantity;
	double price;

	public Book() {
	}

	public Book(String isbn, String title, String author, int quantity, double price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
		this.price = price;
	}

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

}
