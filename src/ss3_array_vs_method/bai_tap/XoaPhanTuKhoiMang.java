package ss3_array_vs_method.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mangSoNguyen = {1, 4, 2, 6, 33, 9, 3};
        for (int i = 0; i < mangSoNguyen.length; i++) {
            System.out.print(mangSoNguyen[i]+", ");
        }
        System.out.println("nhập phần tử muốn xóa: ");
        int diaChiSoCanXoa = scanner.nextInt();
        int[] mangSoNguyen1 = new int[mangSoNguyen.length - 1];
        for (int i = 0, j = 0; i < mangSoNguyen.length; i++) {
            if (mangSoNguyen[i] != diaChiSoCanXoa) {
                mangSoNguyen1[j++] = mangSoNguyen[i];
            }
        }
        for (int i = 0; i < mangSoNguyen1.length; i++) {
            System.out.print(mangSoNguyen1[i]+", ");
        }
    }
}
