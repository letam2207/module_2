package ss4_OOP.thuc_hanh;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();
        LopHinhChuNhat lopHinhChuNhat = new LopHinhChuNhat(width, height);
        System.out.println("Your Rectangle \n"+ lopHinhChuNhat.display());
        System.out.println("Perimeter of the Rectangle: "+ lopHinhChuNhat.getPerimeter());
        System.out.println("Area of the Rectangle: "+ lopHinhChuNhat.getArea());
    }
}
