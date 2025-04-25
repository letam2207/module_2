package ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.commom;

import ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeListStudentToBinaryFile(String filePath, List<Product> productList) {
        File file = new File(filePath);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file");
        } catch (IOException e) {
            System.out.println("lỗi ghi file");
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("lỗi đóng file");
            }
        }
    }

    public static List<Product> readBinaryToListStudent(String filePath) {
        List<Product> productList = new ArrayList<>();
        File file = new File(filePath);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            if (file.length()>0){
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                productList = (List<Product>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            System.out.println("lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return productList;

    }
}
