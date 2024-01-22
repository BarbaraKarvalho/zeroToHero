package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {

        double A, B, C;
        int menu;
        boolean novaConsulta = true;

        Scanner scan = new Scanner(System.in);
        while (novaConsulta) {
            System.out.println("Digite o valor de A: ");
            A = scan.nextDouble();
            System.out.println("Digite o valor de B: ");
            B = scan.nextDouble();

            C = A;
            A = B;
            B = C;

            System.out.println("Valor de A invertido com B é " + A);
            System.out.println("Valor de B invertido com A é " + B);

            System.out.println("Deseja fazer uma nova inversão?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            menu = scan.nextInt();

            if(menu == 2){
                novaConsulta = false;
            }
        }
        scan.close();
    }
}

