package test_file_text.FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadATextFile {
    public static void main(String[] args) {
        try {
            File inFile = new File("Hello.txt");
            FileReader reader = new FileReader(inFile);
            BufferedReader reader1 = new BufferedReader(reader);
            String line = null;
            while ((line = reader1.readLine())!=null){
                System.out.println(line);
            }
            reader1.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
