package academy.devcsilva.maratonajava.javacore.Bintroducaometodos.test;

import academy.devcsilva.maratonajava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "Jiraya";
//        pessoa.idade = 70;
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        pessoa.imprime();
        System.out.println("----No método GET----");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
