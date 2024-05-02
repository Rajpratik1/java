import java.util.*;
public class problem5 {
    public static void agePrint(int age){
        if(age>18){
            System.out.println("You are Eligible.");
            return;
        }
        else{
            System.out.println("You are not Eligible.");
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        agePrint(a);
        sc.close();
    }
}
