package com.sunbeam;

import java.util.stream.IntStream;

public class Assign_8 {

	public static void main(String[] args) {
		IntStream s1 = IntStream.range(1, 10);
		int sum = s1.sum();
		System.out.println(sum);
		IntStream s2 = IntStream.range(1,10);
		System.out.println(s2.summaryStatistics());
		

	}

}
