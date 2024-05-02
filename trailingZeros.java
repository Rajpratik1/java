import java.util.Scanner;

public class trailingZeros {
    static int trailing1(int n) {
        int res = 1;
        for (int i = 2; i < n; i++)
        res = res * i;
        int zeros=0;
        while (res % 10 == 0) {
            zeros++;
            res = res / 10;
        }
        return zeros;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trailing1(n));
        sc.close();
    }
}
