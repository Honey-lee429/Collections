package br.com.digital.innovation.one.aula2;

import java.util.function.Supplier;

public class Suplidores {
    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa(); //nome : Hanna, idade: 30
        Supplier<Pessoa> instanciaPessoa2 = Pessoa::new; //nome : Hanna, idade: 30
        System.out.println(instanciaPessoa.get());
        System.out.println(instanciaPessoa2.get());
    }
}



class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {
        nome = "Hanna";
        idade = 30;
    }

    @Override
    public String toString() {
        return String.format("nome : %s, idade: %d",nome,idade) ;
    }
}
