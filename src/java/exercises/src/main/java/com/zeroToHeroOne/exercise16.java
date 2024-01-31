package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise16 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double x, y, z;
        int menu;
        boolean novaConsulta = true;

        while(novaConsulta) {
            System.out.println("Digite o primeiro valor válido");
            x = scan.nextInt();
            System.out.println("Digite o segundo valor válido");
            y = scan.nextInt();
            System.out.println("Digite o terceiro valor válido");
            z = scan.nextInt();

            if (x < y + z || y < x + z || z < y + x) {
                if (x == y && x == z) {
                    System.out.println("Triângulo Equilatero, ou seja, os três lados são iguais");

                } else if (x == y || x == z) {
                    System.out.println("Triângulo Isosceles, ou seja, os dois lados são iguais");

                } else
                    System.out.println("Triângulo Escaleno, ou seja, os três lados são diferentes");

                System.out.println("Deseja verifcar novamente?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                menu = scan.nextInt();

                if (menu == 2) {
                    novaConsulta = false;
                }
            }
        }
        scan.close();
    }
}
