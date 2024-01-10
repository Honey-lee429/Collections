package map;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestaCursoComAluno {
    public static void main(String[] args) {

        //-------------------------------------------------------------
        CursoMap cursoMap = new CursoMap("poo", "paulo");

        // Adiciona aulas dentro do curso
        cursoMap.adiciona(new AulaMap("java", 100));
        cursoMap.adiciona(new AulaMap("java", 100));
        cursoMap.adiciona(new AulaMap("python", 50));
        cursoMap.adiciona(new AulaMap("c++", 504));

        // Adiciona alunos dentro do curso
        var a1 = new AlunosMap("paula", 5555);

        cursoMap.adiciona(a1);
        cursoMap.adiciona(new AlunosMap("maria", 1234));
        cursoMap.adiciona(new AlunosMap("paloma", 2341));
        cursoMap.adiciona(new AlunosMap("jorge", 3234));

        // forEach
        cursoMap.getAulas().forEach(System.out::println);
        /*Aula: c++, duracao: 504
          Aula: java, duracao: 100
          Aula: java, duracao: 100
          Aula: python, duracao: 50
        */

        System.out.println(cursoMap); // set.CursoSet@52cc8049
        System.out.println(cursoMap.getAlunoSets()); // sem o toString [set.AlunoSet@7ef20235, set.AlunoSet@2d98a335, set.AlunoSet@16b98e56]
        System.out.println(cursoMap.getAulas()); // [Aula: c++, duracao: 504, Aula: java, duracao: 100, Aula: java, duracao: 100, Aula: python, duracao: 50]


        AlunosMap paula = new AlunosMap("paula", 5555);
        System.out.println("aluna eh igual? " + a1.equals(paula)); // false, pois mesmo que o objeto contenha tudo igual, ele não fará referência ao primeiro, e portanto, são diferentes.
        // Para compararmos se existem nomes iguais, por exemplo, devemos reescrever o método equals na nossa classe Aluno

        //obrigatoriamente o seguinte é verdadeiro com a implementaçao do hascode na classe aluno, que é o código de espalhamento
        // testando metodo alunoEstaMatriculado
        System.out.println("pessoa esta matriculada? " + cursoMap.alunoEstaMatriculado(paula));
        System.out.print("o hashCode torna-se igual para ambos ");
        System.out.println(a1.hashCode() == paula.hashCode());

        //buscando aluno pela matricula
        System.out.println("nome da pessoa da matriculada 5555 eh "  + cursoMap.buscaAulanoPelaMatricula(5555));







    }
}
