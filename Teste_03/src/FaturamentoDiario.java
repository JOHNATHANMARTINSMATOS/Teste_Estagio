/*3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.*/
public class FaturamentoDiario {
    public static void main(String[] args) {
        double[] faturamentos = {2000.0, 0.0, 3000.0, 1500.0, 0.0, 8000.0, 3500.0};
        double soma = 0;
        int diasValidos = 0;

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;

        for (double faturamento : faturamentos) {
            if (faturamento > 0) {
                soma += faturamento;
                diasValidos++;
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
            }
        }

        double media = soma / diasValidos;
        int diasAcimaDaMedia = 0;

        for (double faturamento : faturamentos) {
            if (faturamento > media) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor faturamento: R$ " + menorFaturamento);
        System.out.println("Maior faturamento: R$ " + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}