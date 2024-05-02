import java.util.Scanner;

public class divisor2 {
     static void Divisor2(int n){
        for(int i=2;i*i<n;i++)
            if(n%i==0)
            System.out.println(i);
        
        for(int i=n;i>=1;i--)
            if(n%i==0)
            System.out.println(n/i);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Divisor2(n);
        sc.close();
    }
}
