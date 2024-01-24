package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        double nota1, nota2, nota3, nota4, mediaNota;
        int menu;
        boolean novaConsulta = true;

        while (novaConsulta) {
            System.out.println("Digite a sua primeira nota: ");
            nota1 = scan.nextDouble();
            System.out.println("Digite a sua segunda nota: ");
            nota2 = scan.nextDouble();
            System.out.println("Digite a sua terceira nota: ");
            nota3 = scan.nextDouble();
            System.out.println("Digite a sua quarta nota: ");
            nota4 = scan.nextDouble();

            System.out.println("Digite o seu nome: ");
            nome = scan.next();

            mediaNota = (nota1 + nota2 + nota3 + nota4) / 4;

            if (mediaNota >= 7) {
                System.out.println("Aluna(o): " + nome);
                System.out.printf("A sua média é %.2f\n", mediaNota);
                System.out.println("Você foi aprovado! Parabéns!!!");

            } else if (mediaNota < 7) {
                System.out.println("Aluna(o): " + nome);
                System.out.printf("A sua média é %.2f\n", mediaNota);
                System.out.println("Você foi reprovado!");
            } else
                break;

                System.out.println("Você deseja consultar outro aluno?");
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