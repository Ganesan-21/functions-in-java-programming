import java.util.Scanner;
public class Main {
    public static void Square(int a) {
        int size = a;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Triangle(int r) {
        int rows = r;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     public static void Characters(int b) {
        int rows = b;
        char ch = 'A';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
     public static void Inverted(int c) {
        int rows = c;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Reverse(int d) {
        int rows = d;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < rows - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("List of patterns:");
            System.out.println("1. Square Pattern");
            System.out.println("2. Triangular Pattern");
            System.out.println("3. Character Pattern");
            System.out.println("4. Reverse Triangle Pattern");
            System.out.println("5. Inverted Triangle Pattern");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number of rows: ");
                    int a = sc.nextInt();
                    Square(a);
                    break;
                case 2:
                    System.out.print("Enter a number of rows: ");
                    int b = sc.nextInt();
                    Triangle(b);
                    break;
                case 3:
                    System.out.print("Enter a number of rows: ");
                    int c = sc.nextInt();
                    Characters(c);
                    break;
                case 4:
                    System.out.print("Enter a number of rows: ");
                    int d = sc.nextInt();
                    Reverse(d);
                    break;
                case 5:
                    System.out.print("Enter a number of rows: ");
                    int e = sc.nextInt();
                    Inverted(e);
                    break;
                case 6:
                    System.out.println("Thank you! We are exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
        sc.close();
}
}

