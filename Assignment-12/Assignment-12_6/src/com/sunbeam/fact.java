package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class fact {

	public static void main(String[] args) {
    System.out.println("Enter number to find factorial:");	
    Scanner sc  = new Scanner(System.in);
    int num1 = sc.nextInt();
    Stream<Integer> strm1 = Stream.iterate(1,i->i+1)
    .limit(num1);
    int res = strm1.reduce(1,(a,e)->a*e);
    System.out.println(res);
	}

}
