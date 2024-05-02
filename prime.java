import java.util.Scanner;
public class prime {
    boolean numberPrime(int n){
          if(n==1)
          return false;
          else
          for(int i=2;i<n;i++){
            if(n%i==0)
            return false;
          }
          return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        prime obj =new prime();
        boolean a= obj.numberPrime(n);
        System.out.println(a);
        sc.close();
    }
}
