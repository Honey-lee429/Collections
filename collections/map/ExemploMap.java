package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*Daa os modelos dos carros e seus respectivos consumos na estrada, fa�a:
 * modelo = gol - consumo = 14,4 km/l
 * modelo = uno - consumo = 15,6 km/l
 * modelo = mobi - consumo = 16,1 km/l
 * modelo = hb20 - consumo = 14,5 km/l
 * modelo = kwid - consumo = 15,6 km/l
 * */
public class ExemploMap {
	public static void main(String[] args) {
		System.out.println("forma aleat�ria");
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(carrosPopulares);
		
		
		System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
		Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(carrosPopulares1.toString());
		
		
		System.out.println("\nExiba o dicion�rio ordenado em ordem alfab�tica: ");
		Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
		System.out.println(carrosPopulares2);
		
		System.out.println("\nSubstitua o consumo do gol por 15,2km/l");
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);
		
		System.out.println("\nconfira se o modelo tucson est� no dicion�rio: " + carrosPopulares.containsKey("tucson"));
		
		System.out.println("\nExiba o consumodo uno: " + carrosPopulares.get("uno"));
		
		//System.out.println("Exiba o terceiro modelo adicionado: "); // como no set n�o temos como pegar este valor
		
		System.out.println("\nExiba os modelos: " + carrosPopulares.keySet());
		
		System.out.println("\nExia os consumos dos carros: " + carrosPopulares.values());
		
		System.out.println("\nExiba o modelo mais econ�mico e seu consumo");
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Entry<String, Double>> entrySet = carrosPopulares.entrySet();
		String modeloMaisEficiente = "";
		
		for (Entry<String, Double> entry : entrySet) {
			if (entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
			}
		}
		System.out.println(modeloMaisEficiente + ", consumo de " + consumoMaisEficiente);
		
		
		System.out.println("\nExiba o modelo menos econ�mico e seu consumo: ");
		Double menosEficiente = Collections.min(carrosPopulares.values());
		String modeloMenosEficiente = "";
		
		for (Entry<String, Double> entry : carrosPopulares.entrySet()) {
			if (entry.getValue().equals(menosEficiente)) {
				modeloMenosEficiente = entry.getKey();
				System.out.println(modeloMenosEficiente + ", consumo de " + menosEficiente);
			}
		}
		
		
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println("\nExiba a soma dos consumos: " + soma);
		
		System.out.println("\nExiba a m�dia dos consumos deste dicion�rio de carros: " + soma/carrosPopulares.size());
		
		
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		while(iterator1.hasNext()) {
			if(iterator1.next().equals(15.6)) {
				iterator1.remove();
			}
		}
		System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l: " + carrosPopulares);
		
		
		carrosPopulares.clear();
		System.out.println("\nApague o dicion�rio de carros: " + carrosPopulares);
		
		
		System.out.println("\nA lista est� vazia: " + carrosPopulares.isEmpty());
			
	}
}

