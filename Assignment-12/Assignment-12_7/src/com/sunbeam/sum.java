package com.sunbeam;

import java.util.Random;
import java.util.stream.Stream;

public class sum {

	public static void main(String[] args) {
	
		Random r = new Random();
		Stream<Integer> strm = Stream.generate(()->r.nextInt(100))
				.limit(10);
//		strm.forEach(ele -> System.out.println(ele));
				int res = strm.reduce(0,(a,e)->a+e);
				System.out.println(res);
		
		
	
	}

}
