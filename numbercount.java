import java.util.Scanner;

public class numbercount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nOdd = 0;
        int nEven = 0;
        int a = 0;
        a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the range from " + a + " to " + b + ".");
        
         
        for (int i = a; i < b; i++) {
            if (a % 2 == 0) {
                System.out.print(a);
                System.out.print(" ");
                nEven++;
            }
            
        System.out.println("");
          
            if (a % 2 != 0) {
                System.out.print(a);
                System.out.print(" ");
                nOdd++;
            }
            a++;
        }
    
        System.out.println("");
        System.out.print("Number of even number is " + nEven + " and odd number is " + nOdd);
        sc.close();
    }
}