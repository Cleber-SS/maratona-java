package academy.devcsilva.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os dígitos.
        // \D = tudo que não for dígitos.
        // \s = espaços em branco \t \n \f \r.
        // \S = todos caracteres excluindo os em brancos.
        // \w = de a-z A-Z, dígitos, e o _.
        // \W = tudo o que não for incluso no \w.
        String regex = "\\W";
//        String texto = "abaaba";
        String texto2 = "@#hh_j2 12gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
