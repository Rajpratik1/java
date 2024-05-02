// import java.util.*; 
public class stringBuilder {
    public static void main(String[] args){
        StringBuilder a=new StringBuilder("Pratik Raj");
        System.out.println(a);

        // char at 0
        System.out.println(a.charAt(0));

        a.setCharAt(0,'b');
        System.out.println(a);

        //insert a character
        a.insert(1,'n');
        System.out.println(a);

        //to delete character
        a.delete(0,3);
        System.out.println(a);

        a.append("c");
        a.append("b");
        a.append("a");
        System.out.println(a);
    }
}
