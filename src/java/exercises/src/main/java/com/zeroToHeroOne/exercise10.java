package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1, nota2, nota3, mediaNota;
        int menu;
        boolean novaConsulta = true;

        while (novaConsulta) {
            System.out.println("Digite a sua primeira nota: ");
            nota1 = scan.nextDouble();
            System.out.println("Digite a sua segunda nota: ");
            nota2 = scan.nextDouble();
            System.out.println("Digite a sua terceira nota: ");
            nota3 = scan.nextDouble();

            mediaNota = (nota1 + nota2 + nota3) / 3;
            System.out.printf("A sua média de notas é: %.2f\n ", mediaNota);

            if (mediaNota <= 6.0) {
                System.out.println("Estude mais! Se continuar assim, vai se ferrar!");
            } else
                System.out.println("Continue assim! Parabéns!!!");

            System.out.println("Deseja verificar uma nova média?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            menu = scan.nextInt();

            if (menu == 2) {
                novaConsulta = false;
            }
        }
        scan.close();
    }
}
