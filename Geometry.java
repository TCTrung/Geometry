import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Ve tam giac");
            System.out.println("2. Ve hinh vuong");
            System.out.println("3. Ve hinh chu nhat");
            System.out.println("0. Thoat");
            System.out.println("Nhap lua chon: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Ve tam giac");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Ve hinh vuong");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Ve hinh chu nhat");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Khong co!");
            }
        }
    }
}
