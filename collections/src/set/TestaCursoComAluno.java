package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestaCursoComAluno {
    public static void main(String[] args) {

        //a estrutura Set usa a hash table e implementa a função de espalhamento para realizar mais rapidamente suas buscas, como a busca binária.
        // Por isso operações min, max, sort não funcionam.

        System.out.println("--\tOrdem Aleatoria, nao imprime objetos repetidos, nao ordena elementos\t--");
        Set<String> alunos = new HashSet<>();
        alunos.add("alberto");
        alunos.add("barbara");
        alunos.add("carla");
        alunos.add("denis");
        alunos.add("denis");

        System.out.println(alunos); // [alberto, denis, carla, barbara]
        System.out.println(alunos.size()); //4

        Set<String> alunosSincronizados = Collections.synchronizedSet(alunos); // o método faz, retorna um nova coleção que pode ser compartilhada entre threads sem perigos.
        System.out.println(alunosSincronizados); // [alberto, denis, carla, barbara]

        //-------------------------------------------------------------
        CursoSet cursoSet = new CursoSet("poo", "paulo");

        // Adiciona aulas dentro do curso
        cursoSet.adiciona(new AulaSet("java", 100));
        cursoSet.adiciona(new AulaSet("java", 100));
        cursoSet.adiciona(new AulaSet("python", 50));
        cursoSet.adiciona(new AulaSet("c++", 504));

        // Adiciona alunos dentro do curso
        var a1 = new AlunoSet("paula", 5555);

        cursoSet.adiciona(a1);
        cursoSet.adiciona(new AlunoSet("maria", 1234));
        cursoSet.adiciona(new AlunoSet("paloma", 2341));
        cursoSet.adiciona(new AlunoSet("jorge", 3234));

        // forEach
        cursoSet.getAulas().forEach(System.out::println);
        /*Aula: c++, duracao: 504
          Aula: java, duracao: 100
          Aula: java, duracao: 100
          Aula: python, duracao: 50
        */

        System.out.println(cursoSet); // set.CursoSet@52cc8049
        System.out.println(cursoSet.getAlunoSets()); // sem o toString [set.AlunoSet@7ef20235, set.AlunoSet@2d98a335, set.AlunoSet@16b98e56]
        System.out.println(cursoSet.getAulas()); // [Aula: c++, duracao: 504, Aula: java, duracao: 100, Aula: java, duracao: 100, Aula: python, duracao: 50]


        AlunoSet paula = new AlunoSet("paula", 5555);
        System.out.println("aluna eh igual? " + a1.equals(paula)); // false, pois mesmo que o objeto contenha tudo igual, ele não fará referência ao primeiro, e portanto, são diferentes.
        // Para compararmos se existem nomes iguais, por exemplo, devemos reescrever o método equals na nossa classe Aluno

        //obrigatoriamente o seguinte é verdadeiro com a implementaçao do hascode na classe aluno, que é o código de espalhamento
        // testando metodo alunoEstaMatriculado
        System.out.println("pessoa esta matriculada? " + cursoSet.alunoEstaMatriculado(paula));
        System.out.print("o hashCode torna-se igual para ambos ");
        System.out.println(a1.hashCode() == paula.hashCode());

        //buscando aluno pela matricula
        System.out.println("nome da pessoa da matriculada 5555 eh " + cursoSet.buscaAulanoPelaMatricula(5555));







    }
}
