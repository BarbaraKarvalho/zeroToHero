package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {

        int A, B, quociente, resto;
        int menu;
        boolean novoCalculo = true;

        Scanner scan = new Scanner(System.in);
        while (novoCalculo) {
            System.out.println("Digite o dividendo (número inteiro): ");
            A = scan.nextInt();
            System.out.println("Digite o divisor (número inteiro): ");
            B = scan.nextInt();

            if (B == 0) {
                System.out.println("Nenhum número pode ser divido por zero, pois nunca irá ser encontrado um valor para o quociente de forma que se aproxime do dividendo " + B);

            } else if (B != 0) {
                quociente = A / B;
                System.out.println("Divisão de A por B é " + quociente + ". Sendo, ");
                System.out.println("Quociente: " + quociente);

                resto = A - (quociente * B);
                System.out.println("Resto: " + resto);

                System.out.println();
                System.out.println("Deseja fazer um novo cálculo?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                menu = scan.nextInt();

                if (menu == 2) {
                    novoCalculo = false;
                }
            }
        }
        scan.close();
    }
}