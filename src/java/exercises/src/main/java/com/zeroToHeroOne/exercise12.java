package com.zeroToHeroOne;

import java.util.Scanner;

public class exercise12 {
public static void main(String[] args) {
    //TODO: Fazer com Switch
    double produto, desconto1, desconto2, descontoF1, descontoF2, valor3, valor4, valorF4, valorPF4;
    int opcao, parcelaOP4;
    int menu;
    boolean novoProduto = true;

    Scanner scan = new Scanner(System.in);

    while (novoProduto) {
        System.out.println("Digite o valor do seu produto:");
        produto = scan.nextDouble();

        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        opcao = scan.nextInt();

        if (opcao == 1) {
            desconto1 = produto * 0.15f;
            System.out.printf("O desconto é: R$ %.2f\n", desconto1);
            descontoF1 = produto - desconto1;
            System.out.printf("O valor final do seu produto com o desconto é: R$ %.2f\n", descontoF1);

        } else if (opcao == 2) {
            desconto2 = produto * 0.10f;
            System.out.printf("O desconto é: R$ %.2f\n", desconto2);
            descontoF2 = produto - desconto2;
            System.out.printf("O valor final do seu produto com o desconto é: R$ %.2f\n", descontoF2);

        } else if (opcao == 3) {
            valor3 = produto / 2;
            System.out.printf("Você optou por parcelar o seu produto. Então, ficará duas parcelas de R$ %.2f\n", valor3);

        } else if (opcao == 4) {
            System.out.printf("Você optou por parcelar o seu produto com juros. Então, selecione a quantidade de parcelas: \n");
            System.out.println("3 - 3x");
            System.out.println("4 - 4x");
            System.out.println("5 - 5x");
            System.out.println("6 - 6x");
            System.out.println("7 - 7x");
            System.out.println("8 - 8x");
            System.out.println("9 - 9x");
            System.out.println("10 - 10x");
            parcelaOP4 = scan.nextInt();

            valor4 = produto * 0.10f;
            valorF4 = produto + valor4;
            System.out.printf("O valor do produto com juros é R$ %.2f\n", valorF4);
            valorPF4 = (valorF4 / parcelaOP4);
            System.out.printf("Então, ficam parcelas iguais de R$ %.2f\n", valorPF4);

        } else
            break;

            System.out.println("Deseja consultar novo produto?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            menu = scan.nextInt();

            if (menu == 2) {
                novoProduto = false;
            }
        }
        scan.close();
    }
}
