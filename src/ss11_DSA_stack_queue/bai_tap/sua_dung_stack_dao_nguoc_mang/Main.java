package ss11_DSA_stack_queue.bai_tap.sua_dung_stack_dao_nguoc_mang;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("mảng ban đầu :");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-5d", arr[i]);
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("\nMảng sau khi đảo ngược: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-5d", arr[i]);
        }
        Stack<String> wStack = new Stack<>();
        String string = "một hai ba bốn năm";
        String[] arr2 = string.split(" ");
        System.out.println("\nchuỗi ban đầu : ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("%-5s", arr2[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            wStack.push(arr2[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = wStack.pop();
        }
        System.out.println("\nChuỗi sau khi đảo ngược: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-5s", arr2[i]);
        }
    }
}
