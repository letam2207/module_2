package test_file_text.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteATextFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Hello.txt");
            writer.write("Hello!");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
