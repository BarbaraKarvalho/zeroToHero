package com.zeroToHero;

import java.util.Scanner;

public class exercise08_1 {
    private static final float INSS = 0.08f;
    private static final float SINDICATO = 0.05f;

    public static void main(String [] args) {
        float valorHora, salarioBruto, salarioLiquido, descontoSalario;
        int quantHora;

        Scanner scan = new Scanner(System.in);

        System.out.println("How much do you earn per hours worked? ");
        valorHora = scan.nextFloat();

        System.out.println("How many hours do you work? ");
        quantHora = scan.nextInt();

        salarioBruto = valorHora * quantHora;
        System.out.printf("Your gross salary is R$ %.2f\n", salarioBruto);

        if(salarioBruto < 2112.00){
            descontoSalario = salarioBruto * (INSS + SINDICATO);
            System.out.printf("Your discount is R$ %.2f\n", descontoSalario);

            salarioLiquido = salarioBruto - descontoSalario;
            System.out.printf("Your total salary for month is R$ %.2f\n", salarioLiquido);

        } else if (salarioBruto >= 2112.00 && salarioBruto < 2826.65){
            final float IR = 0.075f;
            descontoSalario = salarioBruto * (0.075f + INSS + SINDICATO);
            System.out.printf("Your discount is R$ %.2f\n", descontoSalario);

            salarioLiquido = salarioBruto - descontoSalario;
            System.out.printf("Your total salary for month is R$ %.2f\n", salarioLiquido);

        } else if (salarioBruto >= 2826.66 && salarioBruto < 3751.05){
            final float IR = 0.15f;
            descontoSalario = salarioBruto * (IR + INSS + SINDICATO);
            System.out.printf("Your discount is R$ %.2f\n", descontoSalario);

            salarioLiquido = salarioBruto - descontoSalario;
            System.out.printf("Your total salary for month is R$ %.2f\n", salarioLiquido);

        } else if (salarioBruto >= 3751.06 && salarioBruto < 4664.68){
            final float IR = 0.225f;
            descontoSalario = salarioBruto * (IR + INSS + SINDICATO);
            System.out.printf("Your discount is R$ %.2f\n", descontoSalario);

            salarioLiquido = salarioBruto - descontoSalario;
            System.out.printf("Your total salary for month is R$ %.2f\n", salarioLiquido);

        } else if (salarioBruto > 4664.68){
            final float IR = 0.275f;
            descontoSalario = salarioBruto * (IR + INSS + SINDICATO);
            System.out.printf("Your discount is R$ %.2f\n", descontoSalario);

            salarioLiquido = salarioBruto - descontoSalario;
            System.out.printf("Your total salary for month is R$ %.2f\n", salarioLiquido);
            scan.close();
        }
    }
}