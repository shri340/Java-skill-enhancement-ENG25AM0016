abstract class animal {
    abstract void sound();
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}
class Dog extends animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Prani {
    
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}
