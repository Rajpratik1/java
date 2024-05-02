import java.util.Scanner;
public class matrixprogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        int c[][]=new int[a1][b1];
        for(int i=0;i<a1;i++){
            for(int j=0;j<b1;j++){
                c[i][j]=sc.nextInt();
            }
        }
        int a2=sc.nextInt();
        int b2=sc.nextInt();
        int d[][]=new int[a2][b2];
        for(int i=0;i<a2;i++){
            for(int j=0;j<2;j++){
                d[i][j]=sc.nextInt();
            }
        }
        int e[][]=new int[a1][b2];
        for(int i=0;i<a1;i++){
            for(int j=0;j<b2;j++){
            for(int k=0;k<b1;k++){
        e[i][j]=+c[i][k]*d[k][j];
            }
        }}
        for(int i=0;i<a2;i++){
            for(int j=0;j<b1;j++){
                System.out.print(e[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
