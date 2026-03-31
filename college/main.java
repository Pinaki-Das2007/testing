 class employee{
        private int salary;


public employee(int salary2) {
               
        }

public void setSalary(int salary){
this.salary = salary;
}

public void work()
{
System.out.println("Working as an employee!");
}

public int getSalary(){
return salary;
}
}


 class HRManager extends employee{


public HRManager(int salary){
super(salary);
}

public void work(){
System.out.println("\nManaging employees");
}


public void addEmployee(){
System.out.println("\nAdding new employee!");

}
}
public class main{
public static void main (String args[])
{
employee emp = new employee(400000);

HRManager mgr = new HRManager(700000);

emp.work();

System.out.println("Employee salary:" + emp.getSalary());

mgr.work();

System.out.println("Manager salary:" + mgr.getSalary());

mgr.addEmployee();
}
}