import java.util.Scanner;
public class prime1 {
     boolean prime2(int n){
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
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        prime1 obj =new prime1();
         boolean a = obj.prime2(n);
        System.out.println(a);
        sc.close();
    }
}
