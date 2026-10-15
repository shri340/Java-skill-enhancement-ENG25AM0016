public class animalInherit {
    void eat() {
        System.out.println("eating...");
    }
    
}class dog extends animalInherit {
    void bark() {
        System.out.println("barking...");
    }
}

 void main(String args[]) {
        dog d = new dog();
        d.bark();
        d.eat();
    }

