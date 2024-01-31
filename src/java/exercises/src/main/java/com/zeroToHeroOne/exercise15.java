package com.zeroToHeroOne;

import java.util.Scanner;
public class exercise15 {
    private static final int ano = 365;
    public static void main(String[] args) {

        int anoN, idade, converterAnoMeses, converterAnoDias;
        boolean novaConsulta = true;
        int menu;

        Scanner scan = new Scanner(System.in);
        while (novaConsulta) {
            System.out.println("Digite o ano (quatro digitos) que você nasceu: ");
            anoN = scan.nextInt();

            idade = 2024 - anoN;
            converterAnoMeses = idade * 12; //meses ou pode fazer idade * 365 * 30
            converterAnoDias = idade * ano;
            System.out.println("Você tem " + idade + " anos, " + converterAnoMeses + " meses, " + converterAnoDias + " dias");

            System.out.println("Deseja fazer uma nova consulta?");
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
