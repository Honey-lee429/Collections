package map;

import java.util.*;

public class CursoMap {
    private String nome;
    private String instrutor;
    private Set<AulaMap> aulas = new HashSet<>();
    private Set<AlunosMap> alunosMaps = new HashSet<>();
    private Map<Integer, String> buscaMatricula = new HashMap<>();


    public CursoMap(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adiciona(AulaMap aula) {
        this.aulas.add(aula);
    }

    public void adiciona(AlunosMap aluno) {
        this.buscaMatricula.put(aluno.getMatricula(), aluno.getNome());
        this.alunosMaps.add(aluno);
    }

    public Set<AulaMap> getAulas() {
        return aulas;
    }

    public Set<AlunosMap> getAlunoSets() {
        return this.alunosMaps;
    }

    public boolean alunoEstaMatriculado(AlunosMap aluno) {
        return this.alunosMaps.contains(aluno);
    }

    /*
    * Utilizando o for para buscar dentro de uma coleção de alunos o nome do aluno
    * torna menos performatico, como foi usado no set, para isso utilizados o Map que tem o hashCode como funcionalidade*/
    public boolean buscaAulanoPelaMatricula(int matricula) {
         buscaMatricula.get(matricula);
         return true;
    }
}
