package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise23 {
    public static void main(String[] args) {

        double valorHA, totalSalario;
        int numAM, menu;
        double descontoINSS, descontoINSS1, descontoINSS2, descontoINSS3, somaDesconto, totalDesconto, salarioF;
        double limiteTeto = 1557.20;
        boolean totalDesLim = true;
        boolean novaConsulta = true;


        Scanner scan = new Scanner(System.in);
        while (novaConsulta) {
            System.out.println("Digite o valor hora/aula?");
            valorHA = scan.nextDouble();
            System.out.println("Digite a quantidade de aulas mês? ");
            numAM = scan.nextInt();

            totalSalario = valorHA * numAM;
            System.out.printf("Seu salário mensal sem desconto é R$ %.2f\n", totalSalario);
            System.out.println("");

            System.out.println("*** TABELA DO INSS *** ");
            System.out.println("Sálario (de) $0,00 até $1.412,00 - desconto de 7.5%");
            System.out.println("Sálario (de) $1.412,01 até $2.561,29 - desconto de 9.0%");
            System.out.println("Sálario (de) $2.666,69 até $4.000,03 - desconto de 12.0%");
            System.out.println("Sálario (de) $4.000,04 até $7.786,02 - desconto de 14.0%");
            System.out.println("Sálario maior que $7.786,02 - desconto limitado ao teto do INSS de R$ 1.557,20");
            System.out.println("");

            if (totalSalario < 1412.00) {
                descontoINSS = totalSalario * 0.075f;
                totalDesconto = totalSalario - descontoINSS;
                System.out.printf("O seu desconto do INSS é R$ %.2f\n", descontoINSS);
                System.out.printf("O seu salário com o desconto do INSS é R$ %.2f\n", totalDesconto);

            } else if (totalSalario > 1412.01 && totalSalario < 2666.68) {
                descontoINSS = 1412.00 * 0.075f; //105,9
                descontoINSS1 = (totalSalario - 1412.00) * 0.09f;
                somaDesconto = descontoINSS + descontoINSS1;

                totalDesconto = totalSalario - (descontoINSS + descontoINSS1);

                System.out.printf("O seu desconto do INSS é R$ %.2f\n", somaDesconto);
                System.out.printf("O seu salário com o desconto do INSS é R$ %.2f\n", totalDesconto);

            } else if (totalSalario > 2666.69 && totalSalario < 4000.03) {
                descontoINSS = 1412.00 * 0.075f; // 105,9
                descontoINSS1 = (2666.68 - 1412.00) * 0.09f; //1254,68
                descontoINSS2 = (totalSalario - 2666.68) * 0.12f;
                somaDesconto = descontoINSS + descontoINSS1 + descontoINSS2;

                System.out.printf("O seu desconto do INSS é R$ %.2f\n", somaDesconto);
                totalDesconto = totalSalario - (descontoINSS + descontoINSS1 + descontoINSS2);

                System.out.printf("O seu salário com o desconto do INSS é R$ %.2f\n", totalDesconto);

            } else if (totalSalario > 4000.04 && totalSalario < 7786.02) {
                descontoINSS = 1412.00 * 0.075f; // 105,9
                descontoINSS1 = (2666.68 - 1412.00) * 0.09f; //1254,68
                descontoINSS2 = (4000.03 - 2666.68) * 0.12f; // 1.333,35
                descontoINSS3 = (totalSalario - 4000.03) * 0.14f;
                somaDesconto = descontoINSS + descontoINSS1 + descontoINSS2 + descontoINSS3;

                totalDesconto = totalSalario - (descontoINSS + descontoINSS1 + descontoINSS2 + descontoINSS3);

                System.out.printf("O seu desconto do INSS é R$ %.2f\n", somaDesconto);
                System.out.printf("O seu salário com o desconto do INSS é R$ %.2f\n", totalDesconto);

            } else if (totalSalario > 7786.03) {
                descontoINSS = 1412.00 * 0.075f; // 105,9
                descontoINSS1 = (2666.68 - 1412.00) * 0.09f; //1254,68 - 112,92
                descontoINSS2 = (4000.03 - 2666.68) * 0.12f; // 1.333,35 - 160,00
                descontoINSS3 = (totalSalario - 4000.03) * 0.14f;

                totalDesconto = totalSalario - (descontoINSS + descontoINSS1 + descontoINSS2 + descontoINSS3);

                if (totalDesLim) {
                    System.out.printf("Você terá que pagar o teto do INSS de R$ %.2f\n", limiteTeto);
                    salarioF = totalSalario - limiteTeto;
                    System.out.printf("O seu salário com o desconto do INSS é R$ %.2f\n", salarioF);
                    totalDesLim = true;
                }
            }
            System.out.println("");
            System.out.println("Deseja fazer nova consulta?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            menu = scan.nextInt();

            if (menu == 2){
                novaConsulta = false;
            }
        }
        scan.close();
    }
}

