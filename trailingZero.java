import java.util.*;

public class trailingZero {
    int contZero(int n) {
        int fac = 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            fac = fac * i;
        }
        for (int i = 5; i <= n; i = i * 5) {
            res = res + n / i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        trailingZero obj = new trailingZero();
        int a = obj.contZero(n);
        System.out.println(a);
        sc.close();
    }
} 
