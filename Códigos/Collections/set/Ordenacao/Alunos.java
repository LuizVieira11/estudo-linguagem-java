package Collections.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos>{

    private String nome;
    private Long matricula;
    private double media;

    public Alunos(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    @Override
    public int compareTo(Alunos a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alunos alunos)) return false;
        return Objects.equals(getMatricula(), alunos.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public String toString() {
        return "\n-> Nome: '" + nome + "' | Mat: " + matricula + " | Média: " + media;
    }
}

class ComparatorPorMatricula implements Comparator<Alunos> {

    @Override
    public int compare(Alunos a1, Alunos a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}
