import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        double salarioBruto, salarioLiquido;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu salário bruto: ");
        salarioBruto = scanner.nextDouble();

        if (salarioBruto <= 1903.98) {
            salarioLiquido = salarioBruto;
        } 
        else if (salarioBruto <= 2826.65) {
            salarioLiquido = salarioBruto - 142.80;
        } 
        else if (salarioBruto <= 3751.05) {
            salarioLiquido = salarioBruto - 354.80;
        } 
        else if (salarioBruto <= 4664.68) {
            salarioLiquido = salarioBruto - 636.13;
        } 
        else {
            salarioLiquido = salarioBruto - 869.36;
        }

        System.out.println("Seu salário líquido é: " + salarioLiquido);
        scanner.close();
    }
}