package com.sunbeam;

import java.util.Scanner;
import com.sunbeam.comp.Check;

public class comp {
	
//	@Functional Interface
	interface Check<T>{
		boolean compare(T x, T y);
	}
	 static <T> int countIf(T[] arr, T key, Check<T> c) {
		 Integer [] arr1 = {44, 77, 99, 22, 55, 66}; 
		 Integer key1 = 50;
		 int cnt =0 ;
		 for(T ele: arr) {
			if(c.compare(ele, key))
				 cnt ++;
		 }
		 return cnt;
		 
		 	
	 }
	public static void main(String[] args) {
		Double[] arr2 = {1.1, 2.2,2.2,4.4,2.2,2.2,5.5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to find:");
		 double key2 = sc.nextDouble();
	    int ct = countIf(arr2, key2,(ele,k)->ele.equals(k));
	    System.out.println("Double vale ka count:"+ct);
	    
	}

}
