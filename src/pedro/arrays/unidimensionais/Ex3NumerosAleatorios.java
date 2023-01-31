/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

// random.nextint(100)

import java.util.Random;

public class Ex3NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] numerosAleatorios = new int[20];

        for(int i=0; i<20; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números aleatórios:");
        for(int numero : numerosAleatorios){
            System.out.println(numero);
        }

        System.out.println("Antecessores e sucessores dos números:");
        for(int numero : numerosAleatorios){
            System.out.println((numero - 1) + " " + (numero + 1));
        }
    }
}
