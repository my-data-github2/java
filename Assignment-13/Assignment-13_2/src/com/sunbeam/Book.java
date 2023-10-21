package com.sunbeam;

import java.io.InputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class Book implements Serializable{

	String isbn;
	double price;
	String author;
	int quantity;

	public Book() {

	}

	public Book(String isbn, double price, String author, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.author = author;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", author=" + author + ", quantity=" + quantity + "]";
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the isbn:");
		isbn = sc.nextLine();
		System.out.print("Enter the Author name:");
		author = sc.nextLine();
		System.out.print("Enter the Book quantity:");
		quantity = sc.nextInt();
		System.out.print("Enter the Price:");
		price = sc.nextInt();
	}

	public static int menu() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("0. Exit");
		System.out.println("1. Add book");
		System.out.println("2. Display All Books in forward using random access");
		System.out.println("3. Find a book");
		System.out.println("4. Delete a book using index");
		System.out.println("5. Delete using isbn");
		System.out.println("6. Reverse the booklist");
		System.out.println("7. Save the books");
		System.out.println("8. load the books");
		choice = sc.nextInt();
		return choice;

	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}

	public static void main(String[] args) {

		List<Book> bookList = new ArrayList<>();
		int choice, index;
		Book key;
		Book b1;
		String isbn;
		Scanner sc = new Scanner(System.in);
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				b1 = new Book();
				b1.accept();
				if (bookList.contains(b1)) {
					index = bookList.indexOf(b1);
					Book bk = bookList.get(index);
					bk.setQuantity(bk.getQuantity() + 1);
				}
				bookList.add(b1);
				break;
			case 2:
				for (Book book : bookList) {
					System.out.println(book);
				}
				break;
			case 3:

				System.out.print("Enter the isbn for searching:");
				isbn = sc.nextLine();
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
				}
				break;
			case 5:
				System.out.println("Enter isbn for deletion of book = ");
				isbn = sc.next();
				bookList.remove(isbn);
				System.out.println("Book with isbn deleted");
				break;
			case 6:
				Collections.reverse(bookList);
				System.out.println(bookList);
				break;
			case 7:
				try (FileOutputStream fout = new FileOutputStream("Books1.txt")) {
					try (ObjectOutputStream oout = new ObjectOutputStream(fout)) {
						oout.writeObject(bookList);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Books saved");

				break;
			case 8:
				List<Book> booklist;
				try (FileInputStream fin = new FileInputStream("Books2.txt")) {
					try (ObjectInputStream oin = new ObjectInputStream(fin)) {
						bookList = ((List<Book>) oin.readObject());
					}
				} catch (Exception e) {
//					System.out.println("Books loaded");

				}
//				System.out.println("Books loaded");

				break;
			default:
				System.out.println("Wrong choice.");
				break;
			}
		}

	}

}
