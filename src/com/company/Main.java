package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //declares the object and initialize with
        //predefined standard input object
        Scanner sc = new Scanner(System.in);
        //String input
        String name = sc.nextLine();
        //Character input
        char gender = sc.next().charAt(0);
        //numerical data input
        //byte, short and float can be read
        //using similar-named function
        int age = sc.nextInt();
        long mobileNO = sc.nextLong();
	double credit = sc.nextDouble();
	// Declare an object and initialize with 
        // predefined standard input object 
        Scanner sc = new Scanner(System.in); 
  
        // Initialize sum and count of input elements 
        int sum = 0, count = 0; 
  
        // Check if an int value is available 
        while (sc.hasNextInt()) 
        { 
            // Read an int value 
            int num = sc.nextInt(); 
            sum += num; 
            count++; 
        } 
        int mean = sum / count; 
	// Print the values to check if the input was correctly obtained. 
        System.out.println("Name: "+name); 
        System.out.println("Gender: "+gender); 
        System.out.println("Age: "+age); 
        System.out.println("Mobile Number: "+mobileNo); 
        System.out.println("Credit: "+credit); 
	 System.out.println("Mean: " + mean)
    }
}
