package ss6_inheritace_polimorhism.bai_tap.lop_circle_va_lop_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle =new Circle(5,"red");
        Cylinder cylinder = new Cylinder(6,5,"red");
        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
    }
}
