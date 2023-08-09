package Collections.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long cod, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto("Produto 2", 2L, 45d, 5);
        cadastroProdutos.adicionarProduto("Produto 6", 23L, 99d, 5);
        cadastroProdutos.adicionarProduto("Produto 0", 9L, 5d, 5);
        cadastroProdutos.adicionarProduto("Produto 99", 88L, 4d, 5);
        cadastroProdutos.adicionarProduto("Produto 3", 21L, 455d, 5);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirPorPreco());

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

    }

}
