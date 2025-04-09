package ss3_array_vs_method.bai_tap;

import java.util.Scanner;

public class DemPhanTuXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "code gym da nang";
        System.out.println("nhập kí tự kiểm tra: ");
        char kiTu = sc.next().charAt(0);
        int demKiTu = 0;
        for (int i = 0; i < str.length(); i++) {
            if (kiTu == str.charAt(i)) {
                demKiTu++;
            }
        }
        System.out.println("kí tự "+kiTu+" xuất hiện "+demKiTu+" lần trong mảng");
    }
}
