import java.util.*;
public class problem3 {
    public static void twoGreater(int a,int b){
        if(a>b){
            System.out.println(a);
            return;
        }
        else{
            System.out.println(b);
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        twoGreater(a,b);
        sc.close();
    }
}
