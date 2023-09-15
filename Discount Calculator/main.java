import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Digite o valor do produto: ");
        double valorProduto = Double.parseDouble(reader.readLine());

        System.out.print("Digite a porcentagem de desconto: ");
        double percentualDesconto = Double.parseDouble(reader.readLine());

        double valorDesconto = (valorProduto * percentualDesconto) / 100;

        double valorProdutoComDesconto = valorProduto - valorDesconto;

        System.out.println("Valor do desconto: " + valorDesconto + " reais");
        System.out.println("Valor do produto com desconto: " + valorProdutoComDesconto + " reais");

        reader.close();
    }
}