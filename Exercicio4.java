import java.util.Scanner;

public class Exercicio4 {
    public static void main( String [] args){
        
        Scanner teclado = new Scanner (System.in);   
        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();   
        int menor, maior; 
        
        if(num1>=num2){
            maior = num1;
            menor = num2;
        }else{
            maior = num2;
            menor = num1;
        }
    
        for(int i = maior; menor<=i; i--){
            int fatorial = 1;

            for(int x = 1; x<=i;x++){
                fatorial = x*fatorial;

            }
            System.out.println("Fatorial de "+i +" é "+ fatorial);

        }

    }
}
