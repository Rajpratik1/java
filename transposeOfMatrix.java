import java.util.Scanner;

public class transposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int n=sc.nextInt();
        int [][] arr=new int [a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int A[][]=new int[b][a];
        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
                System.out.print(A[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
