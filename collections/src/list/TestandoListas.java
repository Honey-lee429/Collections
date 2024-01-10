package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestandoListas {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("ABCD");
        lista.add("BCDA");
        lista.add("CDAB");
        lista.remove(0);

        System.out.println(lista); //[BCDA, CDAB]
// --------------------------------------
        /*
         * BCDA
         * CDAB
         */
        lista.forEach(System.out::println);

        lista.forEach(item -> {
            System.out.println(item);
        });

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("item " + lista.get(i));
        }

// ------------------------------------------
        Aula a1 = new Aula("Revistando as ArrayLists", 20);
        Aula a2 = new Aula("Listas de objetos", 15);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 10);

        ArrayList<Aula> a = new ArrayList<>();
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(new Aula("x", 5));


        System.out.println(a); // sem toString [list.Aula@2d98a335, list.Aula@16b98e56, list.Aula@7ef20235]

        /*
         * Diferente de uma String ou de tipos primitivos mais simples, o Collections.sort não sabe ordenar uma lista de
         * list.Aula. De qual forma ele faria isso? Pelo nome da aula? Pela duração? Não daria para saber. Para que ele seja
         * capaz de fazer isso, você precisa implementar a interface Comparable definindo um critério de comparação para
         * os objetos desse tipo. Faça com que a classe list.Aula implemente essa interface e execute a classe
         * TestaListaDeAula para verificar se a ordenação funcionou.
         * */
        Collections.sort(lista); //sort do compareTo da classe list.Aula
        System.out.println(lista);
        Collections.sort(a);
        System.out.println(a);
        /*
         * E se quisermos ordenar essa lista de acordo com o tempo de uma aula? Poderíamos alterar o método compareTo,
         * mas assim todas as ordenações de aulas seriam afetadas. Há uma forma bastante enxuta de se fazer isso
         * utilizando os recursos do Java 8:
         * */
        a.sort(Comparator.comparing(Aula::getNome)); // Toda lista, a partir do Java 8, possui um método sort que recebe Comparator para comparar atributos além do definido no metodo compareTo
        System.out.println(a);

        //----------------------------------------------------------------

        Curso curso = new Curso("POO", "maria");
        // List<list.Aula> aulaList = curso.getAulas();
        // aulaList.add(new list.Aula("python", 120));
        // da para escrever dessa forma curso.getAulas().add(new list.Aula("python", 120));

        //curso.getAulas().add(new list.Aula("python", 120)); // Exception in thread "main" java.lang.UnsupportedOperationException, devido ter adicionado no getAulas
        //System.out.println(curso.getAulas());
        // Solução do problema: criado um método adiciona()

        curso.adiciona(new Aula("scala", 110));
        curso.adiciona(new Aula("c++", 140));
        curso.adiciona(new Aula("java", 150));
        System.out.println(curso.getAulas());

        //Collections.sort(curso.getAulas()); // Exception in thread "main" java.lang.UnsupportedOperationException
        /* Solução do problema: geralmente há um construtor das nossas coleções que recebem o próprio tipo, para construir um igual,
        como se fosse um clone. Para isso, basta passarmos a lista de aulas para o construtor do ArrayList, por ex. Assim,
        não precisamos fazer um for e ir adicionando todas as aulas da lista imutável para a nova lista. Basta passar a lista
         imutáel para o construtor e ele já fará isso, criando uma nova lista com os mesmos elementos da lista que estamos passando no construtor!
         */

        List<Aula> aulaImutavel = curso.getAulas();

        List<Aula> novaLista = new ArrayList<>(aulaImutavel);
        Collections.sort(novaLista);
        System.out.println("ordenada em min " + novaLista);
        novaLista.sort(Comparator.comparing(Aula::getNome));
        System.out.println("ordem alfabetica " + novaLista);

        System.out.println("tempo total do curso de poo: " + curso.getTotalDuracao());

        System.out.println(curso); // criar toString



        // ---------------------------------------------------------------


    }
}
