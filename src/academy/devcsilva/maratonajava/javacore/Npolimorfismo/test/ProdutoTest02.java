package academy.devcsilva.maratonajava.javacore.Npolimorfismo.test;

import academy.devcsilva.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devcsilva.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devcsilva.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("--------------------------");

        Produto produto2 = new Tomate("Italiano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
