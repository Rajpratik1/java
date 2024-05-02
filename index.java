import java.util.Scanner;
public class index{
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] makePrefixSumArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
         arr[i]= arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = obj.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter "+n+"elements:");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("Input array:");
        printArray(arr);
        makePrefixSumArray(arr);
        obj.close();
    }
}