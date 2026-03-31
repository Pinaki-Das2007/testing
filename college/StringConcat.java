import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        String result = str1 + str2;

        System.out.println("After concatenation: " + result);

        sc.close();
    }
}