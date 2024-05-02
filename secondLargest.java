public class secondLargest {
    public static int getLargest(int arr[]){
        int n=arr.length;
        int max=arr[0];
        for(int i=0;i<n;i++)
        if(arr[i]>max){
            max=arr[i];
        }
        return max;
    }
    public static int secondLargest(int arr[]){
      int n=arr.length;
      int a= getLargest(arr);
      int res=-1;     
      for(int i=0;i<n;i++){
        if(arr[i]>a){
        if(res==-1){
            res=i;
        }
        else if(arr[i]==a){
            res=i;
        }
        }
      }
      return res;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{23,54,76,56,59};
        System.out.println(getLargest(arr));
        System.out.println(secondLargest(arr));
    }
}
