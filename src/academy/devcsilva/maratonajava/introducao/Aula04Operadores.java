package academy.devcsilva.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //operadores básicos: +, -, / e *
        int numero1 = 20;
        int numero2 = 10;
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int divisao = numero1 / numero2;
        int multiplicacao = numero1 * numero2;
        String concatenacao = "valor" + numero1 + numero2; //aqui o sinal + não somou, apenas juntou as variáveis.
        System.out.println(concatenacao);

        //operador resto(da divisão): %
        int resto = 20 % 2;
        System.out.println(resto);

        //operadores comparação: <, >, <=, >=, == e != ->eles retornam true ou false(booleanos).
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorOuIgualQueVinte = 10 <= 20;
        boolean isDezMaiorOuIgualQueVinte = 10 >= 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("Dez é Menor Que Vinte: " + isDezMenorQueVinte);
        System.out.println("Dez é Maior Que Vinte: " + isDezMaiorQueVinte);
        System.out.println("Dez é Menor Ou Igual Que Vinte: " + isDezMenorOuIgualQueVinte);
        System.out.println("Dez é Maior Ou Igual Que Vinte: " + isDezMaiorOuIgualQueVinte);
        System.out.println("Dez é Igual Que Vinte: " + isDezIgualQueVinte);
        System.out.println("Dez é Diferente Que Vinte: " + isDezDiferenteQueVinte);

        //operadores lógicos: &&(AND), ||(OR) e !(NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("Dentro Da Lei Maior Que Trinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("Dentro Da Lei Menor Que Trinta: " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("Playstation Cinco é Compravel: " + isPlaystationCincoCompravel);

        //operadores de atribuição: =, +=, -=, *=, /= e %=
        double bonus = 1800;
        bonus += 1000;  //=2800
        bonus -= 1000;  //=1800
        bonus *= 2;  //=3600
        bonus /= 2;  //=1800
        bonus %= 2;  //=0
        System.out.println(bonus);

        //operadores unários: ++ e --
        int contador = 0;
        contador++;  //=1, incrementa +1 depois
        contador--;  //=0, decrementa -1 depois
        ++contador;  //  incrementa +1 antes
        --contador;  // decrementa -1 antes
        System.out.println(contador);

        int contador2 = 5;
        System.out.println(contador2++); //=5
        System.out.println(contador2);  //=6
        int contador3 = 8;
        System.out.println(++contador3); //=9
        System.out.println(--contador3); //=8
    }
}
