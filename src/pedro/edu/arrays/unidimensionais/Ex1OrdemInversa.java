/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

package pedro.edu.arrays.unidimensionais;

public class Ex1OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {10, 97, 27, 46, 33, 10};
        int        tamanhoVetor = vetor.length;

        System.out.print("Vetor:\n");

        for(int i=0; i<tamanhoVetor; i++){
            System.out.print(vetor[tamanhoVetor - (i+1)]);
            System.out.print("\n");
        }
    }
}
