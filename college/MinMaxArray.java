import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter 5 numbers:");

        // Taking input
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume first element is smallest and largest
        int smallest = arr[0];
        int largest = arr[0];

        // Compare remaining elements
        for(int i = 1; i < arr.length; i++) {
            
            if(arr[i] < smallest) {
                smallest = arr[i];
            }

            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

        sc.close();
    }
}