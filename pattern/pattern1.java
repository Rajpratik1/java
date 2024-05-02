package pattern;
public class pattern1{
    public static void main(String[] args) {
        int r=5, c=9;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(j%2!=0){
                    System.out.println("*");
                }
            }
        }
    }
}