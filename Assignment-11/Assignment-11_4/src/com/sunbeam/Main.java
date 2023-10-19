package com.sunbeam;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;
import java.util.NavigableSet;


public class Main {

	public static void main(String[] args) {
		TreeSet<Book> set = new TreeSet<>(priceComparator);
		set.add(new Book("1", "Gate", "Kunal", 1, 20.0));
		set.add(new Book("4", "Rate", "Rahul", 2, 50.0));
		set.add(new Book("5", "Mate", "Somesh", 1, 60.0));
		set.add(new Book("3", "Date", "Aman", 4, 10.0));
		set.add(new Book("2", "Late", "Shivansh", 3, 20.0));
		set.add(new Book("5", "Sate", "Vijay", 5, 90.0));

		//Iterating the set elements using the iterator method.
		System.out.println("Iterating the set elements using the iterator method");
		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
        Book b = itr.next();
        System.out.println(b);
		}
		
		System.out.println();
		//Iterating the set using the descending Iterator method.
		System.out.println("Iterating the set using the descending Iterator method.");
		Iterator<Book> revItr  = set.descendingIterator();
		while(revItr.hasNext()) {
		Book b = revItr.next();
		System.out.println(b);
		
		}
	}
}

// // If any duplicate isbn is added then the duplicate value is not allowed, as doesn't contain any duplicate value in it. 
// // the first occured isbn allowed only, and duplicate one is not allowed. 

// // books are based on hashcode.