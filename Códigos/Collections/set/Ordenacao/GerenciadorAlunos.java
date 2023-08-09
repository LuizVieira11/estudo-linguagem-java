package Collections.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Alunos> alunosSet;

    public GerenciadorAlunos(){
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Alunos alunoParaRemover = null;
        if(!alunosSet.isEmpty()){
            for(Alunos a : alunosSet){
                if(a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
            }
        }else{
            throw new RuntimeException("Conjunto vazio");
        }
        System.out.println("Aluno " + alunoParaRemover.getNome() + " removido");
        alunosSet.remove(alunoParaRemover);
    }

    public Set<Alunos> exibirAlunosPorNome(){
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Alunos> exibirAlunoPorNota(){
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorPorMatricula());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Lucas", 2223L, 7.9d);
        gerenciadorAlunos.adicionarAluno("Luiz", 9932L, 5.5d);
        gerenciadorAlunos.adicionarAluno("Marcos", 6758L, 10d);
        gerenciadorAlunos.adicionarAluno("Ana", 9902L, 9.8d);
        gerenciadorAlunos.adicionarAluno("Plato", 2343L, 1d);

        gerenciadorAlunos.exibirAlunos();

        System.out.println(gerenciadorAlunos.exibirAlunoPorNota());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
    }

}
