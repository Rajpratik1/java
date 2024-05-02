//Java Program to find the frequency of each element in the array
import java.util.*;
 public class question2{
    public static void arr2(int a[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
        return;
    }
    public static void main(String[] args) {
        int[] a=new int[7];
        arr2(a);
    }
 }