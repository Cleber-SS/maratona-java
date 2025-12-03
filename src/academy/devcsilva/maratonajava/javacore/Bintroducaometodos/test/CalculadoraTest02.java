package academy.devcsilva.maratonajava.javacore.Bintroducaometodos.test;

import academy.devcsilva.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(4, 5);
        calculadora.multiplicaDoisNumerosReais(2.0F, 7.5F);
    }
}
