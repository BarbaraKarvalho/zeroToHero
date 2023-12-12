package com.zeroToHero;

import java.io.IOException;
import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {

        float pesoPeixe, excessoPeixe, multa;
        boolean controleFluxo = true;
        int menu;

        Scanner scan = new Scanner(System.in);
        while (controleFluxo) {
            System.out.println("João, how many kilos are in the fish? ");
            pesoPeixe = scan.nextFloat();

            if (pesoPeixe <= 50) {
                System.out.println("Your fish is complies with the weight established by the fishing regulations of the state of São Paulo");

            } else {
                excessoPeixe = pesoPeixe - 50;
                multa = excessoPeixe * 4;

                System.out.printf("Excess fish: %.2f\n", excessoPeixe);
                System.out.printf("Fine for excess fish: %.2f\n", multa);

                System.out.println("Your fish is above the weight established by the fishing regulations of the state of São Paulo");
            }

            System.out.println("Do you wish to information other fish?");
            System.out.println("1 - yes");
            System.out.println("2 - no");
            menu = scan.nextInt();

            if (menu == 2) {
                controleFluxo = false;
            }
        }
        scan.close();
    }
}