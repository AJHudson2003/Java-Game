package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 //declares the object and initialize with
        //predefined standard input object
        Scanner sc = new Scanner(System.in);
        //name code
        string name = sc.nextLine();
	System.out.println("enter your name: ");
       	System.out.println("name: "+ name);
       	// gender code
       	string gender = sc.nextLine();
	System.out.println(" enter you gender here: ");
        System.out.println("gender: "+ gender);
	    
	system.out.println("enter you grades and after you do type end and enter to emd the line of code");
        int sum = 0, count = 0;


        while (sc.hasNextInt())
        {
            // Read an int value
            int num = sc.nextInt();
            sum += num;
            count++;
        }
        int grade = sum / count;
        System.out.println("average: " + grade);
	    
	
    }
}
