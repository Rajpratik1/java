public class fibonacci {
   static  int fib(int n){
        if(n== 0){
            return 0;
        }
        
        return n+fib(n-1);
    }
    public static void main(String[] args) {
         
        System.out.println(fib(4));
    }
    
}
