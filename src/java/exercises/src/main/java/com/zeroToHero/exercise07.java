package com.zeroToHero;

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args){

        float pesoPeixe, excessoPeixe, multa;

        Scanner scan = new Scanner(System.in);
        System.out.println("João, how many kilos are in the fish? ");
        pesoPeixe = scan.nextFloat();

        if(pesoPeixe <= 50) {
            System.out.println("Your fish is complies with the weight established by the fishing regulations of the state of São Paulo");

        } else if (pesoPeixe >= 51) {
            excessoPeixe = pesoPeixe - 50;
            multa = excessoPeixe * 4;

            System.out.printf("Excess fish: %.2f\n", excessoPeixe);
            System.out.printf("Fine for excess fish: %.2f\n", multa);

            System.out.println("Your fish is above the weight established by the fishing regulations of the state of São Paulo");
            scan.close();
        }
    }
}
