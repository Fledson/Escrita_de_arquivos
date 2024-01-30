package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        // Instanciar as frases a serem escritas no arquivo
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
        // Definir o caminho do arquivo de destino
        String path = "c:\\temp\\out.txt";

        // bloco try-with-resources
        /*
         new FileWriter(path) cria se não existir - sobrescreve se existir
         new FileWriter(path, true) cria se não existir - adiciona se existir
        */
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            // loop para percorrer cada frase no vetor
            for (String line : lines) {
                // escreve a frase
                bw.write(line);
                // dá uma quebra de linha
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
