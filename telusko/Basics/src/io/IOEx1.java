package io;

import java.io.File;
import java.io.IOException;

public class IOEx1 {
    public static void main(String[] args) throws IOException {
        String filePathname = "C:\\Users\\akash\\Java\\Basics\\src\\io\\data.txt";
        File file1 = new File(filePathname);
        System.out.println(file1.exists());
        System.out.println(file1.isFile());

        System.out.println(file1.createNewFile());


        String dirPathname = "C:\\Users\\akash\\Java\\Basics\\src\\io\\sample";
        File dir = new File(dirPathname);
        System.out.println(dir.exists());
        System.out.println(dir.isDirectory());

        System.out.println(dir.mkdir());
        System.out.println(dir.getName());
        System.out.println(dir.getAbsolutePath());
        System.out.println(dir.getPath());
    }
}
