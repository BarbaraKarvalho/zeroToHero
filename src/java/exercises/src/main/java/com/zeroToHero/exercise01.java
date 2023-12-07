package com.zeroToHero;

import java.util.Scanner;


public class exercise01 {
    public static void main(String[] args) {
        double raio;
        double area;
        double perimetro;
        final double PI = 3.14;
        //area = PI * (r * r)
        //perímetro: c = 2.PI.r

        System.out.println("Insert the value of radius: ");
        Scanner scan = new Scanner(System.in);
        raio = scan.nextDouble();

        perimetro = 2 * Math.PI * raio;
        //System.out.println("The perimeter value is " + perimetro);
        System.out.printf("The perimeter value is %.2f\n", perimetro);

        area = Math.PI * Math.pow(raio, 2);
        //System.out.println("The value of the area is " + area);
        System.out.printf("The value of the area is %.2f\n", area);
        scan.close();
    }
}