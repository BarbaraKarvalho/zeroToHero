package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        double A, B, C;
        double soma;
        boolean menorRepete = true;
        int menu;

        Scanner scan = new Scanner(System.in);

        while(menorRepete) {
            System.out.println("Insira o valor de A: ");
            A = scan.nextDouble();

            System.out.println("Insira o valor de B: ");
            B = scan.nextDouble();

            System.out.println("Insira o valor de C: ");
            C = scan.nextDouble();

            soma = (A + B);
            System.out.println("Soma entre A + B = " + soma);

            if(soma < C) {
                System.out.println("Soma entre A + B é " + soma + " e é > que C");
            }

            System.out.println("Você deseja fazer uma nova verificação?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            menu = scan.nextInt();

            if(menu == 2) {
                menorRepete = false;
            }
        }
        scan.close();
    }
}