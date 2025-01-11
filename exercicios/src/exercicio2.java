
import java.util.Scanner;

// 2) Sequência de Fibonacci e verificação de pertencimento

public class exercicio2 {


        public static boolean verificaFibonacci(int numero) {
            int a = 0, b = 1;
            while (b < numero) {
                int temp = b;
                b = a + b;
                a = temp;
            }
            return b == numero || numero == 0;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe um número: ");
            int numero = scanner.nextInt();

            if (verificaFibonacci(numero)) {
                System.out.println("O número " + numero + " está na sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " NÃO está na sequência de Fibonacci.");
            }

            scanner.close();
        }
    }

