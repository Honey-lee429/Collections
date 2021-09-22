package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*Dada a população estimada de alguns estados do NE brasileiro, faça:
 * Estado = PE - pop = 9.616.621
 * Estado = AL - pop = 3.351.543
 * estado = CE - pop = 9.187.103
 * estado - RN - pop = 3.534.265
 * - crie um dicionário e relacione os estados e suas populações
 * - substitua a população do estado do RN por 3.534.165
 * - Confira se o estado PB está no dicionário, cso não, adicione com pop 4.039.277
 * - Ordem que foi informado
 * - ordem alfabética
 * - estado com menor pop
 * - estado com maior pop
 * - soma da pop
 * - media da pop
 * - remova estados com pop < 4.000.000
 * - apague o dicionario de estados
 * - confira se está vazio*/
public class ExercicioPopulacao {
	public static void main(String[] args) {
		System.out.println("--\tLista de estados e população\t--");
		Map<String, Long> estado = new HashMap<>() {{
			put("PE ",  7616621l);
			put("AL ", (long) 3351543);
			put("CE ", (long) 9187103);
			put("RN ", (long) 8534265);
		}};
		System.out.println(estado);
		
		System.out.println("\n--\tsubstitua a população do estado do RN por 3.534.165\t--");
		estado.put("RN ", (long) 3534165);
		System.out.println(estado);
		
		System.out.println("\n--\tConfira se o estado PB está no dicionário, cso não, adicione com pop 4.039.277\t-- " + estado.containsKey("PB"));
		estado.put("PB", 4039277l);
		System.out.println(estado);
		
		System.out.println("\n--\tOrdem que foi informado\t--");
		Map<String, Long> estado1 = new LinkedHashMap<>() {{
			put("PE ",  7616621l);
			put("AL ", (long) 3351543);
			put("CE ", (long) 9187103);
			put("RN ", (long) 8534265);
		}};
		System.out.println(estado1);
		
		System.out.println("\n--\tordem alfabética\t--");
		Map<String, Long> estado2 = new TreeMap<>(estado1);
		for (Entry<String, Long> s : estado2.entrySet()) {
			System.out.println(s.getKey());	
		}
		System.out.println(estado2.keySet());
		
		
		
		System.out.println("\n--\tEstado com menor pop\t--");
			Long menorPopulacao = Collections.min(estado.values());
			Set<Entry<String, Long>> estadoMin = estado.entrySet(); 
			String estadoMenorPopulacao = "";
			for (Entry<String, Long> entry : estadoMin) {
				if(entry.getValue().equals(menorPopulacao)) estadoMenorPopulacao = entry.getKey();
			}
			System.out.println(estadoMenorPopulacao + " = " + menorPopulacao);
		
		System.out.println("\n--\testado com maior pop\t--");
			Long maiorPopulacao = Collections.max(estado.values());
			String estadoMaiorPopulacao = "";
			for (Entry<String, Long> entry : estado.entrySet()) {
				if(entry.getValue().equals(maiorPopulacao)) estadoMaiorPopulacao = entry.getKey();
			}
			System.out.println(estadoMaiorPopulacao + " = " + maiorPopulacao);
		
		System.out.println("\n--\tsoma da pop\t--");
			Iterator<Long> iterator = estado.values().iterator();
			Long soma = 0l;
			while (iterator.hasNext()){
				soma += iterator.next();
			}
			System.out.println(soma);
		
		System.out.println("\n--\tmedia da pop " + soma/estado.size());
			
		System.out.println("\n--\tremova estados com pop < 4.000.000\t--");
			Iterator<Long> iterator1 = estado.values().iterator();
			while(iterator1.hasNext()) {
				if(iterator1.next() < 4000000) iterator1.remove();
			}
			System.out.println(estado);
			
		estado.clear();
			System.out.println("\n--\tapague o dicionario de estados\t--"  + estado);
			
		System.out.println("\n--\tconfira se está vazio\t--" + estado.isEmpty());
		
	}
}

