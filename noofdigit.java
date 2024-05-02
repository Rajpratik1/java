import java.util.Scanner;
public class noofdigit {
    int digit(int n){
          int count=0;
        while(n!=0){
            n=n/10;
            ++count;
        }
        return count;
    }   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        noofdigit obj = new noofdigit(); // Create an instance of the class
        int a = obj.digit(n);
        System.out.println(a);
        sc.close();    
    } 
}
