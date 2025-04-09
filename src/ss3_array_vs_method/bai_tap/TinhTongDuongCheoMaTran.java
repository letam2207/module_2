package ss3_array_vs_method.bai_tap;

import java.util.Scanner;

public class TinhTongDuongCheoMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hang, cot;
        do {
            System.out.print("Nhập số hàng: ");
            hang = scanner.nextInt();
            System.out.print("Nhập số cột: ");
            cot = scanner.nextInt();
            if (hang != cot) {
                System.out.println("Nhập số hàng bằng số cột !");
            }
        } while (hang != cot);
        int[][] mang = new int[hang][cot];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhập giá trị tại [" + i + "][" + j + "]: ");
                mang[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\n Mảng vừa nhập là:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(mang[i][j] + "\t");
            }
            System.out.println();
        }
        int tongCheoChinh = 0;
        for (int i = 0; i < hang; i++) {
            tongCheoChinh += mang[i][i];
        }
        System.out.println("Tổng đường chéo chính là: " + tongCheoChinh);

        scanner.close();
    }
}
