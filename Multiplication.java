import java.util.Scanner;

public class Multiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = a;
        for (int i = 1; i <= 10; i++) {
            res = a * i;
            System.out.println(a + "*" + i + "==" + res);
        }
    }
}
