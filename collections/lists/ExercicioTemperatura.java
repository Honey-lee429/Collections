package lists;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
 * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que mês elas ocorreram (mostrar o nome do mês por extenso*/
public class ExercicioTemperatura {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		
		List<Integer> temperatura = new ArrayList<>();
				
		int soma = 0;
		double media = 0;
		
		for(int i = 1; i <= 6; i++) {
			System.out.println("qual foi a temperatura dos últimos 6 meses?");
			int num = read.nextInt();	
			temperatura.add(num);
			soma +=num;

	
		}
		
		
		System.out.println("As temperaturas foram: " +temperatura);
		
		
		media = soma/6;
		System.out.println("a média é: " +media);
		
		Iterator<Integer> grau = temperatura.iterator();
		while(grau.hasNext()) {
			Integer next = grau.next();
			if(next <= media) grau.remove();
			
			
		}
		
		System.out.println("Os graus acima da média são: ");
		System.out.println(temperatura);
				
		
		
	}
	
}
