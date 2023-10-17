package com.sunbeam;

public abstract class FindMinimum{
	public static <T extends Number & Comparable<T>> T findMin(T[] arr) {
	   T min = arr[0];
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i].compareTo(min)< 0) 
	    	{
	    	min = arr[i];	
	    	}
	    }
	    return min;
	    
	}
   public static void main(String[] args) {
		Integer[] arr1 = {22,55,77,11,33};
		Integer min1 = findMin(arr1);
		System.out.println(min1);
		Double[] arr2 = {2.2,5.5,7.7,1.1,3.3};
		Double min2 = findMin(arr2);
		System.out.println(min2);

	}

}

