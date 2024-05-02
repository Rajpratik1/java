//Java Program to sort the elements of an array in ascending order
public class greatest {
    public static void main(String[] args) {
    int[] arr=new int[]{1,2,3,4,45,23,43,87};
    int temp = arr[0];
    for(int i=0;i<arr.length;i++){
        // for(int j=0;j<)
        if(temp<arr[i]){
            temp=arr[i];
        }
        }
        System.out.println(temp);
    }
}
