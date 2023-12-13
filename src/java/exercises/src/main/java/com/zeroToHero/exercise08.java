package com.zeroToHero;

import java.util.Scanner;

public class exercise08 {

    private static final float IR = 0.11f;
    private static final float INSS = 0.08f;
    private static final float SINDICATO = 0.05f;

    public static void main(String [] args) {
        float valorHora, salarioBruto, salarioLiquido, descontoSalario, descontoIR, descontoINSS, descontoSindicato;
        int quantHora;


        Scanner scan = new Scanner(System.in);

        System.out.println("How much do you earn per hours worked? ");
        valorHora = scan.nextFloat();

        System.out.println("How many hours do you work? ");
        quantHora = scan.nextInt();

        salarioBruto = valorHora * quantHora;
        System.out.printf("Your gross salary is R$ %.2f\n", salarioBruto);

        descontoIR = salarioBruto * IR;
        System.out.printf("IR (11): R$ %.2f\n", descontoIR);
        descontoINSS = salarioBruto * INSS;
        System.out.printf("INSS (8): R$ %.2f\n", descontoINSS);
        descontoSindicato = salarioBruto * SINDICATO;
        System.out.printf("SINDICATO (5): R$ %.2f\n", descontoSindicato);

        descontoSalario = salarioBruto * (IR + INSS + SINDICATO);
        System.out.printf("Your discount salary for month is R$ %.2f\n", descontoSalario);

        salarioLiquido = salarioBruto - descontoSalario;
        System.out.printf("Your total salary for month is R$ %.2f\n", salarioLiquido);
        scan.close();
    }
}
