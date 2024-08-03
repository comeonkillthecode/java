package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx2 {
    public static void main(String[] args) throws IOException {
        String filePathname = "C:\\Users\\akash\\Java\\Basics\\src\\io\\data.txt";
        FileWriter fileWriter = null;
        File file1 = new File(filePathname);


        try {
            fileWriter = new FileWriter(file1, true);
            fileWriter.write("Java");
            fileWriter.write("\n");
            fileWriter.write(65);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert fileWriter != null;
            fileWriter.close();
        }
    }
}
