import java.util.Scanner;

public class Exercicio3{
    public static void main( String [] args){
        
        Scanner teclado = new Scanner (System.in);   
        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = teclado.nextInt();

        System.out.print("Digite o quarto número: ");
        int num4 = teclado.nextInt();


        int fatorial1 = 1;
        int fatorial2 = 1;
        int fatorial3 = 1;
        int fatorial4 = 1;


            for (int i=1; i<=num1;i++){
                fatorial1 = i * fatorial1;
            }
            for (int i=1; i<=num2;i++){
                fatorial2 = i * fatorial2;
            }
            for (int i=1; i<=num3;i++){
                fatorial3 = i * fatorial3;
            }
            for (int i=1; i<=num4;i++){
                fatorial4 = i * fatorial4;
            }

        System.out.println("Fatorial de "+ num1 + " é "+ fatorial1);
        System.out.println("Fatorial de "+ num2 + " é "+ fatorial2);
        System.out.println("Fatorial de "+ num3 + " é "+ fatorial3);
        System.out.println("Fatorial de "+ num4 + " é "+ fatorial4);

    }
}