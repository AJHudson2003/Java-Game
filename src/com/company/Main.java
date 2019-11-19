package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //declares the object and initialize with
        //predefined standard input object
        Scanner sc = new Scanner(System.in);
        //String input
        String name = sc.nextLine();
       System.out.println("name"+ name);
       String gender = sc.nextLine();
       System.out.println("gender"+ gender);
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
        System.out.println("Mean: " + mean);
    }
}
