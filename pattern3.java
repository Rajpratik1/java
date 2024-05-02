import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=i;j<b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
