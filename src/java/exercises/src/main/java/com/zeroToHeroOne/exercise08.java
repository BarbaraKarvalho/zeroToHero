package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {

        int a, b, c;
        int menu;
        boolean novaConsulta = true;

        Scanner scan = new Scanner(System.in);

        while (novaConsulta) {
            System.out.println("Digite três valores inteiros?");
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();

            if (a == b && b == c && c == a) {
                System.out.println("Os valores que você digitou são iguais");

            } else if (a > b && b > c && a > c) {
                System.out.println("A ordem descreste é: " + a + ", " + b + ", " + c);

            } else if (a <= b && b <= c && a <= c) { //a-b b-c c-a // c b a
                System.out.println("A ordem descreste é: " + c + ", " + b + ", " + a);

            } else if (a <= c && b <= a && b <= c) { //a-b b-c c-a // c a b
                System.out.println("A ordem descreste é: " + c + ", " + a + ", " + b);

            } else if (a <= b && c <= b && a <= c) { //a-b c-b a-c // b c a
                System.out.println("A ordem descreste é: " + b + ", " + c + ", " + a);

            } else if (a <= b && c <= b && c <= a) { //a-b c-b c-a // b a c
                System.out.println("A ordem descreste é: " + b + ", " + a + ", " + b);

            } else if (b <= a && b <= c && c <= a) { //a-b c-b c-a // a c b
                System.out.println("A ordem descreste é: " + a + ", " + c + ", " + b);

            }else
                break;

                System.out.println("Deseja verficar uma nova ordem?");
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