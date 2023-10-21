package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Buffer {

	public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
	try(FileWriter fw = new FileWriter("new.txt")){
		try(BufferedWriter bw = new BufferedWriter(fw)) {
			for(int i=0; i<=4;i++) {
				String line = sc.nextLine();
	            bw.write(line);
	            System.out.println(line);
	            bw.newLine();
	            
			}
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
		}
}
