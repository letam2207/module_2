package ss2_vong_lap.bai_tap;

public class HienThiSoNguyeToNhoHon100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean kiemTra = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    kiemTra = false;
                }
            }
            if (kiemTra) {
                System.out.println("số nguyên tố nhỏ hơn 100 là :" + i);
            }
        }
    }
}
