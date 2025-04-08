package ss3_array_vs_method.bai_tap;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mangBanDau = {2, 43, 5, 6, 23, 4};
        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < mangBanDau.length; i++) {
            System.out.print(mangBanDau[i] + ",");
        }
        System.out.println("\nNhập số muốn thêm: ");
        int soThem = scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm: ");
        int viTri = scanner.nextInt();
        if (viTri < 0 || viTri > mangBanDau.length) {
            System.out.println("Vị trí không hợp lệ!");
            return;
        }
        int[] mangMoi = new int[mangBanDau.length + 1];
        for (int i = 0; i < viTri; i++) {
            mangMoi[i] = mangBanDau[i];
        }
        mangMoi[viTri] = soThem;
        for (int i = viTri; i < mangBanDau.length; i++) {
            mangMoi[i + 1] = mangBanDau[i];
        }
        System.out.print("Mảng sau khi thêm: ");
        for (int i = 0; i < mangMoi.length; i++) {
            System.out.print(mangMoi[i] + ",");
        }
    }
}
