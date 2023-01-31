/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

package pedro.edu.arrays.unidimensionais;

import java.util.Scanner;

public class Ex2Consoantes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[]   consoantes = new String[6];

        String letra;
        int      i=0;
        int  count=0;

        while(i<6){
            System.out.print("Digite uma letra: "); letra = scan.next();

            if(!((letra.equalsIgnoreCase("a"))
                || (letra.equalsIgnoreCase("e"))
                || (letra.equalsIgnoreCase("i"))
                || (letra.equalsIgnoreCase("o")
                || (letra.equalsIgnoreCase("u"))))){
                    consoantes[i] = letra;
                    count++;
            }   
            i++;
        }
        
        for(int j=0; j<consoantes.length; j++){
            if(consoantes[j] != null) System.out.print(consoantes[j] + "\n ");
        }
    
        System.out.println("Foram digitadas " + count + " consoantes.");
    } 
}
