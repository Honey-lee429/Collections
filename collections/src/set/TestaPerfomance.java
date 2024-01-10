package set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class TestaPerfomance {
    /*Crie a classe TestaPerformance, com um método main e um código que insere 50 mil números
    em uma ArrayList e os pesquisa. Vamos usar o método currentTimeMillis(), de System, para
    cronometrar o tempo gasto com a adição e pesquisa dos elementos:*/
    public static void main(String[] args) {

        Collection<Integer> number = new LinkedList<>();
        //Troque o ArrayList por HashSet e verifique o tempo que vai demorar:
        //Collection<Integer> number = new HashSet<>();
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {
            number.add(i);
        }

        number.forEach(numero -> number.contains(numero));

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;
        System.out.println("Tempo gasto: " + tempoDeExecucao);
    }
}
