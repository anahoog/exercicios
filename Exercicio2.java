// /Faça um programa que leia dois números e apresente a soma dos
//fatoriais desses números

import java.util.Scanner;

public class Exercicio2{
    public static void main( String [] args){
        
        Scanner teclado = new Scanner (System.in);   
        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();
        //System.out.println(num1);
        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();
        num1 = num1+num2;
        System.out.println("Soma dos números: "+num1);


        int fatorial = 1;


        for (int i=1; i<=num1;i++){
            fatorial = i * fatorial;
        }

        System.out.println("Seu fatorial: "+fatorial);

    }
}