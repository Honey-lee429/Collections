package br.com.digital.innovation.one.aula1;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class ComposicaoDeFuncoes {
    public static void main(String[] args) {
        int[] valores = {1,2,3,4};

     // funcional
     		Arrays.stream(valores)
     				.filter(numero -> numero % 2 == 0)
     				.map(numero -> numero * 2)
     				.forEach(numero -> System.out.println(numero));
     		
     		// imperativo
     		for (int i = 0; i < valores.length; i++) {
     			int valor = 0;
     			if (valores[i] % 2 == 0) {
     				valor = valores[i] *2;
     				
     				if (valor != 0) {
     					System.out.println(valor);
     				}
     			}
     		}
     		
     		int valor = 20;
     		UnaryOperator<Integer> retornarDobro = v -> v *2;
     		System.out.println(retornarDobro.apply(valor));// retorna o dobro do valor
     		System.out.println(valor); // valor não será alterado
     		
    }
}


