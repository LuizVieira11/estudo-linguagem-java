package Collections.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("nome 1", 20, 1.57);
        ordenacaoPessoas.adicionarPessoa("nome 2", 12, 1.67);
        ordenacaoPessoas.adicionarPessoa("nome 3", 33, 1.90);
        ordenacaoPessoas.adicionarPessoa("nome 4", 65, 1.55);

        System.out.println(ordenacaoPessoas.ordenarIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

    }


}
