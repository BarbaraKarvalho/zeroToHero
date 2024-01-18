package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {

        boolean valor = true;
        int a;
        int b;
        int menu;
        boolean novaConsulta = true;

        Scanner scan = new Scanner(System.in);

        while (novaConsulta) {
            System.out.println("Digite o primeiro valor: ");
            a = scan.nextInt();

            System.out.println("Digite o segundo valor: ");
            b = scan.nextInt();

            //if(a == b){
            //} else
            //    valor = false;
            //System.out.println("O valor é: " + valor);

            if (a > b) {
                System.out.println("O valor de A é maior que B? ");
                System.out.println(valor + " - " + a + " é maior que " + b);
            } else if (a < b) {
                System.out.println("O valor de A é menor que B? ");
                System.out.println(valor + " - " + a + " é menor que " + b);
            } else if (a == b) {
                System.out.println("Esses valores são iguais? ");
                System.out.println(valor + " - " + a + " é igual " + b);
            } else
                valor = false;

            System.out.println("Deseja fazer nova consulta?");
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
