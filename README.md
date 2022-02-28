# Food Truck Project

## Description

This program is designed to take user input that creates Food Truck objects with the input information.

After a Food Truck object is created, it is assigned to an array that acts as a "parking lot" and stores the objects along with their data in the array.

A user will be asked to input 5 or less Food Truck objects and provide the information that defines each of them. For example, they will input the name, food type, and rating for the truck. The creation of the object will automatically give the truck an ID that increments for every truck that is created in the program.

## Lessons Learned

During the program, I was not entirely aware of how necessary the constructors would be for the ID creation process. I was attempting to do something far more complicated, using for loops to give each truck an ID after creation. At some point, I noticed that it would be far more effective to create two constructors. One that took the information as arguments and another no-arg constructor that would automatically set the ID and then increment the static number of trucks variable after an ID was assigned.

This solution was significantly more effective than using a for loop to iterate through each object in the array after creation and set an ID for each one. Upon the food truck's creation, it automatically assigns it without the help of a different program.

I also took the time to see how encapsulation can be applied to my data and my methods. In theory, I would not want anything beyond the food truck class to have direct access to the data, so I made all of the variables in the food truck object private. In order to set them, I used 'setters' and I used 'getters' to retrieve them. However, I did not want any class beyond those in the package to have access to these setting methods, since only the classes inside of the same package would have a need to set them. So, I set all of the 'setter' methods from public to protected. I felt that retrieving the data without direct access would not cause any problems with my class, and it wouldn't matter if classes outside of the method could see into what that data reads without direct access. Because of this, I set the 'getter' classes to public, as well as the toString() method.

Here are some examples:

toString() method:

`public String toString() {
		return ("Name: " + name + "\n" + "Food Type: " + foodType + "\n" + "ID: " + id + "\n" + "Rate: " + rate);
	}`

Setter method:

`protected void setName(String name) {
		this.name = name;
	}`

Getter method:

`public int getId() {
		return id;
	}`

Variable example:

`private static int numTrucks = 1;`

## Technologies Used

There were multiple technologies and ideas used to make this program work. They include the following:

- The Java utility, Scanner.
- Instantiation by creating new objects (FoodTruck()).
- Switch/case for the menu option.
- Encapsulation to properly protect data.
- 'Setter' and 'Getter' methods.
- Static declaration to keep the same value across all object instances.

## What was the most difficult part of this project?

This program was simple for the most part and there was not much difficulty completing it. Technically, the most difficult part of the program would be the logic behind assigning new IDs. Although I found a fairly simple resolution to this problem quickly, I did try a more complex solution. I was a bit frustrated with having to use the for loop. During it's creation, I came up with the ID assignment using constructors to assign an ID.
