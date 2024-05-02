import java.util.ArrayList;
import java.util.Collections;
public class reverseArraylist {
    
    // static void reverseList(ArrayList<Integer> list){
    //     int i=0,j=list.size()-1;
    //     while(i<j){
    //         // temp =a;
    //         // a=b;
    //         // b=temp;
        
    //         Integer temp=Integer.valueOf(list.get(i));
    //         list.set(i,list.get(j));
    //         list.set(j,temp);
            
    //         i++;
    //         j--;
    //     }
        
    // }
    
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        // reverseList(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println("Ascending"+ list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Desc Order" + list);

        ArrayList<String>l1 = new ArrayList<>();
        l1.add("Pratik");
        l1.add("Raj");
        l1.add("Ritik");
        l1.add("Raj");

        Collections.sort(l1);
        System.out.println(l1);

        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
    }
}
