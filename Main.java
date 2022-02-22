package com.company;

import java.util.Scanner;

public class Main {
    //changing nums
    public static void main(String[] args) {
	// write your code here
    Scanner scanner = new Scanner(System.in);

        System.out.println("First Num: ");
        double a = scanner.nextDouble();
        System.out.println("Second Num: ");
        double b = scanner.nextDouble();

        System.out.println("-BEFORE CHANGING-");
        System.out.println("First Num = " + a);
        System.out.println("Second Num = " + b);

        System.out.println("-AFTER CHANGING-");
        System.out.println("First Num = " + b);
        System.out.println("Second Num = " + a);






    }
}
