package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise24 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        float tempo, velocidade, distancia, litrosUtilizados;
        int menu;
        boolean novaConsulta = true;

            while(novaConsulta){
            System.out.println("Digite quanto tempo durou a viagem? ");
            tempo = scan.nextFloat();

            System.out.println("Digite a velocidade média? ");
            velocidade = scan.nextFloat();

            distancia = tempo * velocidade;
            litrosUtilizados = distancia / 12;
            System.out.printf("Você percorreu: %.2f km de distância e a gastou %.2f litros de combustível.", distancia, litrosUtilizados);
            System.out.println(" ");

            System.out.println("Deseja fazer uma nova consulta?");
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