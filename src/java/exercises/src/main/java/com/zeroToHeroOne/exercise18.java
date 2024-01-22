package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise18 {
   // private static final double Francisco = 1.50f;
  //  private static final double Sara = 1.10f;

    public static void main(String[] args){

        int ano = 0;
        float Francisco = 1.50f;
        float Sara = 1.10f;

        while(Francisco >= Sara) {

            Francisco += 0.02f;
            System.out.printf("Por ano, Franscisco cresce: %.2f\n", Francisco);

            Sara += 0.03f;
            System.out.printf("Por ano, Sara cresce: %.2f\n", Sara);
            System.out.println("");

            ano++;

            System.out.printf("Francisco: %.2f\t Sara: %.2f\t Ano: %d\n ", Francisco, Sara, ano);
            System.out.println("");
            //%t formats date/time
        }
        System.out.printf("São necessários %d anos! ", ano);
    }
}
