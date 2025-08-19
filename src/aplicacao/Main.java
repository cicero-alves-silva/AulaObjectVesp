package aplicacao;

import modelo.Pessoa;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        Pessoa pessoa1 = new Pessoa("111.111.111-11", "Ana");
        System.out.println("INFORMAÇÕES DA PESSOA 01");
        System.out.println(pessoa1.getClass());
        System.out.println(pessoa1);
        System.out.println("------------------------------");
        Pessoa pessoa2 = new Pessoa("111.111.111-11", "Ana");
        System.out.println("INFORMAÇÕES DA PESSOA 02");
        System.out.println(pessoa2.getClass());
        System.out.println(pessoa2);
        System.out.println("------------------------------");
        if (pessoa1.equals(pessoa2)) {
            System.out.println("As pessoas são iguais!!!");
        } else {
            System.out.println("As pessoas não são iguais!!!");
        }
    }
}