package recursion;

public class GenerateSubset{
    public void subsets(String s, String curr, int i ){
        if(i==s.length()){
            System.out.println(curr);
            return ;
        }
        subsets(s, curr, i+1);
        subsets(s, curr+s.charAt(i), i+1);
    } 
    public static void main(String [] args){
        // This line of code `generateSubset gs = new generateSubset();` is creating a new instance of
        // the `generateSubset` class using the default constructor. The new instance is stored in the
        // variable `gs`, which can then be used to access the methods and properties of the
        // `generateSubset` class.
        GenerateSubset gs = new GenerateSubset();
        String input = "abc";
        gs.subsets(input, "", 0);
    }
}
