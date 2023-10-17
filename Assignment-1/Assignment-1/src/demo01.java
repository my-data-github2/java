import java.util.Scanner;

public class demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
        int number =  scanner.nextInt();
//		int binary = Integer.toBinaryString(number);
//		int hexa  = Integer.toHexString(number);
//		int octal = Integer.toOctalString(number);
		System.out.println(Integer.toBinaryString(number));
		System.out.println(Integer.toHexString(number));
		System.out.println(Integer.toOctalString(number));

	}

	
}
