import java.util.Scanner;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
         for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int evencount = 0;
        int oddcount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }
        System.out.println("Number of even elements: " + evencount);
        System.out.println("Number of odd elements: " + oddcount);
    }
}
