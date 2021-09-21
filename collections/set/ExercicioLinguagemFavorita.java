package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Crie atributos nome, anoDeCriacao e ide. 
 * Em seguida, crie um cj de 3 linguagens e faça um programa que ordene esse cj por:
 * A. Ordem de Inserção
 * B. Ordem crescente (nome)
 * C IDE
 * D. Ano de criação e nome
 * E. Nome, ano de criação e IDE
 * Exiba as linguagens no console, um abaixo da outra*/
public class ExercicioLinguagemFavorita {
	public static void main(String[] args) {
		
		Set<Lingua> programacao = new HashSet<>() {{
			add(new Lingua("Java", 1991, "eclipse"));
			add(new Lingua("JavaScript", 1995, "Atom"));
			add(new Lingua("C#", 2000, "Visual Studio Code"));
		}};
		System.out.println("Ordem aleatória: ");
		System.out.println(programacao);
		
		System.out.println("\nOrdem de Inserção");
		Set<Lingua> set = new LinkedHashSet<>() {{
			add(new Lingua("Java", 1991, "eclipse"));
			add(new Lingua("JavaScript", 1995, "Atom"));
			add(new Lingua("C#", 2000, "Visual Studio Code"));
		}};
		System.out.println(set);
		
		System.out.println("\nOrdem alfabética Nome");
		Set<Lingua> alfa = new TreeSet<>(set); // precisa implementar interface Comprable na classe e o método comparTo
		for (Lingua lingua : alfa) {
			System.out.println(lingua);
		}
		
		System.out.println("\nOrdem alfabética IDE");
		Set<Lingua> ide = new TreeSet<>(new ComparatoIde());
		ide.addAll(programacao);
		for (Lingua lingua : ide) {
			System.out.println(lingua);
		}
		
		System.out.println("\nOrdem de Ano");
		Set<Lingua> ano = new TreeSet<>(new ComparatoAno());
		ano.addAll(programacao);
		for (Lingua lingua : ano) {
			System.out.println(lingua);
		}
	}
}


class Lingua implements Comparable<Lingua>{
	private String nome;
	private int ano;
	private String ide;
	
	
	
	public Lingua(String nome, int ano, String ide) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.ide = ide;
	}
	
	@Override
	public String toString() {
		return "Lingua [nome=" + nome + ", ano=" + ano + ", ide=" + ide + "]";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + ((ide == null) ? 0 : ide.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lingua other = (Lingua) obj;
		if (ano != other.ano)
			return false;
		if (ide == null) {
			if (other.ide != null)
				return false;
		} else if (!ide.equals(other.ide))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getIde() {
		return ide;
	}
	public void setIde(String ide) {
		this.ide = ide;
	}

	@Override
	public int compareTo(Lingua o) {
		return this.getNome().compareToIgnoreCase(o.getNome());
	}
}

class ComparatoIde implements Comparator<Lingua> {

	@Override
	public int compare(Lingua o1, Lingua o2) {
		return o1.getIde().compareToIgnoreCase(o2.getIde());
	}
}

class ComparatoAno implements Comparator<Lingua> {

	@Override
	public int compare(Lingua o1, Lingua o2) {
		return Integer.compare(o1.getAno(), o2.getAno());
	}
	
}
