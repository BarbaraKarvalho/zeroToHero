package com.zeroToHero;

import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {

        double nota1, nota2, nota3;
        double mediaFinal;

        Scanner nota = new Scanner(System.in);

        System.out.println("Input the student's first grade: ");
        nota1 = nota.nextDouble();

        System.out.println("Input the student's second grade: ");
        nota2 = nota.nextDouble();

        System.out.println("Input the student's third grade: ");
        nota3 = nota.nextDouble();

        mediaFinal = (nota1 + nota2 + nota3)/3;
        //System.out.println("Your average is " + mediaFinal);
        System.out.printf("Your average is %.2f\n", mediaFinal);

        if(mediaFinal >= 7) {
            System.out.println("You're approved");
        }
        else{
            System.out.println("You're disapproved");
            nota.close();
        }
    }
}
