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
    }
}
