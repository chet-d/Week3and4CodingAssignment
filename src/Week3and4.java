import java.io.*;
import java.lang.*;
import java.util.*;

public class Week3and4 {

	public static void main(String[] args) {
		
		// Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		 Integer [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		 
		/*Programmatically subtract the value of the first element in the array from the value in the last element of 
		 * the array (i.e. do not use ages[7] in your code). Print the result to the console
		 */
		
		 int lastMinusFirst = ages[ages.length-1]-ages[0];
		 System.out.println("The difference between the last and first age is " + lastMinusFirst);
		 
		 //Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		 
		 //I will be doing this by converting the array in to an ArrayList
		 
		 List ageList = new ArrayList(Arrays.asList(ages));
		 ageList.add(30);
		 
		 ages = (Integer[]) ageList.toArray(ages);
		 
		 
		 //Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 
		 int sumofAges = 0;
		 for (int i = 0; i < ages.length; i++) {
			 sumofAges += ages[i];
			 
		 }
		 System.out.println("Sum of Ages " + sumofAges);	
		 int ageAvg = sumofAges/ages.length;
		 System.out.println("The Average age is " + ageAvg);
		 
		 
		 // Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 
		 String[] nameArray = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		 
		 //Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		 int nameLength = 0;
		 for(String name : nameArray) {
			 nameLength += name.length();
		

			 
		 }
		 int AvgLetter = nameLength/nameArray.length;
		 System.out.println("The average letter per name is " + AvgLetter);
		 
		 //Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console
		 
	
	String nameConcat = "";
	for(String names : nameArray) {
		nameConcat += names +" ";
		
	}
	System.out.println(nameConcat);
	
	//How do you access the last element of any array?
	//You access it by Array[Array.length -1 ]
	
	//How do you access the first element of any array?
	//You access it by Array[0]
	
	//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
	
	int [] nameLengths = new int[nameArray.length];
	for(int k = 0; k < nameArray.length; k++) {
		nameLengths[k] = nameArray[k].length();
		//System.out.println(nameLengths[k]);
	}
	
	//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
	
	int nameSum = 0;
	for(int h = 0; h <nameLengths.length; h++) {
		nameSum += nameLengths[h];
	}
	System.out.println("The length of the names are " +nameSum);

	//calling stringMultiplier Method
	String hello = "hello";
	int num = 3;
	
	System.out.println(stringMultiplier(hello, num));
	
	
	//calling fullName Method
	String first = "Chitram";
	String last = "Darshanand";
	
	System.out.println(fullName(first, last));
	
	
	//calling arraySum Method
	
	int [] myArray = new int [3];
	myArray[0] = 25;
	myArray[1]= 30;
	myArray[2]=50;
	
	System.out.println(arraySum(myArray));
	
	//calling averageCalculator Method
	 double [] numDoubles = new double [3];
	 numDoubles[0] = 30;
	 numDoubles[1] = 20;
	 numDoubles[2] = 50;
	 
	 System.out.println(averageCalculator(numDoubles));
	 
	 //calling averageComparison Method
	 
	 double [] numDoubles1 = {33.5, 665.6, 999.9};
	 double [] numDoubles2 = {10.5, 11.8, 1100.9};
	 
	 System.out.println(averageComparison(numDoubles1, numDoubles2));
	 
	 //calling willBuyDrink Method
	 boolean hot = true;
	 double money = 12.75;
	 System.out.println(willBuyDrink(hot, money));
	 
	 
	 //Calling kiloToLbsCalculator
	 double kilo1 = 20;
	 System.out.println(kilo1 + " Kilos is approximately " +kiloToLbsCalculator(kilo1) + " lbs.");
		
	}
	
	//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n 
	//number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	public static String stringMultiplier(String word, int n) {
		String result = "";
		for(int j = 0; j <n; j++) {
			result += word;
			
		}return result;
	}
	
	//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the 
	//first and the last name as a String separated by a space).
	
	public static String fullName(String firstName, String lastName) {
		String nameResult = firstName + " " + lastName;
		return nameResult;
	}
	
	//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean arraySum (int [] numbersArray) {
		int numSum = 0;
		for(int nums : numbersArray) {
			numSum +=nums;
		}
		
		if(numSum > 100) {
			return true;
		}
		return false;
	}
	
	//Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double averageCalculator(double []doubleArray) {
		int sumofDoubles = 0;
		for (double doubles : doubleArray) {
			sumofDoubles += doubles;
		}
		
		double doubleAverage = sumofDoubles/doubleArray.length;
		
		return doubleAverage;
	}
	
 //Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean averageComparison(double[] doubleArray1, double[] doubleArray2) {
		int sumofDouble1 = 0;
		for(double doubles1: doubleArray1) {
			sumofDouble1 +=doubles1;
		}
		int sumofDouble2 = 0;
		for(double doubles2: doubleArray2) {
			sumofDouble2 +=doubles2;
		}
		
		if(sumofDouble1 > sumofDouble2) {
			return true;
		}
		
		return false;
		
	}
	
	//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50
	public static boolean willBuyDrink(boolean isHotOutside, double moneyinPocket) {
		if(isHotOutside = true && moneyinPocket > 10.50) {
			return true;
		}
		return false;
	}
	
 //Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	//Will be creating a simple calculator to convert kilograms to pounds
	
	public static double kiloToLbsCalculator (double kilo) {
		double kiloToPounds = kilo*2.20462;
		return kiloToPounds;
		
	
		
	}
	
	
	
	
	

}




