package ss3_array_vs_method.bai_tap;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMnag2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mang2Chieu = {{12,32,45,33,77},{96,37,11,21,4,7}};
        int giaTRiLonNhat = mang2Chieu[0][0];
        for (int i = 0; i < mang2Chieu.length; i++) {
            for (int j = 0; j < mang2Chieu[i].length; j++) {
                if (mang2Chieu[i][j]>giaTRiLonNhat){
                    giaTRiLonNhat = mang2Chieu[i][j];
                }
            }
        }
        System.out.println("giá trị lớn nhất trong mảng trên là : "+giaTRiLonNhat);
    }
}
