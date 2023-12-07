package com.zeroToHero;

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        double areaQuadrado, ladoQuadrado;
        //A=l^2 or A=b*h

        Scanner scan = new Scanner(System.in);

        System.out.println("Input the value: ");
        ladoQuadrado = scan.nextDouble();

        areaQuadrado = Math.pow(ladoQuadrado,2) * 2;
        // or areaQuadrado = (b * h) * 2;
        System.out.printf("The result of the area of the square is %.2f\n", areaQuadrado);
        scan.close();
    }
}