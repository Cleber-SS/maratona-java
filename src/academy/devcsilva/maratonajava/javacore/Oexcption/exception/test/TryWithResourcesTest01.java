package academy.devcsilva.maratonajava.javacore.Oexcption.exception.test;

import academy.devcsilva.maratonajava.javacore.Oexcption.exception.domain.Leitor1;
import academy.devcsilva.maratonajava.javacore.Oexcption.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerAquivo();
    }

    public static void lerAquivo() {
        //Try with resources
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
