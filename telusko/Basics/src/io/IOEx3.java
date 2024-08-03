package io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOEx3 {
    public static void main(String[] args) throws IOException {
        String filePathname = "C:\\Users\\akash\\Java\\Basics\\src\\io\\data.txt";
        FileReader fileReader = null;
        File file1 = new File(filePathname);


        try {
            fileReader = new FileReader(file1);
//            int i = fileReader.read();
//            while (i != -1){
//                System.out.print((char)i);
//                i = fileReader.read();
//            }

            char ch[] = new char[(int)file1.length()];

            fileReader.read(ch);
            System.out.println(ch);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert fileReader != null;
            fileReader.close();
        }
    }
}
