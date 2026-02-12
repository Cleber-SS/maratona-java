package academy.devcsilva.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Eu sou fascinado por Java.\nPois é uma tecnologia poderosa.");
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
