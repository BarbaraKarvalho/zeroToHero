package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise06 {
    private static final float reajuste = 0.05f;
    public static void main(String[] args){

        double valor, total;
        int menu;
        boolean novaConsulta = true;

        Scanner scan = new Scanner(System.in);

        while(novaConsulta) {
            System.out.println("Digite um valor: ");
            valor = scan.nextDouble();

            total = (valor + reajuste);
            System.out.printf("O valor com reajuste é: %.2f\n", total);

            System.out.println("Quer verificar outro valor?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            menu = scan.nextInt();

            if(menu == 2) {
                novaConsulta = false;
            }
        }
        scan.close();
    }
}
