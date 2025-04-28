package ss13_linear_search.bai_tap.tim_chuoi_lien_tiep_dai_nhat;

import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi muốn kiểm tra: ");
        String str = scanner.nextLine();
        String result = "";
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            int j = i;
            while (j + 1 <= str.length() - 1) {
                if (str.charAt(j) <= str.charAt(j + 1)) {
                    if (temp.isEmpty()) {
                        temp.append(str.charAt(j));
                    }
                    temp.append(str.charAt(j + 1));
                    j++;
                } else {
                    break;
                }
            }
            if (result.length() < temp.length()) {
                result = temp.toString();
            }
            temp.setLength(0);
            i = j;
        }
        System.out.println("chuỗi dài nhất là: "+result);
    }
}