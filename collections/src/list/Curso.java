package list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(this.aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTotalDuracao() {
        /* var duracao = 0;
        for (list.Aula aula : this.aulas) {
            duracao += aula.getMinutos();
        } */
        return this.aulas.stream().mapToInt(Aula::getMinutos).sum(); // java8 -> maneira alternativa de escrever o for
    }

    @Override
    public String toString() {
        return "curso: " + this.nome + " ,duracao do curso: " + getTotalDuracao() + " min, contem as " + this.aulas;
    }
}
