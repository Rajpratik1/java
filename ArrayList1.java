import java.util.ArrayList;
import java.util.Collections;
class ArrayList1{
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();

        //add elements
        list.add(0);
        list.add(1);
        list.add(34);

        System.out.println(list);

        //get elements

        int element = list.get(2);
        System.out.print(element);

        //add el in between
        list.add(2,1);
        System.out.println(list);

        //set element
        list.set(0,5);

        //delete element
        list.remove(0);
        System.out.println(list);

        //size
        for(int i=0;i<list.size();i++){
            System.out.println(list);
        }       
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}