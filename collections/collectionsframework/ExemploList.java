package collectionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ExemploList {

	public static void main(String[] args) {
		//Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
		
		// List notas = new ArrayList(); //antes do java 5
		
		System.out.println("Cria uma lista e adicione as sete notas: ");
		
		 List<Double> notas = new ArrayList<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
		 notas.add(7d);
		 notas.add(8d);
		 notas.add(10d);
		 notas.add(1d);
		 notas.add(5.5);
		 notas.add(6.7);
		 notas.add(3.5);
		 System.out.println(notas);
		 
		 //		ArrayList<Double> notas = new ArrayList<>();
//		List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6));
		
/*		List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6);
		notas.add(10d); //d de double ou 1.0
		System.out.println(notas); // não compila, pois desta forma não pode add ou remover números do array
*/		

/*		List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6);
		notas.add(1d);
		notas.remove(5.0);
		System.out.println(notas); // não compila, pois desta forma não pode add ou remover números do array
*/
		
		
		
		System.out.println("A posição da nota 5.5 é: " + notas.indexOf(5.5));
		
		System.out.println("Adicione na lista a nota 14.0 na posição 4: ");
		notas.add(4, 14d);
		System.out.println(notas);
		
		System.out.println("Substitua a nota 7.0 pela nota 9.0: ");
		notas.set(notas.indexOf(7d), 9d);
		System.out.println(notas);
		
		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
		
//		System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
//		for (Double nota : notas) System.out.println(nota);
		
		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Exiba a soma dos valores: "+ soma );
		
		
		System.out.println("Exiba a média das notas: " + (soma/notas.size()));
		
		System.out.println("Remova a nota na posição 1: "+ notas.remove(1));
		System.out.println("Remova a nota 10: " + notas.remove(10d));
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> elemento = notas.iterator();
		while(elemento.hasNext()) {
			Double next = elemento.next();
			if(next < 7) elemento.remove();
		}
		System.out.println(notas);
		
		System.out.println("Apague toda a lista");
		notas.clear();
		System.out.println(notas);
		
		System.out.println("A lista está vazia? " + notas.isEmpty());
		
	}

}