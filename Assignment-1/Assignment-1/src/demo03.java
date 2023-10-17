import java.util.Scanner;

public class demo03 {

	public static int menu() {
		int choice;
		System.out.println("1. Exit");
	    System.out.println("1. Dosa");
	    System.out.println("2. Idli");
	    System.out.println("3. Vadapav");
	    System.out.println("4. Dhokla");
	    System.out.println("5. Kachori");
	    System.out.println("6. Samosa");
	    System.out.println("7. Rice");
	    System.out.println("8. Dal");
	    System.out.println("9. Pizza");
	    System.out.println("10. Icecream");
	    System.out.println("11. Generate Bill: ");
	    System.out.println("Enter your choice: ");
	    Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();	
		return choice;
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dosa = 30;
		double idli = 20;
		double vadapav = 15;
		double dhokla = 30;
		double kachori = 30;
		double samosa = 20;
		double rice = 50;
		double dal = 80;
		double pizza = 80;
		double icecream = 20;
		int choice;
		int total = 0;
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:
				total += dosa;
				break;
			case 2:
				total += idli;
				break;
			case 3:
				total += vadapav;
				break;
			case 4:
				total += dhokla;
				break;
			case 5:
				total += kachori;
				break;
			case 6:
				total += samosa;
				break;
			case 7:
				total += rice;
				break;
			case 8:
				total += dal;
				break;
			case 9:
				total += pizza;
				break;
			case 10:
				total += icecream;
				break;
			case 11:
				System.out.println("Total Bill: "+ total);
				default:
					System.out.println("Invalid choice");
					break;
			}
		}
		
	}	
		
	}
