package throwthrows;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

    static void readFile() throws IOException {

        FileReader fr = new FileReader("data.txt");
        fr.read();
    }

    public static void main(String[] args) {

        try {
            readFile();
        }

        catch(IOException e) {
            System.out.println("File not found");
        }
    }
}
