import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class arraylist {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(20);
        arr.add(26);
        arr.add(3);
        arr.add(24);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        System.out.println("ArrayList with duplicates: " + arr);

        // Remove duplicates using a Set
        Set<Integer> result = new HashSet<>(arr);
        
        // Create a new ArrayList without duplicates
        ArrayList<Integer> result1 = new ArrayList<>(result);

        //  Print the ArrayList without duplicates
        System.out.println("ArrayList without duplicates: " + result1);

        
    }
}

/*
 * Collections.sort(arr);
 * for(int i=0;i<n;i++){
 * if(arr.get[i]==arr[i+1])
 * result.add
 * 
 *  System.out.println("ArrayList with duplicates: " + numbersWithDuplicates);

        Remove duplicates using a Set
        Set<Integer> setWithoutDuplicates = new HashSet<>(numbersWithDuplicates);
        
        Create a new ArrayList without duplicates
        List<Integer> numbersWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);

         Print the ArrayList without duplicates
        System.out.println("ArrayList without duplicates: " + numbersWithoutDuplicates);
 * }
 */