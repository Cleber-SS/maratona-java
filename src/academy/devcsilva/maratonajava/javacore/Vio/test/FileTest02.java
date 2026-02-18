package academy.devcsilva.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Pasta criada? " + isDiretorioCreated);

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("arquivo.txt criado? " + isFileCreated);

        File fileRename = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isFileRenamed = fileArquivoDiretorio.renameTo(fileRename);
        System.out.println("arquivo.txt renomeado? " + isFileRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio pasta renomeado? " + isDiretorioRenamed);
    }
}
