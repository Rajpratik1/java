import java.util.*;
public class updateBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int operation =sc.nextInt();
        int n=5;
        int pos=1;
        int bitmask=1<<pos;

        if(operation==1){
            int num=bitmask|n;
            System.out.println(num);
        }
        else{
            int num=~(bitmask);
            int number =num&n;
            System.out.println(number);
        }
        sc.close();
    }
}
