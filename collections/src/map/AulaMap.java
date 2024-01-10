package map;

public class AulaMap implements Comparable<AulaMap>{
    private String nome;
    private int minutos;

    public AulaMap(String nome, int minutos) {
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
    public int compareTo(AulaMap o) {
        return Integer.compare(this.minutos, o.minutos);
    }

}
