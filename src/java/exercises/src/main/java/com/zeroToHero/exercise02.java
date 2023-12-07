package com.zeroToHero;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        double number;

        System.out.println("Input the number: ");
        Scanner scan = new Scanner(System.in);
        number = scan.nextDouble();

        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even");
        } else {
            System.out.println("The number " + number + " is odd ");
            scan.close();
        }
    }
}
