package pedro.edu.metodos;
import java.util.Scanner;

public class Calculadora{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int numero1, numero2;
        String operacao;

        System.out.println("Digite dois inteiros: ");
        numero1 = scan.nextInt();
        numero2 = scan.nextInt();
        
        System.out.println("Agora, digite a operação que deseja realizar(+, -, *,/):");
        operacao = scan.next();

        switch (operacao) {
            case "+":
                somar(numero1, numero2);
                break;
            case "-":
                subtrair(numero1, numero2);
                break;
            case "/":
                dividir(numero1, numero2);
                break;
            case "*":
                multiplicar(numero1, numero2);
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

    }

    public static void somar(int a, int b){
        System.out.println(a + " + " + b + " = " + (a+b));
    }

    public static void multiplicar(int a, int b){
        System.out.println(a + " X " + b + " = " + (a*b));
    }

    public static void dividir(int a, int b){
        System.out.println(a + " / " + b + " = " + (a/b));
    }

    public static void subtrair(int a, int b){
        System.out.println(a + " - " + b + " = " + (a-b));
    }
}