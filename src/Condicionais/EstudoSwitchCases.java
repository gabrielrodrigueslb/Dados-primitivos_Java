package Condicionais;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        //pedir para o usuario
        Scanner scanner= new Scanner(System.in);
        System.out.println("Escolha um personagem:");
        System.out.println("1- Son Goku");
        System.out.println("2- Vegeta");
        System.out.println("1- Son Gohan");

        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou o número: " + escolhaDoUsuario);

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuário escolher o Son Goku");
                break;
            case 2:
                System.out.println("O usuário escolher o Vegeta");
                break;
            case 3:
                System.out.println("O usuário escolher o Son Gohan");
                break;
            default :
                System.out.println("Você escolheu uma opção inválida, fluxo cancemlado.");
        }


        //fechar a caixa
        scanner.close();


    }
}
