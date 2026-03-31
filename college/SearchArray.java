
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int found = 0;

        System.out.println("Enter 5 numbers:");

        // Taking input
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number to search:");
        int key = sc.nextInt();

        // Searching element
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                found = 1;
                System.out.println("Number found at position: " + i);
                break;
            }
        }

        if(found == 0) {
            System.out.println("Number not found");
        }

        sc.close();
    }
}