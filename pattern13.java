import java.util.*;
public class pattern13 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            //space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            ///count print
            for(int j=i;j>=1;j--){
                System.out.print(j+"");
            } 
             for(int j=2;j<=i;j++){
                System.out.print(j+"");
            } 
            System.out.println();
        }
        // for(int i=1;i<=n;i++){
        //     //space print
             
        //     ///count print
        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);
        //     } 
        //     System.out.println();
        // }
        sc.close();
    }
}
