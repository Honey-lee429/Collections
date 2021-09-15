package set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMetodos {
public static void main(String[] args) {
//	Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
	
	System.out.println("Crie um cj e add as notas: ");
	
//	Set noas = new HashSet<>(); //antes do java 5
//	Set<Double> notas = new HashSet<>(); // Generics(jdk 5) - Diamont Operator(jdk 7)
//	HashSet<Double> notas = new HashSet<>();
/*	Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
	notas.add(1d);
	notas.remove(5d);
	System.out.println(notas);
*/	
	Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
	System.out.println(notas.toString()); //não imprime nº repetidos e imprime de forma aleatória
	
	
	System.out.println("não conseguimos achar a posição do elemento com o método set utilizando indexOf, pois estão distribuidos aleatoriamente");
	System.out.println("não conseguimos adicionar elementos em uma determinada posição");
	System.out.println("não conseguimos fazer substituiçoes de elementos ex. 5d pelo 6d");
	
	System.out.println("\nConfira se a nota 5 está no cj: " + notas.contains(5d));
	System.out.println("Exiba a menor nota: " + Collections.min(notas));
	System.out.println("Exiba a maior nota: " + Collections.max(notas));
	
	Iterator<Double> iterator = notas.iterator();
	Double soma = 0.0;
	while(iterator.hasNext()) { //se tiver prox numero
		Double next = iterator.next(); //prox numero
		soma+= next; //soma o numero com o prox
	}
	System.out.println("Exiba a soma dos valores utilizando o iterator: " + soma );
	
	System.out.println("A média das notas é: " + soma/notas.size());
	
	System.out.println("\nRemova a nota 0: " + notas.remove(0.0));
	System.out.println(notas);
	
	
	Iterator<Double> iterator1 = notas.iterator();
	while(iterator1.hasNext()) { 
		Double next = iterator1.next();
		if (next < 7) iterator1.remove();
	}
	System.out.println("\nRemova as notas menores que 7: " +notas );
	
	
	System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
	Set<Double> notas2 = new LinkedHashSet<>();
	notas2.add(9.3);
	notas2.add(5d);
	notas2.add(7d);
	notas2.add(0d);
	notas2.add(3.6);
	notas2.add(7d);
	notas2.add(10d);
	System.out.println(notas2);
	
	
	Set<Double> notas3 = new TreeSet<>(notas2); //notas2 os elementos precisa ter o comparable para funcionar
	System.out.println("\nExiba todas as notas em ordem crescente: " + notas3);
	
	
	notas3.clear();
	System.out.println("\nApague todo o cj " + notas3);
	
	System.out.println("\nConfira se notas2 etá vazio: " + notas2.isEmpty());
	System.out.println("Confira se notas3 etá vazio: " + notas3.isEmpty());
	
	
}
	
}
