package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args){
        int numero, antecessor, sucessor, menu;
        boolean digitarNovamente = true;

        Scanner scan = new Scanner(System.in);

        while (digitarNovamente) {
            System.out.println("Digite um número inteiro: ");
            numero = scan.nextInt();

            antecessor = numero - 1;
            System.out.println(antecessor + " é o número antecessor");

            sucessor = numero + 1;
            System.out.println(sucessor + " é o número sucessor");

            System.out.println("Deseja digitar outro número?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            menu = scan.nextInt();

            if(menu == 2){
                digitarNovamente = false;
            }
            scan.close();
        }
    }
}
