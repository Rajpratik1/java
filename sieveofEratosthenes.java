import java.util.*; 
public class sieveofEratosthenes {
    static void sieveofEratosthenes1(int n){
        for(int i=2;i<=n;i++){
            prime2(i);
            System.out.println(i);
        }
        return;
    }
    static boolean prime2(int n){
        if(n==1)
        return false; 
        if(n%2==0 && n%3==0)
        return false;
        if(n==2 && n==3)
        return true;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0)
            return false; 
        }
        return true;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sieveofEratosthenes1(n));
    }
}
