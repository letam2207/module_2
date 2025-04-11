package menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ProductManagement studendManagement = new ProductManagement();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Search");
            System.out.println("6. Exit");
            System.out.println("Lựa chọn của bạn: ");
            int enter = scanner.nextInt();
            switch (enter){
                case 1:
                    studendManagement.displayStudent();
                    break;
                case 2:
                    studendManagement.addStudent();
                    break;
                case 3:
                    studendManagement.deleteStudent();
                    break;
                case 4:
                    studendManagement.updateStudent();
                    break;
                case 5:

                case 6:
                    System.exit(0);
            }
        }while (true);



    }
}
