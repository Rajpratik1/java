public class question7 {
    public static void main(String[] args) {
        int [] arr=new int[]{1,2,3,4,2,7,8,8,3};
        for(int i=1;i<=arr.length;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}