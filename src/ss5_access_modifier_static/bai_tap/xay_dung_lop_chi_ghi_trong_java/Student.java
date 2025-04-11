package ss5_access_modifier_static.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class Student {
    String name = "John";
    String classes = "C02";
    Student(){
    }
    public String setName(String name){
       return this.name = name;
    }
    public String setClasses(String classes){
        return this.classes = classes;
    }
}
