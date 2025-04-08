package ss3_array_vs_method.bai_tap;

import java.util.Scanner;

public class GopHaiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mang1 = {12, 32, 44, 23, 78, 9};
        int[] mang2 = {34, 72, 49, 53, 90};
        int[] mang3 = new int[mang1.length + mang2.length];
        for (int i = 0; i < mang1.length; i++) {
            mang3[i] = mang1[i];
        }
        for (int i = 0; i < mang2.length; i++) {
            mang3[mang1.length + i] = mang2[i];
        }
        System.out.print("Mảng sau khi gộp: ");
        for (int i = 0; i < mang3.length; i++) {
            System.out.print(mang3[i]+",");
        }
    }
}
