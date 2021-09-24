package map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class ExercicioContato {
	public static void main(String[] args) {
		  System.out.println("--\tOrdem aleatória\t--");
			  	Map<Integer, Contato> contato = new HashMap<>() {{
			  		put(1, new Contato("Mari", 92005));
			  		put(2, new Contato("Norma", 99272));
			  		put(3, new Contato("Rafa", 96505));
			  		put(4, new Contato("Gigi", 91234));
			  	}};
			  	System.out.println(contato);
			  	for (Map.Entry<Integer, Contato> entry : contato.entrySet()) {
					System.out.println(entry.getKey() + " " + entry.getValue().getNome() + " " + entry.getValue().getNumero());
				}
		  	
		  	
		  System.out.println("\n--\tOrdem Inserção\t--");
		  		Map<Integer, Contato> agenda = new LinkedHashMap<>() {{
		  			put(1, new Contato("Mari", 92005));
			  		put(2, new Contato("Norma", 99272));
			  		put(3, new Contato("Rafa", 96505));
		  		}};
		  		for (Entry<Integer, Contato> entry : contato.entrySet()) {
					System.out.println(entry);
				}
		  		
		  System.out.println("\n--\tOrdem id\t--");
		  		Map<Integer, Contato> contato1 = new TreeMap<>(contato);
		  		for (Entry<Integer, Contato> entry : contato1.entrySet()) {
					System.out.println(entry);
				}
		  
		  System.out.println("\n--\tOrdem número telefone com classe anônima\t--"); 
		  		Set<Map.Entry<Integer, Contato>> number = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {

					@Override
					public int compare(Entry<Integer, Contato> o1, Entry<Integer, Contato> o2) {
						return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
					}
			
				});
		  		number.addAll(contato.entrySet());
		  		for (Entry<Integer, Contato> entry : number) {
					System.out.println(entry);
				}
		  		
		System.out.println("\n--\tOrdem nome contato com function\t--");	
				Set<Map.Entry<Integer, Contato>> name = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, String>() {

					@Override
					public String apply(Entry<Integer, Contato> t) {
						return t.getValue().getNome();
					}
				}));
		  		name.addAll(number);
		  		for (Entry<Integer, Contato> entry : name) {
					System.out.println(entry);
				}
		  		
  		System.out.println("\n--\tOrdem nome contato com lambda\t--"); 		
  		Set<Map.Entry<Integer, Contato>> name1 = new TreeSet<>(Comparator.comparing(contatinhos -> contatinhos.getValue().getNome()));
  		name.addAll(number);
  		for (Entry<Integer, Contato> entry : name) {
			System.out.println(entry);
		}
	}
}



class Contato {
	private String nome;
	private int numero;
	
		
	public Contato(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}
	
	public Contato() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", numero=" + numero + "]";
	}

}



/*class ComparatorNumero implements Comparator<Map.Entry<Integer, Contato>> {

	@Override
	public int compare(Entry<Integer, Contato> o1, Entry<Integer, Contato> o2) {
		return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
	}	
}
*/

/*class ComparatorName implements Comparator<Map.Entry<Integer, Contato>> {

	@Override
	public int compare(Entry<Integer, Contato> o1, Entry<Integer, Contato> o2) {
		return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
	}
	
*/