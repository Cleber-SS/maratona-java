package academy.devcsilva.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println("Linguagem do SO: " + Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        System.out.println("-------- Todas as línguas suportadas --------");
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + ", ");
        }

        System.out.println("\n-------- Todos os países suportados --------");
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + ", ");
        }
    }
}
