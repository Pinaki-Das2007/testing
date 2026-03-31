import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter 5 numbers:");

        // Taking input
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing in reverse order
        System.out.println("Array in reverse order:");
        for(int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}