package com.zeroToHero;

import java.util.Scanner;

public class exercise04 {

    public static void main(String[] args) {
    float metros, centrimetros;

    Scanner meters = new Scanner(System.in);

    System.out.println("Input the meters: ");
    metros = meters.nextFloat();

    centrimetros = metros * 100;
    //System.out.println("The value in centimeters is " + centrimetros);
    System.out.printf("The value in centimeters is %.2f\n ", centrimetros);
    meters.close();
    }
}