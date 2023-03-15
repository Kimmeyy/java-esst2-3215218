package src.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class FileLineAppender {

    public static void main(String[] args) {
        var appender = new FileLineAppender("testfile.txt");
        appender.appendLine("Dies ist ein Test, neue Zeile!");
        appender.appendLine("Second line!");
    }

    private String file;
    public FileLineAppender(String file) {
        this.file = file;
    }

    public void appendLine(String line){
        try {
            var lines = Files.readAllLines(Path.of(file));
            lines.add(line);
            Files.write(Path.of(file),lines);
            System.out.println(Files.readAllLines(Path.of(file)));

            // ODER:
            // line = line + System.LineSeparator();
            // Files.write(Path.of(file), line.getBytes(), StandardOpenOption.APPEND);

        } catch (NoSuchFileException e) {
            try {
                Files.createFile(Path.of(file));
                var lines = Files.readAllLines(Path.of(file));
                lines.add(line);
                Files.write(Path.of(file),lines);
                System.out.println(Files.readAllLines(Path.of(file)));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } catch (IOException e) {
            System.err.println("Error writing to file " + file);
        }
    }
}
