package week1;

public class PromineoLabsWeek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Week 1 Lab");

//
//Copyright (c) 2023 Promineo Tech
//Author:  Promineo Tech Academic Team
//Subject:  Variables & Operations Lab
//Java Week 01 Lab  
//

	
		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
int availableSeats = 26;
		
		// 2. Create a variable to hold the cost of groceries at checkout
double totalCostOfGroceries = 150.00;
		
		// 3. Create a variable to hold a person's middle initial
char middleInitial = 'D';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
boolean itIsHotOutside = true;
boolean itIsColdOutside = false;
		
		// 5. Create a variable to hold a customer's first name
String customersFirstName = "Philip";
		
		// 6. Create a variable to hold a street address
String streetAddress = "42 Wallaby Way, Sydney";

		// 7. Print all variables to the console
	System.out.println( "available seats remaining:" + " " + availableSeats);
System.out.println("total:" + totalCostOfGroceries);
System.out.println(middleInitial);
System.out.println(itIsHotOutside);
System.out.println(itIsColdOutside);
System.out.println(customersFirstName);
System.out.println(streetAddress);
		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable

availableSeats = availableSeats - 2;
System.out.println(availableSeats);

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;

totalCostOfGroceries += 2.15;
System.out.println(totalCostOfGroceries);

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else

middleInitial = 'K';
System.out.println(middleInitial);
	
		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was

itIsHotOutside = !itIsHotOutside;
System.out.println(itIsHotOutside);

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice

String fullName = customersFirstName + " " + middleInitial + " Sherman";
System.out.println(fullName);

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
System.out.println("Hello, My name is " + fullName + ", and I live at " + streetAddress + ". How are you today?");
		
		
	}
}