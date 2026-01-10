package academy.devcsilva.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Cleber Santos";
        nome.concat(" Silva");
        nome.substring(0, 3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Cleber Santos"); //pode ser também com o StringBuffer.
        sb.append(" Silva").append(" Academy");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
