package tester;

import java.util.Scanner;

import com.sunbeam.fruit.*;

public class FruitBasket {

	public static int menu() {
		int choice;
		System.out.println("-------------------------------------");
		System.out.println("0 : Exit");
		System.out.println("1 : Add Mango");
		System.out.println("2 : Add Orange");
		System.out.println("3 : Add Apple");
		System.out.println("4 : Display Fruits Names");
		System.out.println("5 : Display Fresh Fruits");
		System.out.println("6 : Display Taste of all Stale Fruits");
		System.out.println("7 : Mark a fruit as Stale");
		System.out.println("8 : Mark all sour fruits as stale");
		System.out.print("Enter your choice : ");
		choice = new Scanner(System.in).nextInt();
		System.out.println("-------------------------------------");
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the basket : ");
		int size, choice, count = 0;
		size = sc.nextInt();
		Fruit fruitBasket[] = new Fruit[size];

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				if (count < size) {
					fruitBasket[count] = new Mango();
					fruitBasket[count].accept();
					System.out.println("Mango added successfully.");
					count++;
				} else
					System.out.println("Basket is full!!");
				break;
			case 2:
				if (count < size) {
					fruitBasket[count] = new Orange();
					fruitBasket[count].accept();
					System.out.println("Orange added successfully.");
					count++;
				} else
					System.out.println("Basket is full!!");
				break;
			case 3:
				if (count < size) {
					fruitBasket[count] = new Apple();
					fruitBasket[count].accept();
					System.out.println("Apple added successfully.");
					count++;
				} else
					System.out.println("Basket is full!!");
				break;
			case 4:
				for (Fruit f : fruitBasket)
					if (f != null)
						System.out.println(f.getName());
				break;
			case 5:
				for (Fruit f : fruitBasket)
					if (f != null && f.isFresh() == true)
						System.out.println(f.toString());
				break;
			case 6:
				System.out.println("**Stale Fruits**");
				for (Fruit f : fruitBasket)
					if (f != null && f.isFresh() == false)
						System.out.println(f.getName()+" : "+f.taste());
				break;
			case 7: {
				int index;
				System.out.println("Enter the index : ");
				index = sc.nextInt();
				if (index >= 0 && index < size) {
					if (fruitBasket[index] != null)
						fruitBasket[index].setFresh(false);
					System.out.println("Marked as stale successfully.");
				} else
					System.out.println("Wrong index entered..");
			}
				break;
			case 8:
				for(Fruit f: fruitBasket)
					if(f.taste()=="sour" || f.taste()=="sweet n sour")
						f.setFresh(false);
				System.out.println("All sour fruits marked as stale.");
				break;

			}
		}
		
		System.out.println("Thank you for using the application.");
	}

}
