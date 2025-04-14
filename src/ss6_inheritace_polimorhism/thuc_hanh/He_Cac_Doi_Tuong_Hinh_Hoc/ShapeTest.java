package ss6_inheritace_polimorhism.thuc_hanh.He_Cac_Doi_Tuong_Hinh_Hoc;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red",false);
        System.out.println(shape);
    }
}
