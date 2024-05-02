package java_revision; // Adjust the package name according to your project structure

class Pen {
    public String ink() {
        String message = "Pratik Raj";
        System.out.println(message);
        return message;
    }
}

public class ObjectAndClass {
    public static void main(String[] args) {
        Pen myPen = new Pen();
        myPen.ink();
    }
}
