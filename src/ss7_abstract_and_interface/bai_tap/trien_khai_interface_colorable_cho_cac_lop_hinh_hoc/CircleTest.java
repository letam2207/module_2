package ss7_abstract_and_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

import java.util.Random;
import java.util.random.RandomGenerator;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());

        circle = new Circle(3.5);
        System.out.println(circle.getArea());

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        circle.resize(50);
        System.out.println(circle);
    }
}