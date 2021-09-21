package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Crie um cj de cores do arco-iris
 * A: exiba todas as cores uma abaixo da outra
 * B: A quantidade de cores
 * C: Cores em ordem alfabética
 * D: Cores na ordem inversa da que foi informada
 * E: Todas as cores que começam com a letra "v"
 * F: Remova as cores que começam com a letra "v"
 * H: Verificar se o cj está vazio*/

public class ExercicioArcoIris {
	public static void main(String[] args) {
		
		System.out.println("as cores do arco-íris na ordem que foram informadas uma abaixo da outra");
		Set<String> arcoIris = new LinkedHashSet<>();
			arcoIris.add("vermelho");
			arcoIris.add("laranja");
			arcoIris.add("amarelo");
			arcoIris.add("verde");
			arcoIris.add("azul");
			arcoIris.add("anil");
			arcoIris.add("violeta");
			
			for (String string : arcoIris) {
				System.out.println(string);
			}
			
		System.out.println("\nquantidade de cores do arco-íres: " + arcoIris.size());
		
		Set<String> arcoIris1 = new TreeSet<>(arcoIris);
		System.out.println("\nCores em ordem alfabética " + arcoIris1);
		
		
		System.out.println("\nCores na ordem inversa da que foi informada");
		List<String> coresList = new ArrayList<>(arcoIris);
		Collections.reverse(coresList);
		System.out.println(coresList);
		
		System.out.println("\nTodas as cores que começam com a letra v: ");
		for (String string : arcoIris) {
            if(string.startsWith("v")) System.out.println(string);
        }
		
		
		System.out.println("\nRemova as cores que começam com a letra \"v\"" );
		Iterator<String> stringV = arcoIris.iterator();
		while(stringV.hasNext()) {
				if (stringV.next().startsWith("v")) {
					stringV.remove();
				}
		}
		System.out.println(arcoIris);
		
		
		System.out.println("\nVerificar se o cj está vazio: " + arcoIris.isEmpty());
	}
}


