package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {

        String nome;
        int idade;
        boolean novaConsulta = true;
        int menu;

        Scanner scan = new Scanner(System.in);

        while (novaConsulta) {
            System.out.println ("Digite o seu nome: ");
            nome = scan.next();
            System.out.println("Digite a sua idade: ");
            idade = scan.nextInt();

            if(idade >= 18) {
                System.out.println(nome + " é maior de idade.");
            } else
                System.out.println(nome + " é menor de idade.");

                System.out.println("Deseja verificar nova pessoa?");
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
