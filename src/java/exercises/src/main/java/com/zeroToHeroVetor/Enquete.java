package com.zeroToHeroVetor;

import java.util.Arrays;
import java.util.Scanner;

public class Enquete {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean invalido = true;
        int opcao, sistemas;
        int windowns = 0, unix = 0, linux = 0, netware = 0, macOS = 0, outro = 0;
        double percWindowns, percUnix, percLinux, percNetware, percMacOS, percOutro;
        double percTotal;

        System.out.println("** ENQUETE **");
        System.out.println("Qual o melhor Sistema Operacional para uso em servidores?");
        System.out.println("---------------------------------------------------------");
        System.out.println("1 - Windows Server");
        System.out.println("2 - Unix");
        System.out.println("3 - Linux");
        System.out.println("4 - Netware");
        System.out.println("5 - Mac OS");
        System.out.println("6 - Outro");
        System.out.println("--------------------------------------------------------");


        while (invalido) {
            System.out.println("Digite a sua opção: ");
            opcao = scan.nextInt();

            if (opcao == 0) {
                System.out.println("** ENQUETE ENCERRADA! **");
                System.out.println(" ");
                break;
            }

            switch (opcao) {
                case 1:
                    if(opcao == opcao) {
                        ++windowns;

                        System.out.println("Sua escolha foi computada com sucesso");
                    }
                    break;
                case 2:
                    if(opcao == opcao) {
                        ++unix;

                        System.out.println("Sua escolha foi computada com sucesso");
                    }
                    break;
                case 3:
                    if(opcao == opcao) {
                        ++linux;

                        System.out.println("Sua escolha foi computada com sucesso");
                    }
                    break;
                case 4:
                    if(opcao == opcao) {
                        ++netware;

                        System.out.println("Sua escolha foi computada com sucesso");
                    }
                    break;
                case 5:
                    if(opcao == opcao) {
                        ++macOS;

                        System.out.println("Sua escolha foi computada com sucesso");
                    }
                    break;
                case 6:
                    if(opcao == opcao) {
                        ++outro;

                        System.out.println("Sua escolha foi computada com sucesso");
                        break;
                    }
                default:
                    System.out.println("Sua opção é inválida, por isso, não poderá ser computada.");
                    System.out.println("Tente novamente, digitando uma opção valida!!\n");
            }
        }
        scan.close();

        sistemas = (windowns + unix + linux + netware + macOS + outro);
        percTotal = (sistemas * 100)/sistemas;

        percWindowns = (windowns  * 100)/sistemas;
        percUnix = (unix * 100)/sistemas;
        percLinux = (linux * 100)/sistemas;
        percNetware = (netware * 100)/sistemas;
        percMacOS = (macOS * 100)/sistemas;
        percOutro = (outro * 100)/sistemas;

        System.out.println("---------------------------------------------------------------");
        System.out.println("Sistema Operacional     " + "Qntd de Votos     " + "% de Votos ");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Windowns                     " + windowns + "               " + percWindowns + "%");
        System.out.println("Unix                         " + unix + "               " + percUnix + "%");
        System.out.println("Linux                        " + linux + "               " + percLinux + "%");
        System.out.println("Netware                      " + netware + "               " + percNetware + "%");
        System.out.println("MacOS                        " + macOS + "               " + percMacOS + "%");
        System.out.println("Outro                        " + outro + "               " + percOutro + "%");
        System.out.println("---------------------------------------------------------------");
        System.out.println("            " + "Total de Votos: " + sistemas + "              " + percTotal + "%");
        System.out.println("---------------------------------------------------------------");

        if(windowns > unix && windowns > linux && windowns > netware && windowns > macOS && windowns > outro) {
            System.out.println("O vencedor da enquete é o sistema Windowns, com: " + windowns + " votos, equivalente a " + percWindowns + "%");
        } else if(unix > windowns && unix > linux && unix > netware && unix > macOS && unix > outro) {
            System.out.println("O vencedor da enquete é o sistema Unix, com: " + unix + " votos, equivalente a " + percUnix + "%");
        } else if(linux > windowns && linux > unix && linux > netware && linux > macOS && linux > outro) {
            System.out.println("O vencedor da enquete é o sistema Linux, com: " + linux + " votos, equivalente a " + percLinux + "%");
        } else if(netware > windowns && netware > unix && netware > linux && netware > macOS && netware > outro) {
            System.out.println("O vencedor da enquete é o sistema Netware, com: " + netware + " votos, equivalente a " + percNetware + "%");
        } else if(macOS > windowns && macOS > unix && macOS > linux && macOS > netware && unix > outro) {
            System.out.println("O vencedor da enquete é sistema MacOs, com: " + macOS + " votos, equivalente a " + percMacOS + "%");
        } else if(outro > windowns && outro > unix && outro > linux && outro > netware && outro > macOS) {
            System.out.println("O vencedor da enquete é outros sistemas, com: " + outro + " votos, equivalente a " + percOutro + "%");
        }

    }
}

//TODO: Tentativa com array

// int qtd = 0;
// int[] opcao = new int[qtd];
// for (int i = 0; i < opcao.length - 1; i++) {
//    if(opcao[i] < opcao[i + 1]){
//      int aux = opcao[i];
//      opcao[i] = opcao[i + 1];
//      opcao[i + 1] = aux;
//System.out.println("O vencedor da enquete é: " + Arrays.toString(opcao));
//}
//}