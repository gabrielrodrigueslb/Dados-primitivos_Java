package Condicionais;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
//        Scanner= Um jeito de trazer o usuário para dentro da aplicação
//        Objetivo: O usuário vai criar um personagem e vamos validar os dados

        Scanner caixaDeTexto = new Scanner(System.in);

        //Receber o nome do personagem
        System.out.println("Escreva aqui o nome do seu personagem: ");
        String nome = caixaDeTexto.nextLine();
        System.out.println("Seu nome é: " + nome);

        //Receber o nome do personagem
        System.out.println("Escreva aqui a idade do seu personagem: ");
        int idade = caixaDeTexto.nextInt();
        System.out.println("Sua idade é: " + idade);
        
        // Fechar sempre o Scanner
        caixaDeTexto.close();
    }
}
