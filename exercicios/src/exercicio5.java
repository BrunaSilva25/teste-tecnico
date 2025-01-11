import java.util.Scanner;

// 5) Inversão de uma string sem usar funções prontas
public class exercicio5 {

        public static String inverteString(String s) {
            String invertida = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                invertida += s.charAt(i);
            }
            return invertida;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite uma string: ");
            String input = scanner.nextLine();
            System.out.println("String invertida: " + inverteString(input));
            scanner.close();
        }
    }


