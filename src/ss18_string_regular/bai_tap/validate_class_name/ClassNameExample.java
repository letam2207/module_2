package ss18_string_regular.bai_tap.validate_class_name;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String CLASSNAME_REDEX = "^[CAP][0-9]{4}[GHIK]$";
        System.out.println("nhập tên muốn kiểm tra");
        String check = scanner.nextLine();
        Pattern pattern = Pattern.compile(CLASSNAME_REDEX);
        Matcher matcher = pattern.matcher(check);
        if (matcher.matches()){
            System.out.println("Tên lớp hợp lệ");
        }else {
            System.out.println("Tên lớp không hợp lệ");
        }

    }
}
