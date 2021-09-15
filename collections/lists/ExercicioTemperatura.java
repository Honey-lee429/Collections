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
		temperatura.forEach(t -> System.out.println(t + " "));
		
		media = soma/temperatura.size();
		System.out.println("a média é: " +media);
		
		Iterator<Integer> grau = temperatura.iterator();
		while(grau.hasNext()) {
			Integer next = grau.next();
			if(next <= media) grau.remove();			
		}
		
		System.out.println("Os graus acima da média são: ");
		System.out.println(temperatura);
				
		
		 System.out.println("\n\nMeses das temperaturas acima da média: ");
	        Iterator<Integer> iterator = temperatura.iterator();

	        soma = 0;
	        while (iterator.hasNext()) {
	            Integer temp = iterator.next();
	            if (temp > media) {
	                switch (soma) {
	                    case (0):
	                        System.out.printf("1 - janeiro: %.1f\n ", temp);
	                        break;
	                    case (1):
	                        System.out.printf("2 - fevereiro: %.1f\n", temp);
	                        break;
	                    case (2):
	                        System.out.printf("3 - março: %.1f\n", temp);
	                        break;
	                    case (3):
	                        System.out.printf("4 - abril: %.1f\n", temp);
	                        break;
	                    case (4):
	                        System.out.printf("5 - maio: %.1f\n", temp);
	                        break;
	                    case (5):
	                        System.out.printf("6 - junho: %.1f\n", temp);
	                        break;
	                    default:
	                        System.out.println("Não houve temperatura acima da média.");
	                }
	            }
	            soma++;
	        }
	}
	
}
