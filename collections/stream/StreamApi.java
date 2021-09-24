package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamApi {
	public static void main(String[] args) {
		List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		System.out.println("Imprima todos os elementos dessa lista de String: ");
			numerosAleatorios.stream().forEach(new Consumer<String>() {

				@Override
				public void accept(String t) {
					System.out.println(t);
				}
				
			});
			
		System.out.println("\nImprima todos os elementos dessa lista c/ lambda: ");	
			numerosAleatorios.forEach(contats -> System.out.println(contats));
			System.out.println("\nOU");
			numerosAleatorios.forEach(System.out::println);
			
				
		System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set, lembrando que o set não aceita num repetidos:");
			numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
			
		System.out.println("\nTransforme esta lista de String em uma lista de números inteiros.");
			List<Integer> numerosAleatoriosInt = numerosAleatorios.stream()
					.map(Integer::parseInt)
					.collect(Collectors.toList());
			
			
		System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista:");
			numerosAleatorios.stream()
				.map(Integer::parseInt)
				.filter(i -> i % 2 == 0 && i > 2)
				.collect(Collectors.toList())
				.forEach(System.out::println);
					
			
		System.out.println("\nMostre a média dos números: ");	
			numerosAleatorios.stream()
				.mapToInt(Integer::parseInt)
				.average()
				.ifPresent(System.out::println);
			
			
		System.out.println("\nRemova os valores pares: ");
			numerosAleatoriosInt.removeIf(i -> i % 2 == 0);
			System.out.println(numerosAleatoriosInt);
			
			
			
			
			System.out.println("\nIgnore os 3 primeiros elementos da lista e imprima o restante:");
			numerosAleatoriosInt.stream()
	                .skip(3)
	                .forEach(System.out::println);

	        long countNumerosUnicos = numerosAleatoriosInt.stream()
	                .distinct()
	                .count();
	        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

	        System.out.print("Mostre o menor valor da lista: ");
	        numerosAleatoriosInt.stream()
	                .mapToInt(Integer::intValue)
	                .min()
	                .ifPresent(System.out::println);

	        System.out.print("Mostre o maior valor da lista: ");
	        numerosAleatoriosInt.stream()
	                .mapToInt(Integer::intValue)
	                .max()
	                .ifPresent(System.out::println);;

	        int somaDosNumerosPares = numerosAleatoriosInt.stream()
	                .filter(i -> (i % 2 == 0))
	                .mapToInt(Integer::intValue)
	                .sum();
	        System.out.println("Pegue apenas os números ímpares e some: " + somaDosNumerosPares);

	        System.out.println("Mostre a lista na ordem númerica: ");
	        List<Integer> numerosOrdemNatural = numerosAleatoriosInt.stream()
	                .sorted(Comparator.naturalOrder())
	                .collect(Collectors.toList());
	        System.out.println(numerosOrdemNatural);

	        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//	        dica: collect(Collectors.groupingBy(new Function())
	        Map<Object, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInt.stream()
	                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
	        System.out.println(collectNumerosMultiplosDe3E5);
			
	}
	
	
}
