package ss11_DSA_stack_queue.bai_tap.chuoi_Palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        System.out.println("Nhập chuỗi muốn kiểm tra: ");
        String string = scanner.nextLine();
        String[] arr = string.split("");
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
            queue.add(arr[i]);
        }
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            if (!stack.pop().equals(queue.poll())) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Đây là chuỗi Palindrome !");
        } else {
            System.out.println("Đây không phải chuỗi Palindrome !");
        }
    }
}
