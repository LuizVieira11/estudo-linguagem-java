package Collections.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdMap;

    public EstoqueProdutos(){
        this.estoqueProdMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco){
        estoqueProdMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0d;
        if(!estoqueProdMap.isEmpty()){
            for(Produto p : estoqueProdMap.values()){
                valorTotal += (p.getPreco() * p.getQuantidade());
            }
        }else{
            throw new RuntimeException("Estoque vazio");
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = new Produto("a", 0, 0);
        if (!estoqueProdMap.isEmpty()) {
            for (Produto p : estoqueProdMap.values()) {
                if (p.getPreco() > produtoMaisCaro.getPreco()) {
                    produtoMaisCaro = p;
                }
            }
        } else {
            throw new RuntimeException("Map vazio");
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = new Produto("a", 0, Double.MAX_VALUE);
        if(!estoqueProdMap.isEmpty()){
            for(Produto p : estoqueProdMap.values()){
                if(p.getPreco() < produtoMaisBarato.getPreco()){
                    produtoMaisBarato = p;
                }
            }
        }else{
            throw new RuntimeException("Map vazio");
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoDeMaiorValor = new Produto("a", 0, 0);
        if(!estoqueProdMap.isEmpty()){
            produtoDeMaiorValor.setPreco(0);
            for(Produto p : estoqueProdMap.values()){
                if((p.getPreco() * p.getQuantidade()) > (produtoDeMaiorValor.getQuantidade() * produtoDeMaiorValor.getPreco())){
                    produtoDeMaiorValor = p;
                }
            }
        }else{
            throw new RuntimeException("Map vazio");
        }
        return produtoDeMaiorValor;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoque.adicionarProduto(2L, "Produto B", 50, 10.0);
        estoque.adicionarProduto(9L, "Produto C", 2, 15.0);
        estoque.adicionarProduto(8L, "Produto D", 2, 20.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto de maior valor: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }

}
