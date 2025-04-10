package ss4_OOP.bai_tap.XayDungLopQuadraticEquation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a :");
        double a = scanner.nextDouble();
        System.out.println("nhập b :");
        double b = scanner.nextDouble();
        System.out.println("nhập c :");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta>0){
            System.out.println("nhiệm 1 :"+quadraticEquation.getRoot1());
            System.out.println("nhiệm 2 :"+quadraticEquation.getRoot2());
        }else if (delta ==0 ){
            System.out.println("phương trình có nhiệm kép :"+quadraticEquation.getRoot1() );
        }else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
