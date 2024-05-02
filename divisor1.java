import java.util.Scanner;

public class divisor1 {
    static void Divisor1(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
            System.out.println(i);
            if(i!=n/i)
            System.out.println(n/i);
            }}
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Divisor1(n);
        sc.close();
    }
}
