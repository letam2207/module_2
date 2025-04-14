package ss6_inheritace_polimorhism.bai_tap.lop_point_va_moveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2,4);
        MovablePoint movablePoint = new MovablePoint(2,4,3,4);
        System.out.println(point.toString());
        System.out.println(movablePoint.toString());
    }

}
