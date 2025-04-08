package ss2_vong_lap.bai_tap;

public class In20SoNuyenToDauTien {
    public static void main(String[] args) {
        int demSo = 0;
        int soNguyenTo = 2;
        while (demSo <= 20) {
            boolean kiemTra = true;
            for (int i = 2; i < soNguyenTo; i++) {
                if (soNguyenTo % i == 0) {
                    kiemTra = false;
                    break;
                }
            }
            if (kiemTra) {
                System.out.println(soNguyenTo);
                demSo++;
            }
            soNguyenTo++;
        }
    }
}
