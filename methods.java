import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
      
        great();
        
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter the first number");
         int a = sc.nextInt();

         System.out.println("Enter the second number");
         int b = sc.nextInt();
        
        average(a,b);
         sc.close();        
    }

    public static void great(){
        System.out.println("Hello World");
    }


    public static int average(int a, int b) {
       int result = (a+b)/2;
       System.out.println("the average is " + result);
       return result;
    }
}