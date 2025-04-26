package ss18_string_regular.bai_tap.validate_phone_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String PHONE_NUMBER_REDEX = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
        System.out.println("nhập tên muốn kiểm tra");
        String check = scanner.nextLine();
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REDEX);
        Matcher matcher = pattern.matcher(check);
        if (matcher.matches()){
            System.out.println("số điện thoại hợp lệ");
        }else {
            System.out.println("số điện thoại không hợp lệ");
        }

    }
}
