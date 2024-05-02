public  class  question3{
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        int n=2;
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    for(int i=0;i<n;i++){
            int j,first =arr[arr.length-1];
        for(j=arr.length-1;j>0;j--){
            arr[j]=arr[j-1];
        }
        arr[j]=first;
   }
   System.out.println();
   System.out.println("Array after left rotation.");
   for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
   }
    }
}