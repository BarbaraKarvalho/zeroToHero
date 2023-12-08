package com.zeroToHero;

import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args){
        double valorHora, salarioMensal, salarioTotal;
        int horasMes;


        Scanner scan = new Scanner(System.in);

        System.out.println("How much do you earn per hour of work? ");
        valorHora = scan.nextDouble();

        System.out.println("How many hours do you work per month? ");
        horasMes = scan.nextInt();

        salarioMensal = valorHora * horasMes;
        System.out.printf("Your monthly salary is %.2f\n", salarioMensal);


        salarioTotal = salarioMensal * 12;
        System.out.printf("Your total salary for the next 12 months is %.2f\n", salarioTotal);
        scan.close();
    }
}