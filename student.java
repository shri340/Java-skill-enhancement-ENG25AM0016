public class student {
    String name;
    int age;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        student S1 = new student();
        S1.name = "John";
        S1.age = 20;
        S1.display();
        student s2 = new student();
        s2.name = "Alice";
        s2.age = 22;
        s2.display();
        student s3 = new student();
        s3.name = "Bob";
        s3.age = 19;
        s3.display();

}
}
