package com.zeroToHero;

import java.util.Scanner;

public class exercise04 {

    public static void main(String[] args) {
    float metros, centrimentros;

    Scanner meters = new Scanner(System.in);

    System.out.println("Input the meters: ");
    metros = meters.nextFloat();

    centrimentros = metros * 100;
    //System.out.println("The value in centimeters is " + centrimentros);
    System.out.printf("The value in centimeters is %.2f\n ", centrimentros);
    meters.close();
    }
}