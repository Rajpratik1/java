import java.util.ArrayList;

public class wrapper{
    public static void main(String[] args) {
        // The line `Integer i= Integer.valueOf(4);` is creating an instance of the `Integer` class and
        // assigning it the value of 4. The `valueOf()` method is a static method of the `Integer`
        // class that converts the specified value (in this case, 4) into an `Integer` object.
        // Integer i= Integer.valueOf(4);
        // System.out.println(i);
        // Float f=Float.valueOf(4.5f);
        // System.out.println(f);

        // ArrayList<Integer> l1=new ArrayList<>();
        // l1.add(2);
        // l1.add(3);
        // l1.add(42);
        // l1.add(25);
        // l1.add(29);
        // System.out.println(l1.get(2));

        // for(int i=0;i<l1.size();i++){
        //     System.out.println(l1.get(i));
        // }

        // l1.add(4,500000000);
        // System.out.println(l1);

        // l1.remove(4);
        // System.out.println(l1.remove(Integer.valueOf(7)));
        // System.out.println(l1);

        // boolean ans =l1.contains(Integer.valueOf(60));
        // System.out.println(ans);


        //ArrayList<Object> P =new ArrayList<>(); It stores all datatype of element in an arraylist;
        ArrayList<Object> P =new ArrayList<>();
        P.add("pratik raj");
        P.add(1);
        P.add(true);
        System.out.println(P);
    }
}