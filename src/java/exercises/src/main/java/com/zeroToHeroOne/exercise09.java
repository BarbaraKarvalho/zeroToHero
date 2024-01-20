package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {

        float peso, altura, IMC;
        int menu;
        boolean novaConsulta = true;

        Scanner scan = new Scanner(System.in);
        while (novaConsulta) {
            System.out.println("Digite o seu peso: ");
            peso = scan.nextFloat();

            System.out.println("Digite a sua altura: ");
            altura = scan.nextFloat();

            IMC = peso / (altura * altura);
            System.out.printf("Seu IMC é: %.2f\n", IMC);

            if (IMC <= 18.5f) {
                System.out.println("Abaixo do peso");

            } else if (IMC >= 18.6f && IMC <= 24.9f) {
                System.out.println("Peso ideal (Parabéns)");

            } else if (IMC >= 25.0f && IMC <= 29.9f) {
                System.out.println("Levemente acima do peso");

            } else if (IMC >= 30.0f && IMC <= 34.9f) {
                System.out.println("Obesidade grau I");

            } else if (IMC >= 35.0 && IMC <= 39.9) {
                System.out.println("Obesidade grau II (severa)");

            } else
                System.out.println("Obesidade grau III (mórbida)");

            System.out.println("Você deseja fazer uma nova consulta?");
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
