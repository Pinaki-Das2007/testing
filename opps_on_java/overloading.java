package opps_on_java;

public class overloading {
    public static void main(String[] args) {
        Great obj =  new Great();
        obj.greatings("pinaki");
        
    }
    
}


class Great{
    void greating(){
        System.out.println("Hello, Good Morning");
    }

      void greatings(String name){
        System.out.println("Hello," + name + "!Good Morning");
    }
}