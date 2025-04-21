package ss11_DSA_stack_queue.bai_tap.chuyen_doi_he_nhi_pahn_sang_he_thap_phan;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("nhập số muốn đổi: ");
        int number = scanner.nextInt();
        while (number != 0) {
            stack.push(number % 2);
            number = number / 2;
        }
        while (!stack.isEmpty()) {
            System.out.printf("%-5d", stack.pop());
        }
    }
}
