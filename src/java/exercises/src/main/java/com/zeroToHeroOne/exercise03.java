package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise03 {
    public static void main(String [] args) {

        int A, B, menu, C;
        boolean novaConsulta = true;

        Scanner scan = new Scanner(System.in);
        while (novaConsulta) {
            System.out.println("Digite um número inteiro para A: ");
            A = scan.nextInt();
            System.out.println("Digite um número inteiro para B: ");
            B = scan.nextInt();

            if(A == B) {
                C = (A + B);
                System.out.println("A soma dos números iguais é: " + C);
            } else if(A != B) {
                C = (A * B);
                System.out.println("A multiplicação dos números diferentes é: " + C);
            }
                System.out.println("Quer fazer uma nova consulta?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                menu = scan.nextInt();

                if(menu == 2)
                    novaConsulta = false;
            }
        scan.close();
    }
}
