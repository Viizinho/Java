// Main.java
import java.util.Scanner;

import ControleProduto;
import Produto;

public class Main {
    public static void main(String[] args) {
        ControleProduto controle = new ControleProduto();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Efetuar Venda");
            System.out.println("3. Sair");

            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    controle.cadastraProduto();
                    break;
                case 2:
                    scanner.nextLine(); // Limpa o buffer
                    System.out.print("Digite o nome do produto a ser vendido: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Digite a quantidade a ser vendida: ");
                    int quantidadeVendida = scanner.nextInt();
                    Produto produtoParaVenda = new Produto(nomeProduto, 0, 0); // Cria um objeto de produto com valores padrão para pesquisa
                    controle.efetuaVenda(produtoParaVenda, quantidadeVendida);
                    break;
                case 3:
                    scanner.close();
                    System.exit(0); // Encerra o programa
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}