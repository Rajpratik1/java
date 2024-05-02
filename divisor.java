import java.util.Scanner;
public class divisor {
    static void Divisor(int n){
        if(n==1)
        return;
        for(int i=2;i<=n;i++){
            if(n%i==0)
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Divisor(n);
        sc.close();
    }
}
