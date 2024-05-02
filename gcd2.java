import java.util.Scanner;

public class gcd2 {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        int c = a / gcd(a, b);
        int d = b / gcd(a, b);
        return (c * d * gcd(a, b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
        sc.close();
    }
}
// This is an efficient solution of the problem of gcd
// This is an efficient solution of the problem of lcm