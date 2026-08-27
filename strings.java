import java.util.*;
public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();
        System.out.println(a);
        System.out.println("Character at 3rd location: " + a.charAt(3));
        System.out.println("Length of the string: " + a.length());
        System.out.println("Uppercase: " + a.toUpperCase());
        System.out.println("Lowercase: " + a.toLowerCase());
        System.out.println("starts with 'Hello': " + a.startsWith("Hello"));
        System.out.println("ends with 'World': " + a.endsWith("World"));
        System.out.println("a contains 'java': " + a.contains("java"));
        System.out.println("index of 'H': " + a.indexOf('H'));
        System.out.println("substring from index 0 to 7: " + a.substring(0, 7));
        sc.close();
    }
    
}
