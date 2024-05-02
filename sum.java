import java.util.*;
class sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int boat = sc.nextInt();
        int num=0;
        int i=1;
         while(i<=boat){
        num=num+i;
        i++;
    }
        System.out.println(num);
        sc.close();
    }
}