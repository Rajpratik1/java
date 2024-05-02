import java.util.*; 
public class rotation {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int R=sc.nextInt();
        int[] name=new int[n];
        for(int i=0;i<n;i++){
            name[i]=sc.nextInt();
        }
         for(int i=0;i<n;i++){
            for(int j=n-1;j<n;j--){
                if(name[i]==name[j]);
            }
            System.out.print(name[i]);
         }
    }
}
