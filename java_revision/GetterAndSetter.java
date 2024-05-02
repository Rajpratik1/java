package java_revision; 

class Demo{
    private int age = 22;
    private String name = "MyName";

    public Demo(){
        name = "John";
        age = 15;           //This whole block is called constructor. It is automatically called throgh the object of the class. It name is same as class name. It never return anything. This type of constructor is called default constructor.
    } 
   
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
  
}

public class GetterAndSetter{
    public static void main(String[] args) {
        Demo myObj = new Demo();
        System.out.println(myObj.getName() +":"+myObj.getAge());
    }
}
