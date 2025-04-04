package ss1_introduction_to_java.bai_tap;


import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        System.out.println("nhập tên của bạn: ");
        Scanner scanner = new Scanner(System.in);
        String ten = scanner.nextLine();
        System.out.println("Xin Chào " + ten);
    }
}
