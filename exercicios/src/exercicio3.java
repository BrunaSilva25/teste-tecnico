import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 3) Cálculo com base no faturamento diário

public class exercicio3 {

        public static void main(String[] args) {
            List<Double> faturamento = Arrays.asList(1000.0, 2000.0, 0.0, 0.0, 1500.0, 3000.0, 0.0, 3500.0, 4000.0, 0.0, 0.0, 500.0, 600.0);

            List<Double> faturamentoValidos = new ArrayList<>();
            for (double valor : faturamento) {
                if (valor > 0) {
                    faturamentoValidos.add(valor);
                }
            }

            double menor = faturamentoValidos.get(0);
            double maior = faturamentoValidos.get(0);
            double soma = 0;

            for (double valor : faturamentoValidos) {
                if (valor < menor) {
                    menor = valor;
                }
                if (valor > maior) {
                    maior = valor;
                }
                soma += valor;
            }

            double media = soma / faturamentoValidos.size();

            int diasAcimaDaMedia = 0;
            for (double valor : faturamentoValidos) {
                if (valor > media) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor valor: " + menor);
            System.out.println("Maior valor: " + maior);
            System.out.println("Dias acima da média: " + diasAcimaDaMedia);
        }
    }

