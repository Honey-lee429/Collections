package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

/*Lance o dado 100 vezes e conte quantas vezes cada numero apareceu*/
public class Dados {
	public static void main(String[] args) {
		
		//array
		List<Integer> array = new ArrayList<>();
		
		//inst�ncia um objeto da classe Random usando o construtor padr�o
        Random dice = new Random();
        
      //imprime sequ�ncia de 10 n�meros inteiros aleat�rios entre 1 e 7
		for (int i = 1; i <= 10; i++) {
			int lancamento = dice.nextInt(7); 
			array.add(lancamento);
		}
		System.out.println(array);
		
		
		Map<Integer, Integer> array1 = new HashMap<>(array);
		for (Entry<Integer, Integer> numeroRepeticao : array1.entrySet()) {
			System.out.println(
					"O n�mero " + numeroRepeticao.getKey() + " � repetido " + numeroRepeticao.getValue() + " vezes");
		}
	}
}
