import java.util.HashMap;
import java.util.Map;

// 4) Percentual de representação por estado
public class exercicio4 {

        public static void main(String[] args) {
            Map<String, Double> faturamentoEstados = new HashMap<>();
            faturamentoEstados.put("SP", 67836.43);
            faturamentoEstados.put("RJ", 36678.66);
            faturamentoEstados.put("MG", 29229.88);
            faturamentoEstados.put("ES", 27165.48);
            faturamentoEstados.put("Outros", 19849.53);

            double total = 0;
            for (double valor : faturamentoEstados.values()) {
                total += valor;
            }

            System.out.println("Percentual por estado:");
            for (Map.Entry<String, Double> entry : faturamentoEstados.entrySet()) {
                double percentual = (entry.getValue() / total) * 100;
                System.out.println(entry.getKey() + ": " + String.format("%.2f", percentual) + "%");
            }
        }
    }

