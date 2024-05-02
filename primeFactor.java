import java.util.Scanner;
public class primeFactor {
    static void primeFactors(int n){
        if(n<=1)
        return;
        for(int i=2;i<n;i++){ 
                while (n%i==0) {
                    System.out.print(""+i);
                n=n/i;
            }
        }
        if(n>1)
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        primeFactors(n);
        sc.close();
    }
}
