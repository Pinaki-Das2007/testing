package opps_on_java;

public class clsobj {
    public static void main(String[] args) {
        

    //     Dog d1 = new Dog();
    //     d1.name = "Tommy";  
    //     System.out.println(d1.name);
    //     d1.bark();
    //     d1.walk();

    //     Dog d2 = new Dog();
    //     d2.name = "Rexy";
    //     d2.walk();
    //     d1.bark();
    

    Complex num1 = new Complex();
    num1.a = 5;
    num1.b = 3;
    num1.print();
     }
    
}
class Complex{
       int a,b;


       void print(){
        System.out.println(a+ " + " + b + "i");
       }

}
class Dog{
    String name;
    int age;
    String color;

    void bark(){
        System.out.println(name +" is barking");
    } 
    void walk(){
        System.out.println(name + " is walking");
    }
}