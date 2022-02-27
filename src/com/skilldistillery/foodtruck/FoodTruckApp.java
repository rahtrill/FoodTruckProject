package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		FoodTruck[] ftArr = new FoodTruck[5];
		Scanner kb = new Scanner(System.in);
		boolean menu = false;
		int trucks = 0;
		// I used "trucks" to keep track of how many trucks are in the array and aren't
		// null.

		System.out.println("Welcome to the Food Truck submission app!");
		System.out.println();

		for (int i = 0; i < ftArr.length; i++) {
			// Iterates through the length of the array and not hard coded as 5 in case you
			// wanted to change the array length.
			FoodTruck foodTruck = new FoodTruck();
			ftArr[i] = foodTruck;
			// FoodTruck object is made every loop and assigned to the array.

			System.out.println("Please input the food truck name: ");
			String name = kb.next();
			name = name + kb.nextLine();
			// This was my workaround for names with spaces.

			if (name.equals("quit")) {
				System.out.println("Food Truck input has ended.");
				break;
			} else {
				foodTruck.setName(name);
			}
			// Check for quit input, if not, sets the name.

			System.out.println("Please input the type of food the truck sells: ");
			String foodType = kb.next();
			foodTruck.setFoodType(foodType);
			// Set Food Type.

			System.out.println("What is the rating the food truck has: ");
			int rate = kb.nextInt();
			foodTruck.setRate(rate);
			// Set Rate.

			trucks++;
			// Increment trucks value.

		}

		System.out.println();
		menu = true;
		// Begins while loop.

		while (menu) {
			System.out.println();
			System.out.println("============================================");
			System.out.println("=================== MENU ===================");
			System.out.println("============================================");
			System.out.println("= 1. List all existing food trucks         =");
			System.out.println("= 2. See the average rating of food trucks =");
			System.out.println("= 3. Display the highest-rated food truck  =");
			System.out.println("= 4. Quit the program                      =");
			System.out.println("============================================");
			System.out.println("=          (Input option number)           =");
			System.out.println("============================================");
			System.out.println();

			int option = kb.nextInt();

			// I used switch for convenience.
			switch (option) {
			case 1:

				System.out.println("Listing all existing food trucks...");
				System.out.println();

				for (int i = 0; i < trucks; i++) {
					if (i == trucks - 1) {
						System.out.println(ftArr[i].getName() + ".");
					} else {
						System.out.print(ftArr[i].getName() + ", ");
					}
				}
				// For loop goes through and displays all food truck names using getName().

				break;

			case 2:

				System.out.println("Getting the average food truck rating...");
				System.out.println();

				double average = 0.0;

				for (int i = 0; i < trucks; i++) {
					average += ftArr[i].getRate();
				}

				average /= trucks;

				System.out.println("The food truck rating average is " + average);
				// For loop adds all rating together and then divides it by the existing number
				// of trucks (not null trucks) for average.

				break;

			case 3:

				System.out.println("Getting the highest food truck rating...");
				System.out.println();

				int highestRate = ftArr[0].getRate();
				FoodTruck highestRateObject = ftArr[0];
				// Had to created separate highest rates because it's more practical to get the
				// highest rate separately then assign the highest object.

				for (int i = 0; i < trucks; i++) {
					if (ftArr[i].getRate() > highestRate) {
						highestRate = ftArr[i].getRate();
						highestRateObject = ftArr[i];
					}
				}

				System.out.println("The highest food truck rating is from " + highestRateObject.getName()
						+ " at a rating of " + highestRate);
				System.out.println("Here's some more information: ");
				System.out.println(highestRateObject.toString());
				// For loop gets the highest rate and then uses toString() to provide more
				// information.

				break;

			case 4:
				System.out.println("Thank you for using the Food Truck App. Goodbye!");
				menu = false;
				// Quits menu.

				break;

			default:
				System.out.println("Input invalid. Try again.");
				// This is here in case any inputs not on the menu are put in.
			}
		}

		kb.close();
	}

}
