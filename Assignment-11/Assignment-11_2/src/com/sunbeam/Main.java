
 package com.sunbeam;

// import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

 public class Main {

 	public static void main(String[] args) {
 		Set<Book> set = new LinkedHashSet<>();
 	    set.add(new Book("1","Gate","Kunal",1,20.0));  
 	    set.add(new Book("4","Rate","Rahul",2,50.0)); 
 	    set.add(new Book("5","Mate","Somesh",1,60.0)); 
 	    set.add(new Book("3","Date","Aman",4,10.0)); 
 	    set.add(new Book("2","Late","Shivansh",3,20.0)); 
 	    set.add(new Book("5","Sate","Vijay",5,90.0)); 
	    
 	    for(Book b: set) {
 	    	System.out.println(b);
 	    }
 	}

 }
 

//// If any duplicate isbn is added then the duplicate value is not allowed, as set doesn't contain any duplicate value in it. 
//// the first occured isbn is allowed only, and duplicate one is not allowed. 

// book Insertion order is maintained .
 
 