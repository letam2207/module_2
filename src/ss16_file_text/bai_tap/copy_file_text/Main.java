package ss16_file_text.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void copyFileText(String source, String target) throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        reader = new BufferedReader(new FileReader(source));
        writer = new BufferedWriter(new FileWriter(target));

        String line;
        while ((line = reader.readLine()) != null){
            writer.write(line);
            writer.newLine();
        }
        reader.close();
        writer.close();
    }
    public static void main(String[] args) {
        String sourceFile = "ss16_file_text/bai_tap/copy_file_text/source.vsc";
        String targetFile = "ss16_file_text/bai_tap/copy_file_text/target.vsc";
        try {
            copyFileText(sourceFile, targetFile);
            System.out.println("Success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
