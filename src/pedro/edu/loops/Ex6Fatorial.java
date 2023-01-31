/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
package pedro.edu.loops;
import java.util.Scanner;

public class Ex6Fatorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int fatorial, numeroInserido;

        System.out.println("Deseja saber o fatorial de qual número?");
        numeroInserido = scan.nextInt();
        fatorial       = numeroInserido;
        
        while(numeroInserido > 1){
            numeroInserido--;
            fatorial *= numeroInserido;
        }
        System.out.println("O fatorial do número fornecido é: " + fatorial);
    }    
}
