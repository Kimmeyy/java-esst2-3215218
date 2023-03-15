package src.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CheckedExceptions {
    public static void main(String[] args) {
        // ArithmeticException -> RuntimeException
        // Checked Exceptions

        try {
            var lines = Files.readAllLines(Path.of("testfile.txt"));
            for (String line : lines){
                System.out.println(line);
            }
        } catch (IOException e) {
            // System.err.println("Error reading file: " + e);
            // System.err.println("Error reading file: " + e.getMessage());

            // Checked exception wrapped in RuntimeException
            throw new RuntimeException(e);
        }
    }
}
