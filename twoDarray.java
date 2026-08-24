import java.util.*;
public class twoDarray {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the 2D array: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements of 2D array are:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
         }
            System.out.println();
        }

sc.close();}
  } 
 
