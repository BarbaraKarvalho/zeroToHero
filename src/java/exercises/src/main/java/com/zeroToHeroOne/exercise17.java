package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        double Fahrenheit;
        double Celsius;
        int menu;
        boolean novaConversao = true;

        Scanner scan = new Scanner(System.in);
        while (novaConversao) {
            System.out.println("Digite a temperatura em Fahrenheit:");
            Fahrenheit = scan.nextDouble();

            Celsius = (5 * (Fahrenheit - 32) / 9);
            System.out.printf("A temperatura em Fahrenheit é: %.2f\n", Fahrenheit);
            System.out.printf("A temperatura em Celsius é: %.2f\n", Celsius);

            System.out.println("Deseja fazer uma nova conversão de Fahrenheit para Celsius?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            menu = scan.nextInt();

            if (menu == 2) {
                novaConversao = false;
            }
        }
        scan.close();
    }
}
