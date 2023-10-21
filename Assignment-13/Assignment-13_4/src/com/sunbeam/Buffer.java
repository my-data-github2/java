package com.sunbeam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Buffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(FileWriter fw = new FileWriter("Good.txt")) {
			try(BufferedWriter bw = new BufferedWriter(fw)) {
				for(int i =0;i<=4;i++) {
					String line = sc.nextLine();
				    bw.write(line);	
				    bw.newLine();
				}
			}//bw.close();
		}//fw.close();
		catch(Exception e) {
			e.printStackTrace();
		}

		try(FileReader fr = new FileReader("Good.txt")){
			try(BufferedReader br = new BufferedReader(fr)){
				String line;
				while( (line = br.readLine()) != null) {
					System.out.println(line);
				}
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
