public class FinancialAnalysis {
    public static void main(String[] args) {
        // Gastos mensais
        double gastoJaneiro = 15000.0;
        double gastoFevereiro = 23000.0;
        double gastoMarco = 17000.0;

        // Cálculo da despesa total no trimestre
        double despesaTotalTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;

        // Cálculo da média mensal de gastos
        double mediaMensalGastos = despesaTotalTrimestre / 3; // Dividido por 3 meses

        // Impressão dos resultados
        System.out.println("Despesa total no trimestre: " + despesaTotalTrimestre + " reais");
        System.out.println("Média mensal de gastos: " + mediaMensalGastos + " reais");
    }
}
