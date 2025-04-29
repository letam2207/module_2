package ss14_sort_algorithms.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Arrays;

public class InsertionSortByStep {
    static int[] array = {3,6,4,8,1,2,5,33,6,23,11,87,98};
    public static void insertionSort(int[] array) {
        System.out.println("mảng ban đầu: ");
        System.out.println(Arrays.toString(array));
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
                System.out.println("đổi chỗ");
            }
            array[pos] = x;
            System.out.println(Arrays.toString(array));
        }
        System.out.println("mảng sau khi sắp xếp: ");
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        insertionSort(array);
    }


}
