package ss5_access_modifier_static.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Tâm");
        student.setClasses("C02");
        System.out.println(student.name);
        System.out.println(student.classes);

    }
}
