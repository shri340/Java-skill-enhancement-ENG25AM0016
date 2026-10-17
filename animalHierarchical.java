public class animalHierarchical {
    void eat() {
        System.out.println("eating...");
    }

}
class dog extends animalHierarchical {
    void bark() {
        System.out.println("barking...");
    }
}
class cat extends animalHierarchical {
    void meow() {
        System.out.println("meowing...");
    }
}   
 void main(String args[]) {
        dog d = new dog();
        d.bark();
        d.eat();
        cat c = new cat();
        c.meow();
        c.eat();
    }

