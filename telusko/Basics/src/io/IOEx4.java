package io;

import java.io.*;

public class IOEx4 {
    public static void main(String[] args) throws IOException {
        String filePathname = "C:\\Users\\akash\\Java\\Basics\\src\\io\\data.txt";
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        File file1 = new File(filePathname);

        try {
            fileWriter = new FileWriter(file1);
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Akash");
            bufferedWriter.newLine();
            bufferedWriter.write(66);


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert bufferedWriter !=null;
            bufferedWriter.close();
        }
    }
}
