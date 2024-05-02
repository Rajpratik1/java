//Java Program to copy all elements of one array into another array.

import java.util.*;
public class question1 {
    public static void arr1(int a[],int b[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();
            b[i]=a[i];    
        }
        for(int i=0;i<6;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<6;i++){
            System.out.print( b[i]+" ");
        }
        sc.close();
    } 
    public static void main(String[] args) {
        
        int[] a=new int[6];
        int[] b=new int[6];
        arr1(a,b);
    }
}
