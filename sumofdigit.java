import java.util.Scanner;
public class sumofdigit {
       static int sum(int  n){
            if(n==0){
                return 0;
            }
            else 
            return sum(n/10) +n%10; 
        }    
        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            int b=sc.nextInt();
            System.out.println(sum(b));
            sc.close();
        }
}
