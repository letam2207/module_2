package ss5_access_modifier_static.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(4);

        System.out.println("Bán kính "+ circle.getRadius());
        System.out.println("Diện tích "+circle.getArea());
    }



}
