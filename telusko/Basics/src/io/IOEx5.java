package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOEx5 {
    public static void main(String[] args) throws IOException {
        String filePathname = "C:\\Users\\akash\\Java\\Basics\\src\\io\\data.txt";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        File file1 = new File(filePathname);
        
        try {
            fileReader = new FileReader(file1);
            bufferedReader = new BufferedReader(fileReader);

            String s = bufferedReader.readLine();
            while (s != null){
                System.out.println(s);
                s = bufferedReader.readLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert bufferedReader !=null;
            bufferedReader.close();
        }
    }
}
