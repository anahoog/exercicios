//Faça um programa que leia do teclado seu nome, o ano que você
//nasceu, o ano atual e imprima na tela seu nome e sua idade.

import java.util.Scanner;

public class Exercicio{

    public static void main (String[] args) {

        Scanner teclado = new Scanner (System.in);   
        System.out.print("Entre com o seu nome:");
        String nome = teclado.nextLine();
        System.out.println();

        System.out.print("Entre com o ano que nasceu:");
        int nascimento = teclado.nextInt();
        System.out.println();
        
        System.out.print("Entre com o ano atual:");
        int atual = teclado.nextInt();
        int idade = atual - nascimento;

        System.out.println(nome + ", possui " + idade + " anos");
        
    
    }
}