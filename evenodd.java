import java.util.Scanner;

class EvenOdd {
   EvenOdd() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int var2 = var1.nextInt();
      if (var2 % 2 == 0) {
         System.out.println("The number is even.");
      } else {
         System.out.println("The number is odd.");
      }

   }
}
