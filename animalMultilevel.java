public class animalMultilevel {
    void eat() {
        System.out.println("eating...");
    }
    
}
class dog extends animalMultilevel {
    void bark() {
        System.out.println("barking...");
    }
}
class puppy extends dog {
    void weep() {
        System.out.println("weeping...");
    }
}
void main(String args[]) {
        puppy p = new puppy();
        p.weep();
        p.bark();
        p.eat();
    }
