package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Crie uma lista e ordene exibindo nome, idade, cor*/

public class ExemploOrdenacaoList {
	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<>() {{
			add(new Gato("fred", 18, "branco"));
			add(new Gato("leona", 14, "preto"));
			add(new Gato("bah", 6, "amarelo"));
			add(new Gato("fred", 1, "marrom"));
			add(new Gato("sinha moça", 3, "cinza"));
		}};
		
		System.out.println("--\tOrdem aleatória\t--");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
			
		System.out.println("--\tOrdem alfabética (nome)\t--");
		//meusGatos.sort
		Collections.sort(meusGatos); //implements comparable (interface)
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem crescente idade\t--");
		Collections.sort(meusGatos, new ComparatorIdade()); //OU
		//meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		
		System.out.println("--\tOrdem cor\t--");
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem noem/cor/idade\t--");
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
		
		
	}
}


class Gato 	implements Comparable<Gato> {
	private String nome;
	private Integer idade;
	private String cor;
	
	
	public Gato(String nome, Integer idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}


	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}


	@Override
	public int compareTo(Gato o) {
		return this.getNome().compareToIgnoreCase(o.getNome());
	} 	
}


class ComparatorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato o1, Gato o2) {
		return Integer.compare(o1.getIdade(), o2.getIdade());
	}	
}

class ComparatorCor implements Comparator<Gato> {

	@Override
	public int compare(Gato o1, Gato o2) {
		return o1.getCor().compareToIgnoreCase(o2.getCor());
	}
	
}


class ComparatorNomeCorIdade implements Comparator<Gato> {
	/**
	 * 
	 * @author hanel
	 * se os nomes forem diferentes, retorna nome, se forem iguais críterio de desempate é a cor
	 * se as cores forem diferentes, retorna cor
	 * se não, retorna idade.
	 */
	@Override
	public int compare(Gato o1, Gato o2) {
		
		int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
		if (nome != 0) return nome; 
		
		int cor = o1.getCor().compareTo(o2.getCor());
		if (cor != 0) return cor;
		
		return Integer.compare(o1.getIdade(), o2.getIdade());
	}
	
}