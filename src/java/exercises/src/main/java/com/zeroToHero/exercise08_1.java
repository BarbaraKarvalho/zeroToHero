package com.zeroToHero;

import java.util.Scanner;

public class exercise08_1 {
    private static final float INSS = 0.08f;
    private static final float SINDICATO = 0.05f;

    public static void main(String [] args) {
        float valorHora, salarioBruto, salarioLiquido, descontoSalario, descontoIR, descontoINSS, descontoSindicato;
        int quantHora;
        boolean controleFluxo = true;
        int menu;

        Scanner scan = new Scanner(System.in);

        while (controleFluxo) {

            System.out.println("How much do you earn per hours worked? ");
            valorHora = scan.nextFloat();

            System.out.println("How many hours do you work? ");
            quantHora = scan.nextInt();

            salarioBruto = valorHora * quantHora;
            System.out.printf("Your gross salary is R$ %.2f\n\n", salarioBruto);

            if (salarioBruto < 2112.00) {
                final float IR = 0;
                descontoIR = salarioBruto * IR;
                System.out.printf("IR (zero): R$ %.2f\n", descontoIR);
                descontoINSS = salarioBruto * INSS;
                System.out.printf("INSS (8): R$ %.2f\n", descontoINSS);
                descontoSindicato = salarioBruto * SINDICATO;
                System.out.printf("SINDICATO (5): R$ %.2f\n", descontoSindicato);

                descontoSalario = salarioBruto * (INSS + SINDICATO);
                System.out.printf("Total discount is R$ %.2f\n\n", descontoSalario);

                salarioLiquido = salarioBruto - descontoSalario;
                System.out.printf("Your total salary for month is R$ %.2f\n", salarioLiquido);

            } else if (salarioBruto >= 2112.00 && salarioBruto < 2826.65) {
                final float IR = 0.075f;
                descontoIR = salarioBruto * IR;
                System.out.printf("IR (7.5): R$ %.2f\n", descontoIR);
                descontoINSS = salarioBruto * INSS;
                System.out.printf("INSS (8): R$ %.2f\n", descontoINSS);
                descontoSindicato = salarioBruto * SINDICATO;
                System.out.printf("SINDICATO (5): R$ %.2f\n", descontoSindicato);

                descontoSalario = salarioBruto * (0.075f + INSS + SINDICATO);
                System.out.printf("Total discount is R$ %.2f\n\n", descontoSalario);

                salarioLiquido = salarioBruto - descontoSalario;
                System.out.printf("Your total salary for month is R$ %.2f\n", salarioLiquido);

            } else if (salarioBruto >= 2826.66 && salarioBruto < 3751.05) {
                final float IR = 0.15f;
                descontoIR = salarioBruto * IR;
                System.out.printf("IR (15): R$ %.2f\n", descontoIR);
                descontoINSS = salarioBruto * INSS;
                System.out.printf("INSS (8): R$ %.2f\n", descontoINSS);
                descontoSindicato = salarioBruto * SINDICATO;
                System.out.printf("SINDICATO (5): R$ %.2f\n", descontoSindicato);

                descontoSalario = salarioBruto * (IR + INSS + SINDICATO);
                System.out.printf("Total discount is R$ %.2f\n\n", descontoSalario);

                salarioLiquido = salarioBruto - descontoSalario;
                System.out.printf("Your total salary for month is R$ %.2f\n", salarioLiquido);

            } else if (salarioBruto >= 3751.06 && salarioBruto < 4664.68) {
                final float IR = 0.225f;
                descontoIR = salarioBruto * IR;
                System.out.printf("IR (22.5): R$ %.2f\n", descontoIR);
                descontoINSS = salarioBruto * INSS;
                System.out.printf("INSS (8): R$ %.2f\n", descontoINSS);
                descontoSindicato = salarioBruto * SINDICATO;
                System.out.printf("SINDICATO (5): R$ %.2f\n", descontoSindicato);

                descontoSalario = salarioBruto * (IR + INSS + SINDICATO);
                System.out.printf("Your discount is R$ %.2f\n", descontoSalario);

                salarioLiquido = salarioBruto - descontoSalario;
                System.out.printf("Your total salary for month is R$ %.2f\n", salarioLiquido);

            } else if (salarioBruto > 4664.68) {
                final float IR = 0.275f;
                descontoIR = salarioBruto * IR;
                System.out.printf("IR (27.5): R$ %.2f\n", descontoIR);
                descontoINSS = salarioBruto * INSS;
                System.out.printf("INSS (8): R$ %.2f\n", descontoINSS);
                descontoSindicato = salarioBruto * SINDICATO;
                System.out.printf("SINDICATO (5): R$ %.2f\n", descontoSindicato);

                descontoSalario = salarioBruto * (IR + INSS + SINDICATO);
                System.out.printf("Total discount is R$ %.2f\n\n", descontoSalario);

                salarioLiquido = salarioBruto - descontoSalario;
                System.out.printf("Your total salary for month is R$ %.2f\n", salarioLiquido);
            }
            System.out.println("Do you want other information?");
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