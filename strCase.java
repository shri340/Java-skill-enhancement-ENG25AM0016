import java.util.*;
public class strCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
    int upcount = 0;
    int lowcount = 0;
    int digitcount = 0;
    int spacecount = 0;
  for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upcount++;
            } else if (Character.isLowerCase(ch)) {
                lowcount++;
            } else if (Character.isDigit(ch)) {
                digitcount++;
            } else if (Character.isWhitespace(ch)) {
                spacecount++;
            }
        }

        System.out.println("Uppercase letters: " + upcount);
        System.out.println("Lowercase letters: " + lowcount);
        System.out.println("Digits: " + digitcount);
        System.out.println("Spaces: " + spacecount);

        sc.close();
    }
}
