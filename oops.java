//find the pair with the given sum in the an array.

class sum{
    public static void findPair(int [] arr,int target){
        int c=arr.length;
    for(int i=0;i<c-1;i++){
    for(int j=i+1;j<c;j++){
    if(arr[i]+arr[j]==target){
    System.out.println("sum is found");
    return;
    }
    }}
    System.out.println("sum is not found");}
    
    public static void main(String [] args){
    int [] arr={65,6,54,54,3,44,49};
    int target= 109;
    findPair(arr,target);
    }}
    
    