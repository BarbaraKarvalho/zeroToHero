package com.zeroToHeroOne;

import java.util.Arrays;
import java.util.Scanner;

public class exercise08_2 {
    public static void main(String[] args) {

        //TODO:
        //SEM DEFINIR A QUANTIDADE QUE O USUÁRIO INSERIR DE NÚMEROS
        //usuario - Quantos números que ele vai informar
        //depois aplica a regra
        //Pega o primeiro item do array comparar com todos

        Scanner scan = new Scanner(System.in);

        //Bubble Sort: uma escolha eficaz para pequenas listas
        //Ele funciona comparando e trocando elementos adjacentes até que a lista esteja ordenada.

        int quantidade = 0;
        System.out.println("Digite quantos numeros quer informar?");
        quantidade = scan.nextInt();

        int[] valor = new int[quantidade];
        for(int a = 0; a < valor.length; a++){
            System.out.println("Digite o primeiro número inteiro:");
            valor[a] = scan.nextInt();
        }
        scan.close();
        boolean flag; // Flag será usada para indicar se foi feita uma troca

        // loop while quando um loop não pode ser executado em todos
        // um do-while loop quando o loop é executado pelo menos uma vez.
        do{
            //A cada interação é marcado como se não houvesse ainda troca
            flag = false;

            //Percorre por todos os elementos menos o ultimo,
            //pois serão comparados o elemento com seu seguinte
            for (int i = 0; i < valor.length - 1; i++) {

                //verifica se os elementos estão na ordem certa
                //Quem verifica se a posição atual é maior ou menor
                if (valor[i] < valor[i + 1]) {

                    //Caso não estejam ordenados tem troca de lugar
                    //Variável para aux para troca dos valores
                    int aux = valor[i];
                    valor[i] = valor[i + 1];
                    valor[i + 1] = aux;

                    // Quando teve uma troca
                    flag = true;
                }
            }
        } while (flag); // Se hove uma troca o algorítimo continua.

        System.out.println("Os números digitados na ordem crescente são: " + Arrays.toString(valor));
    }
}
