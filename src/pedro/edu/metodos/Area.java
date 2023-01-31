/*
 * Crie uma aplicação que calcule a área dos 3 quadriláteros notáveis
 * trapézio, retângulo e quadrado
 * Use Sobrecarga
 */

package pedro.edu.metodos;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.println("1- Trapézio\n2- Retângulo\n3- Quadrado");
        System.out.print("Digite o respectivo número do quadrilátero que deseja calcular a área: ");
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite a base maior, menor e a altura: ");
                int baseMaior = scan.nextInt();
                int baseMenor = scan.nextInt();
                int alturaTrapezio = scan.nextInt();
                calcularArea(baseMaior, baseMenor, alturaTrapezio);
                break;
            case 2:
                System.out.println("Digite a base e a altura: ");
                int base = scan.nextInt();
                int alturaRetangulo = scan.nextInt();
                calcularArea(base, alturaRetangulo);
                break;
            case 3:
                System.out.println("Digite o lado: ");
                int lado = scan.nextInt();
                calcularArea(lado);
                break;
            default:
                System.out.println("Código inválido.");
                break;
        }
    }
    
    public static void calcularArea(int baseMaior, int baseMenor, int altura){
        System.out.println("A área do trapézio é: " + ((baseMaior + baseMenor)*altura)/2);
    }

    public static void calcularArea(int base, int altura){
        System.out.println("A área do retângulo é: " + (base*altura));
    }

    public static void calcularArea(int lado){
        System.out.println("A área do quadrado é: " + (lado*lado));
    }
}
