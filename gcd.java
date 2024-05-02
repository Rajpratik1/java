import java.util.Scanner;
public class gcd {
    static int gcd1(int a,int b){
        int res=Math.min(a, b);
        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd1(n, b));
        sc.close();
    }
}
