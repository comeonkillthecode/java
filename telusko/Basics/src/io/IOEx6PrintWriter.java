package io;

import java.io.*;

public class IOEx6PrintWriter {
    public static void main(String[] args) throws IOException {
        String filePathname = "C:\\Users\\akash\\Java\\Basics\\src\\io\\data.txt";
        PrintWriter printWriter = null;
        File file1 = new File(filePathname);
        
        try {
            printWriter = new PrintWriter(file1);

            /*
              Diff between FileWriter and PrintWriter is while writing,
              fileWriter.write(int) will covert into char
              printWriter.write(int) will directly write the int value to the file
             */

            printWriter.println("Heyyy");
            printWriter.println(5);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert printWriter !=null;
            printWriter.close();
        }
    }
}
