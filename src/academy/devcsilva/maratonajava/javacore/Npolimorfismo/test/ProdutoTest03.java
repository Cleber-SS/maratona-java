package academy.devcsilva.maratonajava.javacore.Npolimorfismo.test;

import academy.devcsilva.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devcsilva.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devcsilva.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devcsilva.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen", 3000);


        Tomate tomate = new Tomate("Italiano", 20);
        tomate.setDataValidade("12/01/2026");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
