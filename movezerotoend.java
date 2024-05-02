import java.util.Scanner;

class movezerotoend{
    
    public int swap(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                temp[i] = arr[i];
                arr[i] = arr[j];
                arr[j] = temp[i];
            }
        }
        return arr[];
    }

    public int trailingZero(int[] arr,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for(int j=i+1;j<n;j++)
                if(arr[j]!=0)
                swap(arr[i],arr[j]);
            }
        }
        return arr[];
    }

    public static void main(Sring[] args){
        Scanner sc=new Scanner(system.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
    }
}