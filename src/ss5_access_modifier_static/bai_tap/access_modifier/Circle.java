package ss5_access_modifier_static.bai_tap.access_modifier;

public class Circle {
    double radius = 1.0;
    String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double getArea() {
        return Math.PI * Math.pow(this.radius, 2);

    }
}
