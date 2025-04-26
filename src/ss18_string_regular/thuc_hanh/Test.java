package ss18_string_regular.thuc_hanh;

public class Test {
    public static void main(String[] args) {
        String name = "Nguyen Van A";
        String regex = "^[A-Z]{1}[a-z]\\s+[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+$";
        boolean check = name.matches(regex);
        System.out.println(check);
    }
}
