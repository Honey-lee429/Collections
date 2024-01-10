package set;

public class AlunoSet {

    private String nome;
    private int matricula;

    public AlunoSet(String nome, int matricula) {
        if (nome == null) {
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "(Aluno: " + this.getNome() + " ,matricula: " + this.getMatricula() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        AlunoSet aluno = (AlunoSet) obj;
        return this.getNome().equals(aluno.getNome());
    }

    @Override
    public int hashCode() {
       // return this.nome.charAt(0); // todo nome que começa com uma determinada letra, fica guardada num espaço.
        return this.nome.hashCode(); // guarda os nomes de acordo com o agrupamento de cada silaba, fazendo um for, desta forma a busca fica mais eficiente do q a forma anterior
    }
}
