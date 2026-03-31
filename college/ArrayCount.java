import java.util.Scanner;

public class ArrayCount {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];

        int positive = 0;
        int negative = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;

        System.out.println("Enter 20 integers:");

        // Taking input
        for(int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }

        // Counting
        for(int i = 0; i < 20; i++) {

            if(arr[i] > 0) {
                positive++;
            }
            else if(arr[i] < 0) {
                negative++;
            }
            else {
                zero++;
            }

            if(arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Printing results
        System.out.println("Number of Positive numbers: " + positive);
        System.out.println("Number of Negative numbers: " + negative);
        System.out.println("Number of Odd numbers: " + odd);
        System.out.println("Number of Even numbers: " + even);
        System.out.println("Number of Zeros: " + zero);

        sc.close();
    }
}