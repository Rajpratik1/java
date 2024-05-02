import java.util.*;
public class problem6 {
    public static void doWhile(int n){
        do{
            System.out.println("yes");
        }while(n>0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        doWhile(n);
        sc.close();
    }
}
