package com.zeroToHeroOne;

import java.util.Random;
import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {

        boolean novaRodada = true;
        int menu;

        Scanner scan = new Scanner(System.in);

        while(novaRodada) {
            Random gerador = new Random();
            System.out.println("Os números aleatórios da rodada são: ");
            for (int i = 0; i <= 100; i++) {
                System.out.println(gerador.nextInt(0, 101));
            }

            System.out.println();
            System.out.println("Deseja fazer uma nova consulta de números aleatórios?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            menu = scan.nextInt();

            if (menu == 2) {
                novaRodada = false;
            }
        }
        scan.close();
    }
}
