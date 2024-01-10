package list;

public class Aula implements Comparable<Aula>{
    private String nome;
    private int minutos;

    public Aula(String nome, int minutos) {
        this.nome = nome;
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "list.Aula: " + this.nome + ", duracao: " + this.minutos;
    }


    public String getNome() {
        return nome;
    }

    public int getMinutos() {
        return minutos;
    }


    @Override
    public int compareTo(Aula o) {
        return Integer.compare(this.minutos, o.minutos);
    }

}
