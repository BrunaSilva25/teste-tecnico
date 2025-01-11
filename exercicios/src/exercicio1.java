public class exercicio1 {

    // 1) Qual será o valor da variável SOMA ao final do processamento?

        public static void main(String[] args) {
            int indice = 13;
            int soma = 0;
            int k = 0;

            while (k < indice) {
                k = k + 1;
                soma = soma + k;
            }

            System.out.println("O valor da variável SOMA é: " + soma);
        }
    }

// Resultado  91

