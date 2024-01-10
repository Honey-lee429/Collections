package set;

public class AulaSet implements Comparable<AulaSet>{
    private String nome;
    private int minutos;

    public AulaSet(String nome, int minutos) {
        this.nome = nome;
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "Aula: " + this.nome + ", duracao: " + this.minutos;
    }


    public String getNome() {
        return nome;
    }

    public int getMinutos() {
        return minutos;
    }


    @Override
    public int compareTo(AulaSet o) {
        return Integer.compare(this.minutos, o.minutos);
    }

}
