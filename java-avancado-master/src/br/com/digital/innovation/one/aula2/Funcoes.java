package br.com.digital.innovation.one.aula2;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String,String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String,Integer> converterStringParaInteiroECalcularODobro = string -> Integer.valueOf(string) * 2;
        Function<String, Integer> converterStringParaInteiro = Integer::valueOf; //m�todo de refer�ncia
        
        System.out.println(retornarNomeAoContrario.apply("joao"));
        System.out.println(converterStringParaInteiroECalcularODobro.apply("20"));
        System.out.println(converterStringParaInteiro.apply("20"));
    }
}
