package com.zeroToHeroOne;

public class exercise19 {
    public static void main(String[] args) {

            System.out.println("TABUADA DE 0 A 10");

        for(int tabuada = 0; tabuada <= 10; tabuada++) {

            for(int contador = 0; contador <=10; contador++) {
                int multiplicador = tabuada * contador;
                System.out.println(tabuada + " x " + contador + " = " + multiplicador);
            }
            System.out.println(" "); //pular linnha
        }
    }
}

