package io;

import java.io.*;

public class IOEx8DeSerializer {
    public static void main(String[] args) throws IOException {
        String filePathname = "C:\\Users\\akash\\Java\\Basics\\src\\io\\student.txt";
        ObjectInputStream objectInputStream = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(filePathname);
            BufferedInputStream bufferedInputStream =  new BufferedInputStream(fileInputStream);
//            objectInputStream = new ObjectInputStream(fileInputStream);
            objectInputStream = new ObjectInputStream(bufferedInputStream);

            Student student = (Student) objectInputStream.readObject();

            System.out.println(student.toString());
        } catch (FileNotFoundException _) {

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            assert objectInputStream != null;
            objectInputStream.close();
        }
    }
}
