import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int val = 0;
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Mul");
        System.out.println("4.Div");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                val = a + b;
                break;
            case 2:
                val = a - b;
                break;
            case 3:
                val = a * b;
                break;
            case 4:
                val = a / b;
                break;
        }
        System.out.println(val);

    }

}
