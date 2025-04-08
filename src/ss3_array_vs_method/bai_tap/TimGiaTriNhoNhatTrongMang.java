package ss3_array_vs_method.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int doDaiMang = scanner.nextInt();
        int[] mang = new int[doDaiMang];
        for (int i = 0; i < doDaiMang; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
        System.out.println("mảng vừa nhập là :");
        for (int i = 0; i < doDaiMang; i++) {
            System.out.print(mang[i] + ", ");
        }
        int giaTriNhoNhat = mang[0];
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] < giaTriNhoNhat) {
                 giaTriNhoNhat = mang[i];
            }
        }
        System.out.println("\nphần tử nhỏ nhất trong mảng là: "+giaTriNhoNhat);
    }
}
