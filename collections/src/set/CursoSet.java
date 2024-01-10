package set;

import list.Aula;

import java.util.*;

public class CursoSet {
    private String nome;
    private String instrutor;
    private Set<AulaSet> aulas = new HashSet<>();
    private Set<AlunoSet> alunoSets = new HashSet<>();

    public CursoSet(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adiciona(AulaSet aula) {
        this.aulas.add(aula);
    }

    public void adiciona(AlunoSet aluno) {
        this.alunoSets.add(aluno);
    }

    public Set<AulaSet> getAulas() {
        return aulas;
    }

    public Set<AlunoSet> getAlunoSets() {
        return this.alunoSets;
    }

    public boolean alunoEstaMatriculado(AlunoSet aluno) {
        return this.alunoSets.contains(aluno);
    }

    /*
    * Utilizando o for para buscar dentro de uma coleção de alunos o nome do aluno
    * torna menos performatico, para isso utilizados o Map que tem o hashCode como funcionalidade*/
    public String buscaAulanoPelaMatricula(int matricula) {
        for (AlunoSet alunoSet : alunoSets) {
            if (matricula == alunoSet.getMatricula()) {
                return alunoSet.getNome();
            }
        }
        throw new NoSuchElementException("matricula nao encontrada");
    }
}
