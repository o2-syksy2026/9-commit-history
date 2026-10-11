package part03;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {
        Path logFile = Path.of("pizza-commits.txt");
        String fileContents = Files.readString(logFile, StandardCharsets.UTF_8);

        // TODO: implement the logic described in the readme file

        // `fileContents` variable should contain the contents of the pizza log file
        // as in the previous parts. You can check the contents by uncommenting the
        // following line:

        // System.out.println(fileContents);
    }
}
