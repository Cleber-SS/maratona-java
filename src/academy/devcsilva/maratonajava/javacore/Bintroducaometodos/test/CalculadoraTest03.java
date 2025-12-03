package academy.devcsilva.maratonajava.javacore.Bintroducaometodos.test;

import academy.devcsilva.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(10, 2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20, 0));
        System.out.println("----------------");
        calculadora.imprimeDivisaoDeDoisNumeros(40, 0);
    }
}
