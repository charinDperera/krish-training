package main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Caretaker caretaker= new Caretaker();
		Basket basket = new Basket();
		
		System.out.println("Add whatever needed to basked ");
		
		while(true) {
			System.out.println("Enter Brand name of cloth: ");
			String bName = sc.next();
			
			System.out.println("Enter type of cloth: ");
			String type = sc.next();
			
			System.out.println("Enter size of cloth: ");
			String size = sc.next();
			
			basket.addCloth(new Cloth(bName, type, size));
			
			System.out.println("Would you like to :"
					+ "\n [1]Add more"
					+ "\n [2]Save and View Basket"
					+ "\n [3]Undo and View Basket"
					+ "\n [4]Stop");
			int choice = sc.nextInt();
			
			if (choice == 1)
				continue;
			else if (choice == 2) {
				caretaker.save(basket);
				System.out.println(basket);
			}
			else if (choice == 3) {
				caretaker.undo(basket);
				System.out.println(basket);
			}
			else
				break;
		}
	}

}
