// ControleProduto.java
import java.util.ArrayList;
import java.util.List;

import SupermarketSystem.Produto;

public class ControleProduto {
    private List<Produto> produtos;

    public ControleProduto() {
        produtos = new ArrayList<>();
    }

    public boolean efetuaVenda(Produto produto, int quantidade) {
        for (Produto p : produtos) {
            if (p.getNome().equals(produto.getNome())) {
                if (p.getQuantidade() >= quantidade) {
                    p.setQuantidade(p.getQuantidade() - quantidade);
                    System.out.println(quantidade + " unidades de " + p.getNome() + " vendidas com sucesso.");
                    return true;
                } else {
                    System.out.println("Não há estoque suficiente de " + p.getNome() + ".");
                    return false;
                }
            }
        }
        System.out.println("Produto " + produto.getNome() + " não encontrado.");
        return false;
    }

    public void cadastraProduto() {
        // Leitura dos atributos do produto a partir do console
        // Você pode usar a classe Scanner para isso

        String nome = // Ler o nome do produto;
        int quantidade = // Ler a quantidade em estoque;
        double preco = // Ler o preço do produto;

        Produto produto = new Produto(nome, quantidade, preco);
        produtos.add(produto);
        System.out.println(produto.getNome() + " cadastrado com sucesso.");
    }
}