public class getBits {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        if((bitmask & n)==0){
            System.out.println("Bits is zero.");
        }
        else{
            System.out.println("Bits is not zero");
        }
    }
}
