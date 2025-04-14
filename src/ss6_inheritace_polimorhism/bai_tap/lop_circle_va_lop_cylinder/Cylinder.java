package ss6_inheritace_polimorhism.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height,double radius,String color) {
        super(radius,color);
        this.height = height;
    }

    public Cylinder() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " height= " + height +
                " Volume= " + getVolume() +
                '}';
    }
}
