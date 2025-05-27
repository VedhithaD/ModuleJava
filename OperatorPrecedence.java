import java.util.Scanner;

public class OperatorPrecedence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 10, b = 5, c = 2;
        int res1 = a + b * c;
        int res2 = (a + b) * c;
        int res3 = a + b - c * 2;
        int res4 = a + (b - c) * 2;
        int res5 = a + b / c;
        System.out.println("a+b*c=" + res1);
        System.out.println("(a+b)*c=" + res2);
        System.out.println("a+b-c*2=" + res3);
        System.out.println("a+(b-c)*2=" + res4);
        System.out.println("a+b/c=" + res5);
    }
}
