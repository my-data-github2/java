package com.sunbeam;

import java.util.Comparator;

public class Sort{
	
	public static <T> void selectionSort(T[] arr, Comparator<T> c) { 
	    for(int i=0; i<arr.length-1; i++) { 
	        for(int j=i+1; j<arr.length; j++) { 
	            if(c.compare(arr[i], arr[j]) > 0) { 
	               T temp = arr[i]; 
	               arr[i] = arr[j]; 
	               arr[j] = temp; 
	            } 
	        } 
	    } 
	} 

	public static void main(String[] args) {
		
		Double[] arr1 = {2.2,4.4,1.1,3.3};
		class DoubleComparator implements Comparator<Double>{
			public int compare(Double d1, Double d2) {
				return Double.compare(d1,d2);
			}
		}
		DoubleComparator cmp = new DoubleComparator();
		selectionSort(arr1,cmp);
	for(Double ele:arr1) {
		System.out.println(ele);
	}
 
	}

}
