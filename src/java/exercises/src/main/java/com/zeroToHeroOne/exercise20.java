package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args){

        int x, multiplicador;
        int contador = 0;
        int menu;
        boolean novaTabuada = true;

        Scanner scan = new Scanner(System.in);
        while(novaTabuada) {
            System.out.println("*** RESOLVEDOR DE TABUADA *** ");
            System.out.println("Digite um número inteiro:");
            x = scan.nextInt();

            for(contador = 0; contador <= 10; contador++) {
                multiplicador = x * contador;
                System.out.println(x + " x " + contador + " = " + multiplicador);
            }
                System.out.println();
                System.out.println("Deseja verifcar uma nova tabuada?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                menu = scan.nextInt();

                if (menu == 2) {
                    novaTabuada = false;
            }
        }
        scan.close();
    }
}
