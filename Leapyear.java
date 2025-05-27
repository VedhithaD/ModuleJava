import java.util.Scanner;

public class Leapyear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(a + " is Leap year");
        } else {
            System.out.println(a + " is not a leap year");
        }
    }
}
