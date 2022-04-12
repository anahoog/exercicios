//Faça um programa que leia um número (usuário fornece o número)
//e apresente o fatorial desse número

import java.util.Scanner;

public class Exercicio1{
    public static void main( String [] args){
        
        Scanner teclado = new Scanner (System.in);   
        System.out.print("Digite um número: ");
        int num1 = teclado.nextInt();
        //System.out.println(num1);
        int fatorial = 1;

        for (int i=1; i<=num1;i++){
            fatorial = i * fatorial;
        }

        System.out.println("Seu fatorial: "+fatorial);

    }
}