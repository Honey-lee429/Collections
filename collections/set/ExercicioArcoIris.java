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
 * C: Cores em ordem alfab�tica
 * D: Cores na ordem inversa da que foi informada
 * E: Todas as cores que come�am com a letra "v"
 * F: Remova as cores que come�am com a letra "v"
 * H: Verificar se o cj est� vazio*/

public class ExercicioArcoIris {
	public static void main(String[] args) {
		
		System.out.println("as cores do arco-�ris na ordem que foram informadas uma abaixo da outra");
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
			
		System.out.println("\nquantidade de cores do arco-�res: " + arcoIris.size());
		
		Set<String> arcoIris1 = new TreeSet<>(arcoIris);
		System.out.println("\nCores em ordem alfab�tica " + arcoIris1);
		
		
		System.out.println("\nCores na ordem inversa da que foi informada");
		List<String> coresList = new ArrayList<>(arcoIris);
		Collections.reverse(coresList);
		System.out.println(coresList);
		
		System.out.println("\nTodas as cores que come�am com a letra v: ");
		for (String string : arcoIris) {
            if(string.startsWith("v")) System.out.println(string);
        }
		
		
		System.out.println("\nRemova as cores que come�am com a letra \"v\"" );
		Iterator<String> stringV = arcoIris.iterator();
		while(stringV.hasNext()) {
				if (stringV.next().startsWith("v")) {
					stringV.remove();
				}
		}
		System.out.println(arcoIris);
		
		
		System.out.println("\nVerificar se o cj est� vazio: " + arcoIris.isEmpty());
	}
}


