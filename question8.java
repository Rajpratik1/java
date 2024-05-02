// import java.util.*; 
// // import java.util.Comparator;
// public class question8 {
//     public static void main(String[] args) {
//         Integer [] arr = {1,2,3,4,2,7,8,8,3};
//         Arrays.sort(arr,Collections.reverseOrder());
//         System.out.println(Arrays.toString(arr));
//     }
// }

// import java.util.Arrays;
// import java.util.Collections;
// // import java.util.Comparator;

// public class question8 {
//     public static void main(String[] args) {
//         Integer[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
//         Arrays.sort(arr, Collections.reverseOrder());

//         // Print the sorted array
//         System.out.println(Arrays.toString(arr));
//     }
// }

 
// import java.util.Comparator;
public class question8 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2,7,8,8,3};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
             if(arr[i]>max){
                max=arr[i];
             }
        }
        System.out.println(max+" ");
    }
}
