package academy.devcsilva.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Cleber"; //String constant pool
        String nome2 = "Cleber";
        nome = nome.concat(" Silva"); // nome += " Silva"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Cleber");
        //a linha de cima, 1º variável de referencia, 2º objeto do tipo String, 3 uma String no pool de String.
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
