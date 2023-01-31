/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
package pedro.edu.loops;
import java.util.Scanner;

public class Ex4PareImpar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int quantidadeNumeros, numerosPares=0, numerosImpares=0, numeroInserido;
        
        System.out.println("Digite quantos inteiros deseja inserir:");
        quantidadeNumeros = scan.nextInt();

        for(int i=0; i<quantidadeNumeros; i++) {
            System.out.println("Digite um inteiro: ");
            numeroInserido = scan.nextInt();

            if((numeroInserido % 2) != 0) numerosImpares++;
            else numerosPares++;
            
        }
        System.out.println("Foram inseridos " + numerosPares + " números pares");
        System.out.println("Foram inseridos " + numerosImpares + " números ímpares");
    }    
}
