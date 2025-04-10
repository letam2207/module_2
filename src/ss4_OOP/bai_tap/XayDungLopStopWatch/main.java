package ss4_OOP.bai_tap.XayDungLopStopWatch;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to stop");
        scanner.nextLine();
        stopWatch.stop();
        System.out.println("thời gian đã chạy: "+stopWatch.getElapsedTime());
    }
}
