package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {

        double numero;
        boolean novaConsulta = true;
        int menu;
        Scanner scan = new Scanner(System.in);

        while(novaConsulta) {
            System.out.println("Insira um número: ");
            numero = scan.nextDouble();

            if (numero == 0){
                System.out.println("Zero é número neutro");
            } else if (numero % 2 == 0 && numero > 0) {
                System.out.println("O seu número é par e positivo");
            } else if (numero % 2 == 0 && numero < 0) {
                System.out.println("O seu número é par e negativo");
            } else if (numero % 2 == 1 && numero > 0) {
                System.out.println("O seu número é impar e positivo");
            } else
                System.out.println("O seu número é impar e negativo");

            System.out.println("Deseja fazer nova consulta: ");
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
