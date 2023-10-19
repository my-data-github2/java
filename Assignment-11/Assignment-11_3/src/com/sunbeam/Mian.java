

 package com.sunbeam;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

 public class Mian {

 	public static void main(String[] args) {
 		Set<Book> set = new TreeSet<>();
 	    set.add(new Book("1","Gate","Kunal",1,20.0));  
 	    set.add(new Book("4","Rate","Rahul",2,50.0)); 
 	    set.add(new Book("5","Mate","Somesh",1,60.0)); 
 	    set.add(new Book("3","Date","Aman",4,10.0)); 
 	    set.add(new Book("2","Late","Shivansh",3,20.0)); 
 	    set.add(new Book("5","Sate","Vijay",5,90.0)); 
	    
 	    Iterator<Book> itr =  set.iterator();
 	    while(itr.hasNext()) {
 	    	Book e = itr.next();
 	    	System.out.println(e);
 	    }
// 	    for(Book book: set) {
// 	    	System.out.println(book);
// 	    }
 	    }
 	}
 // Duplicates allowed in hai.

 