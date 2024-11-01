package week5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class file {

    String filePath;

    public file(String filePath) {
        this.filePath = filePath;
    }

    public void read() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(this.filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException err) {
            System.out.println(err);
        }
    }
}
