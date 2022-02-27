package com.skilldistillery.foodtruck;

public class FoodTruck {
	private int id = 1;
	private String name;
	private String foodType;
	private int rate;
	private static int numTrucks = 1;

	// All variables are private. No one outside of this class should touch these
	// values.

	protected FoodTruck() {
		id = numTrucks;
		numTrucks++;
	}
	// No-args constructor assigns ID based on how many trucks there are.

	protected FoodTruck(String name, String foodType, int rate) {
		this.id = numTrucks;
		numTrucks++;

		this.name = name;
		this.foodType = foodType;
		this.rate = rate;
	}
	// This constructor is not necessary for the FoodTruckApp to run but is here in
	// case it's initialized with the variables as arguments. This also sets the ID
	// based on how many trucks there are.

	// Constructors were set to protected so it's exclusive to FoodTruckApp.

	public String toString() {
		return ("Name: " + name + "\n" + "Food Type: " + foodType + "\n" + "ID: " + id + "\n" + "Rate: " + rate);
	}
	// toString() returns a String of the Food Truck's information. toString() is
	// public because it returns values and doesn't set any.

	protected void setName(String name) {
		this.name = name;
	}

	protected void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	protected void setRate(int rate) {
		this.rate = rate;
	}
	// Set methods were preferred to set the variables for this program. Set values
	// are protected so other classes in the library can't run the program

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getFoodType() {
		return foodType;
	}

	public int getRate() {
		return rate;
	}
	// Get methods were necessary for this program to find specific values and
	// perform particular functions like finding the highest rating. Get methods
	// were set to public since it is retrieving data and not setting them.

}
