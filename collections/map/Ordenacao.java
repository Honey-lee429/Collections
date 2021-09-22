package map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
 * crie um dicionario e ordene este dicionário:
 * exibindo (Nome Autor (String) - Nome Livro (Livro)*/

public class Ordenacao {
	public static void main(String[] args) {
		
		
		System.out.println("--\tOrdem Aleatória\t--");
			Map<String, Livro> meusLivros = new HashMap<>() {{
				put("Hawking, Stephen", new Livro("Uma breve história do tempo", 350));
				put("Duhigg, Charles", new Livro("O poder do hábito", 408));
				put("Carnegie, Dale", new Livro("Como fazer amigos e influenciar pessoas", 250));
				put("Vieira, Paulo", new Livro("O poder da ação", 475));
			}};
			for (Entry<String, Livro> livros : meusLivros.entrySet()) {
					System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
			}
		
		
		System.out.println("\n--\tOrdem Inserção\t--");
			Map<String, Livro> livro = new LinkedHashMap<>() {{
				put("Hawking, Stephen", new Livro("Uma breve história do tempo", 350));
				put("Duhigg, Charles", new Livro("O poder do hábito", 408));
				put("Carnegie, Dale", new Livro("Como fazer amigos e influenciar pessoas", 250));
				put("Vieira, Paulo", new Livro("O poder da ação", 475));
			}};
			for (Entry<String, Livro> x : livro.entrySet()) {
				System.out.println(x.getKey()+ x.getValue());
			}
		
		System.out.println("\n--\tOrdem alfabética autores\t--");
			Map<String, Livro> meusLivros1 = new TreeMap<>(meusLivros);
			for (Entry<String, Livro> x : meusLivros1.entrySet()) {
				System.out.println(x.getKey());
			}
		
		System.out.println("\n--\tOrdem alfabética livros\t--");
			Set<Map.Entry<String, Livro>> meusLivros2 = new TreeSet<>(new ComparatorNomeLivro());
			meusLivros2.addAll(meusLivros1.entrySet());
			for (Entry<String, Livro> entry : meusLivros2) {
				System.out.println(entry.getValue().getNome());
			}
			
		System.out.println("\n--\tOrdem número de páginas\t--");
			Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorPag());
			meusLivros3.addAll(meusLivros2);
			for (Entry<String, Livro> entry : meusLivros3) {
				System.out.println(entry.getValue().getPaginas());
			}
			
		
		
	}
}


class Livro {
	private String nome; 
	private Integer paginas;
	
	public Livro(String nome, Integer paginas) {
		super();
		this.nome = nome;
		this.paginas = paginas;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
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
		Livro other = (Livro) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (paginas == null) {
			if (other.paginas != null)
				return false;
		} else if (!paginas.equals(other.paginas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
	}

}

class ComparatorNomeLivro implements Comparator<Map.Entry<String, Livro>> {

	@Override
	public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
		return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
	}

}

class ComparatorPag implements Comparator<Map.Entry<String, Livro>>	{

	@Override
	public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
		return Integer.compare(o1.getValue().getPaginas(), o2.getValue().getPaginas());
		
	}
	
}