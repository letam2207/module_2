package ss3_array_vs_method.bai_tap;

import java.util.Scanner;

public class TinhTongCacSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập số hàng: ");
        int hang = scanner.nextInt();
        System.out.println("nhập số cột:");
        int cot = scanner.nextInt();
        int[][] mang = new int[hang][];
        for (int i = 0; i < hang; i++) {
            mang[i] = new int[cot];
            for (int j = 0; j < mang[i].length; j++) {
                System.out.println("Nhập giá trị tại [" + i + "][" + j + "]: ");
                mang[i][j] = scanner.nextInt();
            }
        }
        System.out.println("mảng vừa nhập là: ");
        for (int i = 0; i < mang.length; i++) {
            for (int j = 0; j < mang[i].length; j++) {
                System.out.print(mang[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("nhập cột muốn tính tổng :");
        int tong = 0;
        int cotTinhTong = scanner.nextInt();
        for (int i = 0; i < mang.length; i++) {
            for (int j = cotTinhTong; j <= cotTinhTong; j++) {
                tong += mang[i][j];
            }
        }
        System.out.println("Tổng của cột ở vị trí " + cotTinhTong + " là :" + tong);
    }
}
