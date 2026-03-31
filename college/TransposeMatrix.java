
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];

        System.out.println("Enter elements of 3x3 matrix:");

        // Taking input
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose of the matrix:");

        // Printing transpose
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}