import java.util.*;
public class problem4 {
    public static void circle(int r){
        double circum = (2* 3.14* r);
        System.out.println(circum);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        circle(r);
        sc.close();
    }
}
