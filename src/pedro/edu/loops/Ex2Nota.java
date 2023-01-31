/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

package pedro.edu.loops;
import java.util.Scanner;

public class Ex2Nota {
    
    public static void main(String[] args) {
        int     nota;
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scan.nextInt();

            if(nota < 0 || nota > 10){
                System.out.println("Nota inválida.");
            } else {
                break;
            }
        }
    }

}
