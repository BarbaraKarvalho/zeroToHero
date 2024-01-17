package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args){

        double salarioMinimo = 1293.20;
        double salarioUsuario, qtdSalarioMinimo;
        int menu;
        boolean novoSalario = true;

        Scanner scan = new Scanner(System.in);

        while(novoSalario) {
            System.out.println("Valor do salário mínimo: R$1.293,20");
            System.out.println("Qual é o valor do seu salário?");
            salarioUsuario = scan.nextDouble();

            //total = (salarioUsuario - salarioMinimo);
            //System.out.printf("Você ganha: R$ %.2f\n",total);

            qtdSalarioMinimo = salarioUsuario / salarioMinimo;

            if(salarioUsuario >= salarioMinimo) {
                System.out.println("Você recebe: " + (int) qtdSalarioMinimo + " salário(s) mínimo(s)");
            } else
                System.out.println("Você recebe menos que 01 salário mínimo");

            System.out.println("Deseja consultar outro salário?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            menu = scan.nextInt();

            if(menu == 2) {
                novoSalario = false;
            }
        }
        scan.close();
    }
}
