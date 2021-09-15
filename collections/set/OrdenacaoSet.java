package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre minhas sérias favoritas,
 * crie um cj e ordene este conjunto exibindo: (nome - genero = tempo de episódio)
 */

public class OrdenacaoSet {
	public static void main(String[] args) {
		
		System.out.println("--\tOrdem Aleatória\t--");
		Set<Serie> minhasSeries = new HashSet<>(){{
			add(new Serie("chess","criatividade", 60));
			add(new Serie("peaky brinders","policia", 80));
			add(new Serie("la casa","crime", 60));
			add(new Serie("rei leao","desenho", 74));
		}};
		
	    for (Serie serie : minhasSeries) {
	    	System.out.println(serie.getNome() + " - "
	    			+ serie.getGenero() + " - " 
	    			+ serie.getTempoEpisodio());
	    }	
		
		System.out.println("\n--\tOrdem inserção\t--");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
			add(new Serie("chess","criatividade", 60));
			add(new Serie("peaky brinders","policia", 80));
			add(new Serie("la casa","crime", 60));
			add(new Serie("rei leao","desenho", 74));
		}};
		for (Serie serie : minhasSeries1) {
			System.out.println(serie.getNome() + " - "
	    			+ serie.getGenero() + " - " 
	    			+ serie.getTempoEpisodio());
		}
		
		System.out.println("\n--\tOrdem crescente (tempoEpisodio)\t--");
		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1); //precisa implementar interface Comparable na classe Serie para funcionar
		for (Serie serie : minhasSeries2) { //para imprimir os dois tempoEpisodio iguais, devemos tratá-la dentro do compareTo da Classe Serie
			System.out.println(serie.getNome() + " - "
	    			+ serie.getGenero() + " - " 
	    			+ serie.getTempoEpisodio());
		}
	
		
		System.out.println("\n--\tOrdem ComparatorNomeGeneroTempo\t--");
		Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
		minhasSeries3.addAll(minhasSeries2);
		for (Serie serie : minhasSeries3) {
			System.out.println(serie.getNome() + " - "
	    			+ serie.getGenero() + " - " 
	    			+ serie.getTempoEpisodio());
	}
}
}


class Serie implements Comparable<Serie> {
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}
	public void setTempoEpisodio(Integer tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}

	@Override
	public String toString() {
		return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, genero, tempoEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tempoEpisodio == null) {
			if (other.tempoEpisodio != null)
				return false;
		} else if (!tempoEpisodio.equals(other.tempoEpisodio))
			return false;
		return true;
	}

	@Override
	public int compareTo(Serie o) {
		//como o set não recebe objetos iguais, deveos tratar aqui
		
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), o.getTempoEpisodio());
		if(tempoEpisodio != 0) {
			return tempoEpisodio;
		} else {
			return this.getGenero().compareTo(o.getGenero());
		}
	}
	
	
}



class ComparatorNomeGeneroTempo implements Comparator<Serie> {

	@Override
	public int compare(Serie s1, Serie s2) {
		
		int nome = s1.getNome().compareTo(s2.getNome());
		if (nome != 0) {
			return nome;
		}
		
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if (genero != 0) return genero;
		
		return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
	}
	
}

