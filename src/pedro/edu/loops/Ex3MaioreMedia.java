/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
package pedro.edu.loops;
import java.util.Scanner;

public class Ex3MaioreMedia {
    
    public static void main(String[] args){
        int  numeroEntrada, maiorNumero, soma;
        Scanner scan = new Scanner(System.in);
       
        soma        =    0;
        maiorNumero =    0;

        for(int i=0; i<5; i++) {
            System.out.println("Digite um inteiro: ");
            numeroEntrada = scan.nextInt();
            
            soma += numeroEntrada;

            if(numeroEntrada > maiorNumero) maiorNumero = numeroEntrada;            
            
        }
        System.out.println("O maior número digitado foi: " + maiorNumero);
        System.out.println("A média dos números digitas é " + (soma/5));
    }
}
