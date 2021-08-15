package lectures.fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Lecture {
    public static void main(String[] args) throws IOException {
        String directory = "src/lectures/fileIO";
        String filename = "hello.sh";

        //when writing multiline content - use a collection to hold each line
        ArrayList<String> fileContents = new ArrayList<String>();
        fileContents.add("Hello, from: ");
        fileContents.add("JAVA FILE IO");

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }

        Files.write(dataFile, fileContents);
    }
}
